package com.kojos.thymeleaf.repository;

import com.kojos.thymeleaf.entity.Guestbook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestbookRepository extends JpaRepository<Guestbook,Long> {

}
