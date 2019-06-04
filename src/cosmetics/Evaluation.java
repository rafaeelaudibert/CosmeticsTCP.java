package cosmetics;

public class Evaluation {

	private Integer score;
	private User reviewer;
	private Product product;
	private Group group;
	
	private static Integer MINIMUM_SCORE = -3;
	private static Integer MAXIMUM_SCORE = 3;

	public Evaluation(User reviewer, Product product, Group group) {
		this.group = group;
		this.product = product;
		this.reviewer = reviewer;
		this.score = null;
	}

	public boolean isDone() {
		return true;
	}

	public void setScore(Integer score) throws Exception {
		if (this.score != null) {
			throw new Exception(); // Trocar por uma excess�o espec�fica depois
		}
		
		if (score == null) {
			throw new Exception(); // Should be changed for a CustomException later
		}
				
		if (score < MINIMUM_SCORE || score > MAXIMUM_SCORE) {
			throw new Exception(); // Should be changed for a CustomException later
		}
		
		this.score = score;
	}

	public Group getGroup() {
		return this.group;
	}

	public Product getProduct() {
		return this.product;
	}

	public User getReviewer() {
		return this.reviewer;
	}
	
	public Integer getScore() {
		return this.score;
	}
}
