package shaq.venusrestblog.repository;

import shaq.venusrestblog.data.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Post, Long> {

}