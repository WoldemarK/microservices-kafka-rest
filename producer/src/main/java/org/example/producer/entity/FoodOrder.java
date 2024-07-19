package org.example.producer.entity;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class FoodOrder {

    String item;
    Double amount;
}
