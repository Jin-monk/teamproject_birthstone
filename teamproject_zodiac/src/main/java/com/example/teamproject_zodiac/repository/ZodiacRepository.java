package com.example.teamproject_zodiac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.teamproject_zodiac.entity.Zodiac;

public interface ZodiacRepository extends JpaRepository<Zodiac,Long>{
	
	@Query("SELECT z FROM Zodiac z WHERE " +
	       "(:month = z.startMonth AND :day >= z.startDay) OR " +
	       "(:month = z.endMonth AND :day <= z.endDay) OR " +
	       "(z.startMonth > z.endMonth AND " +
	       "((:month = z.startMonth AND :day >= z.startDay) OR (:month = z.endMonth AND :day <= z.endDay)))")
	Zodiac getZodiacSign(@Param("month") int month,
						 @Param("day") int day);

}
