package com.executar;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class ExecutarServiceTest {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		List<Bike> bikeGot = new ArrayList<>();
		
		List<String> bikes = new ArrayList<>();
		bikes.add("hero");
		bikes.add("honda");
		bikes.add("apache");
		bikes.add("bajaj");
		
		
		final ExecutorService executorService = Executors.newCachedThreadPool();


		List<Future<List<Bike>>> bikesFuture = new ArrayList<>();
		List<Callable<List<Bike>>> bikeList = new ArrayList<>();
		
		CardService service = new CardService();
	
		bikes.forEach(bike -> bikeList.add(() -> service.getBikeDetails(bike)));
		
		 bikesFuture = executorService.invokeAll(bikeList);
		 
		 for(Future<List<Bike>> future : bikesFuture) {
			  bikeGot.addAll(future.get());
		 }
		 System.out.println(bikeGot);
		
		
		
	}

}
