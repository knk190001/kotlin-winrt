package Windows.Devices.HumanInterfaceDevice

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

@ABIMarker(HidCollectionType.ABI::class)
@Signature("enum(Windows.Devices.HumanInterfaceDevice.HidCollectionType;i4)")
@WinRTByReference(brClass = HidCollectionType.ByReference::class)
public enum class HidCollectionType(
  public val value: Int
) : NativeMapped {
  Physical(0),
  Application(1),
  Logical(2),
  Report(3),
  NamedArray(4),
  UsageSwitch(5),
  UsageModifier(6),
  Other(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HidCollectionType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Physical
      1 -> Application
      2 -> Logical
      3 -> Report
      4 -> NamedArray
      5 -> UsageSwitch
      6 -> UsageModifier
      7 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HidCollectionType> {
    public fun setValue(newValue: HidCollectionType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HidCollectionType =
        HidCollectionType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HidCollectionType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HidCollectionType =
        HidCollectionType.values()[0].fromNative(value, null)

    public override fun toNative(obj: HidCollectionType): Int = obj.value
  }
}
