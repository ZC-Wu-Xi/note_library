package com.roy.algorithm;

import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.util.Collection;

/**
 * @author ：楼兰
 * @date ：Created in 2020/12/20
 * @description: 自定义扩展的范围分片算法。实现对select * from course where cid between 2000 and 3000; 这类语句的数据源分片
 **/

public class MyRangeDSShardingAlgorithm implements RangeShardingAlgorithm<Long> {
    /**
     *
     * @param availableTargetNames
     * @param shardingValue 包含逻辑表名、分片列和分片列的条件范围。
     * @return 返回目标结果。可以是多个。
     */
    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<Long> shardingValue) {
        //实现按照 Between 进行范围分片。
        //例如 select * from course where cid between 2000 and 3000;
        Long lowerEndpoint = shardingValue.getValueRange().lowerEndpoint();//2000
        Long upperEndpoint = shardingValue.getValueRange().upperEndpoint();//3000
        //对于我们这个奇偶分离的场景，大部分范围查询都是要两张表都查。
        return availableTargetNames;
    }
}
