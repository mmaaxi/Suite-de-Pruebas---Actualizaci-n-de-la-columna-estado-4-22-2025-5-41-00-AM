package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;
import static org.junit.Assert.assertTrue;

public class tc_003Steps {

    tc_003Page page = new tc_003Page();

    @Given("el usuario ha exportado el reporte")
    public void usuario_ha_exportado_el_reporte() {
        page.exportReport();
    }

    @When("el usuario revisa la columna 'estado' en el Excel")
    public void usuario_revisa_columna_estado() {
        page.checkEstadoColumnInExcel();
    }

    @Then("la columna 'estado' muestra los datos y fórmulas actualizados")
    public void columna_estado_muestra_datos_y_formulas_actualizados() {
        assertTrue(page.isEstadoColumnUpdatedAccordingToDescription());
    }

    @Given("el usuario tiene el documento de requisitos")
    public void usuario_tiene_documento_requisitos() {
        page.loadRequirementsDocument();
    }

    @When("el usuario compara los valores y formatos con el documento de requisitos")
    public void usuario_compara_con_requisitos() {
        page.compareColumnWithRequirements();
    }

    @Then("los datos y formato en la columna 'estado' coinciden con los requisitos")
    public void datos_y_formatos_coinciden_con_requisitos() {
        assertTrue(page.doDataAndFormatsMatchRequirements());
    }
}