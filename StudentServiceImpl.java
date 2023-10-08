package in.ineuron.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.DAO.IStudentDAO;
import in.ineuron.bo.BO;
import in.ineuron.dto.DTO;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDAO stDao;

	@Override
	public int insert(DTO dto) {
		BO bo = new BO();
		BeanUtils.copyProperties(dto,bo);
		return stDao.insert(bo);
	}

	@Override
	public void delete(int id) {
		stDao.delete(id);
	}

	@Override
	public void delete(DTO dto) {
		BO bo = new BO();
		BeanUtils.copyProperties(dto, bo);
		stDao.delete(bo);

	}

	@Override
	public void update(DTO dto) {
		BO bo = new BO();
		BeanUtils.copyProperties(dto, bo);
		stDao.update(bo);

	}

	@Override
	public DTO getStudent(int id) {
		BO studentBO = stDao.getStudent(id);
		DTO dto = null;
		if (studentBO != null) {
			dto = new DTO();
			BeanUtils.copyProperties(studentBO, dto);
		}
		return dto;
	}

	@Override
	public List<DTO> getAllStudents() {
		List<BO> studentBO = stDao.getAllStudents();
		List<DTO> studentDTO = new ArrayList<DTO>();
		studentBO.forEach(bo -> {
			DTO dto = new DTO();
			BeanUtils.copyProperties(bo, dto);
			studentDTO.add(dto);
		});
		return studentDTO;
	}

}
