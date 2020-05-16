package com.learn.neko.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @author NekoChips
 * @description Spring 事务管理伪代码
 * @date 2020/5/15
 */
public class TransactionManagerDemo {

//    @Autowired
//    private PlatformTransactionManager transactionManager;
//    
//    public void executeTransaction() {
//        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
//        TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
//        try {
//            // 处理事务逻辑代码
//            // 事务执行完毕后，提交事务
//            transactionManager.commit(transactionStatus);
//        } catch (Exception e) {
//            transactionManager.rollback(transactionStatus);
//        }
//    }

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Autowired
    private PlatformTransactionManager transactionManager;
    
    public void executeTransaction() {
        transactionTemplate.setTransactionManager(transactionManager);
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                try {
                    // 处理事务的逻辑代码
                } catch (Exception e) {
                    // 事务异常，将 TransactionStatus 设为只回滚事务
                    status.setRollbackOnly();
                }
            }
        });
    }
}
