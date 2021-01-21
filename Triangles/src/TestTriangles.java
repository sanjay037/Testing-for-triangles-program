import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;

import org.junit.jupiter.api.Test;
import static java.lang.Math.sqrt;


class TestTriangles {

	Triangles t = new Triangles();

	@Test
	void testSas() {
        int[] s1 = {4,4,2};
        int[] s2 = {2,5,4};
        int[] a1 = {120,20,70};
        int[] a2 = {120,30,30};
        assertEquals(1,t.sas(s1, s2, a1, a2));
	}
	@Test
	void testSas2() {
        int[] s1 = {7,5,6};
        int[] s2 = {7,4,6};
        int[] a1 = {60,90,30};
        int[] a2 = {60,30,60};
        assertEquals(1,t.sas(s1, s2, a1, a2));
	}
	@Test
	void testSas3() {
        int[] s1 = {6,5,3};
        int[] s2 = {3,6,4};
        int[] a1 = {30,90,60};
        int[] a2 = {20,60,100};
        assertEquals(1,t.sas(s1, s2, a1, a2));
	}
	@Test
	void testSas4() {
        int[] s1 = {6,5,3};
        int[] s2 = {12,14,13};
        int[] a1 = {60,90,30};
        int[] a2 = {50,80,50};
        assertEquals(0,t.sas(s1, s2, a1, a2));
	}

	@Test
	void testAsa() {
        int[] s1 = {4,3,2};
        int[] s2 = {4,4,1};
        int[] a1 = {30,80,70};
        int[] a2 = {70,80,30};
        assertEquals(1,t.asa(s1, s2, a1, a2));
	}
	@Test
	void testAsa1() {
        int[] s1 = {2,4,3};
        int[] s2 = {2,6,5};
        int[] a1 = {30,70,80};
        int[] a2 = {70,80,30};
        assertEquals(1,t.asa(s1, s2, a1, a2));
	}
	@Test
	void testAsa2() {
        int[] s1 = {2,5,4};
        int[] s2 = {4,1,4};
        int[] a1 = {30,70,80};
        int[] a2 = {70,80,30};
        assertEquals(1,t.asa(s1, s2, a1, a2));
	}
	@Test
	void testAsa3() {
        int[] s1 = {4,3,2};
        int[] s2 = {2,1,2};
        int[] a1 = {70,80,30};
        int[] a2 = {30,70,80};
        assertEquals(0,t.asa(s1, s2, a1, a2));
	}

	@Test
	void testAas() {
		int[] s1 = {4,3,2};
		int[] s2 = {5,2,4};
        int[] a1 = {30,80,70};
        int[] a2 = {70,30,80};
        assertEquals(1,t.aas(s1, s2, a1, a2));
	}
	@Test
	void testAas1() {
		int[] s1 = {2,7,6};
        int[] s2 = {6,7,3};
        int[] a1 = {30,70,80};
        int[] a2 = {30,80,70};
        assertEquals(1,t.aas(s1, s2, a1, a2));
	}
	@Test
	void testAas2() {
		int[] s1 = {2,7,6};
        int[] s2 = {5,3,7};
        int[] a1 = {50,70,60};
        int[] a2 = {50,70,50};
        assertEquals(1,t.aas(s1, s2, a1, a2));
	}
	@Test
	void testAas3() {
		int[] s1 = {2,7,6};
        int[] s2 = {7,5,3};
        int[] a1 = {30,0,60};
        int[] a2 = {55,45,100};
        assertEquals(0,t.aas(s1, s2, a1, a2));
	}

	@Test
	void testHl() {
		int[] s1 = {7,6,2};
		int[] s2 = {3,7,6};
		int[] a1 = {30,90,60};
		int[] a2 = {90,35,55};
		assertEquals(1,t.hl(s1, s2, a1, a2));
	}

	@Test
	void testHl1() {
		int[] s1 = {6,2,7};
		int[] s2 = {3,8,6};
		int[] a1 = {30,90,60};
		int[] a2 = {65,35,80};
		assertEquals(0,t.hl(s1, s2, a1, a2));
	}

	@Test
	void testSss() {
		int[] s1 = {2,5,4};
		int[] s2 = {4,2,5};
		assertEquals(1,t.sss(s1, s2));
	}
	
	@Test
	void testSss1() {
		int[] s1 = {4,2,4};
		int[] s2 = {2,5,4};
		assertEquals(0,t.sss(s1, s2));
	}

	@Test
	void testGetSides1() {
		int[] s1 = {2,4,5};
		assertArrayEquals(s1,t.getSides1(4,2,5));
	}

	@Test
	void testGetSides2() {
		int[] s1 = {2,4,5};
		assertArrayEquals(s1,t.getSides2(s1[0], s1[1],s1[2]));
	}

	@Test
	void testGetAngles1() {
		int[] a1 = {30,60,90};
		assertArrayEquals(a1,t.getAngles1(60,30,90));
	}

	@Test
	void testGetAngles2() {
		int[] a1 = {30,60,90};
		assertArrayEquals(a1,t.getAngles2(a1[0], a1[1],a1[2]));
	}

