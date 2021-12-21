package com.ttdos.ejerciciotres;

import static org.junit.Assert.*;

import org.junit.*;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {
	
	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public static void setUp() throws Exception {
		
	}

	@After
	public static void tearDown() throws Exception {
	}

	@Test
	public static void testMain() {
		fail("Not yet implemented"); // TODO
	}*/

	@Test
	public static void testObtenerCompFunc() {
		assertEquals(App.obtenerCompFunc(5), 0);
	}

	@Test
	public static void testObtenerCorFunc() {
		assertEquals(App.obtenerCorFunc(5), 0);
	}

	@Test
	public static void testObtenerPertFunc() {
		assertEquals(App.obtenerPertFunc(5), 0);
	}

	@Test
	public static void testObtenerAdecuacionFuncional() {
		assertEquals(App.obtenerAdecuacionFuncional(0,0,0), 0);
	}

	@Test
	public static void testObtenerModu() {
		assertEquals(App.obtenerModu(5), 0);
	}

	@Test
	public static void testObtenerReusa() {
		assertEquals(App.obtenerPertFunc(5), 0);
	}

	@Test
	public static void testObtenerAna() {
		assertEquals(App.obtenerAna(5), 0);
	}

	@Test
	public static void testObtenerCapModificacion() {
		assertEquals(App.obtenerCapModificacion(5), 0);
	}

	@Test
	public static void testObtenerCapSerProbado() {
		assertEquals(App.obtenerCapModificacion(5), 0);
	}

	@Test
	public static void testObtenerMantenibilidad() {
		assertEquals(App.obtenerMantenibilidad(0,0,0,0,0), 0);
	}

	@Test
	public static void testEvaluacionCalidad() {
		assertEquals(App.evaluacionCalidad(0,0), false);
	}

	@Test
	public static void testMin() {
		int[] v = new int[] {4,5,6};
		assertEquals(App.min(v), 4);
	}

	private App createTestSubject()  {
	 return new App();
	}

	/*@Test
	public static void testLeerCosas() {
		fail("Not yet implemented"); // TODO
	}*/
}
