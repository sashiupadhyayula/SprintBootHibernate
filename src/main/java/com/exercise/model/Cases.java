package com.exercise.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CASES")
public class Cases implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	private Long caseId;
	private String caseCin;
	private Long familyNumber;
	private Date caseStatusDate;
	private boolean caseEducatedInd;
	private Date caseEducatedDate;
	private boolean caseNeedTranslatorInd;
	private String casePhone;
	private boolean casePhoneReminderUse;
	private String caseEducatedBy;
	private Long caseStaffId;
	private String createdBy;
	private Date creationDate;
	private String lastUpdatedBy;
	private Date lastUpdateDate;
	private String caseLanguageCd;
	private String caseHowEducatedCd;
	private String caseStatus;
	private String caseHeadFname;
	private String caseHeadLname;
	private String caseHeadMi;
	private String caseHeadSsn;
	private String caseTeam;
	private Long caseLoad;
	private Long clntClientId;
	private Long fmnbId;
	private String loadType;
	private String caseSpokenLanguageCd;
	private Long noteRefId;
	private Date anniversaryDt;
	private String stateStaffIdExt;
	@Column(name = "CASE_GENERIC_FIELD1_DATE")
	private Date caseGenericField1Date;
	@Column(name = "CASE_GENERIC_FIELD2_DATE")
	private Date caseGenericField2Date;
	@Column(name = "CASE_GENERIC_FIELD3_NUM")
	private Long caseGenericField3Num;
	@Column(name = "CASE_GENERIC_FIELD4_NUM")
	private Long caseGenericField4Num;
	@Column(name = "CASE_GENERIC_FIELD5_TXT")
	private String caseGenericField5Txt;
	@Column(name = "CASE_GENERIC_FIELD6_TXT")
	private String caseGenericField6Txt;
	@Column(name = "CASE_GENERIC_FIELD7_TXT")
	private String caseGenericField7Txt;
	@Column(name = "CASE_GENERIC_FIELD8_TXT")
	private String caseGenericField8Txt;
	@Column(name = "CASE_GENERIC_FIELD9_TXT")
	private String caseGenericField9Txt;
	@Column(name = "CASE_GENERIC_FIELD10_TXT")
	private String caseGenericField10Txt;
	@Column(name = "CASE_GENERIC_REF11_ID")
	private Long caseGenericRef11Id;
	@Column(name = "CASE_GENERIC_REF12_ID")
	private Long caseGenericRef12Id;
	private Date lastStateUpdateTs;
	private String lastStateUpdatedBy;


	public Long getCaseId() {
		return caseId;
	}
	public void setCaseId(Long caseId) {
		this.caseId = caseId;
	}
	public String getCaseCin() {
		return caseCin;
	}
	public void setCaseCin(String caseCin) {
		this.caseCin = caseCin;
	}
	public Long getFamilyNumber() {
		return familyNumber;
	}
	public void setFamilyNumber(Long familyNumber) {
		this.familyNumber = familyNumber;
	}
	public Date getCaseStatusDate() {
		return caseStatusDate;
	}
	public void setCaseStatusDate(Date caseStatusDate) {
		this.caseStatusDate = caseStatusDate;
	}
	public boolean isCaseEducatedInd() {
		return caseEducatedInd;
	}
	public void setCaseEducatedInd(boolean caseEducatedInd) {
		this.caseEducatedInd = caseEducatedInd;
	}
	public Date getCaseEducatedDate() {
		return caseEducatedDate;
	}
	public void setCaseEducatedDate(Date caseEducatedDate) {
		this.caseEducatedDate = caseEducatedDate;
	}
	public boolean isCaseNeedTranslatorInd() {
		return caseNeedTranslatorInd;
	}
	public void setCaseNeedTranslatorInd(boolean caseNeedTranslatorInd) {
		this.caseNeedTranslatorInd = caseNeedTranslatorInd;
	}
	public String getCasePhone() {
		return casePhone;
	}
	public void setCasePhone(String casePhone) {
		this.casePhone = casePhone;
	}

	public boolean isCasePhoneReminderUse() {
		return casePhoneReminderUse;
	}
	public void setCasePhoneReminderUse(boolean casePhoneReminderUse) {
		this.casePhoneReminderUse = casePhoneReminderUse;
	}
	public String getCaseEducatedBy() {
		return caseEducatedBy;
	}
	public void setCaseEducatedBy(String caseEducatedBy) {
		this.caseEducatedBy = caseEducatedBy;
	}
	public Long getCaseStaffId() {
		return caseStaffId;
	}
	public void setCaseStaffId(Long caseStaffId) {
		this.caseStaffId = caseStaffId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getCaseLanguageCd() {
		return caseLanguageCd;
	}
	public void setCaseLanguageCd(String caseLanguageCd) {
		this.caseLanguageCd = caseLanguageCd;
	}
	public String getCaseHowEducatedCd() {
		return caseHowEducatedCd;
	}
	public void setCaseHowEducatedCd(String caseHowEducatedCd) {
		this.caseHowEducatedCd = caseHowEducatedCd;
	}
	public String getCaseStatus() {
		return caseStatus;
	}
	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}
	public String getCaseHeadFname() {
		return caseHeadFname;
	}
	public void setCaseHeadFname(String caseHeadFname) {
		this.caseHeadFname = caseHeadFname;
	}
	public String getCaseHeadLname() {
		return caseHeadLname;
	}
	public void setCaseHeadLname(String caseHeadLname) {
		this.caseHeadLname = caseHeadLname;
	}
	public String getCaseHeadMi() {
		return caseHeadMi;
	}
	public void setCaseHeadMi(String caseHeadMi) {
		this.caseHeadMi = caseHeadMi;
	}
	public String getCaseHeadSsn() {
		return caseHeadSsn;
	}
	public void setCaseHeadSsn(String caseHeadSsn) {
		this.caseHeadSsn = caseHeadSsn;
	}
	public String getCaseTeam() {
		return caseTeam;
	}
	public void setCaseTeam(String caseTeam) {
		this.caseTeam = caseTeam;
	}
	public Long getCaseLoad() {
		return caseLoad;
	}
	public void setCaseLoad(Long caseLoad) {
		this.caseLoad = caseLoad;
	}
	public Long getClntClientId() {
		return clntClientId;
	}
	public void setClntClientId(Long clntClientId) {
		this.clntClientId = clntClientId;
	}
	public Long getFmnbId() {
		return fmnbId;
	}
	public void setFmnbId(Long fmnbId) {
		this.fmnbId = fmnbId;
	}
	public String getLoadType() {
		return loadType;
	}
	public void setLoadType(String loadType) {
		this.loadType = loadType;
	}
	public String getCaseSpokenLanguageCd() {
		return caseSpokenLanguageCd;
	}
	public void setCaseSpokenLanguageCd(String caseSpokenLanguageCd) {
		this.caseSpokenLanguageCd = caseSpokenLanguageCd;
	}
	public Long getNoteRefId() {
		return noteRefId;
	}
	public void setNoteRefId(Long noteRefId) {
		this.noteRefId = noteRefId;
	}
	public Date getAnniversaryDt() {
		return anniversaryDt;
	}
	public void setAnniversaryDt(Date anniversaryDt) {
		this.anniversaryDt = anniversaryDt;
	}
	public String getStateStaffIdExt() {
		return stateStaffIdExt;
	}
	public void setStateStaffIdExt(String stateStaffIdExt) {
		this.stateStaffIdExt = stateStaffIdExt;
	}
	public Date getCaseGenericField1Date() {
		return caseGenericField1Date;
	}
	public void setCaseGenericField1Date(Date caseGenericField1Date) {
		this.caseGenericField1Date = caseGenericField1Date;
	}
	public Date getCaseGenericField2Date() {
		return caseGenericField2Date;
	}
	public void setCaseGenericField2Date(Date caseGenericField2Date) {
		this.caseGenericField2Date = caseGenericField2Date;
	}
	public Long getCaseGenericField3Num() {
		return caseGenericField3Num;
	}
	public void setCaseGenericField3Num(Long caseGenericField3Num) {
		this.caseGenericField3Num = caseGenericField3Num;
	}
	public Long getCaseGenericField4Num() {
		return caseGenericField4Num;
	}
	public void setCaseGenericField4Num(Long caseGenericField4Num) {
		this.caseGenericField4Num = caseGenericField4Num;
	}
	public String getCaseGenericField5Txt() {
		return caseGenericField5Txt;
	}
	public void setCaseGenericField5Txt(String caseGenericField5Txt) {
		this.caseGenericField5Txt = caseGenericField5Txt;
	}
	public String getCaseGenericField6Txt() {
		return caseGenericField6Txt;
	}
	public void setCaseGenericField6Txt(String caseGenericField6Txt) {
		this.caseGenericField6Txt = caseGenericField6Txt;
	}
	public String getCaseGenericField7Txt() {
		return caseGenericField7Txt;
	}
	public void setCaseGenericField7Txt(String caseGenericField7Txt) {
		this.caseGenericField7Txt = caseGenericField7Txt;
	}
	public String getCaseGenericField8Txt() {
		return caseGenericField8Txt;
	}
	public void setCaseGenericField8Txt(String caseGenericField8Txt) {
		this.caseGenericField8Txt = caseGenericField8Txt;
	}
	public String getCaseGenericField9Txt() {
		return caseGenericField9Txt;
	}
	public void setCaseGenericField9Txt(String caseGenericField9Txt) {
		this.caseGenericField9Txt = caseGenericField9Txt;
	}
	public String getCaseGenericField10Txt() {
		return caseGenericField10Txt;
	}
	public void setCaseGenericField10Txt(String caseGenericField10Txt) {
		this.caseGenericField10Txt = caseGenericField10Txt;
	}
	public Long getCaseGenericRef11Id() {
		return caseGenericRef11Id;
	}
	public void setCaseGenericRef11Id(Long caseGenericRef11Id) {
		this.caseGenericRef11Id = caseGenericRef11Id;
	}
	public Long getCaseGenericRef12Id() {
		return caseGenericRef12Id;
	}
	public void setCaseGenericRef12Id(Long caseGenericRef12Id) {
		this.caseGenericRef12Id = caseGenericRef12Id;
	}
	public Date getLastStateUpdateTs() {
		return lastStateUpdateTs;
	}
	public void setLastStateUpdateTs(Date lastStateUpdateTs) {
		this.lastStateUpdateTs = lastStateUpdateTs;
	}
	public String getLastStateUpdatedBy() {
		return lastStateUpdatedBy;
	}
	public void setLastStateUpdatedBy(String lastStateUpdatedBy) {
		this.lastStateUpdatedBy = lastStateUpdatedBy;
	}


	//private Set<CaseClient> caseClients = new DatabaseSet();


	/*
	 * public Set<CaseClient> getCaseClients() { return this.caseClients; }
	 */

	/*
	 * public void setCaseClients(Set<CaseClient> caseClients) { if (caseClients ==
	 * null) { this.caseClients = new DatabaseSet(); } else {
	 * this.caseClients.clear(); Iterator iter = caseClients.iterator();
	 *
	 * while (iter.hasNext()) { CaseClient cc = (CaseClient) iter.next();
	 * cc.setCaseId(this.getCaseId()); this.caseClients.add(cc); }
	 *
	 * } }
	 *
	 * public void addCaseClient(CaseClient caseClient) {
	 * caseClient.setCaseId(this.getCaseId()); this.caseClients.add(caseClient); }
	 *
	 * public CaseClient getFirstCaseClient() { CaseClient caseClient = null; if
	 * (this.caseClients != null && this.caseClients.size() > 0) { caseClient =
	 * (CaseClient) this.caseClients.iterator().next(); }
	 *
	 * return caseClient; }
	 *
	 * public void setFirstCaseClient(CaseClient caseClient) { }
	 */



}
