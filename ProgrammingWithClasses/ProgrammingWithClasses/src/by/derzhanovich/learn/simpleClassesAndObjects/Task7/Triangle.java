package by.derzhanovich.learn.simpleClassesAndObjects.Task7;
/*
* Описать класс, представляющий треугольник . Предусмотреть методы для создания объектов, вычисления плоащади, периметра
*  и точки пересечения медиан*/
public class Triangle {
    private int aSide;
    private int bSide;
    private int cSide;


    public Triangle(int aSide, int bSide, int cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public int getaSide() {
        return aSide;
    }

    public int getbSide() {
        return bSide;
    }

    public int getcSide() {
        return cSide;
    }

    public double calculateArea(){
        double perimeter = calculatePerimeter();
        double Area = Math.sqrt(perimeter*(perimeter - aSide)* (perimeter - bSide) * (perimeter - cSide));
        return Area;
    }

    public double calculatePerimeter(){
        return (aSide + bSide + cSide)/2;
    }
//xA,yA.. координаты вершин треугольника
    public void getMediana(int xA,int yA, int xB,int yB,int xC,int yC){
        double medianaX = (double) (xA + xB + xC) / 3;
        double medianaY = (yA + yB + yC) / 3.0;
        System.out.printf("Точка пересечения медиан: %.2f %.2f" ,  medianaX,medianaY);
    }

}
class Program{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,2,2);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());
        triangle.getMediana(2,2,5,7,9,8);
    }
}
