package com.shreyoshi.test.interview;

public class CovariantTest {

	
}

class ABC {
	
	ABC add(int a, int b) {
		return new ABC();
	}
}

class XYZ extends ABC {
	
//	XYZ add(int a, int b) {
//		return new XYZ();
//	}
}

class PQR extends XYZ {
	
	ABC add(int a, int b) {
		return new PQR();
	}
}
