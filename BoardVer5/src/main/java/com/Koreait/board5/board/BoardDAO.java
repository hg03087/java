package com.Koreait.board5.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Koreait.board5.DBUtils;


public class BoardDAO {
	public static List<BoardVO> selBoardList() {
		List<BoardVO> list = new ArrayList();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT A.iboard, A.title, A.iuser, A.regdt, B.unm "
				+ " FROM t_board A  "
				+ " INNER JOIN t_user B "
				+ " ON A.iuser = B.iuser " 
				+ " ORDER BY A.iboard DESC " ;
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			
			while(rs.next()) {

				BoardVO vo = new BoardVO();
				vo.setIboard(rs.getInt("iboard"));
				vo.setTitle(rs.getString("title"));
				vo.setRegdt(rs.getString("regdt"));
				vo.setIuser(rs.getInt("iuser"));
				vo.setUnm(rs.getString("unm"));
				list.add(vo);

				
			}
		} catch (Exception e) {
			e.printStackTrace();	
		}finally {
			DBUtils.close(con, ps, rs);
		}
		return list;
	}

	public static BoardVO selBoard(BoardVO param) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BoardVO vo = null;
		
		String sql = " SELECT B.unm, "
				+ " A.iboard, A.title, A.ctnt, A.iuser, A.regdt  "
				+ " , IF(C.iboard IS NULL, 0, 1) AS isFav "
				+ " FROM t_board A " 
				+ " INNER JOIN t_user B " 
				+ " ON A.iuser = B.iuser "
				+ " LEFT JOIN t_board_fav c "
				+ " ON A.iboard = C.iboard "
				+ " AND C.iuser = ? "
				+ " WHERE A.iboard = ? ";
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, param.getIuser());  //로그인 user pk
			ps.setInt(2, param.getIboard());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				vo = new BoardVO();
				vo.setIboard(rs.getInt("iboard"));
				vo.setTitle(rs.getString("title"));
				vo.setCtnt(rs.getString("ctnt"));
				vo.setRegdt(rs.getString("regdt"));
				vo.setIuser(rs.getInt("iuser"));
				vo.setUnm(rs.getString("unm"));
				vo.setIsFav(rs.getInt("isFav"));
				return vo;
			}
		} catch (Exception e) {			
			e.printStackTrace();
			return vo;
		} finally {
			DBUtils.close(con, ps, rs);
		}
		return vo;

	}
	
	public static int insBoard(BoardVO param) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO t_board "
				+ " (title, ctnt, iuser) " 
				+ " VALUES "
				+ " (?, ?, ?) "; 
		
		try {
			con = DBUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, param.getTitle());
			ps.setString(2, param.getCtnt());
			ps.setInt(3, param.getIuser());
			
			return ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			DBUtils.close(con, ps);
		}
		
	}
}

