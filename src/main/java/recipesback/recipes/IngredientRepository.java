package recipesback.recipes;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IngredientRepository extends CrudRepository<Ingredient,Integer> {
    Iterable<Ingredient> findByNameContainingIgnoreCase(String name);

    @Query("SELECT i.meal.name FROM Ingredient i WHERE i.name=:name")
    List<String> mealsByIngredient(@Param("name") String name);


}
