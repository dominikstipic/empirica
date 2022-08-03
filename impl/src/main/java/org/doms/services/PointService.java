package org.doms.services;

import org.doms.data.Point;

import java.util.List;

public class PointService {

    private final List<Point> database = List.of(
            new Point(1,2)
    );

    public void addPoints(List<Point> points){
        database.addAll(points);
    }

    public void addPoint(Point point){
        addPoints(List.of(point));
    }

    public List<Point> getPoints(){
        return database;
    }

}
