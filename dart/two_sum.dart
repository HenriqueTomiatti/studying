/*
leet code challenge two sum
 */
void main() {
  List<int> nums = [2, 7, 11, 15];
  int target = 13;

  List<int> result =  twoSum(nums, target);
  
  if(result.isNotEmpty) {
    print("Indices: ${result[0]} and ${result[1]}");
  } else {
    print("No solution found");
  }
}
/*
I wrote te explanation at the of the code!!!
*/
List<int> twoSum(List<int> nums, int target) {
  for(int i = 0;  i < nums.length; i++) {
    for(int j = i + 1; j < nums.length;  j++ ) {
      if(nums [j] + nums[i] == target) {
        return [i, j];
      }
    }
  }
  return [];
}
/*
The explanation is:
int i = 0: the variable i is initialized with the value 0, which indicates that we start with the first element in the "nums" list
i < nums.length: this condition checks if i is less than the length of the list "nums", ensuring that the loop continues as long as there are elements to iterate over in the list
i++ goes to the next element in the list
int j = i + 1: The variable j starts with the value of i + 1. This means the second loop always begins at the next element after the one being processed by the first loop (i) for example, if i is 0, j starts at 1, if i is 1, j starts at 2, and so on
j < nums.length: The loop continues as long as j is less than the length of the list. This allows comparing the current element nums[i] with all subsequent elements in the list
j++: At the end of each iteration, the value of j is incremented, allowing the code to compare nums[i] with the next number in the list
*/

