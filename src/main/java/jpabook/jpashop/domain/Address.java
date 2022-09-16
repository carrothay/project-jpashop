package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable //내장 파일
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
