package com.zytc.task;


import com.zytc.common.GlobalConstants;
import com.zytc.jdbc.JDBCMethod;
import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class KafkaConsumer extends Thread {

	private String topic;

	public KafkaConsumer(String topic) {

		this.topic = topic;
	}

	private ConsumerConnector createConsumer() {
		Properties prop = new Properties();
		prop.put("zookeeper.connect", GlobalConstants.ZOOKEEPER_CONN);
		prop.put("group.id", GlobalConstants.GROUP_ID);

		return Consumer.createJavaConsumerConnector(new ConsumerConfig(prop));
	}

	@Override
	public void run() {

		String fromIp = GlobalConstants.KAFKA_TOPIC;
		ConsumerConnector consumer = createConsumer();
		Map<String, Integer> topicCountMap = new HashMap();
		topicCountMap.put(topic, 1);
		Map<String, List<KafkaStream<byte[], byte[]>>> messageStream = consumer.createMessageStreams(topicCountMap);
		KafkaStream<byte[], byte[]> streams = messageStream.get(topic).get(0);
		ConsumerIterator<byte[], byte[]> iterator = streams.iterator();
		while (iterator.hasNext()) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			Date date = new Date();
			String dateStr = sdf.format(date);
			String message;
			try {
				message = new String(iterator.next().message(), "UTF-8");
				JDBCMethod.addMessageToMysql(GlobalConstants.SQL_INSERT_YC_INFO,fromIp,message,dateStr);
				System.out.println(message);
			} catch (Exception e) {

			}

		}

	}

}
