/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-10-17 16:43:55 UTC)
 * on 2016-10-24 at 23:29:31 UTC 
 * Modify at your own risk.
 */

package com.example.com.example.entities.anxisendpoint.model;

/**
 * Model definition for RegistroTest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the anxisendpoint. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RegistroTest extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime fechaFinalizacion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_paciente")
  private java.lang.String idPaciente;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_registro")
  private java.lang.String idRegistro;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_test")
  private java.lang.String idTest;

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getFechaFinalizacion() {
    return fechaFinalizacion;
  }

  /**
   * @param fechaFinalizacion fechaFinalizacion or {@code null} for none
   */
  public RegistroTest setFechaFinalizacion(com.google.api.client.util.DateTime fechaFinalizacion) {
    this.fechaFinalizacion = fechaFinalizacion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIdPaciente() {
    return idPaciente;
  }

  /**
   * @param idPaciente idPaciente or {@code null} for none
   */
  public RegistroTest setIdPaciente(java.lang.String idPaciente) {
    this.idPaciente = idPaciente;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIdRegistro() {
    return idRegistro;
  }

  /**
   * @param idRegistro idRegistro or {@code null} for none
   */
  public RegistroTest setIdRegistro(java.lang.String idRegistro) {
    this.idRegistro = idRegistro;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIdTest() {
    return idTest;
  }

  /**
   * @param idTest idTest or {@code null} for none
   */
  public RegistroTest setIdTest(java.lang.String idTest) {
    this.idTest = idTest;
    return this;
  }

  @Override
  public RegistroTest set(String fieldName, Object value) {
    return (RegistroTest) super.set(fieldName, value);
  }

  @Override
  public RegistroTest clone() {
    return (RegistroTest) super.clone();
  }

}
