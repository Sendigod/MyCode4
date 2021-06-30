package com.sorrymaker.day12;

import java.util.List;

/**
 * @Author nextGame
 * @Date 2021/5/20 21:17
 * @Version 1.0
 */
public class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;

        public Employee() {
        }

        public Employee(int id, int importance, List<Integer> subordinates) {
                this.id = id;
                this.importance = importance;
                this.subordinates = subordinates;
        }

        @Override
        public String toString() {
                return "Employee{" +
                        "id=" + id +
                        ", importance=" + importance +
                        ", subordinates=" + subordinates +
                        '}';
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public int getImportance() {
                return importance;
        }

        public void setImportance(int importance) {
                this.importance = importance;
        }

        public List<Integer> getSubordinates() {
                return subordinates;
        }

        public void setSubordinates(List<Integer> subordinates) {
                this.subordinates = subordinates;
        }
}
