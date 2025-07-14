package ArrayEasy;

import java.util.ArrayList;

public class UnionOfTwoArray {
    public static void main(String[] args) {

        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};

        ArrayList list = new ArrayList();

        for (int i : nums1) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }

        for (int i : nums2) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }

        System.out.println(list);
    }
}
