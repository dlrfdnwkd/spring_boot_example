package com.dlrfdnwkd.testspringboot.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dlrfdnwkd.testspringboot.model.Todo;

@RestController
@RequestMapping(value="/todo")
public class TodoController {
	
	private final AtomicInteger counter = new AtomicInteger();
	
	//get api - counter 값 확인
	@RequestMapping(value="/counter", method=RequestMethod.GET)
	public Todo todo(){
		return new Todo(counter.incrementAndGet(),"테스트중");
	}
	//post api - body title 값 확인
	@RequestMapping(value="/title", method=RequestMethod.POST)
	public Todo registryTodo(@RequestParam(value="todoTitle")String todoTitle){
		return new Todo(counter.incrementAndGet(),todoTitle);
	}
	//http header api - 응답 상태값 확인
	@RequestMapping(value="/status", method=RequestMethod.POST)
	public ResponseEntity<Todo> postRegistryTodo(@RequestParam String todoTitle){
		return new ResponseEntity<>(new Todo(counter.incrementAndGet(),todoTitle),HttpStatus.CREATED);
	}
}
