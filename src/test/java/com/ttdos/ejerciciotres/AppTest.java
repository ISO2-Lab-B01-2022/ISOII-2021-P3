package com.ttdos.ejerciciotres;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	
	/*@BeforeClass
	public void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() throws Exception {
	}*/
	
	@Test()
	public void testObtenerCompFunc() throws Exception {
		App h = new App();
		assertEquals(h.obtenerCompFunc(5), 0);
		assertEquals(h.obtenerCompFunc(10), 1);
		assertEquals(h.obtenerCompFunc(15), 1);
		assertEquals(h.obtenerCompFunc(35), 2);
		assertEquals(h.obtenerCompFunc(40), 2);
		assertEquals(h.obtenerCompFunc(50), 2);
		assertEquals(h.obtenerCompFunc(55), 2);
		assertEquals(h.obtenerCompFunc(70), 3);
		assertEquals(h.obtenerCompFunc(75), 3);
		assertEquals(h.obtenerCompFunc(80), 3);
		assertEquals(h.obtenerCompFunc(90), 4);
		assertEquals(h.obtenerCompFunc(95), 4);
		assertEquals(h.obtenerCompFunc(100), 4);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerCompFunc() throws Exception {
		App h = new App();
		h.obtenerCompFunc(-5);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerCompFunc1() throws Exception {
		App h = new App();
		h.obtenerCompFunc(105);
	}

	@Test
	public void testObtenerCorFunc() throws Exception{
		App h = new App();
		assertEquals(h.obtenerCorFunc(5), 0);
		assertEquals(h.obtenerCorFunc(10), 1);
		assertEquals(h.obtenerCorFunc(15), 1);
		assertEquals(h.obtenerCorFunc(35), 1);
		assertEquals(h.obtenerCorFunc(40), 1);
		assertEquals(h.obtenerCorFunc(50), 2);
		assertEquals(h.obtenerCorFunc(55), 2);
		assertEquals(h.obtenerCorFunc(70), 3);
		assertEquals(h.obtenerCorFunc(75), 3);
		assertEquals(h.obtenerCorFunc(80), 3);
		assertEquals(h.obtenerCorFunc(90), 5);
		assertEquals(h.obtenerCorFunc(95), 5);
		assertEquals(h.obtenerCorFunc(100), 5);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerCorFunc() throws Exception {
		App h = new App();
		h.obtenerCorFunc(-5);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerCorFunc1() throws Exception {
		App h = new App();
		h.obtenerCorFunc(105);
	}

	@Test
	public void testObtenerPertFunc() throws Exception{
		App h = new App();
		assertEquals(h.obtenerPertFunc(5), 0);
		assertEquals(h.obtenerPertFunc(10), 2);
		assertEquals(h.obtenerPertFunc(15), 2);
		assertEquals(h.obtenerPertFunc(35), 2);
		assertEquals(h.obtenerPertFunc(40), 2);
		assertEquals(h.obtenerPertFunc(50), 3);
		assertEquals(h.obtenerPertFunc(55), 3);
		assertEquals(h.obtenerPertFunc(70), 4);
		assertEquals(h.obtenerPertFunc(75), 4);
		assertEquals(h.obtenerPertFunc(80), 4);
		assertEquals(h.obtenerPertFunc(90), 5);
		assertEquals(h.obtenerPertFunc(95), 5);
		assertEquals(h.obtenerPertFunc(100), 5);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerPertFunc() throws Exception {
		App h = new App();
		h.obtenerPertFunc(-5);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerPertFunc1() throws Exception {
		App h = new App();
		h.obtenerPertFunc(105);
	}

	@Test
	public void testObtenerAdecuacionFuncional() throws Exception{
		App h = new App();
		assertEquals(h.obtenerAdecuacionFuncional(3,4,4), 3);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsAdecuacionFuncional() throws Exception {
		App h = new App();
		h.obtenerAdecuacionFuncional(-1,-1,-1);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsAdecuacionFuncional1() throws Exception {
		App h = new App();
		h.obtenerAdecuacionFuncional(6,6,6);
	}

	@Test
	public void testObtenerModu() throws Exception{
		App h = new App();
		assertEquals(h.obtenerModu(5), 0);
		assertEquals(h.obtenerModu(10), 1);
		assertEquals(h.obtenerModu(15), 1);
		assertEquals(h.obtenerModu(35), 2);
		assertEquals(h.obtenerModu(40), 2);
		assertEquals(h.obtenerModu(50), 2);
		assertEquals(h.obtenerModu(55), 2);
		assertEquals(h.obtenerModu(70), 3);
		assertEquals(h.obtenerModu(75), 3);
		assertEquals(h.obtenerModu(80), 3);
		assertEquals(h.obtenerModu(90), 4);
		assertEquals(h.obtenerModu(95), 4);
		assertEquals(h.obtenerModu(100), 4);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerModu() throws Exception {
		App h = new App();
		h.obtenerModu(-5);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerModu1() throws Exception {
		App h = new App();
		h.obtenerModu(105);
	}

	@Test
	public void testObtenerReusa() throws Exception{
		App h = new App();
		assertEquals(h.obtenerReusa(5), 0);
		assertEquals(h.obtenerReusa(10), 1);
		assertEquals(h.obtenerReusa(15), 1);
		assertEquals(h.obtenerReusa(35), 2);
		assertEquals(h.obtenerReusa(40), 2);
		assertEquals(h.obtenerReusa(50), 2);
		assertEquals(h.obtenerReusa(55), 2);
		assertEquals(h.obtenerReusa(70), 3);
		assertEquals(h.obtenerReusa(75), 3);
		assertEquals(h.obtenerReusa(80), 3);
		assertEquals(h.obtenerReusa(90), 5);
		assertEquals(h.obtenerReusa(95), 5);
		assertEquals(h.obtenerReusa(100), 5);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerReusa() throws Exception {
		App h = new App();
		h.obtenerReusa(-5);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerReusa1() throws Exception {
		App h = new App();
		h.obtenerReusa(105);
	}

	@Test
	public void testObtenerAna() throws Exception{
		App h = new App();
		assertEquals(h.obtenerAna(5), 0);
		assertEquals(h.obtenerAna(10), 0);
		assertEquals(h.obtenerAna(15), 0);
		assertEquals(h.obtenerAna(35), 1);
		assertEquals(h.obtenerAna(40), 1);
		assertEquals(h.obtenerAna(50), 2);
		assertEquals(h.obtenerAna(55), 2);
		assertEquals(h.obtenerAna(70), 3);
		assertEquals(h.obtenerAna(75), 3);
		assertEquals(h.obtenerAna(80), 3);
		assertEquals(h.obtenerAna(90), 5);
		assertEquals(h.obtenerAna(95), 5);
		assertEquals(h.obtenerAna(100), 5);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerAna() throws Exception {
		App h = new App();
		h.obtenerAna(-5);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerAna1() throws Exception {
		App h = new App();
		h.obtenerAna(105);
	}

	@Test
	public void testObtenerCapModificacion() throws Exception{
		App h = new App();
		assertEquals(h.obtenerCapModificacion(5), 0);
		assertEquals(h.obtenerCapModificacion(10), 1);
		assertEquals(h.obtenerCapModificacion(15), 1);
		assertEquals(h.obtenerCapModificacion(35), 2);
		assertEquals(h.obtenerCapModificacion(40), 2);
		assertEquals(h.obtenerCapModificacion(50), 3);
		assertEquals(h.obtenerCapModificacion(55), 3);
		assertEquals(h.obtenerCapModificacion(70), 4);
		assertEquals(h.obtenerCapModificacion(75), 4);
		assertEquals(h.obtenerCapModificacion(80), 4);
		assertEquals(h.obtenerCapModificacion(90), 5);
		assertEquals(h.obtenerCapModificacion(95), 5);
		assertEquals(h.obtenerCapModificacion(100), 5);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerCapModificacion() throws Exception {
		App h = new App();
		h.obtenerCapModificacion(-5);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerCapModificacion1() throws Exception {
		App h = new App();
		h.obtenerCapModificacion(105);
	}

	@Test
	public void testObtenerCapSerProbado() throws Exception{
		App h = new App();
		assertEquals(h.obtenerCapSerProbado(5), 0);
		assertEquals(h.obtenerCapSerProbado(10), 1);
		assertEquals(h.obtenerCapSerProbado(15), 1);
		assertEquals(h.obtenerCapSerProbado(35), 1);
		assertEquals(h.obtenerCapSerProbado(40), 1);
		assertEquals(h.obtenerCapSerProbado(50), 2);
		assertEquals(h.obtenerCapSerProbado(55), 2);
		assertEquals(h.obtenerCapSerProbado(70), 4);
		assertEquals(h.obtenerCapSerProbado(75), 4);
		assertEquals(h.obtenerCapSerProbado(80), 4);
		assertEquals(h.obtenerCapSerProbado(90), 4);
		assertEquals(h.obtenerCapSerProbado(95), 4);
		assertEquals(h.obtenerCapSerProbado(100), 4);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerCapSerProbado() throws Exception {
		App h = new App();
		h.obtenerCapSerProbado(-5);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerSerProbado1() throws Exception {
		App h = new App();
		h.obtenerCapSerProbado(105);
	}

	@Test
	public void testObtenerMantenibilidad() throws Exception{
		assertEquals(App.obtenerMantenibilidad(3,4,4,4,4), 3);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerMantenibilidad() throws Exception {
		App h = new App();
		h.obtenerMantenibilidad(-1,-1,-1,-1,-1);
	}
	
	@Test(expected = Exception.class)
	public void expectedErrorsObtenerMantenibilidad1() throws Exception {
		App h = new App();
		h.obtenerMantenibilidad(6,6,6,6,6);
	}

	@Test
	public void testEvaluacionCalidad() throws Exception{
		assertEquals(App.evaluacionCalidad(5,5), true);
	}
	
	@Test
	public void testEvaluacionCalidad1() throws Exception{
		assertEquals(App.evaluacionCalidad(0,0), false);
	}

	@Test
	public void testMin() throws Exception{
		int[] v1 = new int[] {6,5,2};
		int[] v2 = new int[] {6,5,25};
		assertEquals(App.min(v1), 2);
		assertEquals(App.min(v2), 5);
	}

	@Test
	public void testLeerCosas() {
		
	}
}
