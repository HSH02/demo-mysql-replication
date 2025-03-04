package com.demo.domain.post.entity

import com.demo.global.entity.BaseTime
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Post(
    @Column(length = 100)
    var title: String,

    @Column(columnDefinition = "TEXT")
    var content: String
) : BaseTime()