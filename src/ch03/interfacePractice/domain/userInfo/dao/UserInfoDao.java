package ch03.interfacePractice.domain.userInfo.dao;

import ch03.interfacePractice.domain.userInfo.UserInfo;

public interface UserInfoDao {
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
