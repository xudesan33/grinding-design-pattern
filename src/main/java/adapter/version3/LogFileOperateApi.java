package adapter.version3;

import adapter.LogModel;

import java.util.List;

public interface LogFileOperateApi {

    public List<LogModel> readLogFile();
    public void writeLogFile(List<LogModel> list);
}