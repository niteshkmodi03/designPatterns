package com.example.designPatterns.inheritance;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class TaskWithCustomKey implements Callable<CustomKey> {

	@Override
	public CustomKey call() throws Exception {
		CustomKey custom = new CustomKey();
		custom.setArrayList(Arrays.asList(12,25));
		custom.setPattern("Hollo");
		return custom;
	}

}
