/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package cn.stylefeng.guns.web.model;


/**
 * 锤锤用户
 * 
 * @author wangjie
 * @date: 2018年7月25日 下午2:45:04
 */
public class CcUser {

	private static final long serialVersionUID = 1L;
	private String empCode; // 员工编码
	private String empName; // 员工姓名
	private String empNameEn; // 员工英文名

	private String empMobile; // 手机号

	private String utype;// 用户类别 （0：用户 1：师傅 2：帮主）
	private String workYears; // 工作年限
	private String qualificationPics; // 资质证明图片
	private String longitude; // 经度
	private String latitude; // 维度
	private String approve; // 认证状态（0、未认证 1、已认证 2、认证失败）
	private String masterGrade; // 师傅总评分
	private String unionId; // 小程序唯一标识
	private String weiOpenId; // APP端微信登录标识
	private String qqOpenId; // APP端QQ登录标识
	private String areaCode; // 区域码
	private String address; // 现居住地详细地址
	private String intro; // 个人简介
	private String idCardPositive; // 身份证正面照
	private String idCardNum; // 身份证号码

	private String avatar; // 头像地址
	private String houseNum; //门牌号

	private String idCardReverse; // 身份证反面
	private String authenticationStatus; // 认证审核状态
	private String refuseReason; // 拒绝原因
	private String mgFcode; // 管理的帮派(用于服务商账户)
	private String inviteCode; // 邀请码
	private String agentCode;	//所属代理商ID（仅用户类型为中间商时使用）
	
	private String appType;//APP登录类型
	
	private String postCode; // 根据职位查询
	private String factionCode; // 根据帮会查询
	private String userhouseCode; // 用户房屋查询
	
	private String loginCode; // 用户Code码
	private String phone; // 手机号
	private String mobile;

	private int totalOrder; // 总订单
	private int totalScore; // 总评分
	
	private String appCid;  // APP的CID信息
	
	private String cpsCode; //推广商编号

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public String getLoginCode() {
		return loginCode;
	}

	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAppType() {
		return appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMobile() {
		return empMobile;
	}

	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}

	public String getEmpNameEn() {
		return empNameEn;
	}

	public void setEmpNameEn(String empNameEn) {
		this.empNameEn = empNameEn;
	}
	
	public String getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	public String getUtype() {
		return utype;
	}

	public void setUtype(String utype) {
		this.utype = utype;
	}

	public String getWorkYears() {
		return workYears;
	}

	public void setWorkYears(String workYears) {
		this.workYears = workYears;
	}

	public String getQualificationPics() {
		return qualificationPics;
	}

	public void setQualificationPics(String qualificationPics) {
		this.qualificationPics = qualificationPics;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getApprove() {
		return approve;
	}

	public void setApprove(String approve) {
		this.approve = approve;
	}

	public String getMasterGrade() {
		return masterGrade;
	}

	public void setMasterGrade(String masterGrade) {
		this.masterGrade = masterGrade;
	}

	public String getUnionId() {
		return unionId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}

	public String getWeiOpenId() {
		return weiOpenId;
	}

	public void setWeiOpenId(String weiOpenId) {
		this.weiOpenId = weiOpenId;
	}

	public String getQqOpenId() {
		return qqOpenId;
	}

	public void setQqOpenId(String qqOpenId) {
		this.qqOpenId = qqOpenId;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getIdCardPositive() {
		return idCardPositive;
	}

	public void setIdCardPositive(String idCardPositive) {
		this.idCardPositive = idCardPositive;
	}

	public String getIdCardNum() {
		return idCardNum;
	}

	public void setIdCardNum(String idCardNum) {
		this.idCardNum = idCardNum;
	}

	public String getAuthenticationStatus() {
		return authenticationStatus;
	}

	public void setAuthenticationStatus(String authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}

	public String getRefuseReason() {
		return refuseReason;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public String getMgFcode() {
		return mgFcode;
	}

	public void setMgFcode(String mgFcode) {
		this.mgFcode = mgFcode;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getFactionCode() {
		return factionCode;
	}
	
	public void setFactionCode(String factionCode) {
		this.factionCode = factionCode;
	}

	public String getIdCardReverse() {
		return idCardReverse;
	}

	public void setIdCardReverse(String idCardReverse) {
		this.idCardReverse = idCardReverse;
	}

	public String getUserhouseCode() {
		return userhouseCode;
	}

	public void setUserhouseCode(String userhouseCode) {
		this.userhouseCode = userhouseCode;
	}

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}

	public int getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	public String getAppCid() {
		return appCid;
	}

	public void setAppCid(String appCid) {
		this.appCid = appCid;
	}

	public String getCpsCode() {
		return cpsCode;
	}

	public void setCpsCode(String cpsCode) {
		this.cpsCode = cpsCode;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	
}