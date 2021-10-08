package grading;

import java.util.List;
import java.util.Map;

class weightedTotalStrategy implements gradingStrategy
{
	private Map<String, Double> weights;
	
	public weightedTotalStrategy() {
	}
	
	public weightedTotalStrategy(Map<String, Double> weights) {
	}

	


	@Override
	public List<Grade> calculate(String key, List<Grade> grades) throws SizeException {
		// TODO Auto-generated method stub
		return null;
	}}
