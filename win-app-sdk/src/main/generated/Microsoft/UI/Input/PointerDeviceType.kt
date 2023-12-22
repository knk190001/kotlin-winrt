package Microsoft.UI.Input

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

@ABIMarker(PointerDeviceType.ABI::class)
@Signature("enum(Microsoft.UI.Input.PointerDeviceType;i4)")
@WinRTByReference(brClass = PointerDeviceType.ByReference::class)
public enum class PointerDeviceType(
  public val value: Int
) : NativeMapped {
  Touch(0),
  Pen(1),
  Mouse(2),
  Touchpad(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PointerDeviceType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Touch
      1 -> Pen
      2 -> Mouse
      3 -> Touchpad
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PointerDeviceType> {
    public fun setValue(newValue: PointerDeviceType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PointerDeviceType =
        PointerDeviceType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PointerDeviceType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PointerDeviceType =
        PointerDeviceType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PointerDeviceType): Int = obj.value
  }
}
