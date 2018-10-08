package com.softpower.seoro.model;

import java.io.Serializable;

public class SP_SeoroHome_VO implements Serializable {
	private String CONTENT_ID;
	private String CONTENT_NO;
	private String CREATE_DATE;
	private String USER_ID;
	private String UPDATE_DATE;
	private String CONTENT;
	private String TITLE;
	private String VIEW_COUNT;
	private String STATUS;
	
	
	public String getCONTENT_ID() {
		return CONTENT_ID;
	}
	public void setCONTENT_ID(String cONTENT_ID) {
		CONTENT_ID = cONTENT_ID;
	}
	public String getCONTENT_NO() {
		return CONTENT_NO;
	}
	public void setCONTENT_NO(String cONTENT_NO) {
		CONTENT_NO = cONTENT_NO;
	}
	public String getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(String cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	public void setUPDATE_DATE(String uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getVIEW_COUNT() {
		return VIEW_COUNT;
	}
	public void setVIEW_COUNT(String vIEW_COUNT) {
		VIEW_COUNT = vIEW_COUNT;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	
	
}
