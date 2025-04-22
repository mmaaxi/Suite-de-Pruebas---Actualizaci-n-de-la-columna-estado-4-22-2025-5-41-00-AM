Feature: Validar actualización de campos en la columna 'estado'

  Scenario: Exportar y revisar columna 'estado' en Excel
    Given el usuario ha exportado el reporte
    When el usuario revisa la columna 'estado' en el Excel
    Then la columna 'estado' muestra los datos y fórmulas actualizados

  Scenario: Comparar valores y formatos con los requisitos
    Given el usuario tiene el documento de requisitos
    When el usuario compara los valores y formatos con el documento de requisitos
    Then los datos y formato en la columna 'estado' coinciden con los requisitos