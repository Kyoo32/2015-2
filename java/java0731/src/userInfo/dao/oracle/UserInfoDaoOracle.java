package userInfo.dao.oracle;
import userInfo.UserInfo;
import userInfo.dao.UserInfoDao;

public class UserInfoDaoOracle implements UserInfoDao {
	
	public void insertUserInfo(UserInfo userInfo){
		
		System.out.println("insert UserInfo into ORACLE" + userInfo.getUserId());
	}
	
	public void deleteUserInfo(UserInfo userInfo){
		System.out.println("delete UserInfo from ORACLE" + userInfo.getUserId() );
		
	}
	
	public void updateUserInfo(UserInfo userInfo){
		System.out.println("update UserInfo in ORACLE" + userInfo.getUserId() );
	}
}
