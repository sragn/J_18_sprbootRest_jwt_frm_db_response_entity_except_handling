package com.thinkconstructive.restdemo.model;

import java.io.Serializable;

import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;
import javax.persistence.*;

/**
 * The persistent class for the agents database table.
 * 
 */
@Entity
@Table(name="agents")
@NamedQuery(name="Agent.findAll", query="SELECT a FROM Agent a")
public class Agent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long agentNo;

	@Column(name="agent_gateway")
	private byte agentGateway;

	@Column(name="agent_type")
	private byte agentType;

	private String agentName;

	private Timestamp attemptedDate;

	private String client;

	@Column(name="client_crm")
	private byte clientCrm;

	private String cuserid;

	@Column(name="default_campaignid")
	private BigInteger defaultCampaignid;

	private String did;

	@Column(name="did_isd")
	private BigInteger didIsd;

	private String didOut;

	@Column(name="didout_isd")
	private BigInteger didoutIsd;

	private BigInteger extension;

	private BigInteger extension1;

	private BigInteger extension2;

	private BigInteger extension3;

	private BigInteger extension4;

	private BigInteger extension5;

	private BigInteger extension6;

	@Column(name="in_out")
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

	@Temporal(TemporalType.DATE)
	private Date pwdExpiry;

	private Timestamp pwdUpdated;

	private byte qwrap;

	private String resetpwd;

	private String shift;

	@Column(name="sip_auth")
	private byte sipAuth;

	@Column(name="sip_password")
	private String sipPassword;

	@Column(name="sip_username")
	private Integer  sipUsername;

	private short slno;

	private String status;

	private String webpwd;

	private String webuid;

	public Agent() {
	}

	public long getAgentNo() {
		return this.agentNo;
	}

	public void setAgentNo(long agentNo) {
		this.agentNo = agentNo;
	}

	public byte getAgentGateway() {
		return this.agentGateway;
	}

	public void setAgentGateway(byte agentGateway) {
		this.agentGateway = agentGateway;
	}

	public byte getAgentType() {
		return this.agentType;
	}

	public void setAgentType(byte agentType) {
		this.agentType = agentType;
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Timestamp getAttemptedDate() {
		return this.attemptedDate;
	}

	public void setAttemptedDate(Timestamp attemptedDate) {
		this.attemptedDate = attemptedDate;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public byte getClientCrm() {
		return this.clientCrm;
	}

	public void setClientCrm(byte clientCrm) {
		this.clientCrm = clientCrm;
	}

	public String getCuserid() {
		return this.cuserid;
	}

	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}

	public BigInteger getDefaultCampaignid() {
		return this.defaultCampaignid;
	}

	public void setDefaultCampaignid(BigInteger defaultCampaignid) {
		this.defaultCampaignid = defaultCampaignid;
	}

	public String getDid() {
		return this.did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public BigInteger getDidIsd() {
		return this.didIsd;
	}

	public void setDidIsd(BigInteger didIsd) {
		this.didIsd = didIsd;
	}

	public String getDidOut() {
		return this.didOut;
	}

	public void setDidOut(String didOut) {
		this.didOut = didOut;
	}

	public BigInteger getDidoutIsd() {
		return this.didoutIsd;
	}

	public void setDidoutIsd(BigInteger didoutIsd) {
		this.didoutIsd = didoutIsd;
	}

	public BigInteger getExtension() {
		return this.extension;
	}

	public void setExtension(BigInteger extension) {
		this.extension = extension;
	}

	public BigInteger getExtension1() {
		return this.extension1;
	}

	public void setExtension1(BigInteger extension1) {
		this.extension1 = extension1;
	}

	public BigInteger getExtension2() {
		return this.extension2;
	}

	public void setExtension2(BigInteger extension2) {
		this.extension2 = extension2;
	}

	public BigInteger getExtension3() {
		return this.extension3;
	}

	public void setExtension3(BigInteger extension3) {
		this.extension3 = extension3;
	}

	public BigInteger getExtension4() {
		return this.extension4;
	}

	public void setExtension4(BigInteger extension4) {
		this.extension4 = extension4;
	}

	public BigInteger getExtension5() {
		return this.extension5;
	}

	public void setExtension5(BigInteger extension5) {
		this.extension5 = extension5;
	}

	public BigInteger getExtension6() {
		return this.extension6;
	}

	public void setExtension6(BigInteger extension6) {
		this.extension6 = extension6;
	}

	public byte getInOut() {
		return this.inOut;
	}

	public void setInOut(byte inOut) {
		this.inOut = inOut;
	}

	public Timestamp getInstime() {
		return this.instime;
	}

	public void setInstime(Timestamp instime) {
		this.instime = instime;
	}

	public byte getIsAuth() {
		return this.isAuth;
	}

	public void setIsAuth(byte isAuth) {
		this.isAuth = isAuth;
	}

	public byte getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(byte isEnable) {
		this.isEnable = isEnable;
	}

	public byte getIsGateway() {
		return this.isGateway;
	}

	public void setIsGateway(byte isGateway) {
		this.isGateway = isGateway;
	}

	public byte getLoginAttempt() {
		return this.loginAttempt;
	}

	public void setLoginAttempt(byte loginAttempt) {
		this.loginAttempt = loginAttempt;
	}

	public String getMailid() {
		return this.mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getNummasking() {
		return this.nummasking;
	}

	public void setNummasking(String nummasking) {
		this.nummasking = nummasking;
	}

	public byte getPopuponring() {
		return this.popuponring;
	}

	public void setPopuponring(byte popuponring) {
		this.popuponring = popuponring;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Date getPwdExpiry() {
		return this.pwdExpiry;
	}

	public void setPwdExpiry(Date pwdExpiry) {
		this.pwdExpiry = pwdExpiry;
	}

	public Timestamp getPwdUpdated() {
		return this.pwdUpdated;
	}

	public void setPwdUpdated(Timestamp pwdUpdated) {
		this.pwdUpdated = pwdUpdated;
	}

	public byte getQwrap() {
		return this.qwrap;
	}

	public void setQwrap(byte qwrap) {
		this.qwrap = qwrap;
	}

	public String getResetpwd() {
		return this.resetpwd;
	}

	public void setResetpwd(String resetpwd) {
		this.resetpwd = resetpwd;
	}

	public String getShift() {
		return this.shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public byte getSipAuth() {
		return this.sipAuth;
	}

	public void setSipAuth(byte sipAuth) {
		this.sipAuth = sipAuth;
	}

	public String getSipPassword() {
		return this.sipPassword;
	}

	public void setSipPassword(String sipPassword) {
		this.sipPassword = sipPassword;
	}

	public Integer getSipUsername() {
		return this.sipUsername;
	}

	public void setSipUsername(Integer  sipUsername) {
		//this.sipUsername = sipUsername;
	    this.sipUsername = (sipUsername != null) ? sipUsername : 0; // Avoid null assignment

	}

	public short getSlno() {
		return this.slno;
	}

	public void setSlno(short slno) {
		this.slno = slno;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWebpwd() {
		return this.webpwd;
	}

	public void setWebpwd(String webpwd) {
		this.webpwd = webpwd;
	}

	public String getWebuid() {
		return this.webuid;
	}

	public void setWebuid(String webuid) {
		this.webuid = webuid;
	}

}