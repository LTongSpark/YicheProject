package com.zytc.common;


import com.zytc.task.KafkaConsumer;

import java.io.*;

/**
 * Created by Administrator on 2018/4/18.
 */

public class GlobalConstants {
    /**
     * mysql 配置相关
     *
     */

    //驱动
    public static String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    //连接字符串
    public static String JDBC_URL = "jdbc:mysql://192.168.1.222:3306/yichedata?characterEncoding=utf-8";

    //用户名称
    public static String JDBC_USER = "root";

    //密码
    public static String JDBC_PASSWORD = "root";

    //数据库名称
    public static String JDBC_DB_BI = "yichedata";

    //表名
    public static String JDBC_DB_TABLE = "yc_info";

    public static String JDBC_DB_ESC = "esc";


    /**
     * kafka相关
     */

    //topic名称
    public static String KAFKA_TOPIC = "ycdata";

    //zookeeper连接
    public static String ZOOKEEPER_CONN = "linux-d01:2181,linux-d02:2181,linux-d03:2181";

    //kafka 消费者组
    public static String GROUP_ID = "ycgroup01";

    // 添加到临时表中
    public static String SQL_INSERT_YC_INFO = "INSERT INTO yc_info (fromIp,info,createTime) VALUES (?,?,?);";

    //查询临时表
    public static String SQL_SELECT_YC_INFO = "select info from yc_info";


    /**
     * 日志类型相关
     */

    //用户登录日志
    public static String LOGIN_USER_INFO = "loadlog";

    //用户权限变更
    public static String AUTHORITY_USER_INFO = "authlog";

    //敏感数据访问
    public static String SENDATA_ASSESS_INFO = "sensitivelog";

    //用户登录日志sql语句
    public static String SQL_USER_LOGIN_INFO = "INSERT INTO userLogin_info (Infotype,Interface,userId,userType,hostname,client,ip,timestamp,originalLogId,originalCMD,type,Do,result,abnormal,Classes,Databasename,Tablename,Fieldname) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

    //用户权限变更sql语句
    public static String SQL_USER_AUTHORITY_INFO = "INSERT INTO userAuthority_info (Infotype,Interface,userId,userType,hostname,client,ip,timestamp,originalLogId,originalCMD,type,Do,targetUserId,original,now,abnormal,Classes,Databasename,Tablename,Fieldname) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

    // 敏感数据访问sql语句
    public static String SQL_SENDATA_ACCESS_INFO = "INSERT INTO sendataAccess_info (Infotype,Interface,userId,userType,hostname,client,ip,timestamp,originalLogId,originalCMD,type,Do,useTime,affect,abnormal,Classes,Databasename,Tablename,Fieldname) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

    public static void main(String[] args) throws Exception {
        try{
            File file=new File("./conf/config.conf");
            if(!file.exists())
                System.out.println("***服务器无配置文件***");
            FileInputStream fis = new FileInputStream(file);
            String tempstr = "";
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "utf-8"));
            while((tempstr = br.readLine()) != null) {
                if(tempstr.startsWith("JDBC_URL")){
                    GlobalConstants.JDBC_URL = tempstr.replace("JDBC_URL:","");
                }
                if(tempstr.startsWith("JDBC_USER")){
                    GlobalConstants.JDBC_USER = tempstr.replace("JDBC_USER:","");
                }
                if(tempstr.startsWith("JDBC_PASSWORD")){
                    GlobalConstants.JDBC_PASSWORD = tempstr.replace("JDBC_PASSWORD:","");
                }
                if(tempstr.startsWith("GROUP_ID")){
                    GlobalConstants.GROUP_ID = tempstr.replace("GROUP_ID:","");
                }
                if(tempstr.startsWith("KAFKA_TOPIC")){
                    GlobalConstants.KAFKA_TOPIC = tempstr.replace("KAFKA_TOPIC:","");
                }
                if(tempstr.startsWith("ZOOKEEPER_CONN")){
                    GlobalConstants.ZOOKEEPER_CONN = tempstr.replace("ZOOKEEPER_CONN:","");
                }
            }
        } catch(IOException ex) {
            System.out.println(ex.getStackTrace());
        }
        new KafkaConsumer(GlobalConstants.KAFKA_TOPIC).start();
    }
}
