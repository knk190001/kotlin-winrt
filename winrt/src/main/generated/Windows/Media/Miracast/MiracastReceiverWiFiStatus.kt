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

@ABIMarker(MiracastReceiverWiFiStatus.ABI::class)
@Signature("enum(Windows.Media.Miracast.MiracastReceiverWiFiStatus;i4)")
@WinRTByReference(brClass = MiracastReceiverWiFiStatus.ByReference::class)
public enum class MiracastReceiverWiFiStatus(
  public val value: Int
) : NativeMapped {
  MiracastSupportUndetermined(0),
  MiracastNotSupported(1),
  MiracastSupportNotOptimized(2),
  MiracastSupported(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MiracastReceiverWiFiStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> MiracastSupportUndetermined
      1 -> MiracastNotSupported
      2 -> MiracastSupportNotOptimized
      3 -> MiracastSupported
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MiracastReceiverWiFiStatus> {
    public fun setValue(newValue: MiracastReceiverWiFiStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MiracastReceiverWiFiStatus =
        MiracastReceiverWiFiStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MiracastReceiverWiFiStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MiracastReceiverWiFiStatus =
        MiracastReceiverWiFiStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MiracastReceiverWiFiStatus): Int = obj.value
  }
}
