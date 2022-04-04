package Stack;

import java.util.Stack;

public class Maximum_Area_Histogram {
    public static void main(String[] args) {
        int[] building = {6, 2, 5, 4, 5, 1, 6};
        int ans = maxAreaHistogram(building);
        System.out.println(ans);
    }

    //logic for maximum area histogram is --> building[i] * (NSR - NSL - 1);
    static int maxAreaHistogram(int[] arr)
    {
        int n = arr.length;
        //get NSL
        Stack<Integer> st = new Stack<>();
        int[] NSL = new int[n];
        for(int i = n - 1; i >= 0; i--)
        {
            while(!st.isEmpty() && arr[i] < arr[st.peek()])
            {
                NSL[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        //for remaining heights there is no smaller building left in left side so fill -1
        while(!st.isEmpty())
        {
            NSL[st.peek()] = st.pop();
        }

        //get NSR
        int[] NSR = new int[n];
        for(int i = 0; i < n; i++)
        {
            while (!st.isEmpty() && arr[i] < arr[st.peek()])
            {
                NSR[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        //for remaining heights, there is no smaller building left in right so fill it with out side of total building value;
        while(!st.isEmpty())
        {
            NSR[st.pop()] = n;
        }

        //get is maximum area of histogram;
        int maximumArea = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++)
        {
            int currArea = arr[i] * (NSR[i]- NSL[i] - 1);
            maximumArea = Math.max(maximumArea, currArea);
        }
      return maximumArea;
    }
}
