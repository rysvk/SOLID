package com.oop.solid.isp;
import java.util.*;
import javafx.util.*;

public interface Shape {
    int getArea();
    int getPerimeter();
    int getNumDiagonals();
    List<Double> getLengthofDiagonals();
    int getNumAxesofSymmetry();
    int getNumVertices();
    List<Pair<Integer,Integer>> getVertices();
}
