package com.example.demo.service;

import com.example.demo.repository.TwoSumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Component
public class TwoSumService {
    @Autowired
    TwoSumRepository twoSumRepository;

    public int[] getMatchedIndexDefault(int target) {
        List<Integer> defaultList = twoSumRepository.getDefaultList();
        return calculateTwoSum(defaultList, target);
    }

    public int[] getMatchIndex(List<Integer> nums, int target) {
        return calculateTwoSum(nums, target);
    }

    public int[] calculateTwoSum(List<Integer> nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = -1; ans[1] = -1;
        for(int i = 0; i < nums.size(); i++) {
            int diff = target - nums.get(i);
            if(map.containsKey(diff)) {
                ans[0] = map.get(diff);
                ans[1] = i;
                break;
            }
            map.put(nums.get(i), i);
        }
        return ans;
    }
}
