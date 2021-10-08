package grading;
import java.util.List;
public interface gradingStrategy 
{
	public List<Grade> calculate(String key, List<Grade> grades) throws SizeException;
}
