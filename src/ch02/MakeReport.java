package ch02;

public class MakeReport {
    //String형을 저장하는 일반적인 형식
    StringBuffer buffer = new StringBuffer();

    private String line = "===============================\n";
    private String title = "name\t  address \t\t    phone   \n";
    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody(){
        buffer.append("aaa \t");
        buffer.append("seoul \t");
        buffer.append("1231231231\n");

        buffer.append("bbb \t");
        buffer.append("seoul \t");
        buffer.append("1989831231\n");
    }

    private void makeFooter(){
        buffer.append(line);
    }
    //getReport()를 제외하고 모든 변수와 메서드는 캡슐화함
    public String getReport(){
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}
