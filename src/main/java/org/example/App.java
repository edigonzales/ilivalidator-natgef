package org.example;

public class App {

    public static void main(String[] args) {

        System.setProperty("ch.ehi.iox-ili.pluginClasses",
                "ch.geowerkstatt.ilivalidator.extensions.functions.GetAreaIoxPlugin,"
                        + "ch.geowerkstatt.ilivalidator.extensions.functions.GetLengthIoxPlugin,"
                        + "ch.geowerkstatt.ilivalidator.extensions.functions.GetInnerRingsCountIoxPlugin,"
                        + "ch.geowerkstatt.ilivalidator.extensions.functions.GetInGroupsIoxPlugin,"
                        + "ch.geowerkstatt.ilivalidator.extensions.functions.IsInsideExternalXtfIoxPlugin,"
                        + "ch.geowerkstatt.ilivalidator.extensions.functions.IsInsideExternalXtfResourceIoxPlugin,"
                        + "ch.geowerkstatt.ilivalidator.extensions.functions.IsInsideIoxPlugin,"
                        + "ch.geowerkstatt.ilivalidator.extensions.functions.UnionIoxPlugin,"
                        + "ch.geowerkstatt.ilivalidator.extensions.functions.PolylinesOverlapIoxPlugin,"
                        + "ch.geowerkstatt.ilivalidator.extensions.functions.FindObjectsIoxPlugin,"
                        + "ch.geowerkstatt.ilivalidator.extensions.functions.FilterIoxPlugin,"
                        + "ch.geowerkstatt.ilivalidator.extensions.functions.ngk.IsInsideAreaByCodeIoxPlugin");
         
        var myValidator = new MyValidator();
        myValidator.run("src/test/resources/Test_neu4_ohneFehler.xtf");
        myValidator.run("src/test/resources/Test_neu4_mitFehler.xtf");
        
        
    }
}
