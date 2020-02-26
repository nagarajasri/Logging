package com.epam.clean_code;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InterestCalculation {
	private static final Logger LOGGER = LogManager.getLogger(InterestCalculation.class);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LOGGER.info("enter principle amount");
		float p,t,r;
		p = sc.nextFloat();
		LOGGER.info(p);
		LOGGER.info("enter time");
		t = sc.nextFloat();
		LOGGER.info(t);
		LOGGER.info("enter rate of interest");
		r = sc.nextFloat();
		LOGGER.info(r);
		Calculation obj=new Calculation(p,t,r);
		LOGGER.info("Simple Interest"+obj.SI());
		LOGGER.info("Compound Interest"+obj.CI());
		}
	}
