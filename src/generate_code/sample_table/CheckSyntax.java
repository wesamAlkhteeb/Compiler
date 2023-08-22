package generate_code.sample_table;

import java.util.*;

public class CheckSyntax {


    HashMap<String, HashMap<String, ArrayList<String>>> mySyntax;

    public static final String ANY = "ANY";

    static private CheckSyntax checkSyntax;


    private CheckSyntax() {
        for (int i = 0; i < queues.length; i++) {
            queues[i] = new PriorityQueue<>();
        }

        mySyntax = new HashMap<>();
        mySyntax.put(
                "StartApp",
                new HashMap<String, ArrayList<String>>() {{
                    put("Screens", new ArrayList<>(Collections.singletonList(ANY)));
                }});
        mySyntax.put(
                ANY,
                new HashMap<String, ArrayList<String>>() {{
                    put("body", new ArrayList<>(Collections.singletonList("Body")));
                    put("controller", new ArrayList<>(Collections.singletonList("Controller")));
                }}
        );
        mySyntax.put(
                "Body",
                new HashMap<String, ArrayList<String>>() {{
                    put("view", new ArrayList<>(Arrays.asList("HeaderText", "Text", "TextOut", "NewLine", "Form", "HyperLink")));
                }});
        mySyntax.put(
                "HeaderText",
                new HashMap<String, ArrayList<String>>() {{
                    put("typeFont", new ArrayList<>(Collections.singletonList(ANY)));
                    put("title", new ArrayList<>(Collections.singletonList(ANY)));
                }}
        );
        mySyntax.put(
                "Text",
                new HashMap<String, ArrayList<String>>() {{
                    put("title", new ArrayList<>(Collections.singletonList(ANY)));
                }}
        );
        mySyntax.put(
                "TextOut",
                new HashMap<String, ArrayList<String>>() {{
                    put("title", new ArrayList<>(Collections.singletonList(ANY)));
                }}
        );
        mySyntax.put(
                "NewLine",
                new HashMap<String, ArrayList<String>>() {{}}
        );
        mySyntax.put(
                "Form",
                new HashMap<String, ArrayList<String>>() {{
                    put("action", new ArrayList<>(Collections.singletonList(ANY)));
                    put("view", new ArrayList<>(Arrays.asList("Image", "NewLine", "Submit", "InputText", "InputPassword", "TextOut", "Text")));
                }}
        );

        mySyntax.put(
                "InputText",
                new HashMap<String, ArrayList<String>>() {{
                    put("id", new ArrayList<>(Collections.singletonList(ANY)));
                }}
        );
        mySyntax.put(
                "InputPassword",
                new HashMap<String, ArrayList<String>>() {{
                    put("id", new ArrayList<>(Collections.singletonList(ANY)));
                }}
        );
        mySyntax.put(
                "Submit",
                new HashMap<String, ArrayList<String>>() {{
                    put("title", new ArrayList<>(Collections.singletonList(ANY)));
                }}
        );

        mySyntax.put(
                "readFromFile",
                new HashMap<String, ArrayList<String>>() {{
                    put("path", new ArrayList<>(Collections.singletonList(ANY)));
                }}
        );
        mySyntax.put(
                "writeToFile",
                new HashMap<String, ArrayList<String>>() {{
                    put("path", new ArrayList<>(Collections.singletonList(ANY)));
                    put("data", new ArrayList<>(Collections.singletonList(ANY)));
                }}
        );
        mySyntax.put(
                "Image",
                new HashMap<String, ArrayList<String>>() {{
                    put("source", new ArrayList<>(Collections.singletonList(ANY)));
                    put("width", new ArrayList<>(Collections.singletonList(ANY)));
                    put("height", new ArrayList<>(Collections.singletonList(ANY)));
                }}
        );
        mySyntax.put(
                "MoveScreen",
                new HashMap<String, ArrayList<String>>() {{
                    put("page", new ArrayList<>(Collections.singletonList(ANY)));
                }}
        );
        mySyntax.put(
                "HyperLink",
                new HashMap<String, ArrayList<String>>() {{
                    put("title", new ArrayList<>(Collections.singletonList(ANY)));
                    put("page", new ArrayList<>(Collections.singletonList(ANY)));
                }}
        );
        mySyntax.put(
                "Controller",
                new HashMap<String, ArrayList<String>>() {{
                    put("body", new ArrayList<>(Collections.singletonList(ANY)));
                    put("header", new ArrayList<>(Collections.singletonList(ANY)));
                }}
        );
        mySyntax.put(
                "isNotEmpty",
                new HashMap<String, ArrayList<String>>() {{
                    put("title", new ArrayList<>(Collections.singletonList(ANY)));
                }}
        );
    }


    static public CheckSyntax getInstance() {
        if (checkSyntax == null) {
            checkSyntax = new CheckSyntax();
        }
        return checkSyntax;
    }


    // check
    PriorityQueue<String>[] queues = new PriorityQueue[3];
    /*
        queue.poll بيجيب وبمسح
        queue.peek بيجيب بدون مسح
     */
    ArrayList<String> allScreen = new ArrayList<>();

    public void initialStructureAdd(int index) {

        if (index == 0 && queues[index].size() == 1) {
            queues[0].clear();
            queues[1].clear();
            queues[2].clear();
        } else if (index == 1 && queues[index].size() == 1) {
            queues[1].clear();
            queues[2].clear();
        }
    }

    public void addDataToQueue(int index, String data) {
        if (index == 0 && !mySyntax.containsKey(data)) {
            queues[index].add(ANY);
        } else {
            queues[index].add(data);
        }
    }

    public boolean addDataToCheck(String data, int index) {
        data = data.trim();
        initialStructureAdd(index);

        if (index == 2 && Objects.equals(queues[0].peek(), "StartApp") &&
                Objects.equals(queues[1].peek(), "Screens")) {
            allScreen.add(data);
            return true;
        }

        addDataToQueue(index, data);

        if (index == 0) {
            return checkContainObject(data);
        } else if (index == 1) {
            return checkContainAttributeInObject(queues[0].peek(), data);
        } else {
            return checkAll(queues[0].peek(), queues[1].peek(), data);
        }
    }

    private boolean checkContainObject(String object) {
        return mySyntax.containsKey(object) || allScreen.contains(object);
    }

    private boolean checkContainAttributeInObject(String object, String attribute) {
        return (
                mySyntax.containsKey(object) && mySyntax.get(object).containsKey(attribute)
                        ||
                        allScreen.contains(object) && mySyntax.get(ANY).containsKey(attribute)
        );
    }

    private boolean checkAll(String object, String attribute, String objectAttribute) {
        return (
                checkContainAttributeInObject(object, attribute) &&
                        (mySyntax.get(object).get(attribute).contains(objectAttribute) || mySyntax.get(object).get(attribute).contains(ANY))
        );
    }

}
