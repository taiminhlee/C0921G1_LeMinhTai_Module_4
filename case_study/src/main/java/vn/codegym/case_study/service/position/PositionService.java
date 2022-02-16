package vn.codegym.case_study.service.position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.Position;
import vn.codegym.case_study.repository.IPositionRepository;

import java.util.List;

@Service
public class PositionService implements IPositionService{
    @Autowired
    IPositionRepository positionRepository;
    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
