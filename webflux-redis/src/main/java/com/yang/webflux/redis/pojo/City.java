package com.yang.webflux.redis.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @Author: Mu_Yi
 * @Date: 2019/9/19 23:00
 * @Version 1.0
 * @qq: 1411091515
 */

@Data
public class City implements Serializable {

    private static final long serialVersionUID = -2081742442561524068L;

    @Id
    private Long id;

    private Long provinceId;

    private String cityName;

    private String description;

}
