package userInfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import userInfo.UserInfo;
import userInfo.dao.*;
import userInfo.dao.mysql.UserInfoDaoMysql;
import userInfo.dao.oracle.UserInfoDaoOracle;

public class UserInfoWeb {

	public static void main(String[] args) throws IOException{
	UserInfo user = new UserInfo();
	FileInputStream fis = new FileInputStream("db.properties");
	Properties prop = new Properties();
	prop.load(fis);;
	String dbType  = prop.getProperty("DBTYPE");
	
	UserInfoDao dao = new UserInfoDaoOracle();
	
	System.out.println(dbType);
	if(dbType.equals("MYSQL"))
		dao = new UserInfoDaoMysql();
	
	
	dao.insertUserInfo(user);
	dao.deleteUserInfo(user);
	dao.updateUserInfo(user);
	
	//Statement
	//Connection
	
	}
	
	
}
