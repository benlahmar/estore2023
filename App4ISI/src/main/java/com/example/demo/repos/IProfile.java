package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Profile;

public interface IProfile extends JpaRepository<Profile, Long> {

}
