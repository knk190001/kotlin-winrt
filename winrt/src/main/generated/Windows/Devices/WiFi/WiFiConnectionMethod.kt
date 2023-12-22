package Windows.Devices.WiFi

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

@ABIMarker(WiFiConnectionMethod.ABI::class)
@Signature("enum(Windows.Devices.WiFi.WiFiConnectionMethod;i4)")
@WinRTByReference(brClass = WiFiConnectionMethod.ByReference::class)
public enum class WiFiConnectionMethod(
  public val value: Int
) : NativeMapped {
  Default(0),
  WpsPin(1),
  WpsPushButton(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiConnectionMethod {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> WpsPin
      2 -> WpsPushButton
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WiFiConnectionMethod> {
    public fun setValue(newValue: WiFiConnectionMethod): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiConnectionMethod =
        WiFiConnectionMethod.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiConnectionMethod, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiConnectionMethod =
        WiFiConnectionMethod.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiConnectionMethod): Int = obj.value
  }
}
