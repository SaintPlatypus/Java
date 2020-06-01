
import java.io.*;
import java.util.Scanner;
import java.util.LinkedList;

public class Crawler {
    public static void getSites(LinkedList<URLDepthPair> resultLink){
        for (URLDepthPair c : resultLink)
            System.out.println("Depth :" + c.getDepth()+"\tLink :"+c.getURL());
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("URL of site: ");
        String URL= in.nextLine();
        System.out.printf("Depth: ");
        int depth = in.nextInt(); 
        System.out.printf("Number of parallel threads: ");
        int thread = in.nextInt();  
        try{
            URLPool pool = new URLPool(depth);
            pool.addPair(new URLDepthPair(URL, 0));
            for (int i = 0; i < thread; i++) {
                CrawlerTask c = new CrawlerTask(pool);
                Thread t = new Thread(c);
                t.start();
            }

            while (pool.getWait() != thread) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Ignoring  InterruptedException");
                }
            }

            try {
                getSites(pool.getResult());;
            }catch (NullPointerException e){
                System.out.println("Not Link");
            }
            System.exit(0);
        } 
        catch (Exception e){
            System.out.println("usage: java Crawler <URL> <maximum_depth> <num_threads> or second/third not digit");
        }
    }
}