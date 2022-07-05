package ch03.interfacePractice.domain.userInfo.dao.mysql;

import ch03.interfacePractice.domain.userInfo.UserInfo;
import ch03.interfacePractice.domain.userInfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MYSQL DB userID = 0"+userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MYSQL DB userID = 0"+userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete into MYSQL DB userID = 0"+userInfo.getUserId());
    }
}
