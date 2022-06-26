package com.iluwatar.facade.abstractfacade;

import com.iluwatar.facade.DwarvenCartOperator;
import com.iluwatar.facade.DwarvenGoldDigger;

/**
 * @author 15073747
 * @datetime 2018-08-24 15:21
 * @desc
 */
public class MyAbsFacade extends GoldmineAbstractFacade {
    private DwarvenCartOperator cartOperator;
    private DwarvenGoldDigger goldDigger;

    @Override
    public void startNewDay() {
        cartOperator.work();
        cartOperator.goHome();
    }
}
