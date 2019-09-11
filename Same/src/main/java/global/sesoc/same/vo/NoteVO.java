package global.sesoc.same.vo;

import java.sql.Date;

public class NoteVO {

	private String notenum;
	private String userid;
	private String foldernum;
	private String labelname;
	private String contents;
	private Date writedate;
	private Date updatedate;
	private String originname;
	private String savedname;
	private int islock;
	private int isdelete;
	
	//folder 테이블과 조인 대비
	private String foldername;
	

	
}
