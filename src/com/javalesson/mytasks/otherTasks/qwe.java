package com.javalesson.mytasks.otherTasks;

public class qwe {
    public static void main(String[] args) {
        class Point {
            protected int x = 1;
            protected int y = 2;
        }
        class Point3D extends Point {
            private int z = 3;
            public Point3D(int x1, int y1, int z1) {
                x = x1;
                y = y1;
                z = z1;
            }
            public void print() {
                System.out.println(x + " " + y + " " + z);
            }
        }
    }
}
