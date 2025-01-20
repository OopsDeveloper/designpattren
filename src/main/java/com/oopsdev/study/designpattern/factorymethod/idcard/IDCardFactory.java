package com.oopsdev.study.designpattern.factorymethod.idcard;

import com.oopsdev.study.designpattern.factorymethod.framework.Factory;
import com.oopsdev.study.designpattern.factorymethod.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
