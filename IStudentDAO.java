package in.ineuron.DAO;

import java.util.List;

import in.ineuron.bo.BO;

public interface IStudentDAO 
{
	public int insert(BO s);

	public void delete(int id);

	public void delete(BO s);

	public void update(BO b);

	public BO getStudent(int id);

	public List<BO> getAllStudents();
}
