package Windows.Media.Protection

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

@ABIMarker(HdcpProtection.ABI::class)
@Signature("enum(Windows.Media.Protection.HdcpProtection;i4)")
@WinRTByReference(brClass = HdcpProtection.ByReference::class)
public enum class HdcpProtection(
  public val value: Int
) : NativeMapped {
  Off(0),
  On(1),
  OnWithTypeEnforcement(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HdcpProtection {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Off
      1 -> On
      2 -> OnWithTypeEnforcement
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HdcpProtection> {
    public fun setValue(newValue: HdcpProtection): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HdcpProtection =
        HdcpProtection.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HdcpProtection, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HdcpProtection =
        HdcpProtection.values()[0].fromNative(value, null)

    public override fun toNative(obj: HdcpProtection): Int = obj.value
  }
}
