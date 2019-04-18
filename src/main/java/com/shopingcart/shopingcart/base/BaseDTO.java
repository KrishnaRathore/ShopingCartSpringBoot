package com.shopingcart.shopingcart.base;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseDTO {

    private LocalDateTime createDate;

    private LocalDateTime updatedDate;


}
