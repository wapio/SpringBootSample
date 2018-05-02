package com.wakame.wapio.HelloSpringBoot.debug;

public class DebugUtil {
	
	public static void println(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static void print(Object obj) {
		System.out.print(obj.toString());
	}
	
	public static void print(int i) {
		System.out.print(i);
	}
	
	public static void printArray(Object[] objArray) {
		for (Object o : objArray) {
			System.out.print(o.toString());
		}
	}
}
