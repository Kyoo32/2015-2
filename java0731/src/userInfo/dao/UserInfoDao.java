package userInfo.dao;

import userInfo.UserInfo;

public interface UserInfoDao {

	void insertUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
}
