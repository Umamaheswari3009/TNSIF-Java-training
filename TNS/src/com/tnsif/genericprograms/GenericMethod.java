package com.tnsif.genericprograms;

public class GenericMethod {
	public <E> void displayArrayElements(E[] elements) {
		//enhanced for loop or foreach loop		
				for (E element : elements) {
				
					System.out.println("element is: " + element);
				}
			}
	}


