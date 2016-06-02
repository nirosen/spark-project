package univ.bigdata.course;


import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class MainRunner {

    public static void main(String[] args) {
        /*
        TODO: You need to add here all logic required to parse and execute commands.
         */
        SparkConf sparkConf = null;
        JavaSparkContext sc = null;
        try {
            sparkConf = new SparkConf().setAppName("My Spark Job").setMaster("local");
            sc = new JavaSparkContext(sparkConf);
        }
        catch (Exception e)
        {
            System.out.println("Failed to create spark context \n" + e.toString());
        }
        JavaRDD<String> textFiles = sc.textFile("c:\\movies-simple.txt");
        //get("/hello", (req, res) -> "Hello World");
        System.out.println("Hello World.");
    }
}
