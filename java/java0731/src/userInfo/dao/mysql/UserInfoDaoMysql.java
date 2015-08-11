package userInfo.dao.mysql;

import userInfo.UserInfo;
import userInfo.dao.UserInfoDao;

public class UserInfoDaoMysql implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert UserInfo into MySQL" + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete UserInfo from MySQL" + userInfo.getUserId());		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update UserInfo in MySQL" + userInfo.getUserId());		
	}

}
