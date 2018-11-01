package yidong.Util;

public class IsEmpty {
	public static String isEmpty(String a) {
		if ("".equals(a)||a==null||"null".equals(a.trim())) {
			return null;
		}
		else {
			a=a.replaceAll("<", "&lt;")
			.replaceAll(">", "&gt;")
			.replaceAll("%", "\\\\"+"%")
			.replaceAll("_", "\\\\_")
			.replaceAll("'", "'"+"'");
			return a;
		}
	}
}