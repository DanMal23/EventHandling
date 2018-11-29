package grouplayout;

import java.util.ArrayList;

public class Methods {
	private ArrayList<Info> infoList = new ArrayList<Info>();

	public void addData(Info in) {
		infoList.add(in);
	}

	public void removeData(Info in) {
		infoList.remove(in);
	}

	public Info[] getData() {
		return (Info[]) infoList.toArray(new Info[infoList.size()]);
	}
}
