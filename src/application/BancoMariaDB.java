package application;

import java.sql.Connection;

import db.DB;

public class BancoMariaDB {

	public static void main(String[] args) {
		Connection conn = DB.getConnection();
		System.out.println("Deu certo agora???");
		DB.closeConnection();

	}

}
