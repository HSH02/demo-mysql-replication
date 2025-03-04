package com.demo.domain.post.repository

import com.demo.domain.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>