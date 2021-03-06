/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api-testnet.bybit.com]  
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class APIKeyInfo (
  apiKey: Option[String] = None,
  userId: Option[Number] = None,
  ips: Option[List[String]] = None,
  note: Option[String] = None,
  permissions: Option[List[String]] = None,
  createdAt: Option[String] = None,
  readOnly: Option[Boolean] = None
)

