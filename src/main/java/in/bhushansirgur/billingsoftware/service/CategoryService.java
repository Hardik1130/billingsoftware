package in.bhushansirgur.billingsoftware.service;

import in.bhushansirgur.billingsoftware.entity.CategoryEntity;
import in.bhushansirgur.billingsoftware.io.CategoryRequest;
import in.bhushansirgur.billingsoftware.io.CategoryResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request, MultipartFile file);

    List<CategoryResponse> read();

    void delete(String categoryId);



}
