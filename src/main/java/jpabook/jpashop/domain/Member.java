package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id") //pk컬럼명
    private Long id; //엔티티 식별자. 엔티티는 타입이 있으므로 id 필드만으로 구분 가능.

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member") //읽기 전용으로 된 매핑정보
    private List<Order> orders = new ArrayList<>();
}
