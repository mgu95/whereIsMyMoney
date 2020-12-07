package core.services;

import data.model.Category;
import data.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category[] getAllCategories() {
        List<Category> all = categoryRepository.findAll();
        Category[] array = new Category[all.size()];
        all.toArray(array);
        return array;
    }
}
