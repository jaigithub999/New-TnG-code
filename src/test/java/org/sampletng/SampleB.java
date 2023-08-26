package org.sampletng;

import org.testng.annotations.Test;

public class SampleB {
	@Test
	private void tc21() {
		System.out.println("Test 21 " + Thread.currentThread().getId());
	}

	@Test
	private void tc22() {
		System.out.println("Test 22 " + Thread.currentThread().getId());
	}

	@Test
	private void tc23() {
		System.out.println("Test 23 " + Thread.currentThread().getId());
	}

}
