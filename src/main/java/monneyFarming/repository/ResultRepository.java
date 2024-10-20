package monneyFarming.repository;

import monneyFarming.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {

    @Query(value = "SELECT * FROM result WHERE DATE(created_at) = :date", nativeQuery = true) // '2024-10-20'
    List<Result> findByDate(@Param("date") String date);

}