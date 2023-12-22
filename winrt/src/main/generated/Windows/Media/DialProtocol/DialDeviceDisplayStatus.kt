package Windows.Media.DialProtocol

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

@ABIMarker(DialDeviceDisplayStatus.ABI::class)
@Signature("enum(Windows.Media.DialProtocol.DialDeviceDisplayStatus;i4)")
@WinRTByReference(brClass = DialDeviceDisplayStatus.ByReference::class)
public enum class DialDeviceDisplayStatus(
  public val value: Int
) : NativeMapped {
  None(0),
  Connecting(1),
  Connected(2),
  Disconnecting(3),
  Disconnected(4),
  Error(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DialDeviceDisplayStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Connecting
      2 -> Connected
      3 -> Disconnecting
      4 -> Disconnected
      5 -> Error
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DialDeviceDisplayStatus> {
    public fun setValue(newValue: DialDeviceDisplayStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DialDeviceDisplayStatus =
        DialDeviceDisplayStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DialDeviceDisplayStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DialDeviceDisplayStatus =
        DialDeviceDisplayStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: DialDeviceDisplayStatus): Int = obj.value
  }
}
