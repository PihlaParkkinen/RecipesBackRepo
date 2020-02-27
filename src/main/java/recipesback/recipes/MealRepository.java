package recipesback.recipes;

import org.springframework.data.repository.CrudRepository;


public interface MealRepository extends CrudRepository<Meal,Integer> {
    Iterable<Meal> findByNameContainingIgnoreCase(String name);

}

