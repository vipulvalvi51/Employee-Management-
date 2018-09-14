package com.pojo.org;

public class Degree {
private int mid;
private String degree;
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getDegree() {
	return degree;
}
public void setDegree(String degree) {
	this.degree = degree;
}
@Override
public String toString() {
	return "Degree [mid=" + mid + ", degree=" + degree + "]";
}
}
