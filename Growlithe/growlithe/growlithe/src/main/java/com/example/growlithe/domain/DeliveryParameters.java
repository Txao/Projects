package com.example.growlithe.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "delivery")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DeliveryParameters {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double weigh;

    @Column(name = "order_from")
    private String orderFrom;

    @Column(name = "order_to")
    private String orderTo;

    @Column(name = "is_received")
    private Boolean isReceived;

    @Column(name = "is_delivered")
    private Boolean isDelivered;

}
