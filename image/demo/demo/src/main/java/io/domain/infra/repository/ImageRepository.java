package io.domain.infra.repository;
import io.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ImageRepository  extends JpaRepository<Image, String> {

}