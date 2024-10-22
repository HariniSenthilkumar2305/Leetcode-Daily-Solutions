#include <stdlib.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDisappearedNumbers(int* nums, int numsSize, int* returnSize) {
    int* present = (int*)calloc(numsSize, sizeof(int));
    if (present == NULL) {
        *returnSize = 0;
        return NULL;
    }
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] > 0 && nums[i] <= numsSize) {
            present[nums[i] - 1] = 1;
        }
    }
    int* result = (int*)malloc(numsSize * sizeof(int));
    if (result == NULL) {
        free(present);
        *returnSize = 0;
        return NULL; 
    }

    int count = 0;
    for (int i = 0; i < numsSize; i++) {
        if (present[i] == 0) {
            result[count] = i + 1;
            count++;
        }
    }

    result = (int*)realloc(result, count * sizeof(int));
    if (result == NULL) {
        free(present);
        *returnSize = 0;
        return NULL; 
    }

    *returnSize = count;
    free(present);
    return result;
}
