package com.Class.org;

public class JavaInstallCheck {

	public static void main(String[] args) {
		System.out.println("Java Version - "+System.getProperty("java.version"));
		System.out.println("Java RunTimeVersion - "+System.getProperty("java.runtime.version"));
		System.out.println("Java Home - "+System.getProperty("java.home"));
		System.out.println("Java ClassPath - "+System.getProperty("java.class.path"));
		System.out.println("Java Path - "+System.getProperty("java.path"));
		System.out.println("Java Vendor - "+System.getProperty("java.vendor"));
		System.out.println("Java Vendor URL - "+System.getProperty("java.vendor.url"));

	}

}