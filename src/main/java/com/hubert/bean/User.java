package com.hubert.bean;

public class User {
	private String oId;
	//用户编号
	private Integer userNo;
	//用户邮箱
	private String userEmail;
	//用户名
	private String userName;
	//密码
	private String userPassword;
	//关注的标签（以，分割）
	private String userTags;
	//用户URL
	private String userURL;
	//QQ
	private String userQQ;
	//个性签名
	private String userIntro;
	//头像类型
	private Integer userAvatarType;
	//头像URL
	private String userAvatarURL;
	//在线标识
	private String userOnlineFlag;
	//用户权限
	private String userRole;
	//发表文章数
	private Integer userArticleCount;
	//发表评论数
	private Integer userCommentCount;
	//关注标签数
	private Integer userTagCount;
	//用户当前状态
	private Integer userStatus;
	//第一次签到日期
	private Integer userFirstCheckin;
	//最近一次签到日期
	private Integer userLastestCheckin;
	//等级
	private Integer userLevelPoint;
	//最近一次发表文章时间
	private Integer userLastestArticleTime;
	//最近一次登录时间
	private Integer userLastestLoginTime;
	//最近一次登录ip
	private String userLastestLoginIp;
	//分享链接
	private String userShareLink;
	//国家
	private String userCountry;
	//省份
	private String userProvince;
	//城市
	private String userCity;
	//注册时间
	private Integer userCreateTime;
	//最近修改时间
	private Integer userUpdateTime;
	//最近修改人
	private String userUpdateUserId;
	
	public User() {
		super();
	}

	public User(String oId, Integer userNo, String userEmail, String userName, String userPassword, String userTags,
			String userURL, String userQQ, String userIntro, Integer userAvatarType, String userAvatarURL,
			String userOnlineFlag, String userRole, Integer userArticleCount, Integer userCommentCount,
			Integer userTagCount, Integer userStatus, Integer userFirstCheckin, Integer userLastestCheckin,
			Integer userLevelPoint, Integer userLastestArticleTime, Integer userLastestLoginTime,
			String userLastestLoginIp, String userShareLink, String userCountry, String userProvince, String userCity,
			Integer userCreateTime, Integer userUpdateTime, String userUpdateUserId) {
		super();
		this.oId = oId;
		this.userNo = userNo;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userTags = userTags;
		this.userURL = userURL;
		this.userQQ = userQQ;
		this.userIntro = userIntro;
		this.userAvatarType = userAvatarType;
		this.userAvatarURL = userAvatarURL;
		this.userOnlineFlag = userOnlineFlag;
		this.userRole = userRole;
		this.userArticleCount = userArticleCount;
		this.userCommentCount = userCommentCount;
		this.userTagCount = userTagCount;
		this.userStatus = userStatus;
		this.userFirstCheckin = userFirstCheckin;
		this.userLastestCheckin = userLastestCheckin;
		this.userLevelPoint = userLevelPoint;
		this.userLastestArticleTime = userLastestArticleTime;
		this.userLastestLoginTime = userLastestLoginTime;
		this.userLastestLoginIp = userLastestLoginIp;
		this.userShareLink = userShareLink;
		this.userCountry = userCountry;
		this.userProvince = userProvince;
		this.userCity = userCity;
		this.userCreateTime = userCreateTime;
		this.userUpdateTime = userUpdateTime;
		this.userUpdateUserId = userUpdateUserId;
	}

	public String getoId() {
		return oId;
	}

	public void setoId(String oId) {
		this.oId = oId;
	}

	public Integer getUserNo() {
		return userNo;
	}

	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserTags() {
		return userTags;
	}

	public void setUserTags(String userTags) {
		this.userTags = userTags;
	}

	public String getUserURL() {
		return userURL;
	}

	public void setUserURL(String userURL) {
		this.userURL = userURL;
	}

	public String getUserQQ() {
		return userQQ;
	}

	public void setUserQQ(String userQQ) {
		this.userQQ = userQQ;
	}

	public String getUserIntro() {
		return userIntro;
	}

	public void setUserIntro(String userIntro) {
		this.userIntro = userIntro;
	}

	public Integer getUserAvatarType() {
		return userAvatarType;
	}

	public void setUserAvatarType(Integer userAvatarType) {
		this.userAvatarType = userAvatarType;
	}

	public String getUserAvatarURL() {
		return userAvatarURL;
	}

