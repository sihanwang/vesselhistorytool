package com.thomsonreuters.ce.destinationmapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.sql.PreparedStatement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

import au.com.bytecode.opencsv.CSVParser;

public class MappingUpdater {

	public static String MergeStr = "merge into vt_dest_port_rship vdpr using (select trim(?) as a from dual) td "
			+ "on (vdpr.raw_destination=td.a) "
			+ "when matched then update set country=?,por_id=(select id from port where axsmarine_id=?) "
			+ "when not matched then "
			+ "insert (id,country,por_id,raw_destination) values (vdp_seq.NEXTVAL,trim(?),(select id from port where axsmarine_id=?),td.a)";

	public static void main(String[] args) throws Exception {

		Connection con = null;// ����һ�����ݿ�����
		
		Class.forName("oracle.jdbc.driver.OracleDriver");// ����Oracle��������
		String url = "jdbc:oracle:thin:@(description =(ADDRESS = (PROTOCOL = TCP)(HOST = scan1.commodities.int.thomsonreuters.com)(PORT = 1521))(load_balance = on)(connect_data = (server = dedicated)(service_name = pocb.int.thomsonreuters.com)))";// 127.0.0.1�Ǳ�����ַ��XE�Ǿ����Oracle��Ĭ�����ݿ���
		String user = "cef_cnr";// �û���,ϵͳĬ�ϵ��˻���
		String password = "cef_cnr";// �㰲װʱѡ���õ�����
		con = DriverManager.getConnection(url, user, password);// ��ȡ����
		con.setAutoCommit(false);

		CSVParser CSVP = new CSVParser(',', '"', '@', false, false);

		BufferedReader br = new BufferedReader(
				new FileReader("C:\\mywork\\vtrebuild\\20170817\\new_mappings_2017-08-15_F.csv"));

		String data = br.readLine();// һ�ζ���һ�У�ֱ������nullΪ�ļ�����

		while (data != null) {

			data = br.readLine(); // ���Ŷ���һ��
			String RowData[] = CSVP.parseLine(data);

			for (String field : RowData) {
				System.out.print(field + ",");
			}
			
			System.out.println();

			String raw_ais_destination = RowData[0];
			int ais_port_id = Integer.parseInt(RowData[1]);
			String country = RowData[4];

			try {
				PreparedStatement objPreStatement = con.prepareStatement(MergeStr);
				objPreStatement.setString(1,raw_ais_destination);
				objPreStatement.setString(2, country);
				objPreStatement.setInt(3,ais_port_id);
				objPreStatement.setString(4, country);
				objPreStatement.setInt(5,ais_port_id);

				objPreStatement.executeUpdate();
				con.commit();
				objPreStatement.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		con.close();
	}

}
