package com.model.persistence;

public class Trainee {

	private int trainee_id;
	private String trainee_name;
	private BranchEnum branch; // (java, oracle, php,dotnet),
	private Double percentage;
	
	
	
	public Trainee() { }



	public Trainee(int trainee_id, String trainee_name, BranchEnum branch, Double percentage) {
		super();
		this.trainee_id = trainee_id;
		this.trainee_name = trainee_name;
		this.branch = branch;
		this.percentage = percentage;
	}



	public Trainee(String trainee_name, BranchEnum branch, Double percentage) {
		super();
		this.trainee_name = trainee_name;
		this.branch = branch;
		this.percentage = percentage;
	}



	public int getTrainee_id() {
		return trainee_id;
	}



	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}



	public String getTrainee_name() {
		return trainee_name;
	}



	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}



	public BranchEnum getBranch() {
		return branch;
	}



	public void setBranch(BranchEnum branch) {
		this.branch = branch;
	}



	public Double getPercentage() {
		return percentage;
	}



	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}



	@Override
	public String toString() {
		return "Trainee [trainee_id=" + trainee_id + ", trainee_name=" + trainee_name + ", branch=" + branch
				+ ", percentage=" + percentage + "]";
	}
	
	
	
}
