class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        // Ensure nums1 is the smaller array
        if (n > m) return findMedianSortedArrays(nums2, nums1);

        int start = 0, end = n;
        int realMidInMergedArray = (n + m + 1) / 2;

        while (start <= end) {
            int mid = (start + end) / 2;
            int leftASize = mid;
            int leftBSize = realMidInMergedArray - mid;

            // Handle boundaries
            int leftA = (leftASize > 0) ? nums1[leftASize - 1] : Integer.MIN_VALUE;
            int leftB = (leftBSize > 0) ? nums2[leftBSize - 1] : Integer.MIN_VALUE;

            int rightA = (leftASize < n) ? nums1[leftASize] : Integer.MAX_VALUE;
            int rightB = (leftBSize < m) ? nums2[leftBSize] : Integer.MAX_VALUE;

            // Check partition correctness
            if (leftA <= rightB && leftB <= rightA) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                } else {
                    return Math.max(leftA, leftB);
                }
            } 
            else if (leftA > rightB) {
                end = mid - 1;  // move left
            } 
            else {
                start = mid + 1; // move right
            }
        }

        return 0.0; // Should not reach here
    }
}
