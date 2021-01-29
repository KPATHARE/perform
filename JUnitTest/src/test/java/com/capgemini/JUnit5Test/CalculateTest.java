package com.capgemini.JUnit5Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations.Mock;

public class CalculateTest {
	Calculate c=null;
	@Mock
	CalculateService service;   //=Mockito.mock(CalculateService.class);
	
	@Before
	public void setUp() {
		c=new Calculate(service);
	}

	@Test
	public void testPerform() {
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(10,c.perform(2, 3));
		verify(service).add(2, 3);
	}

}
