
Map<String,Object> dataset = new HashMap<>(){{
	put("string_data","string_value");
	put("list",Arrays.asList("list1","list2","list3"));
	put("map_data",new HashMap<>(){{
		put("key1","value1");
		put("key2","value2");
	}});
}};

import com.gurumdari.CommandBridge;

CommandBridge bridge = new CommandBridge();
String json = bridge.toJson(dataset);

System.out.println(bridge.prettifyJson(json));

/exit