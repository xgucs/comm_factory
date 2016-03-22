package com.test.single.mode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class TestMain {
	private static Map<String,String> map=null;
	public static void main(String[] args) {
		//StreamTest();
		map=getMap();
	/*	for (Map.Entry<String, String> maps: map.entrySet()) {
			System.out.println("key:"+maps.getKey()+",value:"+maps.getKey());
		}*/
		
		Iterator<Map.Entry<String, String>> iters=map.entrySet().iterator();
		while (iters.hasNext()) {
			Map.Entry<String, String> entry=iters.next();
			System.out.println("key:"+entry.getKey()+",value:"+entry.getKey());
		}
	}

	private static void StreamTest() {
		BufferedReader br = null;
		BufferedWriter bw=null;
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			FileWriter fw=new FileWriter("G:\\a.txt");
			bw=new BufferedWriter(fw);
			String s;
			while ((s=br.readLine())!=null) {
				bw.write(s);
				bw.flush();
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static  Map<String,String> getMap(){
		map=new LinkedHashMap<>();
		map.put("1991", "1991");
		map.put("1992", "1992");
		map.put("1993", "1993");
		map.put("1994", "1994");
		map.put("1995", "1995");
		return map;
		
	}

}
