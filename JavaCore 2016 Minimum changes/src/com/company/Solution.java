package com.company;

/*

2016 Minimum changes

With a minimum of code changes, make Class C serialization possible.

Requirements:
1. There must be a class A in the Solution class.
2. There must be a class B in the Solution class.
3. There must be a class C in the Solution class.
4. Class B must be a descendant of Class A.
5. Class C must be a descendant of Class B.
6. Class A must support the Serializable interface.
7. Class B should not explicitly support the Serializable interface.
8. Class C should not explicitly support the Serializable interface.


 */

import java.io.Serializable;

public class Solution {
    public class A implements Serializable {
        String name = "A";

        public A(String name) {
            this.name += name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public class B extends A {
        String name = "B";

        public B(String name) {
            super(name);
            this.name += name;
        }
    }

    public class C extends B {
        String name = "C";

        public C(String name) {
            super(name);
            this.name = name;
        }
    }

    public static void main(String[] args) {

    }
}

