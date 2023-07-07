package com.example.foodManager.repositorys;

import com.example.foodManager.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface foodRepository extends JpaRepository<Food,Long> {
    Food findByName (String name);
    Food findById (long id);

}
