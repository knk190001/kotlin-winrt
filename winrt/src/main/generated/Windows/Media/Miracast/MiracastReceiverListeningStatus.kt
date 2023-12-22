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

@ABIMarker(MiracastReceiverListeningStatus.ABI::class)
@Signature("enum(Windows.Media.Miracast.MiracastReceiverListeningStatus;i4)")
@WinRTByReference(brClass = MiracastReceiverListeningStatus.ByReference::class)
public enum class MiracastReceiverListeningStatus(
  public val value: Int
) : NativeMapped {
  NotListening(0),
  Listening(1),
  ConnectionPending(2),
  Connected(3),
  DisabledByPolicy(4),
  TemporarilyDisabled(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MiracastReceiverListeningStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotListening
      1 -> Listening
      2 -> ConnectionPending
      3 -> Connected
      4 -> DisabledByPolicy
      5 -> TemporarilyDisabled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MiracastReceiverListeningStatus> {
    public fun setValue(newValue: MiracastReceiverListeningStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MiracastReceiverListeningStatus =
        MiracastReceiverListeningStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MiracastReceiverListeningStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MiracastReceiverListeningStatus =
        MiracastReceiverListeningStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MiracastReceiverListeningStatus): Int = obj.value
  }
}
