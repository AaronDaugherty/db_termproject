package STD.termproject.Spotifate.model;

import java.util.List;

public class Query {

	private String select;
	private String from;
	private String where;
	private String operator;
	private String search;

	public String getSelect() {
		return select;
	}
	public void setSelect(String select) {
		this.select = select;
	}

	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}

	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}

	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}

}