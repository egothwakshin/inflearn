package class1.ex;

import javax.naming.PartialResultException;
import java.lang.reflect.Array;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        MovieReview[] reviews = new MovieReview[]{inception, aboutTime};

        for (int i = 0; i < reviews.length; i++) {
            System.out.println("영화 제목: " + reviews[i].title
                             + ", 리뷰: " + reviews[i].review);
        }

        for (int i = 0; i < reviews.length; i++) {
            MovieReview rv = reviews[i];
            System.out.println("영화 제목: " + rv.title
                    + ", 리뷰: " + rv.review);
        }

        for (MovieReview rv : reviews) {
            System.out.println("영화 제목: " + rv.title
                    + ", 리뷰: " + rv.review);
        }



    }
}
