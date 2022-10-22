package com.sportynote.server.repository.repositoryImpl;

import com.sportynote.server.domain.Routine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoutineRepositoryImpl extends JpaRepository<Routine,Long> {
}
