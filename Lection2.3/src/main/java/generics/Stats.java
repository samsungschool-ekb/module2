package generics;

/**
 * Created by teacher-pc on 17.10.2018.
 */
public class Stats<T extends Number> {
    T[]nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }

    public double average(){
        double sum = 0;
        for(T num: nums){
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }

    public boolean sameAverage(Stats<?>stats){
        if(average() == stats.average())
            return true;
        else
            return false;
    }
}
