package Windows.Management

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

@ABIMarker(MdmAlertMark.ABI::class)
@Signature("enum(Windows.Management.MdmAlertMark;i4)")
@WinRTByReference(brClass = MdmAlertMark.ByReference::class)
public enum class MdmAlertMark(
  public val value: Int
) : NativeMapped {
  None(0),
  Fatal(1),
  Critical(2),
  Warning(3),
  Informational(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MdmAlertMark {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Fatal
      2 -> Critical
      3 -> Warning
      4 -> Informational
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MdmAlertMark> {
    public fun setValue(newValue: MdmAlertMark): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MdmAlertMark =
        MdmAlertMark.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MdmAlertMark, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MdmAlertMark =
        MdmAlertMark.values()[0].fromNative(value, null)

    public override fun toNative(obj: MdmAlertMark): Int = obj.value
  }
}
