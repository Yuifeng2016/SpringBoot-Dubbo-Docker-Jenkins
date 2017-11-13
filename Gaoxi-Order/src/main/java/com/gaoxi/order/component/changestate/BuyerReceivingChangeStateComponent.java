package com.gaoxi.order.component.changestate;

import com.gaoxi.enumeration.order.OrderStateEnum;

/**
 * @author 大闲人柴毛毛
 * @date 2017/11/13 上午8:43
 *
 * @description 买家待收货状态
 */
public class BuyerReceivingChangeStateComponent extends BaseChangeStateComponent {
    @Override
    public void setTargetOrderState() {
        this.targetOrderState = OrderStateEnum.BUYER_RECEIVING;
    }
}
