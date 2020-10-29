package com.lamienne.main;

import javax.inject.Inject;

import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DateSourceTest {

	@Inject
	private DateSourceTest ds;
	
	

}
