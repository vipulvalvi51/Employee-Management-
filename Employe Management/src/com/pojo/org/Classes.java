package com.pojo.org;

public class Classes {
private int id;
private String classes;
private int mid;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getClasses() {
	return classes;
}
public void setClasses(String classes) {
	this.classes = classes;
}
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
@Override
public String toString() {
	return "Classes [id=" + id + ", classes=" + classes + ", mid=" + mid + "]";
}

}
