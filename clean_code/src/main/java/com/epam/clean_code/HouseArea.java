package com.epam.clean_code;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseArea {
	private static final Logger LOGGER = LogManager.getLogger(HouseArea.class);

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LOGGER.info("total area of house in square feet");
		int t = sc.nextInt();
		LOGGER.info(t);
		LOGGER.info("Choose the material required");
		LOGGER.info("1.standard material(Rs:1200INR)\n2.above Standard material(Rs:1500INR)\n3.High standard material(Rs:1800INR)\n");
		LOGGER.info("enter your choice in numbers\n");
		int ch = sc.nextInt();
		LOGGER.info(ch);
		int cost = 0;
		if(ch<3) {
			if(ch == 1)
				cost = 1200;
			else if(ch == 2)
				cost = 1500;
			else if(ch == 3) {
				cost = 1800;
				LOGGER.info("Do You need Fully Automated or not\n1.(Fully Automated(Rs:700))\n2.Not Automated\n");
				LOGGER.info("enter your choice in number");
				int bool = sc.nextInt();
				if(bool == 1)
					cost = cost+700;
			}
			CostConstruction obj = new CostConstruction();
			LOGGER.info("Estimated House Construction cost"+obj.cost(t,cost));
		}else {
			LOGGER.error("your choice is invalid");
		}
	}

}
