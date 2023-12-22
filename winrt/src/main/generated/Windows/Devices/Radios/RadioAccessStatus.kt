package Windows.Devices.Radios

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

@ABIMarker(RadioAccessStatus.ABI::class)
@Signature("enum(Windows.Devices.Radios.RadioAccessStatus;i4)")
@WinRTByReference(brClass = RadioAccessStatus.ByReference::class)
public enum class RadioAccessStatus(
  public val value: Int
) : NativeMapped {
  Unspecified(0),
  Allowed(1),
  DeniedByUser(2),
  DeniedBySystem(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RadioAccessStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> Allowed
      2 -> DeniedByUser
      3 -> DeniedBySystem
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RadioAccessStatus> {
    public fun setValue(newValue: RadioAccessStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RadioAccessStatus =
        RadioAccessStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RadioAccessStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RadioAccessStatus =
        RadioAccessStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: RadioAccessStatus): Int = obj.value
  }
}
