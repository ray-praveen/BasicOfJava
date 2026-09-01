package BasicOfArray.basic.lecture.onedarray;

public class LectureArray {

    static void main(){

        //declaration
        int arr[];
        //allocation
        arr = new int[5];
        //init
        int brr[] = {10, 20, 30};

        for (int index =0; index<=brr.length -1; index++){
            System.out.println(brr[index]);
        }

//        System.out.println(brr[0]);
//        System.out.println(brr[1]);
//        System.out.println(brr[2]);

    }

}
