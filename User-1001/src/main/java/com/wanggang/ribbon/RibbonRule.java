package com.wanggang.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : RibbonRule
 * @Description : RibbonRule
 * @Author : wanggang
 * @Date: 2020-09-27 20:25
 * @Version 1.0
 **/
@Configuration
public class RibbonRule {

    public IRule getRibbonRule(){
        return new RandomRule();
    }

}
