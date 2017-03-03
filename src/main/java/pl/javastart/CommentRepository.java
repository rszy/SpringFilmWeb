package pl.javastart;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Rysiek on 2017-03-02.
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
