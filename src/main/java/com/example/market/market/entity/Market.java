package com.example.market.market.entity;


import com.example.market.base.entity.BaseEntity;
import com.example.market.member.entity.Member;
import com.example.market.product.entity.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Market extends BaseEntity {
    private String email;
    private String name;
    private String info;
    @OneToOne
    private Member member;

    @OneToMany(mappedBy = "market", cascade = CascadeType.REMOVE)
    private List<Product> productList;
}
