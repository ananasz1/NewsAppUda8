package com.example.vikischmideg.newsappuda8;

/**
 * Created by viki.schmideg on 2017.06.05..
 */

public class Article {

    private String mArticleSection;
    private String mArticleTitle;
    private String mArticleUrl;
    private String mArticleDate;

    public Article(String articleTitle, String articleSection, String articleUrl, String articleDate) {
        mArticleTitle = articleTitle;
        mArticleSection = articleSection;
        mArticleUrl = articleUrl;
        mArticleDate = articleDate;
    }

    public String getArticleTitle() {
        return mArticleTitle;
    }

    public String getArticleSection() {
        return mArticleSection;
    }

    public String getArticleUrl() {
        return mArticleUrl;
    }

    public String getArticleDate() {
        return mArticleDate;
    }

}
