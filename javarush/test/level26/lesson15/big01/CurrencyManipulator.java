package com.javarush.test.level26.lesson15.big01;


import com.javarush.test.level26.lesson15.big01.exception.NotEnoughMoneyException;

import java.util.*;

public class CurrencyManipulator
{
    public String currencyCode;
    public Map<Integer, Integer> denominations;

    public CurrencyManipulator(String currencyCode)
    {
        this.currencyCode = currencyCode;
        denominations = new HashMap<>();
    }

    public String getCurrencyCode()
    {
        return currencyCode;
    }

    public void addAmount(int denomination, int count){
        if(denominations.containsKey(denomination)){
            count += denominations.get(denomination);
        }
        denominations.put(denomination, count);
    }

    public int getTotalAmount(){
        int result = 0;
        for(Map.Entry<Integer, Integer> pair : denominations.entrySet()){
            result+= pair.getKey() * pair.getValue();
        }

        return result;
    }

    public boolean hasMoney() {
        boolean result = false;

        for(Map.Entry<Integer, Integer> pair : denominations.entrySet()){
            if(pair.getValue() != 0){
                result = true;
            }
        }
        return result;
    }
    public boolean isAmountAvailable(int expectedAmount){
        return getTotalAmount() >= expectedAmount;
    }
    public Map<Integer, Integer> withdrawAmount(int expectedAmount) throws NotEnoughMoneyException
    {
        Map<Integer, Integer> result = new HashMap<>();
        int amountToWithdraw = expectedAmount;
        synchronized (denominations)
        {
            List<Map.Entry<Integer, Integer>> sortedCash = new ArrayList<>();
            sortedCash.addAll(denominations.entrySet());
            Collections.sort(sortedCash, new Comparator<Map.Entry<Integer, Integer>>()
            {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
                {
                    return o2.getKey().compareTo(o1.getKey());
                }
            });

            for (Map.Entry<Integer, Integer> entry : sortedCash)
            {
                int denominator = entry.getKey();
                int availableBanknotes = entry.getValue();
                if (denominator <= amountToWithdraw)
                {
                    int withdrawnBanknotes = Math.min(availableBanknotes, amountToWithdraw / denominator);
                    result.put(denominator, withdrawnBanknotes);

                    amountToWithdraw -= denominator * withdrawnBanknotes;
                    if (amountToWithdraw == 0)
                        break;
                }
            }

            if (amountToWithdraw > 0)
                throw new NotEnoughMoneyException();

            // subtracting withdrawn money
            for (Map.Entry<Integer, Integer> entry : result.entrySet())
            {
                denominations.put(entry.getKey(), denominations.get(entry.getKey()) - entry.getValue());
            }
            for (Iterator<Map.Entry<Integer, Integer>> iterator = denominations.entrySet().iterator(); iterator.hasNext(); )
            {
                Map.Entry<Integer, Integer> next = iterator.next();
                if (next.getValue() == 0)
                    iterator.remove();
            }
        }
        return result;
    }
}
