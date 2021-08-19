import java.util.ArrayList;
import java.util.List;

public class Query {
	
	private Integer number;
	
	private Integer bestSnippet;
	
	public Query(Integer number, Integer bestSnippet) {
		super();
		this.number = number;
		this.bestSnippet = bestSnippet;
	}

	private List<DeveloperEvaluation> evaluations;

	public void addEvaluation(DeveloperEvaluation evaluation) {
		if (evaluations == null) {
			evaluations = new ArrayList<>();
		}
		evaluations.add(evaluation);
	}
	
	public Double getAverage(String type) {
		Double sum = 0.0;
		for (DeveloperEvaluation developerEvaluation: evaluations) {
			if (type.equals("best")) {
				if (bestSnippet == 1) {
					sum += developerEvaluation.getCodeSnippet1Likert();
				} else {
					sum += developerEvaluation.getCodeSnippet2Likert();
				}
			} else {
				if (bestSnippet == 1) {
					sum += developerEvaluation.getCodeSnippet2Likert();
				} else {
					sum += developerEvaluation.getCodeSnippet1Likert();
				}
			}
		}
		return sum / evaluations.size();
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getBestSnippet() {
		return bestSnippet;
	}

	public void setBestSnippet(Integer bestSnippet) {
		this.bestSnippet = bestSnippet;
	}

	public List<DeveloperEvaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<DeveloperEvaluation> evaluations) {
		this.evaluations = evaluations;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Query other = (Query) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

}
