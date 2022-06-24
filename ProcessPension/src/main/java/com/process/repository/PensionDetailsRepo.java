package com.process.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.process.entity.PensionDetail;

@Repository
public interface PensionDetailsRepo extends JpaRepository<PensionDetail, String> {

}
