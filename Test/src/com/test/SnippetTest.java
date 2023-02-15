 package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

 public class SnippetTest extends Thread{
	 
	 static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
	 
	 public void run() {
		 
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 list.add("sam");
		 
	 }
	 
	 public static void main(String[] args) throws InterruptedException {
		 
		 list.add("Saurah");
		 list.add("mu");
		 
		 SnippetTest sn = new SnippetTest();
		 sn.start();
		 
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			
			String str = (String)itr.next();
			
			if("mu".equals(str)) {
				//itr.remove();
			}
			Thread.sleep(3000);
			
		}
	}
	
	
}
