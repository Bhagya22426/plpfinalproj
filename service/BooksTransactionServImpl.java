package com.capgemini.librarymanagementsystem.service;

import java.util.HashMap;

import com.capgemini.librarymanagementsystem.bean.BooksTransaction;
import com.capgemini.librarymanagementsystem.dao.BooksTransactionDao;
import com.capgemini.librarymanagementsystem.factory.LibraryManagementFactory;

public class BooksTransactionServImpl implements BooksTransactionServ {

	BooksTransactionDao brdao = LibraryManagementFactory.objectBookTransactionDao();

	public HashMap<Integer, BooksTransaction> getAllTrans() {

		return brdao.getAllTrans();
	}

	public boolean updateTransaction(int transactionId, BooksTransaction books) {

		return brdao.updateTransaction(transactionId, books);
	}

	public boolean deleteTransaction(int transactionId) {

		return brdao.deleteTransaction(transactionId);
	}

	public boolean addTransaction(BooksTransaction books) {

		return brdao.addTransaction(books);
	}

	public BooksTransaction searchTransaction(int transactionId) {

		return brdao.searchTransaction(transactionId);
	}

}
