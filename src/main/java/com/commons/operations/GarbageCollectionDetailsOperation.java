package com.commons.operations;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;

import com.commons.model.GarbageCollection;

public class GarbageCollectionDetailsOperation {

	public static ArrayList<GarbageCollection> garbageCollection() {
		ArrayList<GarbageCollectorMXBean> memBean = (ArrayList<GarbageCollectorMXBean>) ManagementFactory
				.getGarbageCollectorMXBeans();
		ArrayList<GarbageCollection> gc = new ArrayList<GarbageCollection>();
		for (GarbageCollectorMXBean garbageCollectorMXBean : memBean) {
			gc.add(new GarbageCollection(garbageCollectorMXBean.getName(), garbageCollectorMXBean.getCollectionCount(),
					garbageCollectorMXBean.getCollectionTime()));
		}

		return gc;
	}
}
