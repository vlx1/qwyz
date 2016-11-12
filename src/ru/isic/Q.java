package ru.isic;

/**
 * Created by Viktor on 12.11.2016.
 */
public class Q <X extends B ,Y extends B,Z extends D> {
    X x;
    Y y;
    Z z;

    public Q(X x, Y y, Z z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int allCalc()
    {
        return x.calc2() + y.calc2() + z.calc();

    }
}
