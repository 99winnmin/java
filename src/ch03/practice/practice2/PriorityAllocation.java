package ch03.practice.practice2;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("등급에 따라 등급이 높은 고객은 업무능력이 우수한 상담원을 찾습니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무능력이 우수한 상담원으로 연결됩니다.");
    }
}
