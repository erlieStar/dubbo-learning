package com.javashitang.producer;

import static org.junit.Assert.assertTrue;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
@Slf4j
public class MyTest {

    /**
     * awk /request cost/ END {printf $1}
     * awk 'BEGIN{overtime=1000;urllength=0} /request cost/{{sum[$8]+=$9;count[$8]++;if(count[$8]==1){max[$8]=$9;min[$8]=$9;great1000[$8]=0;}if($9>max[$8])max[$8]=$9;if($9<min[$8])min[$8]=$9;if($9>overtime)great1000[$8]++;if(urllength<length($8))urllength=length($8);}} END {printf "%-"urllength"s %-5s %-7s %-8s %-5s %-10s %-5s\n","请求路径","大于"overtime"次数","总调用次数","超时比率","最大时长","最小时长","平均时长";for(j=60;j>0;j--){printf"--";}printf"\n";for(i in count) if(great1000[i]>0){printf "%-"urllength+5"s >overtime=%-5s count=%-5s 比率=%.2f%   max=%-5s min=%-5s avg=%-10s \n",i,great1000[i],count[i],great1000[i]*100/count[i],max[i],min[i],sum[i]/count[i]}}' 2020-10-12.log
     */
    @Test
    public void test1() {
        log.info("request cost:[" + "aa" + "] " + 10);
    }
}
