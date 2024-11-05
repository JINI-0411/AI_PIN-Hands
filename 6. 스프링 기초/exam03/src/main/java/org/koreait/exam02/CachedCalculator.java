package org.koreait.exam02;

import java.util.HashMap;
import java.util.Map;

// 시간측정에 더불어서 캐시기능을 추가할 거임
public class CachedCalculator implements Calculator{

    // Impl이랑 Rec두군데 다 추가하고 싶음 그래서 다형성으로 개방폐쇄함
    private Map<Long, Long> cache = new HashMap<>();

    private Calculator cal;

    public CachedCalculator(Calculator cal) {
        this.cal=cal;
    }

    @Override
    public long factorial(long num) {
        if (cache.containsKey(num)){ // 공통 기능
            System.out.println("캐시에 저장된 값 사용!");
            return cache.get(num);
        }
        long result = cal.factorial(num); // 핵심 기능 대신 수행

        cache.put(num, result); // 공통 기능
        System.out.println("캐시에 값을 저장!");

        return result;
    }
}
