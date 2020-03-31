package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alein {
	@Id
private int aid;
private int aname;
private String tech;
public int getAid() {
	return aid;
}
@Override
public String toString() {
	return "Alein [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
}
public void setAid(int aid) {
	this.aid = aid;
}
public int getAname() {
	return aname;
}
public void setAname(int aname) {
	this.aname = aname;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
}