	@Test
	void testSimi_aaa() {
		int[] a1 = {90,60,30};
		int[] a2 = {30,90,60};
		assertEquals(1,t.simi_aaa(a1,a2));
	}
	@Test
	void testSimi_aaa1() {
		int[] a1 = {30,90,60};
		int[] a2 = {80,70,30};
		assertEquals(0,t.simi_aaa(a1,a2));
	}

	@Test
	void testSimi_sas() {
		int[] s1 = {4,10,6};
		int[] s2 = {2,6,3};
		int[] a1 = {30,90,60};
		int[] a2 = {35,90,80};
		assertEquals(1,t.simi_sas(s1, s2, a1, a2));
	}
	@Test
	void testSimi_sas1() {
		int[] s1 = {1,8,4};
		int[] s2 = {4,2,1};
		int[] a1 = {30,120,30};
		int[] a2 = {60,30,90};
		assertEquals(1,t.simi_sas(s1, s2, a1, a2));
	}
	@Test
	void testSimi_sas2() {
		int[] s1 = {11,9,4};
		int[] s2 = {4,11,8};
		int[] a1 = {30,60,90};
		int[] a2 = {100,60,20};
		assertEquals(1,t.simi_sas(s1, s2, a1, a2));
	}

	@Test
	void testSimi_sss() {
		int[] s1 = {16,6,4};
		int[] s2 = {8,3,2};
		assertEquals(1,t.simi_sss(s1, s2));
	}
	@Test
	void testSimi_sss1() {
		int[] s1 = {16,8,4};
		int[] s2 = {8,3,2};
		assertEquals(1,t.simi_sss(s1, s2));
	}

	@Test
	void testCheckValidity() {
		int[] s1 = {8,5,4};
		assertEquals(1,t.checkValidity(s1[0],s1[1],s1[2]));
	}
	@Test
	void testCheckValidity1() {
		int[] s1 = {9,5,4};
		assertEquals(0,t.checkValidity(s1[0],s1[1],s1[2]));
	}

	@Test
	void testCirclearea() {
		double[] s1 = {0,0,0};
		assertEquals(-1,t.circlearea(s1[0], s1[1], s1[2]));
	}
	@Test
	void testCirclearea1() {
		double[] s1 = {13,5,12};
		assertEquals(2122.64,t.circlearea(s1[0], s1[1], s1[2]));
	}

	@Test
	void testFindRadiusOfIncircle() {
		float[] s1 = {-10,20,10};
		assertEquals(-1,t.findRadiusOfIncircle(s1[0], s1[1], s1[2]));
	}
	@Test
	void testFindRadiusOfIncircle1() {
		float[] s1 = {13,5,12};
		assertEquals(2.0,t.findRadiusOfIncircle(s1[0], s1[1], s1[2]));
	}

	@Test
	void testTrianglearea() {
		float r = 0;
		assertEquals(-1,t.trianglearea(r));
	}
	@Test
	void testTrianglearea1() {
		float r = 2;
		assertEquals(4,t.trianglearea(r));
	}

	@Test
	void testSquare() {
		int x = 2;
		assertEquals(4,t.square(2));
	}

	@Test
	void testOrder() {
		assertEquals(10,t.order(30, 20, 10));
	}

	@Test
	void testEuclidDistSquare() {
		Point p1 = new Point(6,5);
		Point p2 = new Point(2,1);
		assertEquals(32,t.euclidDistSquare(p1, p2));
	}

	@Test
	void testGetSideClassification1() {
        int[] s2 = {2,2,2};
		assertEquals("Equilateral",t.getSideClassification(s2[0], s2[1], s2[2]));
	}

	@Test
	void testGetSideClassification2() {
        int[] s2 = {2,3,1};
		assertEquals("Scalene",t.getSideClassification(s2[0], s2[1], s2[2]));
	}

	@Test
	void testGetSideClassification3() {
        int[] s2 = {2,2,1};
		assertEquals("Isosceles",t.getSideClassification(s2[0], s2[1], s2[2]));
	}

	@Test
	void testIsIsosceles1() {
		int[] s1 = {2,2,1};
		assertEquals(1,t.isIsosceles(s1[0], s1[1], s1[2]));
	}

	@Test
	void testIsIsosceles2() {
		int[] s1 = {3,2,1};
		assertEquals(0,t.isIsosceles(s1[0], s1[1], s1[2]));
	}

	@Test
	void testGetAngleClassification1() {
		int[] a1 = {60,60,60};
		assertEquals("acute",t.getAngleClassification(a1[0], a1[1], a1[2]));
	}

	@Test
	void testGetAngleClassification2() {
		int[] a1 = {60,30,90};
		assertEquals("right",t.getAngleClassification(a1[0], a1[1], a1[2]));
	}

	@Test
	void testGetAngleClassification3() {
		int[] a1 = {60,20,100};
		assertEquals("obtuse",t.getAngleClassification(a1[0], a1[1], a1[2]));
	}

