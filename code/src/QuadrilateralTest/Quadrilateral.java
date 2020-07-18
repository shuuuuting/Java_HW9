/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuadrilateralTest;

/**
 *
 * @author zhangshuting
 */
public class Quadrilateral {
    protected Point point1,point2,point3,point4;
    public Quadrilateral(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4){
        setPoint1(x1,y1);
        setPoint2(x2,y2);
        setPoint3(x3,y3);
        setPoint4(x4,y4);
    }
    public void setPoint1(double x1,double y1){
        point1=new Point(x1,y1);
    }
    public void setPoint2(double x2,double y2){
        point2=new Point(x2,y2);
    }
    public void setPoint3(double x3,double y3){
        point3=new Point(x3,y3);
    }
    public void setPoint4(double x4,double y4){
        point4=new Point(x4,y4);
    }
    public Point getPoint1(){
        return point1;
    }
    public Point getPoint2(){
        return point2;
    }
    public Point getPoint3(){
        return point3;
    }
    public Point getPoint4(){
        return point4;
    }
    @Override
    public String toString(){
        return "Coordinates of Quadrilateral are :"+"\n"+point1+","+point2+","+point3+","+point4;
    }
}
