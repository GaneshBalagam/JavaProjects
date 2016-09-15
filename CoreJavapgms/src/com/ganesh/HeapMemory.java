package com.ganesh;

public class HeapMemory {

		public static void main(String[] args) {
		Runtime rt=Runtime.getRuntime();
		System.out.println("Heap maxsize:"+rt.maxMemory());
		System.out.println("Total Heap memory"+rt.totalMemory());
		System.out.println("Free memory:"+rt.freeMemory());
		System.out.println("Consumed memory:"+(rt.totalMemory()-rt.freeMemory()));
	}

}
