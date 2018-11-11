package org;

import org.agilep365.lab.NewMath;
import org.mockito.Mockito;
import junit.framework.TestCase;

public class NewMathTest extends TestCase {
	NewMath newmathInst;

	protected void setUp() throws Exception {
		newmathInst = new NewMath();
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testAdd001(){
		this.assertEquals(0,newmathInst.add(""));
	}
	
	public void testAdd002(){
		this.assertEquals(0,newmathInst.add("0"));
	}
	
	public void testAdd003(){
		this.assertEquals(5,newmathInst.add("2,3"));
	}
	
	public void testAdd004(){
		//this.assertEquals(5,newmathInst.add(null));
	}

	public void testMockupAdd(){
		String compoundNums = "3,2";
		NewMath mock = Mockito.mock(NewMath.class);
		Mockito.when(mock.add(compoundNums)).thenReturn(5);
		assertEquals(5,mock.add(compoundNums));
	}

	public void testMockupMinus(){
		String compoundNums = "3,1";
		NewMath mock = Mockito.mock(NewMath.class);
		Mockito.when(mock.minus(compoundNums)).thenReturn(2);
		assertEquals(2,mock.minus(compoundNums));
	}
//	
//	public void testAdd() {
//		int x = 1;
//		int y = 2;
//		this.assertEquals(3, newmathInst.add(x, y));
//	}
//
//	public void testMinus() {
//		int x = 2;
//		int y = 3;
//		this.assertEquals(1, newmathInst.minus(y, x));
//	}
//
//	public void testMultiply() {
//		int x = 2;
//		int y = 3;
//		this.assertEquals(6, newmathInst.multiply(x, y));
//	}
//
//	public void testDivid() {
//		int x = 2;
//		int y = 3;
//		this.assertEquals(1.5, newmathInst.divide(y, x));
//	}

}
