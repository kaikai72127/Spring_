package tw.leonchen.model;

import java.util.HashMap;

public class TruckBeanFactory {
	
	private HashMap<Integer, TruckBean> map = new HashMap<Integer, TruckBean>();
	
	public void setMap(HashMap<Integer, TruckBean> map) {
		this.map=map;
	}

	public TruckBean getTruckBean(int key) {
		return map.get(key);
	}
}
