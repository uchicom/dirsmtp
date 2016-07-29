/**
 * (c) 2015 uchicom
 */
package com.uchicom.dirsmtp;

/**
 * 起動クラス.
 *
 * @author uchicom: Shigeki Uchiyama
 *
 */
public class Main {

	/**
	 * アドレスとメールユーザーフォルダの格納フォルダを指定する.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SmtpParameter parameter = new SmtpParameter(args);
		if (parameter.init(System.err)) {
			Server server = parameter.createServer();
			if (server != null) {
				server.execute();
			} else {
				//エラーログ
				System.err.println("usage:type is single,multi,pool,selector");
			}
		}
	}

}
