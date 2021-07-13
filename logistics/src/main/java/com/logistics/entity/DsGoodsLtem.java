package com.logistics.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 物品类型表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DsGoodsLtem implements Serializable {
    private Integer dsGoodsId;

    private String dsGoodsName;

    private static final long serialVersionUID = 1L;
}