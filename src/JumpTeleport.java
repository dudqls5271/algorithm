public class JumpTeleport {
    public static void main(String[] args) {
        JumpTeleport jumpTeleport = new JumpTeleport();
        System.out.println(jumpTeleport.solution(5));
        System.out.println(jumpTeleport.solution(6));
        System.out.println(jumpTeleport.solution(5000));
    }

    public int solution(int n) {
        return Integer.bitCount(n);
    }
}