	public void setUserAvatarURL(String userAvatarURL) {
		this.userAvatarURL = userAvatarURL;
	}

	public String getUserOnlineFlag() {
		return userOnlineFlag;
	}

	public void setUserOnlineFlag(String userOnlineFlag) {
		this.userOnlineFlag = userOnlineFlag;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Integer getUserArticleCount() {
		return userArticleCount;
	}

	public void setUserArticleCount(Integer userArticleCount) {
		this.userArticleCount = userArticleCount;
	}

	public Integer getUserCommentCount() {
		return userCommentCount;
	}

	public void setUserCommentCount(Integer userCommentCount) {
		this.userCommentCount = userCommentCount;
	}

	public Integer getUserTagCount() {
		return userTagCount;
	}

	public void setUserTagCount(Integer userTagCount) {
		this.userTagCount = userTagCount;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public Integer getUserFirstCheckin() {
		return userFirstCheckin;
	}

	public void setUserFirstCheckin(Integer userFirstCheckin) {
		this.userFirstCheckin = userFirstCheckin;
	}

	public Integer getUserLastestCheckin() {
		return userLastestCheckin;
	}

	public void setUserLastestCheckin(Integer userLastestCheckin) {
		this.userLastestCheckin = userLastestCheckin;
	}

	public Integer getUserLevelPoint() {
		return userLevelPoint;
	}

	public void setUserLevelPoint(Integer userLevelPoint) {
		this.userLevelPoint = userLevelPoint;
	}

	public Integer getUserLastestArticleTime() {
		return userLastestArticleTime;
	}

	public void setUserLastestArticleTime(Integer userLastestArticleTime) {
		this.userLastestArticleTime = userLastestArticleTime;
	}

	public Integer getUserLastestLoginTime() {
		return userLastestLoginTime;
	}

	public void setUserLastestLoginTime(Integer userLastestLoginTime) {
		this.userLastestLoginTime = userLastestLoginTime;
	}

	public String getUserLastestLoginIp() {
		return userLastestLoginIp;
	}

	public void setUserLastestLoginIp(String userLastestLoginIp) {
		this.userLastestLoginIp = userLastestLoginIp;
	}

	public String getUserShareLink() {
		return userShareLink;
	}

	public void setUserShareLink(String userShareLink) {
		this.userShareLink = userShareLink;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserProvince() {
		return userProvince;
	}

	public void setUserProvince(String userProvince) {
		this.userProvince = userProvince;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public Integer getUserCreateTime() {
		return userCreateTime;
	}

	public void setUserCreateTime(Integer userCreateTime) {
		this.userCreateTime = userCreateTime;
	}

	public Integer getUserUpdateTime() {
		return userUpdateTime;
	}

	public void setUserUpdateTime(Integer userUpdateTime) {
		this.userUpdateTime = userUpdateTime;
	}

	public String getUserUpdateUserId() {
		return userUpdateUserId;
	}

	public void setUserUpdateUserId(String userUpdateUserId) {
		this.userUpdateUserId = userUpdateUserId;
	}

	@Override
	public String toString() {
		return "User [oId=" + oId + ", userNo=" + userNo + ", userEmail=" + userEmail + ", userName=" + userName
				+ ", userPassword=" + userPassword + ", userTags=" + userTags + ", userURL=" + userURL + ", userQQ="
				+ userQQ + ", userIntro=" + userIntro + ", userAvatarType=" + userAvatarType + ", userAvatarURL="
				+ userAvatarURL + ", userOnlineFlag=" + userOnlineFlag + ", userRole=" + userRole
				+ ", userArticleCount=" + userArticleCount + ", userCommentCount=" + userCommentCount
				+ ", userTagCount=" + userTagCount + ", userStatus=" + userStatus + ", userFirstCheckin="
				+ userFirstCheckin + ", userLastestCheckin=" + userLastestCheckin + ", userLevelPoint=" + userLevelPoint
				+ ", userLastestArticleTime=" + userLastestArticleTime + ", userLastestLoginTime="
				+ userLastestLoginTime + ", userLastestLoginIp=" + userLastestLoginIp + ", userShareLink="
				+ userShareLink + ", userCountry=" + userCountry + ", userProvince=" + userProvince + ", userCity="
				+ userCity + ", userCreateTime=" + userCreateTime + ", userUpdateTime=" + userUpdateTime
				+ ", userUpdateUserId=" + userUpdateUserId + "]";
	}
	
	
}
