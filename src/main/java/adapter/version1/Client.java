package adapter.version1;

import adapter.LogModel;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        LogModel lml = new LogModel();
        lml.setLogId("001");
        lml.setOperateUser("admin");
        lml.setOperateTime("2010-03-02 10:08:18");
        lml.setLogContent("this is a test");
        List<LogModel> list = new ArrayList<LogModel>();
        list.add(lml);

        // example1
        LogFileOperateApi logFileApi = new LogFileOperate("");
        logFileApi.writeLogFile(list);
        List<LogModel> readLog = logFileApi.readLogFile();
        System.out.println("readLog:" + readLog);

    }
}
