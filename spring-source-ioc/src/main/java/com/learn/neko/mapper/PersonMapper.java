package com.learn.neko.mapper;

import com.learn.neko.condition.MyCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Repository;

/**
 * @author NekoChips
 * @description Person Mapper
 * @date 2020/4/18
 */

@Repository
@Conditional(value = MyCondition.class)
public class PersonMapper {
    
}
