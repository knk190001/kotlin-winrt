package Windows.Gaming.Input.Custom

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

@ABIMarker(XusbDeviceType.ABI::class)
@Signature("enum(Windows.Gaming.Input.Custom.XusbDeviceType;i4)")
@WinRTByReference(brClass = XusbDeviceType.ByReference::class)
public enum class XusbDeviceType(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Gamepad(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      XusbDeviceType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Gamepad
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<XusbDeviceType> {
    public fun setValue(newValue: XusbDeviceType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): XusbDeviceType =
        XusbDeviceType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<XusbDeviceType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): XusbDeviceType =
        XusbDeviceType.values()[0].fromNative(value, null)

    public override fun toNative(obj: XusbDeviceType): Int = obj.value
  }
}
