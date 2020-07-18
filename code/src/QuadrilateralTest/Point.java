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
final class Point {
    private double X;
    private double Y;
    public Point(double x,double y){
        setX(x);
        setY(y);
    }
    public void setX(double x){
        X=x;
    }
    public void setY(double y){
        Y=y;
    }
    public double getX(){
        return X;
    }
    public double getY(){
        return Y;
    }
    @Override
    public String toString(){
        return "("+X+","+Y+")";
    }
}
