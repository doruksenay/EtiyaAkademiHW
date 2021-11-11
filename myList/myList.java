package homework2;

import java.util.Iterator;

public class myList {

	String[] list;

	public myList() { // constructor
		this.list = new String[0];
	}

	public void list() { // listeyi bastırmak için
		for (String item : list) {
			System.out.println(item);
		}
	}

	public String[] Add(String item) {
		String[] newItems = new String[list.length + 1];

		for (int i = 0; i < list.length; i++) {
			newItems[i] = list[i];
		}
		newItems[newItems.length - 1] = item;
		list = new String[newItems.length];
		for (int i = 0; i < newItems.length; i++) {
			list[i] = newItems[i];
		}
		return list;
	}

	public void Remove(String removeItem) {
		String[] newItems = new String[list.length - 1];
		for (int i = 0; i < newItems.length; i++) {
			newItems[i] = list[i];
		}
		list = new String[newItems.length];
		for (int i = 0; i < newItems.length; i++) {
			if (newItems[i] != removeItem) {
				list[i] = newItems[i];
			}
		}
	}

	public boolean Contains(String items) { // contain methodu
		for (int i = 0; i < list.length; i++) {
			if (list[i] == items) {
				return true;
			}
		}

		return false;
	}
}