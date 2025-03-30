package com.example.Pin_inator.Repository;

import com.example.Pin_inator.Models.Core.Article;
import com.example.Pin_inator.Models.Core.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findByOwner_Id(UUID ownerId);
}
