package ch03.interfacePractice.web.userinfo;

import ch03.interfacePractice.domain.userInfo.UserInfo;
import ch03.interfacePractice.domain.userInfo.dao.UserInfoDao;
import ch03.interfacePractice.domain.userInfo.dao.mysql.UserInfoMysqlDao;
import ch03.interfacePractice.domain.userInfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        //파일 입출력
        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPasswd("!@#!@$");
        userInfo.setUserName("ryu");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        }
        else if(dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMysqlDao();
        }
        else{
            System.out.println("DB ERROR");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
