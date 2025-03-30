package com.example.Pin_inator.Service;

import com.example.Pin_inator.Models.Core.Article;
import com.example.Pin_inator.Repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ArticalService {

    private final ArticleRepository repository;

    @Autowired
    public ArticalService(ArticleRepository repository) {
        this.repository = repository;
    }

    public List<Article> GetArticlesOfOwner(UUID ownerId){
        List<Article> result = repository.findByOwner_Id(ownerId);
        return result;
    }
}
