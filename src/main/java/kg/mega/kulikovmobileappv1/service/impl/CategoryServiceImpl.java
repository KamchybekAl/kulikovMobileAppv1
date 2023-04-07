package kg.mega.kulikovmobileappv1.service.impl;

import jakarta.transaction.Transactional;
import kg.mega.kulikovmobileappv1.model.Category;
import kg.mega.kulikovmobileappv1.repository.CategoryRepo;
import kg.mega.kulikovmobileappv1.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional

public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;
    @Override
    public Category saveCategory(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        Category updatedCategory = categoryRepo.findById(category.getId()).get();
        updatedCategory.setCategory_name(category.getCategory_name());
        return updatedCategory;
    }
}
