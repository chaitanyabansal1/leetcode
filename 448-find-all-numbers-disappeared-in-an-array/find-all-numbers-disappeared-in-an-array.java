class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> brr = new ArrayList<>();

        Arrays.sort(nums);

        int pos = 0;
        int j = 0;
        int[] arr = new int[nums.length];

        for (int i = 1; i <= nums.length; i++) {

            while (j < nums.length && nums[j] < i) {
                j++;
            }

            if (j >= nums.length || nums[j] != i) {
                arr[pos] = i;
                pos++;
            }
        }

        for (int i = 0; i < pos; i++) {
            brr.add(arr[i]);
        }

        return brr;
    }
}