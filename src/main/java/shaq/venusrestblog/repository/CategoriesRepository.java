package shaq.venusrestblog.repository;

import shaq.venusrestblog.data.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Category, Long> {

}