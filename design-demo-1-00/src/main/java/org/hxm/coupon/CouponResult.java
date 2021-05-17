package org.hxm.coupon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author aaron.hu
 * @version 1.0.0
 * @ClassName CouponResult.java
 * @Description TODO
 * @createTime 2021年05月17日 17:02:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CouponResult {

    private String code; // 编码
    private String info; // 描述

}
