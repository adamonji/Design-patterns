package visitor;

import visitor.activity.Activity;
import visitor.activity.Squash;
import visitor.activity.Treadmill;
import visitor.activity.Weights;
import visitor.visitor.VisitorHowManyCalories;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill(400);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        VisitorHowManyCalories visitor = new VisitorHowManyCalories();
        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);
        System.out.println("-------------------------------------------");

        List<Activity> activityList = Arrays.asList(treadmill, squash, weights);

        activityList.forEach(activity -> activity.accept(visitor));
    }
}
