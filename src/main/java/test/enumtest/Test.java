package test.enumtest;

/**
 * Created by wm on 2017/7/17.
 */
public enum Test {
    VIDEO(1, "视频"),
    AUDIO(2, "音频"),
    TEXT(3, "文本"),
    IMAGE(4, "图像");
    public final int key;

    public final String value;

    Test(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValueByKey(int key) {
        String value = null;
        for (Test test : Test.values()) {

            if (test.key == key) {

                value = test.value;
                break;
            }
        }
        return value;

    }

    public static int getKeyByValue(String value) {
        int key = 0;
        for (Test test : Test.values()) {

            if (test.value.equals(value)) {

                key = test.key;
                break;
            }
        }
        return key;

    }

    public static Test serchEnum(int key) {
        Test result = null;
        for (Test test : Test.values()) {

            if (test.key == key) {

                result = test;
                break;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(Test.getValueByKey(1));
        System.out.println(Test.getKeyByValue("音频"));
        System.out.println(Test.serchEnum(2));

    }
}
