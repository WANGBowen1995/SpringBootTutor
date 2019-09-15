package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TwoSumRepository {
    List<Integer> list = new ArrayList<>();
    public TwoSumRepository() {
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
    }

    public List<Integer> getDefaultList() {
        return list;
    }
}
