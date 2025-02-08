package com.Exam.Transactions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalLong;
import java.util.stream.Collectors;

public class TestTransactions {
    public static void main(String[] args) {
        Map<Integer, Transction> transactionMap = new HashMap<>();
        transactionMap.put(1, new Transction(1, "credit", 5000L));
        transactionMap.put(2, new Transction(2, "debit", 2000L));
        transactionMap.put(3, new Transction(3, "credit", 10000L));

        Long c = transactionMap.values()
                .stream()
                .filter(e -> "credit".equalsIgnoreCase(e.getType()))
                .mapToLong(Transction::getAmount)
                .sum();

        // System.out.println(c);
        OptionalLong d = transactionMap.values()
                .stream()
                .filter(e -> "credit".equalsIgnoreCase(e.getType()))
                .mapToLong(Transction::getAmount)
                .min();
        System.out.println(d);
        List<Transction> f = transactionMap.values()
                .stream().filter(e -> "credit".equalsIgnoreCase(e.getType()))
                .collect(Collectors.toList());

        List<Transction> h = transactionMap.values()
                .stream().filter(e -> "debit".equalsIgnoreCase(e.getType()))
                .collect(Collectors.toList());
        System.out.println(h.size());

    }

}