public class Programmers_134240 {
    public static void main(String[] args) {
        Programmers_134240 programmers81301 = new Programmers_134240();
        int[] intArr = {1, 3, 4, 6};

        System.out.println(programmers81301.solution(intArr));
    }

    public String solution(int[] food) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=1;i<food.length;i++){
            int tmp=food[i]/2;
            while (tmp>0){
                stringBuilder.append(i);
                tmp--;
            }
        }

        String temp = stringBuilder.toString();
        stringBuilder.append("0").append(new StringBuilder(temp).reverse());
        return stringBuilder.toString();
    }
}
