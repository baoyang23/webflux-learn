package com.yang.mongo.ty.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @Author: Mu_Yi
 * @Date: 2019/9/18 23:48
 * @Version 1.0
 * @qq: 1411091515
 */

@Data
public class City {

    /**
     * 城市编号
     */
    @Id
    private Long id;


    /**
     * 省份编号
     */
    private Long provinceId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
    private String description;

}
