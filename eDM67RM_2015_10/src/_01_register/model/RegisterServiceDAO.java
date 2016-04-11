package _01_register.model;

import java.io.InputStream;

public interface RegisterServiceDAO {
	public int saveMember(MemberBean mb, InputStream is, long size,
			String filename);
}
