package HomeworksAdd.HWJavaAdd.HWLesson6JavaAdd;

public class Notebook {
    private int operMem;
    private int hd;
    private String operSystem;
    private String color;

    public Notebook(int operMem, int hd, String operSystem, String color) {
        this.operMem = operMem;
        this.hd = hd;
        this.operSystem = operSystem;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook [ОЗУ=" + operMem + "Гб, объем ЖД=" + hd + "Гб, операционная система=" + operSystem + ", цвет=" + color + "]\n";
    }

    public int getOperMem() {
        return operMem;
    }

    public int getHd() {
        return hd;
    }

    public String getOperSystem() {
        return operSystem;
    }

    public String getColor() {
        return color;
    }
    
}
