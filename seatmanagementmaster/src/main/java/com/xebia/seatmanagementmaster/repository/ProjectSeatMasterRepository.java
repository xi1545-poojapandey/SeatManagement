package com.xebia.seatmanagementmaster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xebia.seatmanagementmaster.model.ProjectSeatMaster;

@Repository
public interface ProjectSeatMasterRepository extends JpaRepository<ProjectSeatMaster, Long> {
	
	ProjectSeatMaster findBySeatId(Long seatId);
	
	List<ProjectSeatMaster> findByRoomId(Long roomId);

}
