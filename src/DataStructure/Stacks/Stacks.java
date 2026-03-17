package DataStructure.Stacks;

public class Stacks {
    int[] arr;
    int top;
    int size;

    Stacks(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int val){
        if(top == size - 1){
            System.out.println("Stack Overflown!");
            return;
        }
        top++;
        arr[top] = val;
    }

    void pop(){
        if (top == -1) {
            System.out.println("Stack Underflown!");
            return;
        }
        top--;
    }
    int Top(){
        if (top == -1) {
            System.out.println("Stack Underflown!");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        return top==-1;
    }
}

class Driver{
    public static void main(String[] args) {
        Stacks st = new Stacks(5);
        st.push(10);
        st.push(11);
        st.push(20);
        st.push(9);
        System.out.println(st.Top());
        st.push(9);
        st.push(9);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());

    }
}
