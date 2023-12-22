package Windows.Media.Miracast

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(MiracastReceiverDisconnectReason.ABI::class)
@Signature("enum(Windows.Media.Miracast.MiracastReceiverDisconnectReason;i4)")
@WinRTByReference(brClass = MiracastReceiverDisconnectReason.ByReference::class)
public enum class MiracastReceiverDisconnectReason(
  public val value: Int
) : NativeMapped {
  Finished(0),
  AppSpecificError(1),
  ConnectionNotAccepted(2),
  DisconnectedByUser(3),
  FailedToStartStreaming(4),
  MediaDecodingError(5),
  MediaStreamingError(6),
  MediaDecryptionError(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MiracastReceiverDisconnectReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Finished
      1 -> AppSpecificError
      2 -> ConnectionNotAccepted
      3 -> DisconnectedByUser
      4 -> FailedToStartStreaming
      5 -> MediaDecodingError
      6 -> MediaStreamingError
      7 -> MediaDecryptionError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MiracastReceiverDisconnectReason> {
    public fun setValue(newValue: MiracastReceiverDisconnectReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MiracastReceiverDisconnectReason =
        MiracastReceiverDisconnectReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MiracastReceiverDisconnectReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MiracastReceiverDisconnectReason =
        MiracastReceiverDisconnectReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: MiracastReceiverDisconnectReason): Int = obj.value
  }
}
