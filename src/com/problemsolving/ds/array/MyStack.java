package com.problemsolving.ds.array;

class MyStack{

    int top;
    int arr[] = new int[1000];

    MyStack()
    {
        top = -1;
    }

    /* The method push to push element
        into the stack */
    void push(int a)
    {
        ++top;
        arr[top] = a;
    }

    /* The method pop which return
      the element poped out of the stack*/
    int pop() {
        int poppedOut = -1;
        if (top != -1) {
            poppedOut = arr[top];
            --top;
        }
        return poppedOut;
    }
}
