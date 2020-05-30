package com.exercise.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plans implements Serializable {
	@Id
	private Long planId;
	private String planIdExt;
	private String planName;
	private String planCode;
	private String npiIdExt;
	private String planNameCannon;
	private String planNameSoundlike;
	private String taxName;
	private String comments;
	private String planTypeCd;
	private String dbaName;
	private Date createTs;
	private String createdBy;
	private Date updateTs;
	private String updatedBy;
	private Long noteRefId;
	public Long getPlanId() {
		return planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public String getPlanIdExt() {
		return planIdExt;
	}
	public void setPlanIdExt(String planIdExt) {
		this.planIdExt = planIdExt;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	public String getNpiIdExt() {
		return npiIdExt;
	}
	public void setNpiIdExt(String npiIdExt) {
		this.npiIdExt = npiIdExt;
	}
	public String getPlanNameCannon() {
		return planNameCannon;
	}
	public void setPlanNameCannon(String planNameCannon) {
		this.planNameCannon = planNameCannon;
	}
	public String getPlanNameSoundlike() {
		return planNameSoundlike;
	}
	public void setPlanNameSoundlike(String planNameSoundlike) {
		this.planNameSoundlike = planNameSoundlike;
	}
	public String getTaxName() {
		return taxName;
	}
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getPlanTypeCd() {
		return planTypeCd;
	}
	public void setPlanTypeCd(String planTypeCd) {
		this.planTypeCd = planTypeCd;
	}
	public String getDbaName() {
		return dbaName;
	}
	public void setDbaName(String dbaName) {
		this.dbaName = dbaName;
	}
	public Date getCreateTs() {
		return createTs;
	}
	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdateTs() {
		return updateTs;
	}
	public void setUpdateTs(Date updateTs) {
		this.updateTs = updateTs;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Long getNoteRefId() {
		return noteRefId;
	}
	public void setNoteRefId(Long noteRefId) {
		this.noteRefId = noteRefId;
	}
	
	
}
