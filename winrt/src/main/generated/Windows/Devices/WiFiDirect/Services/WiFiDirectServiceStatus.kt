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

@ABIMarker(WiFiDirectServiceStatus.ABI::class)
@Signature("enum(Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus;i4)")
@WinRTByReference(brClass = WiFiDirectServiceStatus.ByReference::class)
public enum class WiFiDirectServiceStatus(
  public val value: Int
) : NativeMapped {
  Available(0),
  Busy(1),
  Custom(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiDirectServiceStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Available
      1 -> Busy
      2 -> Custom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WiFiDirectServiceStatus> {
    public fun setValue(newValue: WiFiDirectServiceStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiDirectServiceStatus =
        WiFiDirectServiceStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiDirectServiceStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiDirectServiceStatus =
        WiFiDirectServiceStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiDirectServiceStatus): Int = obj.value
  }
}
