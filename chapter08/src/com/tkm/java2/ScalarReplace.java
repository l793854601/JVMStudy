package com.tkm.java2;

public class ScalarReplace {
    public static void main(String[] args) {
        alloc();
    }

    private static void alloc() {
        /*
            point并没有发生逃逸
            以下代码经过标量替换后，会变成：
            int x = 1;
            int y = 2;
            System.out.println("point.x = " + x + ", point.y = " + y);

         */
        Point point = new Point();
        point.setX(1);
        point.setY(2);
        System.out.println("point.x = " + point.x + ", point.y = " + point.y);
    }

    private static class Point {
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}

/*
    static class Customer {
        String name;
        int id;
        Account account;
    }

    static class Account {
        double balance;
    }
 */