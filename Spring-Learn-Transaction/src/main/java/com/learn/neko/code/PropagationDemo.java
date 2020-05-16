package com.learn.neko.code;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author NekoChips
 * @description 事务传播行为伪代码
 * @date 2020/5/15
 */
public class PropagationDemo {
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void methodA() {
        methodB();
        // doSomething
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void methodB() {
        // doSomething
    }
}
