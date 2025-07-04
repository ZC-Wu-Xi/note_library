package com.roy.algorithm;

import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author roy
 * @date 2022/3/27
 * @desc
 */
public class MyRangeTabelShardingAlogorithm implements RangeShardingAlgorithm<Long> {
    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<Long> shardingValue) {
        Long lowerEndpoint = shardingValue.getValueRange().lowerEndpoint();
        Long upperEndpoint = shardingValue.getValueRange().upperEndpoint();
        return Arrays.asList(shardingValue.getLogicTableName()+"_1",shardingValue.getLogicTableName()+"_2");
    }
}
