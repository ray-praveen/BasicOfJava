package methods;

public class MethodOverLoading {

    static int add(int p, int q){
        int sum = p+q;
        return sum;

    }

    static int add(int p , int q, int r){
        int ans = p+q+r;
        return ans;
    }

    static float add(int p , float q){
        float ans = p+q;
        return ans;
    }

//    static float add(int p , int q){
//        float ans = p+q;
//        return ans;
//    }


    static void main(){
        int ans1 = add(1, 2);
//        int ans2 = add(1, 2, 3);
        float ans2 = add(1, 2);
        System.out.println(ans1);
        System.out.println(ans2);

    }

}
