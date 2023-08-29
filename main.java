public class Main {
    public static void main(String[] args) {
        System.out.println("Подсчет суммы четных чисел от 1 до N. -> " + imperativeEvenSum(10));//1
        System.out.println("Поиск наименьшего числа в списке. -> " + imperativeMinFind(new int[]{3, 5, 6, 8, 1, 9, 4, 10}));//2
        System.out.println("Вычисление факториала числа. -> "+factorial(5));//3
        System.out.println("Поиск уникальных элементов в списке. -> "+uniDigitsList(Arrays.asList(1, 2, 3, 4, 3, 7, 8, 5, 2, 1, 4, 5, 2, 3, 6, 9)));//4

    }

    public static List<Integer> uniDigitsList(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>();
        for(var number: list){
            boolean isRep =set.add(number);
            if (!isRep) set.remove(number);
        }
        return new ArrayList<>(set);
    }

    public static int factorial(int f) {
        if (f <= 1)
            return 1;
        else
            return IntStream.rangeClosed(2, f).reduce((x, y) -> x * y).getAsInt();
    }

    public static int imperativeMinFind(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < 7; i++)
            if (min > arr[i + 1]) min = arr[i + 1];
        return min;
    }

    public static int imperativeEvenSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++)
            if (i % 2 == 0) sum = sum + i;
        return sum;
    }

}