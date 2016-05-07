package net.pritesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.pritesh.model.Exercise;

@Repository("exerciseRepository")
public interface ExerciseRepository extends JpaRepository<Exercise, Long>
{

}
