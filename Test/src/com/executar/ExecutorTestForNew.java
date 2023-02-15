package com.executar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.BiPredicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExecutorTestForNew {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	    BiPredicate<String, String> homeCheckPre = (home,homes) -> {
	    	
	    	if(home.startsWith("A") && homes.contains("")){
	    		return true;
	    	}
	    	return false;
	    };
		
		List<String> companies = Arrays.asList("hero","bajaj","apache");
		
		List<String> filtered = companies.stream().filter(company -> homeCheckPre.test("", company)).collect(Collectors.toList());
		
		
		
		final ExecutorService serviceExe = Executors.newCachedThreadPool();
		
		List<Future<List<Bike>>> futureBikes = new ArrayList<>();
		
		List<Callable<List<Bike>>> callableBikes = new ArrayList<>();
		
		CardService service = new CardService();
		
		companies.forEach(company -> callableBikes.add(() -> service.getBikeDetails(company)));
		
		
		futureBikes = serviceExe.invokeAll(callableBikes);
		
		List<Bike> freshBike = new ArrayList<>();
		
		futureBikes.forEach(future -> {
			try {
				freshBike.addAll(future.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		System.out.println(freshBike.toString());
		
	}

}
