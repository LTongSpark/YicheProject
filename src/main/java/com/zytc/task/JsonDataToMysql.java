package com.zytc.task;

import com.alibaba.fastjson.JSONObject;
import com.zytc.common.GlobalConstants;
import com.zytc.domain.Info;
import com.zytc.domain.YcData;
import com.zytc.domain.YcDataDetil;
import com.zytc.jdbc.JDBCMethod;

import java.util.List;


public class JsonDataToMysql {

    public void infoToMysqlMethod() {
        List<Info> jsonInfoList = JDBCMethod.getSelectInfo(GlobalConstants.SQL_SELECT_YC_INFO);

        // 将用户登陆日志添加到数据库
        for (Info json : jsonInfoList) {
            String jsonStr = json.getInfo();
            YcData ycData = JSONObject.parseObject(jsonStr, YcData.class);
            String base = ycData.getBase();
            JSONObject baseSpilt = JSONObject.parseObject(base);

            String infoType = ycData.getInfotype();
            String interFace = ycData.getInterface();
            String userId = baseSpilt.getString("userId");
            String userType = baseSpilt.getString("userType");
            String hostname = baseSpilt.getString("hostname");
            String client = baseSpilt.getString("client");
            String ip = baseSpilt.getString("ip");
            String timestamp = baseSpilt.getString("timestamp");
            String originalLogId = baseSpilt.getString("originalLogId");
            String originalCMD = baseSpilt.getString("originalCMD");

            if (GlobalConstants.LOGIN_USER_INFO.equalsIgnoreCase(infoType)) {
            String operation = ycData.getOperation();
            JSONObject operationSpilt = JSONObject.parseObject(operation);
            String abnormal = operationSpilt.getString("abnormal");
            JSONObject actsplit = operationSpilt.getJSONObject("act");
            String Do = actsplit.getString("do");
            String result = actsplit.getString("result");
            String type = operationSpilt.getString("type");

            String optional = ycData.getOptional();
            JSONObject optionalSpilt = JSONObject.parseObject(optional);
            Integer Classes = optionalSpilt.getInteger("Class");
            String Databasename = optionalSpilt.getString("Databasename");
            String Tablename = optionalSpilt.getString("Tablename");
            String Fieldname = optionalSpilt.getString("Fieldname");

            JDBCMethod.addUserLoginInfoToMysql(GlobalConstants.SQL_USER_LOGIN_INFO, new YcDataDetil(infoType, interFace, userId, userType, hostname, client, ip,
                        timestamp, originalLogId, originalCMD, type, Do, result, abnormal, Classes, Databasename, Tablename, Fieldname));
            }
        }


        // 将用户权限变更日志添加到数据库
        for (Info json : jsonInfoList) {
            String jsonStr = json.getInfo();
            YcData ycData = JSONObject.parseObject(jsonStr, YcData.class);
            String base = ycData.getBase();
            JSONObject baseSpilt = JSONObject.parseObject(base);

            String infoType = ycData.getInfotype();
            String interFace = ycData.getInterface();
            String userId = baseSpilt.getString("userId");
            String userType = baseSpilt.getString("userType");
            String hostname = baseSpilt.getString("hostname");
            String client = baseSpilt.getString("client");
            String ip = baseSpilt.getString("ip");
            String timestamp = baseSpilt.getString("timestamp");
            String originalLogId = baseSpilt.getString("originalLogId");
            String originalCMD = baseSpilt.getString("originalCMD");

            if (GlobalConstants.AUTHORITY_USER_INFO.equalsIgnoreCase(infoType)) {
            String operation = ycData.getOperation();
            JSONObject operationSpilt = JSONObject.parseObject(operation );
            String type = operationSpilt.getString("type");
            JSONObject actsplit = operationSpilt.getJSONObject("act");
            String Do = actsplit.getString("do");
            String targetUserId = actsplit.getString("targetUserId");
            String original = actsplit.getString("original");
            String now = actsplit.getString("now");
            String abnormal = operationSpilt.getString("abnormal");

            String optional = ycData.getOptional();
            JSONObject optionalSpilt = JSONObject.parseObject(optional);
            Integer Classes = optionalSpilt.getInteger("Class");
            String Databasename = optionalSpilt.getString("Databasename");
            String Tablename = optionalSpilt.getString("Tablename");
            String Fieldname = optionalSpilt.getString("Fieldname");

            JDBCMethod.addUserAuthorityInfoToMysql(GlobalConstants.SQL_USER_AUTHORITY_INFO, new YcDataDetil(infoType, interFace, userId, userType, hostname, client, ip,
                        timestamp, originalLogId, originalCMD, type, Do, targetUserId, original, now, abnormal, Classes, Databasename, Tablename, Fieldname));

            }
        }

        // 将敏感数据访问日志添加到数据库
        for (Info json : jsonInfoList) {
            String jsonStr = json.getInfo();
            YcData ycData = JSONObject.parseObject(jsonStr, YcData.class);
            String base = ycData.getBase();
            JSONObject baseSpilt = JSONObject.parseObject(base);

            String infoType = ycData.getInfotype();
            String interFace = ycData.getInterface();
            String userId = baseSpilt.getString("userId");
            String userType = baseSpilt.getString("userType");
            String hostname = baseSpilt.getString("hostname");
            String client = baseSpilt.getString("client");
            String ip = baseSpilt.getString("ip");
            String timestamp = baseSpilt.getString("timestamp");
            String originalLogId = baseSpilt.getString("originalLogId");
            String originalCMD = baseSpilt.getString("originalCMD");

            if (GlobalConstants.SENDATA_ASSESS_INFO.equalsIgnoreCase(infoType)) {
            String operation = ycData.getOperation();
            JSONObject operationSpilt = JSONObject.parseObject(operation);
            String type = operationSpilt.getString("type");
            JSONObject actsplit = operationSpilt.getJSONObject("act");
            String Do = actsplit.getString("do");
            String useTime = actsplit.getString("useTime");
            Integer affect = actsplit.getInteger("affect");
            String abnormal = operationSpilt.getString("abnormal");

            String optional = ycData.getOptional();
            JSONObject optionalSpilt = JSONObject.parseObject(optional);
            Integer Classes = optionalSpilt.getInteger("Class");
            String Databasename = optionalSpilt.getString("Databasename");
            String Tablename = optionalSpilt.getString("Tablename");
            String Fieldname = optionalSpilt.getString("Fieldname");

            JDBCMethod.addSendataAccessInfoToMysql(GlobalConstants.SQL_SENDATA_ACCESS_INFO, new YcDataDetil(infoType, interFace, userId, userType, hostname, client, ip,
                        timestamp, originalLogId, originalCMD, type, Do, useTime, affect, abnormal, Classes, Databasename, Tablename, Fieldname));
            }
        }
    }

//    public static void main(String[] args) {
//        new JsonDataToMysql().infoToMysqlMethod();
//    }
}
