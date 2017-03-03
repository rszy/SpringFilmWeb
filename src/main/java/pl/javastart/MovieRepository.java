package pl.javastart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rysiek on 2017-02-24.
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
