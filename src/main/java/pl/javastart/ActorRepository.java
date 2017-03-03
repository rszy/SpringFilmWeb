package pl.javastart;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Rysiek on 2017-03-03.
 */
public interface ActorRepository extends JpaRepository<Actor, Long> {
}
