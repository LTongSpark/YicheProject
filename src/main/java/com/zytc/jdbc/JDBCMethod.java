package com.zytc.jdbc;

import com.zytc.domain.Info;
import com.zytc.domain.YcDataDetil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class JDBCMethod {

    private static Connection conn;
    private static PreparedStatement ps;
    private static ResultSet rs;
    private static volatile JDBCMethod jm;

    private JDBCMethod(){

    }

    public static JDBCMethod getJDBCMethod() {
        synchronized (JDBCMethod.class) {
            if (jm == null) {
                jm = new JDBCMethod();
            }
        }
        return jm;
    }

    public static void close() throws SQLException {
        if (rs != null)
            rs.close();
        if (ps != null)
            ps.close();
        if (conn != null)
            conn.close();
    }

    public static void addMessageToMysql(String sql,String...objects){
        conn = JdbcManager.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0;i < objects.length; i++){
                ps.setString(i+1,objects[i]);
            }
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //易车数据查找
    public static List<Info> getSelectInfo(String sql) {
        // 获取到连接
        Connection conn = JdbcManager.getConnection();
        PreparedStatement pst = null;
        // 定义一个list用于接受数据库查询到的内容
        List<Info> list = new ArrayList<Info>();
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                Info info = new Info();
                info.setInfo(rs.getString("info"));
                list.add(info);
            }
        } catch (Exception e) {
            System.out.println("查询异常，请耐心纠错...");
        }
        return list;

    }


//    用户登录日志添加
    public static void addUserLoginInfoToMysql(String sql,YcDataDetil ycDataDetil) {
        conn = JdbcManager.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,ycDataDetil.getInfotype());
            ps.setString(2,ycDataDetil.getInterface());
            ps.setString(3,ycDataDetil.getUserId());
            ps.setString(4,ycDataDetil.getUserType());
            ps.setString(5,ycDataDetil.getHostname());
            ps.setString(6,ycDataDetil.getClient());
            ps.setString(7,ycDataDetil.getIp());
            ps.setString(8,ycDataDetil.getTimestamp());
            ps.setString(9,ycDataDetil.getOriginalLogId());
            ps.setString(10,ycDataDetil.getOriginalCMD());
            ps.setString(11,ycDataDetil.getType());
            ps.setString(12,ycDataDetil.getDo());
            ps.setString(13,ycDataDetil.getResult());
            ps.setString(14,ycDataDetil.getAbnormal());
            ps.setInt(15,ycDataDetil.getClasses());
            ps.setString(16,ycDataDetil.getDatabasename());
            ps.setString(17,ycDataDetil.getTablename());
            ps.setString(18,ycDataDetil.getFilename());
            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


//    用户权限变更添加
    public static void addUserAuthorityInfoToMysql(String sql , YcDataDetil ycDataDetil) {
        conn = JdbcManager.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,ycDataDetil.getInfotype());
            ps.setString(2,ycDataDetil.getInterface());
            ps.setString(3,ycDataDetil.getUserId());
            ps.setString(4,ycDataDetil.getUserType());
            ps.setString(5,ycDataDetil.getHostname());
            ps.setString(6,ycDataDetil.getClient());
            ps.setString(7,ycDataDetil.getIp());
            ps.setString(8,ycDataDetil.getTimestamp());
            ps.setString(9,ycDataDetil.getOriginalLogId());
            ps.setString(10,ycDataDetil.getOriginalCMD());
            ps.setString(11,ycDataDetil.getType());
            ps.setString(12,ycDataDetil.getDo());
            ps.setString(13,ycDataDetil.getTargetUserId());
            ps.setString(14,ycDataDetil.getOriginal());
            ps.setString(15,ycDataDetil.getNow());
            ps.setString(16,ycDataDetil.getAbnormal());
            ps.setInt(17,ycDataDetil.getClasses());
            ps.setString(18,ycDataDetil.getDatabasename());
            ps.setString(19,ycDataDetil.getTablename());
            ps.setString(20,ycDataDetil.getFilename());

            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //敏感数据访问
    public static void addSendataAccessInfoToMysql(String sql,YcDataDetil ycDataDetil) {
        conn = JdbcManager.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,ycDataDetil.getInfotype());
            ps.setString(2,ycDataDetil.getInterface());
            ps.setString(3,ycDataDetil.getUserId());
            ps.setString(4,ycDataDetil.getUserType());
            ps.setString(5,ycDataDetil.getHostname());
            ps.setString(6,ycDataDetil.getClient());
            ps.setString(7,ycDataDetil.getIp());
            ps.setString(8,ycDataDetil.getTimestamp());
            ps.setString(9,ycDataDetil.getOriginalLogId());
            ps.setString(10,ycDataDetil.getOriginalCMD());
            ps.setString(11,ycDataDetil.getType());
            ps.setString(12,ycDataDetil.getDo());
            ps.setString(13,ycDataDetil.getUseTime());
            ps.setInt(14,ycDataDetil.getAffect());
            ps.setString(15,ycDataDetil.getAbnormal());
            ps.setInt(16,ycDataDetil.getClasses());
            ps.setString(17,ycDataDetil.getDatabasename());
            ps.setString(18,ycDataDetil.getTablename());
            ps.setString(19,ycDataDetil.getFilename());
            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
