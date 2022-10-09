package com.ramesh.rameshwedding.guests;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//data layer is the interface that uses Repository


//interface GuestRepository extends CrudRepository<GuestEntity, Long>
//******CrudRepository is a root reponsitory and has limited features so we are using JpaRepository
@Repository
interface GuestRepository extends JpaRepository<GuestEntity, Long> {

}
