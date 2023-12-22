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

@ABIMarker(WiFiDirectError.ABI::class)
@Signature("enum(Windows.Devices.WiFiDirect.WiFiDirectError;i4)")
@WinRTByReference(brClass = WiFiDirectError.ByReference::class)
public enum class WiFiDirectError(
  public val value: Int
) : NativeMapped {
  Success(0),
  RadioNotAvailable(1),
  ResourceInUse(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiDirectError {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> RadioNotAvailable
      2 -> ResourceInUse
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WiFiDirectError> {
    public fun setValue(newValue: WiFiDirectError): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiDirectError =
        WiFiDirectError.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiDirectError, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiDirectError =
        WiFiDirectError.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiDirectError): Int = obj.value
  }
}
