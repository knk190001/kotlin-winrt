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

@ABIMarker(WiFiDirectServiceAdvertisementStatus.ABI::class)
@Signature("enum(Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertisementStatus;i4)")
@WinRTByReference(brClass = WiFiDirectServiceAdvertisementStatus.ByReference::class)
public enum class WiFiDirectServiceAdvertisementStatus(
  public val value: Int
) : NativeMapped {
  Created(0),
  Started(1),
  Stopped(2),
  Aborted(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiDirectServiceAdvertisementStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Created
      1 -> Started
      2 -> Stopped
      3 -> Aborted
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WiFiDirectServiceAdvertisementStatus> {
    public fun setValue(newValue: WiFiDirectServiceAdvertisementStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiDirectServiceAdvertisementStatus =
        WiFiDirectServiceAdvertisementStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiDirectServiceAdvertisementStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiDirectServiceAdvertisementStatus =
        WiFiDirectServiceAdvertisementStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiDirectServiceAdvertisementStatus): Int = obj.value
  }
}
