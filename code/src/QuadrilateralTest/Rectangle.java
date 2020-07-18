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
public class Rectangle extends Quadrilateral{
    double width,height,area;
    public Rectangle(double x1,double y1,double width,double height){
        super (x1,y1,x1+ width,y1,x1+width,y1+height,x1,y1+height);
        this.width=width;
        this.height=height;
        area = width*height;
    }
    public double getWidth(){
       return width;
    }
    public double getHeight(){
        return height;
    }
    public double getArea(){
        return area;
    }
    @Override
    public String toString(){
        return "Coordinates of Rectangle are :"+"\n"+point1+","+point2+","+point3+","+point4+"\n"+"Width is : "+width+"\n"+"Height is : "+height+"\n"+"Area is : "+area;
    }
}
