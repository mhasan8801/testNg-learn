package ListenerTesting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

    //dipanggil ketika pengujian dimulai
    public void onStart(ITestContext arg){
        System.out.println("Start test execution..." + arg.getName());
    }

    //dipanggil ketika pengujian selesai
    public void onFinish(ITestContext arg){
        System.out.println("Finish test execution..." + arg.getName());
    }

    //dipanggil ketika sebuah tes dimulai
    public void onTestStart(ITestResult arg0){
        System.out.println("Start test..." + arg0.getName());
    }

    //dipanggil ketika sebuah tes diskip
    public void onTestSkipped(ITestResult arg0){
        System.out.println("Skipped test..." + arg0.getName());
    }

    //dipanggil ketika tes berhasil
    public void onTestSuccess(ITestResult arg0){
        System.out.println("Passed test..." + arg0.getName());
    }

    //dipanggil ketika tes gagal
    public void onTestFailure(ITestResult arg0){
        System.out.println("Failed test..." + arg0.getName());
    }

    //menangani kasus tes yang gagal namun masih memenuhi kriteria keberhasilan yang ditetapkan.
    public void onTestFailedButWithinSuccessPrecentage(ITestResult arg0){
//        TODO Auto-generated method stud
    }

}
