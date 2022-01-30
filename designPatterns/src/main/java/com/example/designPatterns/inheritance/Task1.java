package com.example.designPatterns.inheritance;

import java.util.concurrent.Callable;

public class Task1 implements Callable<String> {

	@Override
	public String call() throws Exception {
		return "Through callable";
	}

}
