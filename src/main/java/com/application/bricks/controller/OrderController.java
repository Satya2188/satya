package com.application.bricks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.bricks.bean.Bricks;
import com.application.bricks.manager.BricksManager;
@RestController
@RequestMapping("/bricks")
public class OrderController {
	
	@Autowired
	private BricksManager bricksManager;

	
	@GetMapping("/{orderId}")
	public ResponseEntity<?> createOrder(@PathVariable final String orderId) {
		String createOrders = bricksManager.createOrders(orderId);
		if (createOrders != null) {
			return new ResponseEntity<>(createOrders, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(createOrders, HttpStatus.NOT_FOUND);
		}
	}
	@PutMapping("/updateOrders/{id}")
	public ResponseEntity<?> updateOrder(@RequestBody Bricks bricks) {
		Object updatedOrders = bricksManager.updateOrder();
		if (updatedOrders != null) {
			return new ResponseEntity<>(updatedOrders, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(updatedOrders, HttpStatus.NOT_FOUND);
		}
	}
}
