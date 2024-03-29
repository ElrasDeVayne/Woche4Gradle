/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package abgabegradle;

import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;

import spark.Spark;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        IRender render = new Render();
		IContextBuilder builder = render.newBuilder();
		builder.width(120).height(20);
		builder.element(new PseudoText("PseudoText"));
		ICanvas canvas = render.render(builder.build());
		String s = canvas.getText();
		System.out.println(s);

        System.out.println("test");
        

        Spark.get("/welcome", (req, res) -> {
            return "Hallo from DevOps";
        });

        Spark.get("/welcomeUser", (req, res) -> {
            String user = "ZHAW BENUTZER";
            return "Hallo " + user + " from DevOps";
        });
     
    }
}
