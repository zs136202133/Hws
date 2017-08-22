package com.zs.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Language {

	public static void main(String[] args){
		Map<Object,String> map = new HashMap<Object,String>();
		List<Map> lst=new ArrayList<Map>();
	    lst.add(map);
		map.put(1, "Stucture");
		lst.add(map);
		map.put(2, "Stucture");
		lst.add(map);
		map.put(3, "Stucture");
		lst.add(map);
		map.put(4, "Stucture");
		lst.add(map);
	    
	    
	    for(int i=0;i<lst.size();i++){
	    	System.out.println(lst.toString());
	    }
	
	
	
	}
}
