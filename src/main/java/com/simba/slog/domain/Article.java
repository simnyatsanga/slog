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
    private String summary;
    private String body;
    private Date createdDate;

    public Article() {
        this.title ="";
        this.summary="";
        this.body="";
    }

    public Article(String title, String summary, String body, Date createdDate) {
        this.title = title;
        this.summary = summary;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    @Override
    public int compareTo(Article o) {
        return o.createdDate.compareTo(this.createdDate);
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Long getId() {
        return id;
    }
}
