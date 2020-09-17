/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpServerRequest
import io.vertx.core.http.ServerWebSocket
import io.vertx.core.net.NetSocket
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.HttpServerRequest.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pipeTo returning a future and chain with await()", replaceWith = ReplaceWith("pipeTo(dst).await()"))
suspend fun HttpServerRequest.pipeToAwait(dst: WriteStream<Buffer>): Unit {
  return awaitResult {
    this.pipeTo(dst, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerRequest.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with await()", replaceWith = ReplaceWith("end().await()"))
suspend fun HttpServerRequest.endAwait(): Unit {
  return awaitResult {
    this.end(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerRequest.toNetSocket]
 *
 * @return [NetSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use toNetSocket returning a future and chain with await()", replaceWith = ReplaceWith("toNetSocket().await()"))
suspend fun HttpServerRequest.toNetSocketAwait(): NetSocket {
  return awaitResult {
    this.toNetSocket(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerRequest.toWebSocket]
 *
 * @return [ServerWebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use toWebSocket returning a future and chain with await()", replaceWith = ReplaceWith("toWebSocket().await()"))
suspend fun HttpServerRequest.toWebSocketAwait(): ServerWebSocket {
  return awaitResult {
    this.toWebSocket(it)
  }
}

