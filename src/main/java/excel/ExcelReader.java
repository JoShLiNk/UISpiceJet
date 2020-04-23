package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.json.JSONArray;
//import org.json.JSONArray;
import org.json.JSONObject;

public class ExcelReader {

	static Workbook wBook = null;
	static int lastRow;
	static int lastColumn;

	@SuppressWarnings("unused")
	public static String getDataInJsonFormat(Sheet sheet) {

		JSONArray array = new JSONArray();
		Row row = sheet.getRow(0);
		String[] header = getHeaders(sheet);
		lastRow = sheet.getLastRowNum();
		// System.out.println("LastRow:"+lastRow);
		JSONObject object = new JSONObject();

		for (int i = 0; i <= lastRow; i++) {

			row = sheet.getRow(i);
			if (row != null) {
				for (int j = 0; j < lastColumn; j++) {
					String value;

					Cell cell = row.getCell(j);

					DataFormatter formatter = new DataFormatter();

					value = formatter.formatCellValue(cell);

					object.put(header[j], value);
					/* SWTICH HERE */
				}
				// System.out.println(object.toString(1));
			}
		}
		array.put(object);

		// System.out.println(object.toString(1));
		return array.toString(1);

	}

	public static String[] getHeaders(Sheet sheet) {
		if (sheet != null) {
			Row row = sheet.getRow(0);
			lastColumn = row.getLastCellNum();
			String[] headers = new String[lastColumn];

			for (int i = 0; i < lastColumn; i++) {
				Cell cell = row.getCell(i);
				headers[i] = cell.getStringCellValue();
			}

			return headers;

		} else {
			return null;
		}

	}

}
//SWITCH
// CellType type = cell.getCellType();
// System.out.println(cell.toString()+" i:"+i+" j:"+j);
// System.out.println("TYPE:"+type.toString());
/*
 * switch (type) { case STRING: object.put(header[j],
 * cell.getStringCellValue()); break; case NUMERIC: object.put(header[j],
 * cell.getNumericCellValue()); break; case BLANK: object.put("BLANK", "");
 * break; case BOOLEAN: object.put(header[j], cell.getBooleanCellValue());
 * break; case FORMULA: object.put(header[j], cell.getCellFormula()); break;
 * case ERROR: object.put("ERROR", ""); break; case _NONE: object.put("_NONE",
 * ""); break; default: break; }
 */
