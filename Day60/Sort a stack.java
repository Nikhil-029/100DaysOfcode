    import java.util.Scanner;
    import java.util.Stack;
    class SortedStack{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                Stack<Integer> s=new Stack<>();
                int n=sc.nextInt();
                while(n-->0)
                s.push(sc.nextInt());
                GfG g=new GfG();
                Stack<Integer> a=g.sort(s);
                while(!a.empty()){
                    System.out.print(a.peek()+" ");
                    a.pop();
                }
                System.out.println();
            }
        }
    }

    class GfG{
        public Stack<Integer> sort(Stack<Integer> s)
        {
            //add code here.
         Stack<Integer> ans = new Stack<>();
            Stack<Integer> helper = new Stack<>();
            while(s.size()>0)
            {
                int val = s.pop();
                if(ans.size()==0 || ans.peek()<=val)
                {
                    ans.push(val);
                }
                else{
                    while(ans.size()>0 && ans.peek()>val){
                        helper.push(ans.pop());
                    }
                    ans.push(val);
                    while(helper.size()>0)
                    {
                        ans.push(helper.pop());
                    }
                }
            }
            return ans;
        }
    }