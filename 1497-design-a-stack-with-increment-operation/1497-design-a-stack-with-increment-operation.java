class CustomStack {

    int arr[];
    int ind = 0;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
    }
    
    public void push(int x) {
        if(ind == arr.length)return;
        arr[ind++] = x;
        
    }
    
    public int pop() {
        if(ind == 0)return -1;
        int ele = arr[ind-1];
        ind--;
        return  ele;
        
    }
    
    public void increment(int k, int val) {
        if(k >= arr.length){
            for(int i =0; i<arr.length; i++){
                arr[i] = arr[i]+val;
            }
        }
        else{
            for(int i =0; i<k; i++){
                arr[i] = arr[i]+val;
            }
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */