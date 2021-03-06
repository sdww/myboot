package com.entity;

import java.io.Serializable;
import java.util.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Demo implements Serializable{
    private Integer did;

    private String title;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dtime;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demo(Integer did, String title, Date dtime) {
		super();
		this.did = did;
		this.title = title;
		this.dtime = dtime;
	}

	@Override
	public String toString() {
		return "Demo [did=" + did + ", title=" + title + ", dtime=" + dtime
				+ "]";
	}
    
    
}