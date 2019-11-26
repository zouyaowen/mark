package com.top.suiyueran;

import java.util.Date;

import org.junit.Test;
import org.springframework.scheduling.support.CronSequenceGenerator;

public class CronSequenceGeneratorTest {
	@Test
	public void test() {
		CronSequenceGenerator cronSequenceGenerator = new CronSequenceGenerator("0/2 1 * * * *"); 
		Date date = new Date();
		System.out.println(date);
		Date next = cronSequenceGenerator.next(date);
		System.out.println(next);
	}
}