	@Test
	void testClassifyTriangle() {
		Point p1 = new Point (3,0);
		Point p2 = new Point (0,4);
		Point p3 = new Point (0,0);
		String arr[] = {"right","Scalene"};
		assertArrayEquals(arr,t.classifyTriangle(p1,p2,p3));
	}

	@Test
	void testLengthSquare() {
		Point p1 = new Point (2,2);
		Point p2 = new Point (1,1);
		assertEquals(2,t.lengthSquare(p1, p2));
	}

	@Test
	void testPrintAngle() {
		Point A = new Point (0,0);
		Point B = new Point (3,4);
		Point C = new Point (5,2);
		double arr[] = {31.328691482543945,81.8698959350586,66.80140686035156};
		assertArrayEquals(arr,t.printAngle(A, B, C));
	}

	@Test
	void testPrintOtherSides1() {
		int n = 5;
		int arr[] = {12,13};
		assertArrayEquals(arr,t.printOtherSides(n));
	}

	@Test
	void testPrintOtherSides2() {
		int n = 4;
		int arr[] = {3,5};
		assertArrayEquals(arr,t.printOtherSides(n));
	}

	@Test
	void testPrintOtherSides3() {
		int n = 1;
		int arr[] = {-1,-1};
		assertArrayEquals(arr,t.printOtherSides(n));
	}

	@Test
	void testPrintOtherSides4() {
		int n = 2;
		int arr[] = {-1,-1};
		assertArrayEquals(arr,t.printOtherSides(n));
	}
	
	@Test
	void testFindDimen1() {
		int H = 5, a = 6;
		double arr[] = {3,4};
		assertArrayEquals(arr,t.findDimen(H, a));
	}

	@Test
	void testFindDimen2() {
		int H = 5, a = 7;
		double arr[] = {-1,-1};
		assertArrayEquals(arr,t.findDimen(H, a));
	}

	@Test
	void testCheck() {
		int H = 4;
		int S = 4;
		assertEquals(true,t.check(H, S));
	}

	@Test
	void testFindPairs() {
		int n = 2, m = 2;
		int H[] = {4,6};
		int S[] = {3,9};
		assertEquals(3,t.findPairs(H, n, S, m));
	}

	@Test
	void testMinimumIncrease1() {
		int s1[] = {3,2,1};
		assertEquals(0,t.minimumIncrease(s1[0], s1[1], s1[2]));
	}

	@Test
	void testMinimumIncrease2() {
		int s1[] = {5,2,1};
		assertEquals(2,t.minimumIncrease(s1[0], s1[1], s1[2]));
	}

	@Test
	void testMinimumIncrease3() {
		int s1[] = {5,4,3};
		assertEquals(0,t.minimumIncrease(s1[0], s1[1], s1[2]));
	}
	
	@Test
	void testCal_cos() {
		float n = 37;
		assertEquals((float)(0.7985844),t.cal_cos(n));
	}

	@Test
	void testThird_side() {
		int a=2,b=3;
		float c=37;
		assertEquals((float)(1.8485096),t.third_side(a, b, c));
	}

	@Test
	void testFindPerimeter() {
		float a=1,b=3,c=1;
		assertEquals(5,t.findPerimeter(a, b, c));
	}

	@Test
	void testFindArea1() {
		float a=0,b=2,c=1;
		assertEquals(0,t.findArea(a, b, c));
	}

	@Test
	void testFindArea2() {
		float a=5,b=12,c=13;
		assertEquals(30,t.findArea(a, b, c));
	}

	@Test
	void testFindArea3() {
		float a=0,b=0,c=0;
		assertEquals(0,t.findArea(a, b, c));
	}

	@Test
	void testVals1() {
		int s1[] = {1,1,1};
		int s2[] = {1,1,1};
		int a1[] = {60,60,60};
		int a2[] = {60,60,60};
		assertEquals("SSS",t.vals(s1, s2, a1, a2));
	}

	@Test
	void testVals2() {
		int s1[] = {4,3,6};
		int s2[] = {3,5,6};
		int a1[] = {60,30,90};
		int a2[] = {90,70,20};
		assertEquals("HL",t.vals(s1, s2, a1, a2));
	}

	@Test
	void testVals3() {
		int s1[] = {6,3,5};
		int s2[] = {5,3,7};
		int a1[] = {60,40,80};
		int a2[] = {80,70,10};
		assertEquals("SAS",t.vals(s1, s2, a1, a2));
	}

	@Test
	void testVals4() {
		int s1[] = {5,7,3};
		int s2[] = {4,3,6};
		int a1[] = {60,50,80};
		int a2[] = {80,60,40};
		assertEquals("ASA",t.vals(s1, s2, a1, a2));
	}

	@Test
	void testVals5() {
		int s1[] = {5,7,3};
		int s2[] = {5,4,6};
		int a1[] = {60,50,80};
		int a2[] = {80,60,40};
		assertEquals("AAS",t.vals(s1, s2, a1, a2));
	}

	@Test
	void testVals6() {
		int s1[] = {5,7,3};
		int s2[] = {6,4,5};
		int a1[] = {40,50,90};
		int a2[] = {80,60,40};
		assertEquals("NONE",t.vals(s1, s2, a1, a2));
	}

}
