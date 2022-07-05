package ch03.practice.practice2;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("쉬고있거나 할당된 통화 수가 가장 적은 상담원을 찾습니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("쉬고있거나 할당된 통화 수가 가장 적은 상담원으로 연결됩니다.");
    }
}
