package oopc15.ue1.businesslogic;

import oopc15.ue1.interfaces.IPoint;

public class Point implements IPoint {

    //region private Methods

    private double x;
    private double y;

    //endregion

    //region CTOR
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //endregion


    //region IPoint implementations

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //endregion

    //region Public Methods

    public double getDistance(IPoint anotherPoint) {
        double dx = anotherPoint.getX() - x;
        double dy = anotherPoint.getY() - y;

        return Math.abs(Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)));
    }

    //endregion

}
