package com.kodnest.hibernate2.HibernateMToMBiDirectionalMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Technology {
@Id
int t_id;
String t_name;

@ManyToMany
List<SoftwareEng> se;

public Technology() {
	super();
	// TODO Auto-generated constructor stub
}

public Technology(int t_id, String t_name, List<SoftwareEng> se) {
	super();
	this.t_id = t_id;
	this.t_name = t_name;
	this.se = se;
}

public int getT_id() {
	return t_id;
}

public void setT_id(int t_id) {
	this.t_id = t_id;
}

public String getT_name() {
	return t_name;
}

public void setT_name(String t_name) {
	this.t_name = t_name;
}

public List<SoftwareEng> getSe() {
	return se;
}

public void setSe(List<SoftwareEng> se) {
	this.se = se;
}

@Override
public String toString() {
	return "Technology [t_id=" + t_id + ", t_name=" + t_name + ", se=" + se + "]";
}
}
