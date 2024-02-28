package com.banking.dao;

import java.util.List;
import java.util.Map;

import com.banking.model.CustomerDetails;
import com.banking.model.User;
import com.banking.utils.CustomException;

public interface UserDao {
	User authendicateUser(int userID, String password) throws CustomException;

	int addUser(User user) throws CustomException;

	boolean checkUserIdExists(int userId) throws CustomException;

	CustomerDetails getCustomerDetails(int userID, int branchID) throws CustomException;

	List<CustomerDetails> getAllCustomerDetails(int branchID) throws CustomException;

	boolean checkUserIdPresentInBranch(int userID, int branchId) throws CustomException;

	<K, V> boolean updateCustomerDetails(int userIdToUpdate, Map<K, V> fieldsToUpdate) throws CustomException;

	boolean updateCustomerPassword(User user, String password) throws CustomException;
}
