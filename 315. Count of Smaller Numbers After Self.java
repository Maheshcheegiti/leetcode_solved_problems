public class Solution {

    public List<Integer> countSmaller(int[] nums) {
        int len = nums.length;

        int[] idxs = new int[len];
        int[] count = new int[len];

        for (int i = 0; i < len; i++) idxs[i] = i;

        mergeSort(nums, idxs, 0, len, count);

        List<Integer> resultList = new ArrayList<>();
        for (int i : count) resultList.add(i);

        return resultList;
    }

    private void mergeSort(int[] nums, int[] idxs, int start, int end, int[] count) {
        if (start + 1 >= end) return;

        int mid = (end - start) / 2 + start;
        mergeSort(nums, idxs, start, mid, count);
        mergeSort(nums, idxs, mid, end, count);

        merge(nums, idxs, start, mid, end, count);
    }

    private void merge(int[] nums, int[] idxs, int start, int mid, int end, int[] count) {
        List<Integer> tmp = new ArrayList<>();
        List<Integer> tmpidx = new ArrayList<>();
        int i = start, j = mid;

        // Merge while both subarrays have elements
        while (i < mid && j < end) {
            if (nums[i] <= nums[j]) {
                count[idxs[i]] += j - mid;
                tmpidx.add(idxs[i]);
                tmp.add(nums[i]);
                i++;
            } else {
                tmpidx.add(idxs[j]);
                tmp.add(nums[j]);
                j++;
            }
        }

        // Merge remaining elements from the left subarray
        while (i < mid) {
            count[idxs[i]] += j - mid;
            tmpidx.add(idxs[i]);
            tmp.add(nums[i]);
            i++;
        }

        // Merge remaining elements from the right subarray
        while (j < end) {
            tmpidx.add(idxs[j]);
            tmp.add(nums[j]);
            j++;
        }

        // Copy the merged elements back to the original arrays
        for (int k = start; k < end; k++) {
            idxs[k] = tmpidx.get(k - start);
            nums[k] = tmp.get(k - start);
        }
    }
}
