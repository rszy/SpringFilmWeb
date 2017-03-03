package pl.javastart;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Rysiek on 2017-03-03.
 */
public interface MovieActorRepository extends JpaRepository<MovieActor, Long> {
}
