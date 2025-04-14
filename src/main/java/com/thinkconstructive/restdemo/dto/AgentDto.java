package com.thinkconstructive.restdemo.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class AgentDto {

	private long agentNo;	
	private byte agentGateway;	
	private byte agentType;
	private String agentName;
	private String client;	
	private byte clientCrm;
	private String cuserid;
	

	private Timestamp attemptedDate;
	private BigInteger defaultCampaignid;
	private String did;
	private BigInteger didIsd;
	private String didOut;	
	private BigInteger didoutIsd;
	private BigInteger extension;
	private BigInteger extension1;
	private BigInteger extension2;
	private BigInteger extension3;
	private BigInteger extension4;
	private BigInteger extension5;
	private BigInteger extension6;
	private byte inOut;
	private Timestamp instime;
	private byte isAuth;
	private byte isEnable;
	private byte isGateway;
	private byte loginAttempt;
	private String mailid;
	private String nummasking;
	private byte popuponring;
	private String pwd;
	
	private Date pwdExpiry;

	private Timestamp pwdUpdated;

	private byte qwrap;

	private String resetpwd;

	private String shift;

	
	private byte sipAuth;

	
	private String sipPassword;

	
	private Integer  sipUsername;

	private short slno;

	private String status;

	private String webpwd;

	private String webuid;
	public AgentDto() {
		// TODO Auto-generated constructor stub
	}

	
	public AgentDto(long agentNo, byte agentGateway, byte agentType, String agentName, String client, byte clientCrm,
			String cuserid, Timestamp attemptedDate, BigInteger defaultCampaignid, String did, BigInteger didIsd,
			String didOut, BigInteger didoutIsd, BigInteger extension, BigInteger extension1, BigInteger extension2,
			BigInteger extension3, BigInteger extension4, BigInteger extension5, BigInteger extension6, byte inOut,
			Timestamp instime, byte isAuth, byte isEnable, byte isGateway, byte loginAttempt, String mailid,
			String nummasking, byte popuponring, String pwd, Date pwdExpiry, Timestamp pwdUpdated, byte qwrap,
			String resetpwd, String shift, byte sipAuth, String sipPassword, Integer sipUsername, short slno,
			String status, String webpwd, String webuid) {
		this.agentNo = agentNo;
		this.agentGateway = agentGateway;
		this.agentType = agentType;
		this.agentName = agentName;
		this.client = client;
		this.clientCrm = clientCrm;
		this.cuserid = cuserid;
		this.attemptedDate = attemptedDate;
		this.defaultCampaignid = defaultCampaignid;
		this.did = did;
		this.didIsd = didIsd;
		this.didOut = didOut;
		this.didoutIsd = didoutIsd;
		this.extension = extension;
		this.extension1 = extension1;
		this.extension2 = extension2;
		this.extension3 = extension3;
		this.extension4 = extension4;
		this.extension5 = extension5;
		this.extension6 = extension6;
		this.inOut = inOut;
		this.instime = instime;
		this.isAuth = isAuth;
		this.isEnable = isEnable;
		this.isGateway = isGateway;
		this.loginAttempt = loginAttempt;
		this.mailid = mailid;
		this.nummasking = nummasking;
		this.popuponring = popuponring;
		this.pwd = pwd;
		this.pwdExpiry = pwdExpiry;
		this.pwdUpdated = pwdUpdated;
		this.qwrap = qwrap;
		this.resetpwd = resetpwd;
		this.shift = shift;
		this.sipAuth = sipAuth;
		this.sipPassword = sipPassword;
		this.sipUsername = sipUsername;
		this.slno = slno;
		this.status = status;
		this.webpwd = webpwd;
		this.webuid = webuid;
	}


	public long getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(long agentNo) {
		this.agentNo = agentNo;
	}

	public byte getAgentGateway() {
		return agentGateway;
	}

	public void setAgentGateway(byte agentGateway) {
		this.agentGateway = agentGateway;
	}

	public byte getAgentType() {
		return agentType;
	}

	public void setAgentType(byte agentType) {
		this.agentType = agentType;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public byte getClientCrm() {
		return clientCrm;
	}

	public void setClientCrm(byte clientCrm) {
		this.clientCrm = clientCrm;
	}

	public String getCuserid() {
		return cuserid;
	}

	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}


	public Timestamp getAttemptedDate() {
		return attemptedDate;
	}


	public void setAttemptedDate(Timestamp attemptedDate) {
		this.attemptedDate = attemptedDate;
	}


	public BigInteger getDefaultCampaignid() {
		return defaultCampaignid;
	}


	public void setDefaultCampaignid(BigInteger defaultCampaignid) {
		this.defaultCampaignid = defaultCampaignid;
	}


	public String getDid() {
		return did;
	}


	public void setDid(String did) {
		this.did = did;
	}


	public BigInteger getDidIsd() {
		return didIsd;
	}


	public void setDidIsd(BigInteger didIsd) {
		this.didIsd = didIsd;
	}


	public String getDidOut() {
		return didOut;
	}


	public void setDidOut(String didOut) {
		this.didOut = didOut;
	}


	public BigInteger getDidoutIsd() {
		return didoutIsd;
	}


	public void setDidoutIsd(BigInteger didoutIsd) {
		this.didoutIsd = didoutIsd;
	}


	public BigInteger getExtension() {
		return extension;
	}


	public void setExtension(BigInteger extension) {
		this.extension = extension;
	}


	public BigInteger getExtension1() {
		return extension1;
	}


	public void setExtension1(BigInteger extension1) {
		this.extension1 = extension1;
	}


	public BigInteger getExtension2() {
		return extension2;
	}


	public void setExtension2(BigInteger extension2) {
		this.extension2 = extension2;
	}


	public BigInteger getExtension3() {
		return extension3;
	}


	public void setExtension3(BigInteger extension3) {
		this.extension3 = extension3;
	}


	public BigInteger getExtension4() {
		return extension4;
	}


	public void setExtension4(BigInteger extension4) {
		this.extension4 = extension4;
	}


	public BigInteger getExtension5() {
		return extension5;
	}


	public void setExtension5(BigInteger extension5) {
		this.extension5 = extension5;
	}


	public BigInteger getExtension6() {
		return extension6;
	}


	public void setExtension6(BigInteger extension6) {
		this.extension6 = extension6;
	}


	public byte getInOut() {
		return inOut;
	}


	public void setInOut(byte inOut) {
		this.inOut = inOut;
	}


	public Timestamp getInstime() {
		return instime;
	}


	public void setInstime(Timestamp instime) {
		this.instime = instime;
	}


	public byte getIsAuth() {
		return isAuth;
	}


	public void setIsAuth(byte isAuth) {
		this.isAuth = isAuth;
	}


	public byte getIsEnable() {
		return isEnable;
	}


	public void setIsEnable(byte isEnable) {
		this.isEnable = isEnable;
	}


	public byte getIsGateway() {
		return isGateway;
	}


	public void setIsGateway(byte isGateway) {
		this.isGateway = isGateway;
	}


	public byte getLoginAttempt() {
		return loginAttempt;
	}


	public void setLoginAttempt(byte loginAttempt) {
		this.loginAttempt = loginAttempt;
	}


	public String getMailid() {
		return mailid;
	}


	public void setMailid(String mailid) {
		this.mailid = mailid;
	}


	public String getNummasking() {
		return nummasking;
	}


	public void setNummasking(String nummasking) {
		this.nummasking = nummasking;
	}


	public byte getPopuponring() {
		return popuponring;
	}


	public void setPopuponring(byte popuponring) {
		this.popuponring = popuponring;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public Date getPwdExpiry() {
		return pwdExpiry;
	}


	public void setPwdExpiry(Date pwdExpiry) {
		this.pwdExpiry = pwdExpiry;
	}


	public Timestamp getPwdUpdated() {
		return pwdUpdated;
	}


	public void setPwdUpdated(Timestamp pwdUpdated) {
		this.pwdUpdated = pwdUpdated;
	}


	public byte getQwrap() {
		return qwrap;
	}


	public void setQwrap(byte qwrap) {
		this.qwrap = qwrap;
	}


	public String getResetpwd() {
		return resetpwd;
	}


	public void setResetpwd(String resetpwd) {
		this.resetpwd = resetpwd;
	}


	public String getShift() {
		return shift;
	}


	public void setShift(String shift) {
		this.shift = shift;
	}


	public byte getSipAuth() {
		return sipAuth;
	}


	public void setSipAuth(byte sipAuth) {
		this.sipAuth = sipAuth;
	}


	public String getSipPassword() {
		return sipPassword;
	}


	public void setSipPassword(String sipPassword) {
		this.sipPassword = sipPassword;
	}


	public Integer getSipUsername() {
		return sipUsername;
	}


	public void setSipUsername(Integer sipUsername) {
		this.sipUsername = sipUsername;
	}


	public short getSlno() {
		return slno;
	}


	public void setSlno(short slno) {
		this.slno = slno;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getWebpwd() {
		return webpwd;
	}


	public void setWebpwd(String webpwd) {
		this.webpwd = webpwd;
	}


	public String getWebuid() {
		return webuid;
	}


	public void setWebuid(String webuid) {
		this.webuid = webuid;
	}
	
	

	
}
