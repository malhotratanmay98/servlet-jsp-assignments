package com.model.persistence;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.exceptions.DataAccessException;

public class TraineeDaoImpl implements TraineeDao {

	
	private Connection connection;
	
	 public TraineeDaoImpl() {
		connection=ConnectionFactory.getConnection();
	}
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		try {
			PreparedStatement pstmt=connection.prepareStatement
					("insert into trainee(name,branch,percentage) values(?,?,?)",
							Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, trainee.getTrainee_name());
			pstmt.setString(2, trainee.getBranch().toString());
			pstmt.setDouble(3, trainee.getPercentage());
			
			
			pstmt.executeUpdate();
			
			ResultSet rs=pstmt.getGeneratedKeys();
			
			if(rs.next()) {
				trainee.setTrainee_id(rs.getInt(1));  //setting the auto generated id
			}
			
		}catch(SQLException ex) {
		
			ex.printStackTrace();
		}
		return trainee;
		
	}

	@Override
	public List<Trainee> getAll() {
		
		List<Trainee> trainees = new ArrayList<Trainee>();
		
		try {
			Trainee tempTrainee = null;
			
			PreparedStatement pstmt = connection.prepareStatement("select * from trainee");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				tempTrainee=new Trainee(rs.getInt(1),
						rs.getString(2), BranchEnum.valueOf(rs.getString(3)), rs.getDouble(4));
				trainees.add(tempTrainee);
			}
		} catch(SQLException ex) {
			throw new DataAccessException(ex);
		}
		return trainees;
	}

	
	
}
