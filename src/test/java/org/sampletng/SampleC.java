package org.sampletng;

import org.testng.annotations.Test;

public class SampleC {
	@Test
	private void tc31() {
		System.out.println("Test 31 " + Thread.currentThread().getId());
	}
	@Test
	private void tc32() {
		System.out.println("Test 32 " + Thread.currentThread().getId());
	}
	@Test
	private void tc33() {
		System.out.println("Test 33 " + Thread.currentThread().getId());
	}
}
