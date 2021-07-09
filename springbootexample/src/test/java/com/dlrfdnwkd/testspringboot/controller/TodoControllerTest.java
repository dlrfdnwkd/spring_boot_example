package com.dlrfdnwkd.testspringboot.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@WebMvcTest(TodoController.class)
public class TodoControllerTest {

	@Autowired
	private MockMvc mvc;
	private AtomicInteger counter = new AtomicInteger();
	
	@Test
	public void todo_test() throws Exception{
		//given
		//when
		final ResultActions actions = mvc.perform(get("/todo/counter"))
		.andDo(print());
		//then
		actions
				.andExpect(status().isOk())
				.andDo(print());
	}
	@Test
	public void registryTodo_test() throws Exception{
		//given
		//when
		final ResultActions action = mvc.perform(post("/todo/title").param("todoTitle", "junit")
				.contentType(MediaType.APPLICATION_JSON_UTF8))
				.andDo(print());
		//then
		action
				.andExpect(status().isOk())
				.andDo(print());
	}
}
