class MyCircularQueue {

    int arr[];
    int n;

    public MyCircularQueue(int k) {
        arr = new int[k];
        n = k;
    }

    int front = -1, rear = -1;
    public boolean enQueue(int value) {
        if(isFull())return false;
        if(front == -1 && rear ==-1){
            front++;
            rear++;
            arr[front] = value;
            return true;
        }
        rear = (rear +1) % n;
        arr[rear] = value;
        return true;

    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        if(front == rear){
            front = rear = -1;
            return true;
        }
        if(front == n-1){
            front = (front+1)% n;
            return true;
        }
        front++;
        return true;

        
    }
    
    public int Front() {
        if(isEmpty())return -1;
        return arr[front];
        
    }
    
    public int Rear() {

        if(isEmpty())return -1;
        return arr[rear];
        
    }
    
    public boolean isEmpty() {
        if(front == -1 && rear == -1)return true;
        return false;
        
    }
    
    public boolean isFull() {
        if((rear+1)% n == front)return true;
        return false;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */