int thirdMax(int* nums, int numsSize) {
    int temp, n = numsSize;

    // Sorting the array in descending order
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (nums[i] < nums[j]) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }

    int count = 1, pos;

    // If there are fewer than 3 elements, return the maximum
    if (n < 3) {
        return nums[0];
    } else {
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                count++;
            }
            if (count == 3) {
                pos = i + 1;
            }
        }
        if (count < 3) {
            return nums[0];
        }

        return nums[pos];
    }
}
