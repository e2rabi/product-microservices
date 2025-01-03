package ma.errabi.sdk.api.recommendation;

import ma.errabi.sdk.api.common.CustomPage;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface RecommendationResource {
    @GetMapping(value = "/recommendation/{id}",produces = "application/json")
    RecommendationDTO getRecommendations(@PathVariable String id);
    @PostMapping(value = "/recommendation",consumes = "application/json")
    RecommendationDTO createRecommendation(@RequestBody RecommendationDTO dto);
    @DeleteMapping(value = "/recommendation/{id}")
    void deleteRecommendations(@PathVariable String id);
    @GetMapping(value = "/recommendation",produces = "application/json")
    List<RecommendationDTO> getAllRecommendations();
    @GetMapping(value = "/recommendation/rating",produces = "application/json")
    CustomPage<RecommendationDTO> scanRecommendationByRating(@RequestParam Integer minRating, @RequestParam Integer maxRating);
}
