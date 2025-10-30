package in.bhushansirgur.billingsoftware.repository;

import in.bhushansirgur.billingsoftware.entity.CategoryEntity;
import in.bhushansirgur.billingsoftware.io.CategoryRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {

    Optional<CategoryEntity> findByCategoryId(String categoryId);

}
