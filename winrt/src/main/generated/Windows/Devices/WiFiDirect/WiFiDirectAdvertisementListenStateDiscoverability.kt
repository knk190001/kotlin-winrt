package Windows.Devices.WiFiDirect

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

@ABIMarker(WiFiDirectAdvertisementListenStateDiscoverability.ABI::class)
@Signature("enum(Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability;i4)")
@WinRTByReference(brClass = WiFiDirectAdvertisementListenStateDiscoverability.ByReference::class)
public enum class WiFiDirectAdvertisementListenStateDiscoverability(
  public val value: Int
) : NativeMapped {
  None(0),
  Normal(1),
  Intensive(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiDirectAdvertisementListenStateDiscoverability {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Normal
      2 -> Intensive
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WiFiDirectAdvertisementListenStateDiscoverability> {
    public fun setValue(newValue: WiFiDirectAdvertisementListenStateDiscoverability): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiDirectAdvertisementListenStateDiscoverability =
        WiFiDirectAdvertisementListenStateDiscoverability.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<WiFiDirectAdvertisementListenStateDiscoverability, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiDirectAdvertisementListenStateDiscoverability =
        WiFiDirectAdvertisementListenStateDiscoverability.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiDirectAdvertisementListenStateDiscoverability): Int =
        obj.value
  }
}
