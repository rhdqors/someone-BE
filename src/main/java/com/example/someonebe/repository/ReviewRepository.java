package com.example.someonebe.repository;

import com.example.someonebe.entity.Review;
import com.example.someonebe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Optional<Review> findByIdAndUser(Long reviewid, User user);
}
