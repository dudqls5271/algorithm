public class Programmers_132267 {

    public static void main(String[] args) {
        Programmers_132267 programmers132267 = new Programmers_132267();
        System.out.println(programmers132267.solution(2, 1, 20));
    }

    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            answer += (n/a) * b;
            n = (n/a) * b + (n%a);
        }
        return answer;
    }

//    public int solution(int a, int b, int n) {
//        int answer = 0;
//        int temp = 0;
//        while (n > 1) {
//            if (n%a != 0) {
//                temp++;
//                solution(a, b, n+temp);
//            }
//            n = (n/a);
//            answer = answer + n*b;
//            solution(a, b, n/a);
//        }
//
//        return answer;
//    }
}
