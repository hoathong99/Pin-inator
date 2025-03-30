package com.example.Pin_inator.Controllers;

import com.example.Pin_inator.Models.Core.Article;
import com.example.Pin_inator.Service.ArticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/article")
public class ArticalController {
    private final ArticalService articleService ;

    @Autowired
    public ArticalController(ArticalService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public List<Article> GetArticlesOfOwner(String ownerId){
        UUID Id = UUID.fromString(ownerId);
        return articleService.GetArticlesOfOwner(Id);
    }
}
