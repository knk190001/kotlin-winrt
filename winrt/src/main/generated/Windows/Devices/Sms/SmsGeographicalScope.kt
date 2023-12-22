package Windows.Devices.Sms

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

@ABIMarker(SmsGeographicalScope.ABI::class)
@Signature("enum(Windows.Devices.Sms.SmsGeographicalScope;i4)")
@WinRTByReference(brClass = SmsGeographicalScope.ByReference::class)
public enum class SmsGeographicalScope(
  public val value: Int
) : NativeMapped {
  None(0),
  CellWithImmediateDisplay(1),
  LocationArea(2),
  Plmn(3),
  Cell(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmsGeographicalScope {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> CellWithImmediateDisplay
      2 -> LocationArea
      3 -> Plmn
      4 -> Cell
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SmsGeographicalScope> {
    public fun setValue(newValue: SmsGeographicalScope): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmsGeographicalScope =
        SmsGeographicalScope.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmsGeographicalScope, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmsGeographicalScope =
        SmsGeographicalScope.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmsGeographicalScope): Int = obj.value
  }
}
