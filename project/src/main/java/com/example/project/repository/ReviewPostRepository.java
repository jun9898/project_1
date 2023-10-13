package com.example.project.repository;

import com.example.project.dto.request.user.ReviewPostDTO;
import com.example.project.dto.response.user.ReviewPostReadDTO;


public interface ReviewPostRepository {

    void write(ReviewPostDTO dto);
    ReviewPostReadDTO read(Long review_seq);



}
