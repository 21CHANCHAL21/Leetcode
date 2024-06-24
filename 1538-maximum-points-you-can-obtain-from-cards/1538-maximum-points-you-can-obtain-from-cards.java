class Solution {
    public int maxScore(int[] cardPoints, int k) {
    int n = cardPoints.length;
    int leftSum = 0;
    
    // Calculate the initial leftSum (sum of the first k elements)
    for (int i = 0; i < k; i++) {
        leftSum += cardPoints[i];
    }
    
    // Initialize maxPoints with leftSum
    int maxPoints = leftSum;
    
    // Initialize rightSum
    int rightSum = 0;
    
    // Adjust leftSum and rightSum accordingly to find the maximum points
    for (int i = 0; i < k; i++) {
        rightSum += cardPoints[n - 1 - i]; // Add elements from the right
        leftSum -= cardPoints[k - 1 - i]; // Remove elements from the left
        maxPoints = Math.max(maxPoints, leftSum + rightSum);
    }
    
    return maxPoints;
}

}