package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByPrice implements Comparator<Marker> {

	public int compare(Marker o1, Marker o2) {
		// TODO Auto-generated method stub
	if(o1.price>o2.price) {
		return 1;
	}else if(o1.price< o2.price){
		return -1;
	}
	else {
		return 0;
	}
	}


}
