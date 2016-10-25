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
 * Model definition for Mensaje.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the anxisendpoint. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Mensaje extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String idMedicoReceptorMensaje;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String idPacienteReceptorMensaje;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_mensaje")
  private java.lang.String idMensaje;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mensaje;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String titulo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer visto;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIdMedicoReceptorMensaje() {
    return idMedicoReceptorMensaje;
  }

  /**
   * @param idMedicoReceptorMensaje idMedicoReceptorMensaje or {@code null} for none
   */
  public Mensaje setIdMedicoReceptorMensaje(java.lang.String idMedicoReceptorMensaje) {
    this.idMedicoReceptorMensaje = idMedicoReceptorMensaje;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIdPacienteReceptorMensaje() {
    return idPacienteReceptorMensaje;
  }

  /**
   * @param idPacienteReceptorMensaje idPacienteReceptorMensaje or {@code null} for none
   */
  public Mensaje setIdPacienteReceptorMensaje(java.lang.String idPacienteReceptorMensaje) {
    this.idPacienteReceptorMensaje = idPacienteReceptorMensaje;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIdMensaje() {
    return idMensaje;
  }

  /**
   * @param idMensaje idMensaje or {@code null} for none
   */
  public Mensaje setIdMensaje(java.lang.String idMensaje) {
    this.idMensaje = idMensaje;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMensaje() {
    return mensaje;
  }

  /**
   * @param mensaje mensaje or {@code null} for none
   */
  public Mensaje setMensaje(java.lang.String mensaje) {
    this.mensaje = mensaje;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitulo() {
    return titulo;
  }

  /**
   * @param titulo titulo or {@code null} for none
   */
  public Mensaje setTitulo(java.lang.String titulo) {
    this.titulo = titulo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVisto() {
    return visto;
  }

  /**
   * @param visto visto or {@code null} for none
   */
  public Mensaje setVisto(java.lang.Integer visto) {
    this.visto = visto;
    return this;
  }

  @Override
  public Mensaje set(String fieldName, Object value) {
    return (Mensaje) super.set(fieldName, value);
  }

  @Override
  public Mensaje clone() {
    return (Mensaje) super.clone();
  }

}