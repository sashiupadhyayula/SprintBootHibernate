package com.exercise.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CLIENT database table.
 *
 */
@Entity
@Table(name = "CLIENT")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CLNT_CLIENT_ID")
	private long clntClientId;

	@Column(name="CLIENT_LANGUAGE")
	private String clientLanguage;

	@Column(name="CLIENT_TYPE_CD")
	private String clientTypeCd;

	@Column(name="CLNT_CIN")
	private String clntCin;

	@Column(name="CLNT_CITIZEN")
	private String clntCitizen;

	@Column(name="CLNT_COMMENT")
	private String clntComment;

	@Column(name="CLNT_DISPLAY_NAME")
	private String clntDisplayName;

	@Temporal(TemporalType.DATE)
	@Column(name="CLNT_DOB")
	private Date clntDob;

	@Temporal(TemporalType.DATE)
	@Column(name="CLNT_DOD")
	private Date clntDod;

	@Column(name="CLNT_ENROLL_STATUS")
	private String clntEnrollStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="CLNT_ENROLL_STATUS_DATE")
	private Date clntEnrollStatusDate;

	@Column(name="CLNT_ETHNICITY")
	private String clntEthnicity;

	@Temporal(TemporalType.DATE)
	@Column(name="CLNT_EXPECTED_DOB")
	private Date clntExpectedDob;

	@Column(name="CLNT_FINET_VENDOR_NBR")
	private String clntFinetVendorNbr;

	@Column(name="CLNT_FNAME")
	private String clntFname;

	@Column(name="CLNT_FROM_PACMIS")
	private String clntFromPacmis;

	@Column(name="CLNT_GENDER_CD")
	private String clntGenderCd;

	@Temporal(TemporalType.DATE)
	@Column(name="CLNT_GENERIC_FIELD1_DATE")
	private Date clntGenericField1Date;

	@Column(name="CLNT_GENERIC_FIELD10_TXT")
	private String clntGenericField10Txt;

	@Temporal(TemporalType.DATE)
	@Column(name="CLNT_GENERIC_FIELD2_DATE")
	private Date clntGenericField2Date;

	@Column(name="CLNT_GENERIC_FIELD3_NUM")
	private BigDecimal clntGenericField3Num;

	@Column(name="CLNT_GENERIC_FIELD4_NUM")
	private BigDecimal clntGenericField4Num;

	@Column(name="CLNT_GENERIC_FIELD5_TXT")
	private String clntGenericField5Txt;

	@Column(name="CLNT_GENERIC_FIELD6_TXT")
	private String clntGenericField6Txt;

	@Column(name="CLNT_GENERIC_FIELD7_TXT")
	private String clntGenericField7Txt;

	@Column(name="CLNT_GENERIC_FIELD8_TXT")
	private String clntGenericField8Txt;

	@Column(name="CLNT_GENERIC_FIELD9_TXT")
	private String clntGenericField9Txt;

	@Column(name="CLNT_GENERIC_REF11_ID")
	private BigDecimal clntGenericRef11Id;

	@Column(name="CLNT_GENERIC_REF12_ID")
	private BigDecimal clntGenericRef12Id;

	@Column(name="CLNT_HIPAA_PRIVACY_IND")
	private String clntHipaaPrivacyInd;

	@Column(name="CLNT_LNAME")
	private String clntLname;

	@Column(name="CLNT_MARITAL_CD")
	private String clntMaritalCd;

	@Column(name="CLNT_MBI")
	private String clntMbi;

	@Column(name="CLNT_MI")
	private String clntMi;

	@Column(name="CLNT_NATIONAL_ID")
	private String clntNationalId;

	@Column(name="CLNT_NOT_BORN")
	private String clntNotBorn;

	@Temporal(TemporalType.DATE)
	@Column(name="CLNT_PREG_TERM_DATE")
	private Date clntPregTermDate;

	@Column(name="CLNT_PREG_TERM_REAS_CD")
	private String clntPregTermReasCd;

	@Column(name="CLNT_PSEUDO_ID")
	private String clntPseudoId;

	@Column(name="CLNT_RACE")
	private String clntRace;

	@Column(name="CLNT_SHARE_PREMIUM")
	private String clntSharePremium;

	@Column(name="CLNT_SSN")
	private String clntSsn;

	@Column(name="CLNT_STATUS_CD")
	private String clntStatusCd;

	@Column(name="CLNT_TPL_PRESENT")
	private String clntTplPresent;

	@Column(name="COMPARABLE_KEY")
	private String comparableKey;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="DO_NOT_CALL_IND")
	private BigDecimal doNotCallInd;

	@Column(name="DO_NOT_EMAIL_IND")
	private BigDecimal doNotEmailInd;

	@Column(name="DO_NOT_TEXT_IND")
	private BigDecimal doNotTextInd;

	@Column(name="DOD_SOURCE_CD")
	private String dodSourceCd;

	@Column(name="DOMESTIC_VIOLENCE_IND")
	private BigDecimal domesticViolenceInd;

	@Column(name="ENGLISH_FLUENCY_CD")
	private String englishFluencyCd;

	@Column(name="ENGLISH_LITERACY_CD")
	private String englishLiteracyCd;

	@Column(name="FIRST_NAME_CANON")
	private String firstNameCanon;

	@Column(name="FIRST_NAME_SOUNDLIKE")
	private String firstNameSoundlike;

	@Column(name="LAST_NAME_CANON")
	private String lastNameCanon;

	@Column(name="LAST_NAME_SOUNDLIKE")
	private String lastNameSoundlike;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_STATE_UPDATE_TS")
	private Date lastStateUpdateTs;

	@Column(name="LAST_STATE_UPDATED_BY")
	private BigDecimal lastStateUpdatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="LAST_UPDATED_BY")
	private String lastUpdatedBy;

	@Column(name="NOTE_REF_ID")
	private BigDecimal noteRefId;

	@Column(name="SALUTATION_CD")
	private String salutationCd;

	@Temporal(TemporalType.DATE)
	@Column(name="SCHED_AUTO_ASSIGN_DATE")
	private Date schedAutoAssignDate;

	@Column(name="SSNVL_ID")
	private BigDecimal ssnvlId;

	@Column(name="STATE_LANGUAGE")
	private String stateLanguage;

	@Column(name="\"SUFFIX\"")
	private String suffix;

	@Column(name="SUPPLEMENTAL_NBR")
	private String supplementalNbr;

	@Column(name="TRIBE_CD")
	private String tribeCd;

	@Column(name="WRITTEN_LANGUAGE")
	private String writtenLanguage;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="CLNT_CLNT_CLIENT_ID")
	private Client client;

	//bi-directional many-to-one association to Client
	@OneToMany(mappedBy="client")
	private List<Client> clients;

	public Client() {
	}

	public long getClntClientId() {
		return this.clntClientId;
	}

	public void setClntClientId(long clntClientId) {
		this.clntClientId = clntClientId;
	}

	public String getClientLanguage() {
		return this.clientLanguage;
	}

	public void setClientLanguage(String clientLanguage) {
		this.clientLanguage = clientLanguage;
	}

	public String getClientTypeCd() {
		return this.clientTypeCd;
	}

	public void setClientTypeCd(String clientTypeCd) {
		this.clientTypeCd = clientTypeCd;
	}

	public String getClntCin() {
		return this.clntCin;
	}

	public void setClntCin(String clntCin) {
		this.clntCin = clntCin;
	}

	public String getClntCitizen() {
		return this.clntCitizen;
	}

	public void setClntCitizen(String clntCitizen) {
		this.clntCitizen = clntCitizen;
	}

	public String getClntComment() {
		return this.clntComment;
	}

	public void setClntComment(String clntComment) {
		this.clntComment = clntComment;
	}

	public String getClntDisplayName() {
		return this.clntDisplayName;
	}

	public void setClntDisplayName(String clntDisplayName) {
		this.clntDisplayName = clntDisplayName;
	}

	public Date getClntDob() {
		return this.clntDob;
	}

	public void setClntDob(Date clntDob) {
		this.clntDob = clntDob;
	}

	public Date getClntDod() {
		return this.clntDod;
	}

	public void setClntDod(Date clntDod) {
		this.clntDod = clntDod;
	}

	public String getClntEnrollStatus() {
		return this.clntEnrollStatus;
	}

	public void setClntEnrollStatus(String clntEnrollStatus) {
		this.clntEnrollStatus = clntEnrollStatus;
	}

	public Date getClntEnrollStatusDate() {
		return this.clntEnrollStatusDate;
	}

	public void setClntEnrollStatusDate(Date clntEnrollStatusDate) {
		this.clntEnrollStatusDate = clntEnrollStatusDate;
	}

	public String getClntEthnicity() {
		return this.clntEthnicity;
	}

	public void setClntEthnicity(String clntEthnicity) {
		this.clntEthnicity = clntEthnicity;
	}

	public Date getClntExpectedDob() {
		return this.clntExpectedDob;
	}

	public void setClntExpectedDob(Date clntExpectedDob) {
		this.clntExpectedDob = clntExpectedDob;
	}

	public String getClntFinetVendorNbr() {
		return this.clntFinetVendorNbr;
	}

	public void setClntFinetVendorNbr(String clntFinetVendorNbr) {
		this.clntFinetVendorNbr = clntFinetVendorNbr;
	}

	public String getClntFname() {
		return this.clntFname;
	}

	public void setClntFname(String clntFname) {
		this.clntFname = clntFname;
	}

	public String getClntFromPacmis() {
		return this.clntFromPacmis;
	}

	public void setClntFromPacmis(String clntFromPacmis) {
		this.clntFromPacmis = clntFromPacmis;
	}

	public String getClntGenderCd() {
		return this.clntGenderCd;
	}

	public void setClntGenderCd(String clntGenderCd) {
		this.clntGenderCd = clntGenderCd;
	}

	public Date getClntGenericField1Date() {
		return this.clntGenericField1Date;
	}

	public void setClntGenericField1Date(Date clntGenericField1Date) {
		this.clntGenericField1Date = clntGenericField1Date;
	}

	public String getClntGenericField10Txt() {
		return this.clntGenericField10Txt;
	}

	public void setClntGenericField10Txt(String clntGenericField10Txt) {
		this.clntGenericField10Txt = clntGenericField10Txt;
	}

	public Date getClntGenericField2Date() {
		return this.clntGenericField2Date;
	}

	public void setClntGenericField2Date(Date clntGenericField2Date) {
		this.clntGenericField2Date = clntGenericField2Date;
	}

	public BigDecimal getClntGenericField3Num() {
		return this.clntGenericField3Num;
	}

	public void setClntGenericField3Num(BigDecimal clntGenericField3Num) {
		this.clntGenericField3Num = clntGenericField3Num;
	}

	public BigDecimal getClntGenericField4Num() {
		return this.clntGenericField4Num;
	}

	public void setClntGenericField4Num(BigDecimal clntGenericField4Num) {
		this.clntGenericField4Num = clntGenericField4Num;
	}

	public String getClntGenericField5Txt() {
		return this.clntGenericField5Txt;
	}

	public void setClntGenericField5Txt(String clntGenericField5Txt) {
		this.clntGenericField5Txt = clntGenericField5Txt;
	}

	public String getClntGenericField6Txt() {
		return this.clntGenericField6Txt;
	}

	public void setClntGenericField6Txt(String clntGenericField6Txt) {
		this.clntGenericField6Txt = clntGenericField6Txt;
	}

	public String getClntGenericField7Txt() {
		return this.clntGenericField7Txt;
	}

	public void setClntGenericField7Txt(String clntGenericField7Txt) {
		this.clntGenericField7Txt = clntGenericField7Txt;
	}

	public String getClntGenericField8Txt() {
		return this.clntGenericField8Txt;
	}

	public void setClntGenericField8Txt(String clntGenericField8Txt) {
		this.clntGenericField8Txt = clntGenericField8Txt;
	}

	public String getClntGenericField9Txt() {
		return this.clntGenericField9Txt;
	}

	public void setClntGenericField9Txt(String clntGenericField9Txt) {
		this.clntGenericField9Txt = clntGenericField9Txt;
	}

	public BigDecimal getClntGenericRef11Id() {
		return this.clntGenericRef11Id;
	}

	public void setClntGenericRef11Id(BigDecimal clntGenericRef11Id) {
		this.clntGenericRef11Id = clntGenericRef11Id;
	}

	public BigDecimal getClntGenericRef12Id() {
		return this.clntGenericRef12Id;
	}

	public void setClntGenericRef12Id(BigDecimal clntGenericRef12Id) {
		this.clntGenericRef12Id = clntGenericRef12Id;
	}

	public String getClntHipaaPrivacyInd() {
		return this.clntHipaaPrivacyInd;
	}

	public void setClntHipaaPrivacyInd(String clntHipaaPrivacyInd) {
		this.clntHipaaPrivacyInd = clntHipaaPrivacyInd;
	}

	public String getClntLname() {
		return this.clntLname;
	}

	public void setClntLname(String clntLname) {
		this.clntLname = clntLname;
	}

	public String getClntMaritalCd() {
		return this.clntMaritalCd;
	}

	public void setClntMaritalCd(String clntMaritalCd) {
		this.clntMaritalCd = clntMaritalCd;
	}

	public String getClntMbi() {
		return this.clntMbi;
	}

	public void setClntMbi(String clntMbi) {
		this.clntMbi = clntMbi;
	}

	public String getClntMi() {
		return this.clntMi;
	}

	public void setClntMi(String clntMi) {
		this.clntMi = clntMi;
	}

	public String getClntNationalId() {
		return this.clntNationalId;
	}

	public void setClntNationalId(String clntNationalId) {
		this.clntNationalId = clntNationalId;
	}

	public String getClntNotBorn() {
		return this.clntNotBorn;
	}

	public void setClntNotBorn(String clntNotBorn) {
		this.clntNotBorn = clntNotBorn;
	}

	public Date getClntPregTermDate() {
		return this.clntPregTermDate;
	}

	public void setClntPregTermDate(Date clntPregTermDate) {
		this.clntPregTermDate = clntPregTermDate;
	}

	public String getClntPregTermReasCd() {
		return this.clntPregTermReasCd;
	}

	public void setClntPregTermReasCd(String clntPregTermReasCd) {
		this.clntPregTermReasCd = clntPregTermReasCd;
	}

	public String getClntPseudoId() {
		return this.clntPseudoId;
	}

	public void setClntPseudoId(String clntPseudoId) {
		this.clntPseudoId = clntPseudoId;
	}

	public String getClntRace() {
		return this.clntRace;
	}

	public void setClntRace(String clntRace) {
		this.clntRace = clntRace;
	}

	public String getClntSharePremium() {
		return this.clntSharePremium;
	}

	public void setClntSharePremium(String clntSharePremium) {
		this.clntSharePremium = clntSharePremium;
	}

	public String getClntSsn() {
		return this.clntSsn;
	}

	public void setClntSsn(String clntSsn) {
		this.clntSsn = clntSsn;
	}

	public String getClntStatusCd() {
		return this.clntStatusCd;
	}

	public void setClntStatusCd(String clntStatusCd) {
		this.clntStatusCd = clntStatusCd;
	}

	public String getClntTplPresent() {
		return this.clntTplPresent;
	}

	public void setClntTplPresent(String clntTplPresent) {
		this.clntTplPresent = clntTplPresent;
	}

	public String getComparableKey() {
		return this.comparableKey;
	}

	public void setComparableKey(String comparableKey) {
		this.comparableKey = comparableKey;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public BigDecimal getDoNotCallInd() {
		return this.doNotCallInd;
	}

	public void setDoNotCallInd(BigDecimal doNotCallInd) {
		this.doNotCallInd = doNotCallInd;
	}

	public BigDecimal getDoNotEmailInd() {
		return this.doNotEmailInd;
	}

	public void setDoNotEmailInd(BigDecimal doNotEmailInd) {
		this.doNotEmailInd = doNotEmailInd;
	}

	public BigDecimal getDoNotTextInd() {
		return this.doNotTextInd;
	}

	public void setDoNotTextInd(BigDecimal doNotTextInd) {
		this.doNotTextInd = doNotTextInd;
	}

	public String getDodSourceCd() {
		return this.dodSourceCd;
	}

	public void setDodSourceCd(String dodSourceCd) {
		this.dodSourceCd = dodSourceCd;
	}

	public BigDecimal getDomesticViolenceInd() {
		return this.domesticViolenceInd;
	}

	public void setDomesticViolenceInd(BigDecimal domesticViolenceInd) {
		this.domesticViolenceInd = domesticViolenceInd;
	}

	public String getEnglishFluencyCd() {
		return this.englishFluencyCd;
	}

	public void setEnglishFluencyCd(String englishFluencyCd) {
		this.englishFluencyCd = englishFluencyCd;
	}

	public String getEnglishLiteracyCd() {
		return this.englishLiteracyCd;
	}

	public void setEnglishLiteracyCd(String englishLiteracyCd) {
		this.englishLiteracyCd = englishLiteracyCd;
	}

	public String getFirstNameCanon() {
		return this.firstNameCanon;
	}

	public void setFirstNameCanon(String firstNameCanon) {
		this.firstNameCanon = firstNameCanon;
	}

	public String getFirstNameSoundlike() {
		return this.firstNameSoundlike;
	}

	public void setFirstNameSoundlike(String firstNameSoundlike) {
		this.firstNameSoundlike = firstNameSoundlike;
	}

	public String getLastNameCanon() {
		return this.lastNameCanon;
	}

	public void setLastNameCanon(String lastNameCanon) {
		this.lastNameCanon = lastNameCanon;
	}

	public String getLastNameSoundlike() {
		return this.lastNameSoundlike;
	}

	public void setLastNameSoundlike(String lastNameSoundlike) {
		this.lastNameSoundlike = lastNameSoundlike;
	}

	public Date getLastStateUpdateTs() {
		return this.lastStateUpdateTs;
	}

	public void setLastStateUpdateTs(Date lastStateUpdateTs) {
		this.lastStateUpdateTs = lastStateUpdateTs;
	}

	public BigDecimal getLastStateUpdatedBy() {
		return this.lastStateUpdatedBy;
	}

	public void setLastStateUpdatedBy(BigDecimal lastStateUpdatedBy) {
		this.lastStateUpdatedBy = lastStateUpdatedBy;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public BigDecimal getNoteRefId() {
		return this.noteRefId;
	}

	public void setNoteRefId(BigDecimal noteRefId) {
		this.noteRefId = noteRefId;
	}

	public String getSalutationCd() {
		return this.salutationCd;
	}

	public void setSalutationCd(String salutationCd) {
		this.salutationCd = salutationCd;
	}

	public Date getSchedAutoAssignDate() {
		return this.schedAutoAssignDate;
	}

	public void setSchedAutoAssignDate(Date schedAutoAssignDate) {
		this.schedAutoAssignDate = schedAutoAssignDate;
	}

	public BigDecimal getSsnvlId() {
		return this.ssnvlId;
	}

	public void setSsnvlId(BigDecimal ssnvlId) {
		this.ssnvlId = ssnvlId;
	}

	public String getStateLanguage() {
		return this.stateLanguage;
	}

	public void setStateLanguage(String stateLanguage) {
		this.stateLanguage = stateLanguage;
	}

	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getSupplementalNbr() {
		return this.supplementalNbr;
	}

	public void setSupplementalNbr(String supplementalNbr) {
		this.supplementalNbr = supplementalNbr;
	}

	public String getTribeCd() {
		return this.tribeCd;
	}

	public void setTribeCd(String tribeCd) {
		this.tribeCd = tribeCd;
	}

	public String getWrittenLanguage() {
		return this.writtenLanguage;
	}

	public void setWrittenLanguage(String writtenLanguage) {
		this.writtenLanguage = writtenLanguage;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Client> getClients() {
		return this.clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Client addClient(Client client) {
		getClients().add(client);
		client.setClient(this);

		return client;
	}

	public Client removeClient(Client client) {
		getClients().remove(client);
		client.setClient(null);

		return client;
	}

}