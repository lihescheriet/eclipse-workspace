/**
 * 
 */
package tools;
/**
 * 
 * @author Lihes
 *
 */
/**
 * 
 * Class - DateUS
 * <br/>
 * <br/>Constructor :
 * <br/>- MesDates()
 * <br/>
 * <br/>Functions :
 * <br/>- MestDates.dateFRtoUS(String date)
 * <br/>  |--> Return String
 * <br/>
 * <br/>- MestDates.dateFRtoUS(String date)
 * <br/>  |--> Return String
 * <br/>
 * <br/>End.
 *
 */
public class DateUS {
	/**
	 * Constructor
	 */
	public DateUS() {}
		/**
		 * convertion String Date FR to US
		 * @param date String
		 * @return newDate type String
		 */
		public String dateFRtoUS(String date) {
			String[] dateHash = date.split("/");
			String year = dateHash[2];
			String month = dateHash[1];
			String day = dateHash[0];
			String newDate = year+"-"+month+"-"+day;
			return newDate;
		}
		/**
		 * convertion String Date US to FR
		 * 
		 * @param date - String
		 * @return newDate- type String
		 */
		public String dateUStoFR(String date) {
			String[] dateHash = date.split("-");
			String year = dateHash[0];
			String month = dateHash[1];
			String day = dateHash[2];
			String newDate = day+"/"+month+"/"+year;
			return newDate;
		}
	}
