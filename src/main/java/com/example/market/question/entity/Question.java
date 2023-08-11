package com.example.market.question.entity;

import com.example.market.base.entity.BaseEntity;
import com.example.market.member.entity.Member;
import com.example.market.product.entity.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Question extends BaseEntity {
    private String title;
    private String content;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Product product;
}