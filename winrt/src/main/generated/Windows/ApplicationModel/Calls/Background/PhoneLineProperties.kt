package Windows.ApplicationModel.Calls.Background

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

@ABIMarker(PhoneLineProperties.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.Background.PhoneLineProperties;u4)")
@WinRTByReference(brClass = PhoneLineProperties.ByReference::class)
public enum class PhoneLineProperties(
  public val value: Int
) : NativeMapped {
  None(0),
  BrandingOptions(1),
  CanDial(2),
  CellularDetails(4),
  DisplayColor(8),
  DisplayName(16),
  NetworkName(32),
  NetworkState(64),
  Transport(128),
  Voicemail(256),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneLineProperties {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> BrandingOptions
      2 -> CanDial
      4 -> CellularDetails
      8 -> DisplayColor
      16 -> DisplayName
      32 -> NetworkName
      64 -> NetworkState
      128 -> Transport
      256 -> Voicemail
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneLineProperties> {
    public fun setValue(newValue: PhoneLineProperties): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneLineProperties =
        PhoneLineProperties.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneLineProperties, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneLineProperties =
        PhoneLineProperties.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneLineProperties): Int = obj.value
  }
}
