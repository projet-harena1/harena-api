/*
 * harena
 * harena
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client;

import java.util.List;
import java.util.Map;

/** ApiException class. */
@SuppressWarnings("serial")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2024-07-23T10:20:14.118552532+03:00[Indian/Antananarivo]")
public class ApiException extends Exception {
  private int code = 0;
  private Map<String, List<String>> responseHeaders = null;
  private String responseBody = null;

  /** Constructor for ApiException. */
  public ApiException() {}

  /**
   * Constructor for ApiException.
   *
   * @param throwable a {@link java.lang.Throwable} object
   */
  public ApiException(Throwable throwable) {
    super(throwable);
  }

  /**
   * Constructor for ApiException.
   *
   * @param message the error message
   */
  public ApiException(String message) {
    super(message);
  }

  /**
   * Constructor for ApiException.
   *
   * @param message the error message
   * @param throwable a {@link java.lang.Throwable} object
   * @param code HTTP status code
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   * @param responseBody the response body
   */
  public ApiException(
      String message,
      Throwable throwable,
      int code,
      Map<String, List<String>> responseHeaders,
      String responseBody) {
    super(message, throwable);
    this.code = code;
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  /**
   * Constructor for ApiException.
   *
   * @param message the error message
   * @param code HTTP status code
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   * @param responseBody the response body
   */
  public ApiException(
      String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
    this(message, (Throwable) null, code, responseHeaders, responseBody);
  }

  /**
   * Constructor for ApiException.
   *
   * @param message the error message
   * @param throwable a {@link java.lang.Throwable} object
   * @param code HTTP status code
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   */
  public ApiException(
      String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
    this(message, throwable, code, responseHeaders, null);
  }

  /**
   * Constructor for ApiException.
   *
   * @param code HTTP status code
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   * @param responseBody the response body
   */
  public ApiException(int code, Map<String, List<String>> responseHeaders, String responseBody) {
    this((String) null, (Throwable) null, code, responseHeaders, responseBody);
  }

  /**
   * Constructor for ApiException.
   *
   * @param code HTTP status code
   * @param message a {@link java.lang.String} object
   */
  public ApiException(int code, String message) {
    super(message);
    this.code = code;
  }

  /**
   * Constructor for ApiException.
   *
   * @param code HTTP status code
   * @param message the error message
   * @param responseHeaders a {@link java.util.Map} of HTTP response headers
   * @param responseBody the response body
   */
  public ApiException(
      int code, String message, Map<String, List<String>> responseHeaders, String responseBody) {
    this(code, message);
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  /**
   * Get the HTTP status code.
   *
   * @return HTTP status code
   */
  public int getCode() {
    return code;
  }

  /**
   * Get the HTTP response headers.
   *
   * @return A map of list of string
   */
  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Get the HTTP response body.
   *
   * @return Response body in the form of string
   */
  public String getResponseBody() {
    return responseBody;
  }

  /**
   * Get the exception message including HTTP response data.
   *
   * @return The exception message
   */
  public String getMessage() {
    return String.format(
        "Message: %s%nHTTP response code: %s%nHTTP response body: %s%nHTTP response headers: %s",
        super.getMessage(), this.getCode(), this.getResponseBody(), this.getResponseHeaders());
  }
}
