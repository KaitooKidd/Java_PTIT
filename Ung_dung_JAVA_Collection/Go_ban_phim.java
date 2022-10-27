package Ung_dung_JAVA_Collection;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Go_ban_phim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String s = sc.next();
            Stack<Character> st1 = new Stack<>();
            Stack<Character> st2 = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '-' && s.charAt(i) != '<' && s.charAt(i) != '>') {
                    st1.push(s.charAt(i));
                }
                else if (s.charAt(i) == '<') {
                    if (!st1.empty()) {
                        st2.push(st1.pop());
                    }
                }
                else if (s.charAt(i) == '>') {
                    if (!st2.empty()) {
                        st1.push(st2.pop());
                    }
                }
                else if (s.charAt(i) == '-') {
                    if (!st1.empty()) {
                        st1.pop();
                    }
                }
            }
            while (!st2.empty()) {
                st1.push(st2.pop());
            }
            StringBuilder tmp = new StringBuilder();
            while (!st1.empty()) {
                tmp.append(st1.pop());
            }
            tmp.reverse();
            System.out.println(tmp);
        }
    }
