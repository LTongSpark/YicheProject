package com.zytc.domain;

/**
 * Created by Administrator on 2018/4/27.
 */
public class YcDataDetil {

    private int id;
    private String Infotype;
    private String Interface;
    private String userId;
    private String userType;
    private String hostname;
    private String client;
    private String ip;
    private String timestamp;
    private String originalLogId;
    private String originalCMD;
    private String type;
    private String Do;
    private String result;
    private String abnormal;
    private String useTime;
    private int affect;
    private String targetUserId;
    private String original;
    private String now;
    private int Classes;
    private String Databasename;
    private String Tablename;
    private String Filename;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfotype() {
        return Infotype;
    }

    public void setInfotype(String infotype) {
        Infotype = infotype;
    }

    public String getInterface() {
        return Interface;
    }

    public void setInterface(String anInterface) {
        Interface = anInterface;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getOriginalLogId() {
        return originalLogId;
    }

    public void setOriginalLogId(String originalLogId) {
        this.originalLogId = originalLogId;
    }

    public String getOriginalCMD() {
        return originalCMD;
    }

    public void setOriginalCMD(String originalCMD) {
        this.originalCMD = originalCMD;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDo() {
        return Do;
    }

    public void setDo(String aDo) {
        Do = aDo;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getAbnormal() {
        return abnormal;
    }

    public void setAbnormal(String abnormal) {
        this.abnormal = abnormal;
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    public int getAffect() {
        return affect;
    }

    public void setAffect(int affect) {
        this.affect = affect;
    }

    public String getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getNow() {
        return now;
    }

    public void setNow(String now) {
        this.now = now;
    }

    public Integer getClasses() {
        return Classes;
    }

    public void setClasses(Integer classes) {
        Classes = classes;
    }

    public String getDatabasename() {
        return Databasename;
    }

    public void setDatabasename(String databasename) {
        Databasename = databasename;
    }

    public String getTablename() {
        return Tablename;
    }

    public void setTablename(String tablename) {
        Tablename = tablename;
    }

    public String getFilename() {
        return Filename;
    }

    public void setFilename(String filename) {
        Filename = filename;
    }


    public YcDataDetil() {

    }


    @Override
    public String toString() {

              return "YcData{" +
              "id=" + id +
              ", Infotype='" + Infotype + '\'' +
              ", Interface='" + Interface + '\'' +
              ", userId='" + userId + '\'' +
              ", userType='" + userType + '\'' +
              ", hostname='" + hostname + '\'' +
              ", client='" + client + '\'' +
              ", ip='" + ip + '\'' +
              ", timestamp='" + timestamp + '\'' +
              ", originalLogId='" + originalLogId + '\'' +
              ", originalCMD='" + originalCMD + '\'' +
              ", type='" + type + '\'' +
              ", Do='" + Do + '\'' +
              ", result='" + result + '\'' +
              ", abnormal='" + abnormal + '\'' +
              ", useTime='" + useTime + '\'' +
              ", affect=" + affect +
              ", targetUserId='" + targetUserId + '\'' +
              ", original='" + original + '\'' +
              ", now='" + now + '\'' +
              ", Classes=" + Classes +
              ", Databasename='" + Databasename + '\'' +
              ", Tablename='" + Tablename + '\'' +
              ", Filename='" + Filename + '\'' +
              '}';
    }


    //userLoginInfo
    public YcDataDetil(String infotype, String anInterface, String userId, String userType, String hostname, String client, String ip, String timestamp, String originalLogId, String originalCMD, String type, String aDo, String result, String abnormal , int classes, String databasename, String tablename, String filename) {
        this.Infotype = infotype;
        this.Interface = anInterface;
        this.userId = userId;
        this.userType = userType;
        this.hostname = hostname;
        this.client = client;
        this.ip = ip;
        this.timestamp = timestamp;
        this.originalLogId = originalLogId;
        this.originalCMD = originalCMD;
        this.type = type;
        this.Do = aDo;
        this.result = result;
        this.abnormal = abnormal;
        this.Classes = classes;
        this.Databasename = databasename;
        this.Tablename = tablename;
        this.Filename = filename;
    }

    // userAuthorityInfo
    public YcDataDetil(String infotype, String anInterface, String userId, String userType, String hostname, String client, String ip, String timestamp, String originalLogId, String originalCMD, String type, String aDo, String targetUserId, String original, String now, String abnormal,int classes, String databasename, String tablename, String filename) {
        this.Infotype = infotype;
        this.Interface = anInterface;
        this.userId = userId;
        this.userType = userType;
        this.hostname = hostname;
        this.client = client;
        this.ip = ip;
        this.timestamp = timestamp;
        this.originalLogId = originalLogId;
        this.originalCMD = originalCMD;
        this.type = type;
        this.Do = aDo;
        this.targetUserId = targetUserId;
        this.original = original;
        this.now = now;
        this.abnormal = abnormal;
        this.Classes = classes;
        this.Databasename = databasename;
        this.Tablename = tablename;
        this.Filename = filename;
    }


    // sendataAccess_info
    public YcDataDetil(String infotype, String anInterface, String userId, String userType, String hostname, String client, String ip, String timestamp, String originalLogId, String originalCMD, String type, String aDo, String useTime, int affect, String abnormal, int classes, String databasename, String tablename, String filename) {
        this.Infotype = infotype;
        this.Interface = anInterface;
        this.userId = userId;
        this.userType = userType;
        this.hostname = hostname;
        this.client = client;
        this.ip = ip;
        this.timestamp = timestamp;
        this.originalLogId = originalLogId;
        this.originalCMD = originalCMD;
        this.type = type;
        this.Do = aDo;
        this.useTime = useTime;
        this.affect = affect;
        this.abnormal = abnormal;
        this.Classes = classes;
        this.Databasename = databasename;
        this.Tablename = tablename;
        this.Filename = filename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YcDataDetil that = (YcDataDetil) o;

        if (id != that.id) return false;
        if (affect != that.affect) return false;
        if (Classes != that.Classes) return false;
        if (Infotype != null ? !Infotype.equals(that.Infotype) : that.Infotype != null) return false;
        if (Interface != null ? !Interface.equals(that.Interface) : that.Interface != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (userType != null ? !userType.equals(that.userType) : that.userType != null) return false;
        if (hostname != null ? !hostname.equals(that.hostname) : that.hostname != null) return false;
        if (client != null ? !client.equals(that.client) : that.client != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (originalLogId != null ? !originalLogId.equals(that.originalLogId) : that.originalLogId != null)
            return false;
        if (originalCMD != null ? !originalCMD.equals(that.originalCMD) : that.originalCMD != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (Do != null ? !Do.equals(that.Do) : that.Do != null) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        if (abnormal != null ? !abnormal.equals(that.abnormal) : that.abnormal != null) return false;
        if (useTime != null ? !useTime.equals(that.useTime) : that.useTime != null) return false;
        if (targetUserId != null ? !targetUserId.equals(that.targetUserId) : that.targetUserId != null) return false;
        if (original != null ? !original.equals(that.original) : that.original != null) return false;
        if (now != null ? !now.equals(that.now) : that.now != null) return false;
        if (Databasename != null ? !Databasename.equals(that.Databasename) : that.Databasename != null) return false;
        if (Tablename != null ? !Tablename.equals(that.Tablename) : that.Tablename != null) return false;
        return Filename != null ? Filename.equals(that.Filename) : that.Filename == null;
    }

    @Override
    public int hashCode() {
        int result1 = id;
        result1 = 31 * result1 + (Infotype != null ? Infotype.hashCode() : 0);
        result1 = 31 * result1 + (Interface != null ? Interface.hashCode() : 0);
        result1 = 31 * result1 + (userId != null ? userId.hashCode() : 0);
        result1 = 31 * result1 + (userType != null ? userType.hashCode() : 0);
        result1 = 31 * result1 + (hostname != null ? hostname.hashCode() : 0);
        result1 = 31 * result1 + (client != null ? client.hashCode() : 0);
        result1 = 31 * result1 + (ip != null ? ip.hashCode() : 0);
        result1 = 31 * result1 + (timestamp != null ? timestamp.hashCode() : 0);
        result1 = 31 * result1 + (originalLogId != null ? originalLogId.hashCode() : 0);
        result1 = 31 * result1 + (originalCMD != null ? originalCMD.hashCode() : 0);
        result1 = 31 * result1 + (type != null ? type.hashCode() : 0);
        result1 = 31 * result1 + (Do != null ? Do.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (abnormal != null ? abnormal.hashCode() : 0);
        result1 = 31 * result1 + (useTime != null ? useTime.hashCode() : 0);
        result1 = 31 * result1 + affect;
        result1 = 31 * result1 + (targetUserId != null ? targetUserId.hashCode() : 0);
        result1 = 31 * result1 + (original != null ? original.hashCode() : 0);
        result1 = 31 * result1 + (now != null ? now.hashCode() : 0);
        result1 = 31 * result1 + Classes;
        result1 = 31 * result1 + (Databasename != null ? Databasename.hashCode() : 0);
        result1 = 31 * result1 + (Tablename != null ? Tablename.hashCode() : 0);
        result1 = 31 * result1 + (Filename != null ? Filename.hashCode() : 0);
        return result1;
    }
}
