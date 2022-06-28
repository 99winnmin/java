package practice1;

public class TakeTransTest {
    public static void main(String[] args) {
        /*James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
        James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
        Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.*/

        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        Subway subwayGreen = new Subway(2);

        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();
        bus500.showBusInfo();
        subwayGreen.showSubwayInfo();

        Student studentE = new Student("Edward",20000);
        Taxi taxi  = new Taxi("Mr.TaxiTaxi");

        studentE.takeTaxi(taxi);

        studentE.showInfo();

        taxi.showTaxiInfo();
    }
}
