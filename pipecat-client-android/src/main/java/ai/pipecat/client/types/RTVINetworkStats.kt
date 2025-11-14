package ai.pipecat.client.types

/**
 * Network statistics representing call quality.
 */
data class RTVINetworkStats(
    /**
     * A lossy, human-readable quality value representing call quality.
     */
    val quality: Int,
    /**
     * A threshold value representing call quality.
     */
    val threshold: RTVINetworkThreshold,
    /**
     * The previous threshold value, if available.
     */
    val previousThreshold: RTVINetworkThreshold? = null,
    /**
     * Detailed network statistics.
     */
    val stats: RTVIDetailedNetworkStats,
)

/**
 * Detailed network statistics including latest metrics and worst packet loss values.
 */
data class RTVIDetailedNetworkStats(
    /**
     * Latest network statistics.
     */
    val latest: RTVILatestStatistics,
    /**
     * Worst video receive packet loss percentage.
     */
    val worstVideoReceivePacketLoss: Float? = null,
    /**
     * Worst video send packet loss percentage.
     */
    val worstVideoSendPacketLoss: Float? = null,
)

/**
 * Latest network statistics snapshot.
 */
data class RTVILatestStatistics(
    /**
     * Receive bits per second.
     */
    val receiveBitsPerSecond: Float? = null,
    /**
     * Send bits per second.
     */
    val sendBitsPerSecond: Float? = null,
    /**
     * Timestamp of the statistics snapshot.
     */
    val timestamp: Float? = null,
    /**
     * Video receive bits per second.
     */
    val videoRecvBitsPerSecond: Float? = null,
    /**
     * Video send bits per second.
     */
    val videoSendBitsPerSecond: Float? = null,
    /**
     * Video receive packet loss percentage.
     */
    val videoRecvPacketLoss: Float? = null,
    /**
     * Video send packet loss percentage.
     */
    val videoSendPacketLoss: Float? = null,
    /**
     * Total receive packet loss percentage.
     */
    val totalRecvPacketLoss: Float? = null,
    /**
     * Total send packet loss percentage.
     */
    val totalSendPacketLoss: Float? = null,
)

/**
 * Represents network quality thresholds based on packet loss.
 */
enum class RTVINetworkThreshold {
    /**
     * Represents that the network has reached a good threshold of packet loss.
     */
    Good,
    /**
     * Represents that the network has reached a low threshold of packet loss.
     */
    Low,
    /**
     * Represents that the network has reached a very low threshold of packet loss.
     */
    VeryLow,
}
