package com.youngseok.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.youngseok.webservice.domain.posts.PostsRepository;
import com.youngseok.webservice.dto.posts.PostsSaveRequestDto;
import com.youngseok.webservice.service.PostsService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {
	
	private PostsService postsService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, Youngseok";
	}
	
	@PostMapping("/posts")
	public long savePosts(@RequestBody PostsSaveRequestDto dto) {
		return postsService.save(dto);
	}
}
