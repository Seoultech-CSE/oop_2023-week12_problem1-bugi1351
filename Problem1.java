import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Number> list = new ArrayList<>();
        System.out.print("Enter five integers and five doubles: ");

        /*
            list 입력 코드
         */
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                int num = input.nextInt();
                list.add(num);
            } else {
                double num = input.nextDouble();
                list.add(num);
            }
        }

        sort(list);

        /*
            list 출력 코드
         */
        for (Number item : list) {
            System.out.print(item+" ");
        }
    }

    public static void sort(ArrayList<Number> list) {
        Collections.sort(list, new Comparator<Number>() {
            @Override
            public int compare(Number num1, Number num2) {
                return Double.compare(num1.doubleValue(), num2.doubleValue());
            }
        });
    }
}



