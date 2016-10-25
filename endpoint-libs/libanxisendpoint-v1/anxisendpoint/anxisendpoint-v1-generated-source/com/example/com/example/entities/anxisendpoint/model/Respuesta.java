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
 * Model definition for Respuesta.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the anxisendpoint. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Respuesta extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_paciente")
  private java.lang.String idPaciente;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_pregunta")
  private java.lang.String idPregunta;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_respuesta")
  private java.lang.String idRespuesta;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String respuesta;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIdPaciente() {
    return idPaciente;
  }

  /**
   * @param idPaciente idPaciente or {@code null} for none
   */
  public Respuesta setIdPaciente(java.lang.String idPaciente) {
    this.idPaciente = idPaciente;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIdPregunta() {
    return idPregunta;
  }

  /**
   * @param idPregunta idPregunta or {@code null} for none
   */
  public Respuesta setIdPregunta(java.lang.String idPregunta) {
    this.idPregunta = idPregunta;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIdRespuesta() {
    return idRespuesta;
  }

  /**
   * @param idRespuesta idRespuesta or {@code null} for none
   */
  public Respuesta setIdRespuesta(java.lang.String idRespuesta) {
    this.idRespuesta = idRespuesta;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRespuesta() {
    return respuesta;
  }

  /**
   * @param respuesta respuesta or {@code null} for none
   */
  public Respuesta setRespuesta(java.lang.String respuesta) {
    this.respuesta = respuesta;
    return this;
  }

  @Override
  public Respuesta set(String fieldName, Object value) {
    return (Respuesta) super.set(fieldName, value);
  }

  @Override
  public Respuesta clone() {
    return (Respuesta) super.clone();
  }

}