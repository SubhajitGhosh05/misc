package com.Prototype;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopname("Kisholoy");
		bs.loadData();
		/*
		 * BookShop bs1 = new BookShop(); bs.setShopname("Kisholoy"); bs.loadData();
		 */
		//Here we are loading data again once we create new object
		BookShop bs1 = (BookShop) bs.clone();
		bs.getBooks().remove(2);
		System.out.println(bs);
		bs1.setShopname("Chalantika");
		System.out.println(bs1);
	}
}
