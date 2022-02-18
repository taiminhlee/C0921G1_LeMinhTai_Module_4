package vn.codegym.case_study.service.position;

import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.Position;

import java.util.List;

@Service
public interface IPositionService {
    List<Position> findAll();
}
