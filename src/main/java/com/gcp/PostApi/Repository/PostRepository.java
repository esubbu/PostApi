package com.gcp.PostApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcp.PostApi.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
