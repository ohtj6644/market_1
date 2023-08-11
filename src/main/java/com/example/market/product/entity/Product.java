package com.example.market.product.entity;


import com.example.market.base.entity.BaseEntity;
import com.example.market.market.entity.Market;
import com.example.market.question.entity.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Setter
@Getter
public class Product extends BaseEntity {
    private String name;
    private String Description;
    private int price;
    private int hitCount;
    private String isActive;
    @ManyToOne
    private Market market;
    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private List<Question> questionList;
}