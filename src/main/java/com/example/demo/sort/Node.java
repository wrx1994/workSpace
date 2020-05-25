package com.example.demo.sort;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Node {
    public int value;
    public Node next;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static void main(String[] args) {
        int roadMessage = 0;
        int[] roadMessages = {6,7,5,5,8,7,7};
        int maxCount = 0;
        int j, k;
        for(j = 0; j < roadMessages.length; ++j)
        {
            int count = 1;
            //
            for(k = j + 1; k < roadMessages.length; ++k)
            {
                if(roadMessages[j] == roadMessages[k])
                    ++count;
            }

            if(count > maxCount) {
                maxCount = count;
                roadMessage = roadMessages[j];
            }
        }
        System.out.println(roadMessage);
    }
}
