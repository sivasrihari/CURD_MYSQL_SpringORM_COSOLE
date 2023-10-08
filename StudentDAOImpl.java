package in.ineuron.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.BO;
//import in.ineuron.dto.DTO;
@Repository
public class StudentDAOImpl implements IStudentDAO 
{
	@Autowired
	private HibernateTemplate hiber;
	@Override
	public int insert(BO s) 
	{
		return (int)hiber.save(s);
	}

	@Override
	public void delete(int id) {
		BO b=null;
		b=hiber.get(BO.class,id);
		if(b!=null)
		{
			hiber.delete(b);
			System.out.println("deletin is successfull");
		}
		else
		{
			System.out.println("deletion is not done with given id="+id);			
		}
	}

	@Override
	public void delete(BO s) 
	{
		
		getAllStudents().forEach(b->System.out.println(b));
		int id=s.getSid();
		BO b=null;
		b=hiber.get(BO.class,id);
		if(b!=null)
		{
			hiber.delete(b);
			System.out.println("deletin is successfull");
		}
		else
		{
			System.out.println("deletion is not done with given id="+id);			
		}
	}

	@Override
	public void update(BO b)
	{
		hiber.update(b);
		System.out.println("updated done successfully");
	}

	@Override
	public BO getStudent(int id) {
		
		return hiber.get(BO.class,id);
	}

	@Override
	public List<BO> getAllStudents() {
		List<BO> l=null;
		l=hiber.loadAll(BO.class);
		return l;
	}

}
