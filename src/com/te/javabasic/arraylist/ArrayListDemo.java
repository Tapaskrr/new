package com.te.javabasic.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("------------------------");

		for (Object var : list) {
			System.out.println(var);
		}

		System.out.println("------------------------");

		int temp = 0;
		while (temp < list.size()) {
			System.out.println(list.get(temp));
			temp++;
		}

		System.out.println("------------------------");

		ListIterator listIterator = list.listIterator();
		while (listIterator.hasNext()) {

			System.out.println(listIterator.next());
		}

		System.out.println("---------changed code---------------");
		
		ListIterator listIterator1 = list.listIterator(list.size());
		while (listIterator1.hasPrevious()) {

			System.out.println(listIterator1.previous());
		}

		System.out.println("------------------------");

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
