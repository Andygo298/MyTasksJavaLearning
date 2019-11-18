package com.javalesson.mytasks.otherTasks;

public class InkapsTask {
    public static void main(String[] args) {

        class Counter{
            public int count=3;
            public void add(int val){
                int temp = 1;
                temp += val;
                count += temp;
            }
        }
        Counter c = new Counter();
        for (int i = 1; i < 4; i++) {
            c.add(i);
        }
        System.out.println(c.count);
    }
}
