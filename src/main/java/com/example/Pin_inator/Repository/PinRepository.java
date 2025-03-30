package com.example.Pin_inator.Repository;

import com.example.Pin_inator.Models.Core.Pin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PinRepository extends JpaRepository<Pin,Long> {
}
