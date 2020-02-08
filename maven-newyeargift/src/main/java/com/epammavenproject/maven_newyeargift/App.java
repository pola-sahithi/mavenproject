package com.epammavenproject.maven_newyeargift;

/**
 * Hello world!
 *
 */
import sweets.*;

import tasks.*;
public class App 
{
	private static final int START = 25;

	private static final int END = 40;



	// Creating objects

	private static final kajubarfi kajubarfi1 = new kajubarfi("kajubarfi1", 10, 10);

	private static final kajubarfi kajubarfi2 = new kajubarfi("kajubarfi2", 15, 15);

	private static final kajubarfi kajubarfi3 = new kajubarfi("kajubarfi3", 25, 20);

	private static final gulabjamun gulabjamun1 = new gulabjamun("gulabjamun1", 10, 50);

	private static final gulabjamun gulabjamun2 = new gulabjamun("gulabjamun2", 20, 50);

	private static final rabdimalai rabdimalai1 = new rabdimalai("rabdimalai1", 20, 15);

	private static final rabdimalai rabdimalai2 = new rabdimalai("rabdimalai", 30, 20);



	// Creating container

	private static final  tasks GIFT = new tasks();



	public static tasks getGift() {

		return GIFT;

	}







	public static void createGift() {

		getGift().add(kajubarfi1, 6);

		getGift().add(kajubarfi2, 8);

		getGift().add(kajubarfi3, 7);

		getGift().add(gulabjamun1, 1);

		getGift().add(gulabjamun2, 1);

		getGift().add(rabdimalai1, 3);

		getGift().add(rabdimalai2, 4);

		getGift().add(rabdimalai2, 5);

		getGift().add(kajubarfi1, 12);

		getGift().add(kajubarfi2, 17);

		getGift().add(kajubarfi3, 14);

		getGift().add(gulabjamun1, 1);

		getGift().add(gulabjamun2, 1);

		getGift().add(rabdimalai1, 3);

		getGift().add(rabdimalai2, 1);

	}

    public static void main( String[] args )

    {

    	createGift();

		System.out.println("Getting all objects from the gift:");

		getGift().getAllCandy();

		System.out.println();

		System.out.println("Sorting objects by sugarValue:");

		getGift().sortBySugarValue(getGift().getList());

		getGift().getAllCandy();

		System.out.println();

		System.out.println("Calculating total weight of the gift: ");

		System.out.println(getGift().calculateTotalWeight() + " gm");

		System.out.println();

		System.out

				.println("Getting all objects with selected range of sugar value(from "

						+ START + "% to " + END + "%) :");

		for (allsweets sweets : getGift().receiveBySugarValue(START, END)) {

			System.out.print(sweets.printAllValues());

		}

	}
}
