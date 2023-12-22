package Windows.UI.Core

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

@ABIMarker(CoreInputDeviceTypes.ABI::class)
@Signature("enum(Windows.UI.Core.CoreInputDeviceTypes;u4)")
@WinRTByReference(brClass = CoreInputDeviceTypes.ByReference::class)
public enum class CoreInputDeviceTypes(
  public val value: Int
) : NativeMapped {
  None(0),
  Touch(1),
  Pen(2),
  Mouse(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreInputDeviceTypes {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Touch
      2 -> Pen
      4 -> Mouse
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CoreInputDeviceTypes> {
    public fun setValue(newValue: CoreInputDeviceTypes): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreInputDeviceTypes =
        CoreInputDeviceTypes.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreInputDeviceTypes, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreInputDeviceTypes =
        CoreInputDeviceTypes.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreInputDeviceTypes): Int = obj.value
  }
}
