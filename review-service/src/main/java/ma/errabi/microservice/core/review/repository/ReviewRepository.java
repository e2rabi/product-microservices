package ma.errabi.microservice.core.review.repository;

import ma.errabi.microservice.core.review.domain.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    Page<Review> getReviewByProductId(int productId, Pageable pageable);
    @Modifying
    void deleteReviewByProductId(String productId);
    List<Review> getReviewByProductId(String productId);
}
