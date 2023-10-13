package com.commons.operations;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

import com.commons.model.HeapMemory;

public class HeapMemoryDetailsOperation {
	public static HeapMemory heapMemoryDetails() {

		MemoryMXBean memBean = ManagementFactory.getMemoryMXBean();
		MemoryUsage heapMemoryUsage = memBean.getHeapMemoryUsage();

		long heapInitSize = heapMemoryUsage.getInit();
		long heapUsedSize = heapMemoryUsage.getUsed();
		long heapCommitedSize = heapMemoryUsage.getCommitted();
		long heapMaxSize = heapMemoryUsage.getMax();

		HeapMemory heapMemoryDetails = new HeapMemory(heapInitSize, heapUsedSize, heapCommitedSize, heapMaxSize);
		return heapMemoryDetails;
	}
}