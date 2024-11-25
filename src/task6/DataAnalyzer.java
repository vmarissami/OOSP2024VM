package task6;

public abstract class DataAnalyzer {
    public final void analyzeData() {
        loadData();
        preprocessData();
        performAnalysis();
        generateReport();
    }

    protected void loadData() {
        System.out.println("Загрузка данных...");
    }

    protected void preprocessData() {
        System.out.println("Предобработка данных...");
    }

    protected abstract void performAnalysis();

    protected void generateReport() {
        System.out.println("Генерация отчета...");
    }
}
