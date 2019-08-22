package com.kloudportal.bricks.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.kloudportal.bricks.bean.Bricks;
import com.kloudportal.bricks.manager.BricksManager;
import com.kloudportal.bricks.utils.Constants;

public class OrderControllerTests {

	@Mock
	BricksManager bricksManager;
	
	@Mock
	OrderController orderController;
	
	Bricks bricks;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void create_order_bricks_success() {
		String orderId = Constants.BRICKS_CREATE;
		Mockito.when(bricksManager.createOrders(Mockito.anyString())).thenReturn(orderId);
		ResponseEntity<?> orderSuccess = orderController.createOrder(Constants.BRICKS_CREATE);
		assertNotNull(orderSuccess);
		assertEquals(HttpStatus.OK, orderSuccess.getStatusCode());
	}
	
	@Test
	public void create_order_bricks_failure() {
		String orderId = Constants.BRICKS_CREATE;
		Mockito.when(bricksManager.createOrders(Mockito.anyString())).thenReturn(orderId);
		ResponseEntity<?> orderFailure = orderController.createOrder(Constants.BRICKS_CREATE);
		assertNotNull(orderFailure);
		assertEquals(HttpStatus.NOT_FOUND, orderFailure.getStatusCode());
	}
	
	@Test
	public void update_order_bricks_success() {
		String updateOrder = Constants.BRICKS_UPDATE;
		Mockito.when(bricksManager.createOrders(Mockito.anyString())).thenReturn(updateOrder);
		ResponseEntity<?> orderSuccess = orderController.createOrder(Constants.BRICKS_UPDATE);
		assertNotNull(orderSuccess);
		assertEquals(HttpStatus.OK, orderSuccess.getStatusCode());
	}
	
	@Test
	public void update_order_bricks_failure() {
		String updateOrder = Constants.BRICKS_UPDATE;
		Mockito.when(bricksManager.createOrders(Mockito.anyString())).thenReturn(updateOrder);
		ResponseEntity<?> orderFailure = orderController.updateOrder(bricks);
		assertNotNull(orderFailure);
		assertEquals(HttpStatus.NOT_FOUND, orderFailure.getStatusCode());
	}
	
}
