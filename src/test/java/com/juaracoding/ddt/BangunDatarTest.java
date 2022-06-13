package com.juaracoding.ddt;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class BangunDatarTest {

	BangunDatar bangunDatar;
	
	@Before
	public void setUp() {
		bangunDatar = new BangunDatar();
	}
	
	@Test
	@FileParameters("src/test/resources/tblSegitiga.csv")
	public void testSegitiga1(double alas, double tinggi, double expect) {
		double actual = bangunDatar.segitiga(alas, tinggi);
		assertEquals(expect, actual, 0.1);
	}
	
}
