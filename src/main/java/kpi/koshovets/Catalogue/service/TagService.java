package kpi.koshovets.Catalogue.service;

import kpi.koshovets.Catalogue.entity.Tag;
import kpi.koshovets.Catalogue.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TagService {
    @Autowired
    private TagRepository tagRepository;

    public List<Tag> getAllTags(){
        return tagRepository.findAll();
    }
}
