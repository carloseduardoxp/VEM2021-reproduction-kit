
public class DeveloperEvaluation {
	
	private Integer id;
	
	public DeveloperEvaluation(Integer id, Integer codeSnippet1Likert, Integer codeSnippet2Likert) {
		this.id = id;
		this.codeSnippet1Likert = codeSnippet1Likert;
		this.codeSnippet2Likert = codeSnippet2Likert;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCodeSnippet1Likert() {
		return codeSnippet1Likert;
	}

	public void setCodeSnippet1Likert(Integer codeSnippet1Likert) {
		this.codeSnippet1Likert = codeSnippet1Likert;
	}

	public Integer getCodeSnippet2Likert() {
		return codeSnippet2Likert;
	}

	public void setCodeSnippet2Likert(Integer codeSnippet2Likert) {
		this.codeSnippet2Likert = codeSnippet2Likert;
	}

	private Integer codeSnippet1Likert;
	
	private Integer codeSnippet2Likert;
	
	

}
