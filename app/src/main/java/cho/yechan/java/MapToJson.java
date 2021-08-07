package cho.yechan.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.gurumdari.CommandBridge;

public class MapToJson {

	public static void main(String[] args) {
		Map<String,Object> dataset = new HashMap<>(){{
			put("string_data","string_value");
			put("list",Arrays.asList("list1","list2","list3"));
			put("map_data",new HashMap<>(){{
				put("key1","value1");
				put("key2","value2");
			}});
		}};

		CommandBridge bridge = new CommandBridge();
		String json = bridge.toJson(dataset);

		System.out.println(bridge.prettifyJson(json));
	}
}
