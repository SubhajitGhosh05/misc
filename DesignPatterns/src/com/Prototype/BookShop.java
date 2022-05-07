package com.Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	private String shopname;
	List<Book> books = new ArrayList<>();

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", books=" + books + "]";
	}

	public void loadData() {
		for (int i = 1; i <= 10; i++) {
			Book b1 = new Book();
			b1.setBid(i);
			b1.setBname("Book_" + i);
			getBooks().add(b1);
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// return super.clone();
		BookShop shop = new BookShop();
		for (Book b : this.getBooks()) {
			shop.getBooks().add(b);
		}
		return shop;
	}

}
