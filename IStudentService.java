package in.ineuron.service;

import java.util.List;

import in.ineuron.dto.DTO;

public interface IStudentService 
{
	public int insert(DTO s);

	public void delete(int id);

	public void delete(DTO s);

	public void update(DTO d);

	public DTO getStudent(int id);

	public List<DTO> getAllStudents();
}
