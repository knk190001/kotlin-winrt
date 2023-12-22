package Windows.Devices.Enumeration

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

@ABIMarker(Panel.ABI::class)
@Signature("enum(Windows.Devices.Enumeration.Panel;i4)")
@WinRTByReference(brClass = Panel.ByReference::class)
public enum class Panel(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Front(1),
  Back(2),
  Top(3),
  Bottom(4),
  Left(5),
  Right(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): Panel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Front
      2 -> Back
      3 -> Top
      4 -> Bottom
      5 -> Left
      6 -> Right
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Panel> {
    public fun setValue(newValue: Panel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Panel = Panel.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<Panel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Panel = Panel.values()[0].fromNative(value, null)

    public override fun toNative(obj: Panel): Int = obj.value
  }
}
