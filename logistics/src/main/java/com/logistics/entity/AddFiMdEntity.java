package com.logistics.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AddFiMdEntity {

    private String waybillNumber;
    private String outletsName;
    private String userName;
    private int type;

}
