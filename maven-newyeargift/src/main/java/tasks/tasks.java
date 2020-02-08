package tasks;
import sweets.*;

import java.io.Serializable;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.List;
public class tasks {

	private List<allsweets> list = new ArrayList<allsweets>();



	public List<allsweets> getList() {

		return list;

	}



	



	public void add(allsweets absCandy, int count) {

		for (allsweets candy : getList()) {

			if (candy.getName().equals(absCandy.getName())) {

				candy.setCount(candy.getCount() + count);

				return;

			}

		}

		getList().add(absCandy);

		absCandy.setCount(count);

	}



	

	public int calculateTotalWeight() {

		int value = 0;

		for (allsweets candy : getList()) {

			value += candy.getCount() * candy.getWeight();

		}

		return value;

	}



	public void getAllCandy() {

		for (allsweets candy : getList()) {

			System.out.print(candy.printAllValues());

		}

	}



	     

	



	public List<allsweets> receiveBySugarValue(int start, int end) {

		ArrayList<allsweets> list2 = new ArrayList<allsweets>();

		sortBySugarValue(list2);

		for (allsweets candy : getList()) {

			if (start <= candy.getSugarValue() && candy.getSugarValue() < end) {

				list2.add(candy);

			}

		}

		return list2;

	}



	

	public void sortBySugarValue(List<allsweets> list) {

		Collections.sort(list, new CompareBySugarValue());

	}



	static class CompareBySugarValue implements Comparator<allsweets>,

			Serializable {



		private static final long serialVersionUID = -6923839843945617223L;



		public int compare(allsweets o1, allsweets o2) {

			return o1.getSugarValue() - o2.getSugarValue();

		}



	}
}
