package factorymethod.version2;

/**
 * 具体的创建器实现对象，实现创建导出成文本文件格式的对象
 */
public class ExportTxtFileOperate extends ExportOperate{

	@Override
	protected ExportFileApi factoryMethod() {
		// 创建导出成文本文件格式的对象
		return new ExportTxtFile();
	}

}