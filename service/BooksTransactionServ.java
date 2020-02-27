package com.capgemini.librarymanagementsystem.service;

import java.util.HashMap;

import com.capgemini.librarymanagementsystem.bean.BooksTransaction;

public interface BooksTransactionServ {

	public HashMap<Integer, BooksTransaction> getAllTrans();

	public boolean updateTransaction(int transactionId, BooksTransaction books);

	public boolean deleteTransaction(int transactionId);

	public boolean addTransaction(BooksTransaction books);

	public BooksTransaction searchTransaction(int transactionId);
}
