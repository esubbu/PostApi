package com.gcp.PostApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gcp.PostApi.Repository.PostRepository;
import com.gcp.PostApi.entity.Post;

@RestController
//@RequestMapping("/post")
public class PostController {

	@Autowired
	PostRepository postRepo;
	
	@PostMapping("/savePost")
	public Post savePostData(@RequestParam String post) {
		Post postData=new Post();
		postData.setPost(post);
		return postRepo.save(postData);
		
	}
	
	@GetMapping("/posts")
	public List<Post> getList(){
		return postRepo.findAll();
		
	}
}
