package com.simba.slog.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="artciles")
public class Article implements Comparable<Article> {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String body;
    private Date createdDate;

    public Article() {
    }

    public Article(String title, String body, Date createdDate) {
        this.title = title;
        this.body = body;
        this.createdDate = createdDate;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Date createdDate() {
        return createdDate;
    }

    @Override
    public int compareTo(Article o) {
        return o.createdDate.compareTo(this.createdDate);
    }
}
