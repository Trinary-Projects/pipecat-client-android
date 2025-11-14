package ai.pipecat.client.types

data class RTVINetworkConnectionStatusUpdate(
    val connection: RTVINetworkConnectionType,
    val event: RTVINetworkConnectionEventType,
)

/**
 * A type of network connection managed by the CallClient.
 */
enum class RTVINetworkConnectionType {
    /**
     * Websocket connection used for sending and receiving call state information.
     */
    signalling,

    /**
     * Incoming media stream.
     */
    recvTransport,

    /**
     * Outgoing media stream.
     */
    sendTransport,
}

enum class RTVINetworkConnectionEventType {
    /**
     * The transport has entered a connected state.
     */
    connected,

    /**
     * The connection has been interrupted.
     */
    interrupted
}

