package com.example.designPatterns.inheritance;

import java.util.HashMap;

class ExampleHash {

	private long id;

	private String name;

	ExampleHash() {
	}

	public ExampleHash(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + (int) (id ^ (id >>> 32));
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}

	@Override
	public String toString() {
		return "ExampleHash [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExampleHash other = (ExampleHash) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<ExampleHash, Integer> map = new HashMap<>();
		map.put(new ExampleHash(), 1);
		map.put(new ExampleHash(1,"Nikesh"), 1);
		map.put(new ExampleHash(), 1);
		map.put(new ExampleHash(1,"Nikesh"), 1);
		ExampleHash hsh = new ExampleHash(1,"Nikesh");
		System.out.println(hsh.equals(new  ExampleHash(1,"Nikesh")));
		
		System.out.println(hsh.hashCode());
		
		System.out.println(new  ExampleHash(1,"Nikesh").hashCode());

		System.out.println(map);

	}

}
