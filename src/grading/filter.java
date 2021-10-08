package grading;
import java.util.List;

public interface filter
{
	public List<Grade> apply(List<Grade> grades) throws SizeException;//

}