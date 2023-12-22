package Windows.Devices.WiFiDirect.Services

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

@ABIMarker(WiFiDirectServiceSessionErrorStatus.ABI::class)
@Signature("enum(Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionErrorStatus;i4)")
@WinRTByReference(brClass = WiFiDirectServiceSessionErrorStatus.ByReference::class)
public enum class WiFiDirectServiceSessionErrorStatus(
  public val value: Int
) : NativeMapped {
  Ok(0),
  Disassociated(1),
  LocalClose(2),
  RemoteClose(3),
  SystemFailure(4),
  NoResponseFromRemote(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiDirectServiceSessionErrorStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Ok
      1 -> Disassociated
      2 -> LocalClose
      3 -> RemoteClose
      4 -> SystemFailure
      5 -> NoResponseFromRemote
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WiFiDirectServiceSessionErrorStatus> {
    public fun setValue(newValue: WiFiDirectServiceSessionErrorStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiDirectServiceSessionErrorStatus =
        WiFiDirectServiceSessionErrorStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiDirectServiceSessionErrorStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiDirectServiceSessionErrorStatus =
        WiFiDirectServiceSessionErrorStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiDirectServiceSessionErrorStatus): Int = obj.value
  }
}
