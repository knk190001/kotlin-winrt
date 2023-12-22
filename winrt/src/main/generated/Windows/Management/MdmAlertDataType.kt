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

@ABIMarker(MdmAlertDataType.ABI::class)
@Signature("enum(Windows.Management.MdmAlertDataType;i4)")
@WinRTByReference(brClass = MdmAlertDataType.ByReference::class)
public enum class MdmAlertDataType(
  public val value: Int
) : NativeMapped {
  String(0),
  Base64(1),
  Boolean(2),
  Integer(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MdmAlertDataType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> String
      1 -> Base64
      2 -> Boolean
      3 -> Integer
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MdmAlertDataType> {
    public fun setValue(newValue: MdmAlertDataType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MdmAlertDataType =
        MdmAlertDataType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MdmAlertDataType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MdmAlertDataType =
        MdmAlertDataType.values()[0].fromNative(value, null)

    public override fun toNative(obj: MdmAlertDataType): Int = obj.value
  }
}
