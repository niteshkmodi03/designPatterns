package com.example.designPatterns.inheritance;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class ExecutorsImplementation {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		Task1 task1 = new Task1();
		Task2 task2 = new Task2();
		TaskWithCustomKey task3 = new TaskWithCustomKey();

		ExecutorService ex = Executors.newFixedThreadPool(2);

//		List<Callable<CustomKey>> tasks = new ArrayList<>();
//		tasks.add(task1);
//		//tasks.add(task2);
//		ex.invokeAll(tasks);

		long time = System.currentTimeMillis();
		Future<String> submit = ex.submit(task1);
		Future<?> submit2 = ex.submit(task2);
		Future<CustomKey> submit3 = ex.submit(task3);

		time = System.currentTimeMillis();
		String string = submit.get();
		System.out.println("submit1 " + string + " " + (System.currentTimeMillis() - time));
		time = System.currentTimeMillis();
		Object x = submit2.get();
		System.out.println("submit2 " + x + " " + (System.currentTimeMillis() - time));

		time = System.currentTimeMillis();
		CustomKey customKey = submit3.get();
		System.out.println("submit3 " + customKey + " " + (System.currentTimeMillis() - time));

//		CompletableFuture<String> completableFuture = new CompletableFuture<>();
//		completableFuture.get();

		CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {

			@Override
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					throw new IllegalStateException(e);
				}
				System.out.println("I'll run in a separate thread than the main thread.");
			}
		});

		future.get();
		future.complete(null);

		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(new Supplier<String>() {
			@Override
			public String get() {
				
				return "Result of the asynchronous computation";
			}
		});

		String result = future2.get();
		future2.complete("hjhj");

//		completableFuture.complete("Future's Result");
		// completableFuture.supplyAsync((Supplier<U>) task1);
//		completableFuture

	}

}
