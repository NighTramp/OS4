package ru.gb.oseminar4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.gb.oseminar4.Controller.TaskController;
import ru.gb.oseminar4.Model.Keys;
import ru.gb.oseminar4.Model.Priority;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AppDiary extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TaskController taskController = new TaskController();

        Map<String,String> map = new HashMap<>();
        map.put(Keys.PRIORITY.toString(), Priority.LOW.toString());
        map.put(Keys.DEADLINESS.toString(), "Yesterday");
        map.put(Keys.FULLNAME.toString(), "Fedorov Anton");
        map.put(Keys.TASK.toString(), "123 do");

        taskController.createLazyTask();
        taskController.createTask(map);
        taskController.createLazyTask();

        taskController.viewTasks();

        taskController.deleteTasks(1);

        taskController.viewTasks();
        System.exit(1);
    }
/*
    НЕ КОНЕКТИТСЯ С КОНТРОЛЛЕРОМ. ПРИ ПОПЫТКЕ ЗАДАТЬ ID КНОПКАМ ИЛИ ИНЫМ ЭЛЕМЕНТАМ
    ПЕРЕСТАЕТ СОБИРАТЬСЯ ПРОЕКТ. ЗНАКОМСТВО С JAVAFX...

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppDiary.class.getResource("RootDairy-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        primaryStage.setTitle("Мой еженедельник");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 */
}
