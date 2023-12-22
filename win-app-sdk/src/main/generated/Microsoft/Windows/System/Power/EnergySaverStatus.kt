package Microsoft.Windows.System.Power

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

@ABIMarker(EnergySaverStatus.ABI::class)
@Signature("enum(Microsoft.Windows.System.Power.EnergySaverStatus;i4)")
@WinRTByReference(brClass = EnergySaverStatus.ByReference::class)
public enum class EnergySaverStatus(
  public val value: Int
) : NativeMapped {
  Uninitialized(0),
  Disabled(1),
  Off(2),
  On(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EnergySaverStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Uninitialized
      1 -> Disabled
      2 -> Off
      3 -> On
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EnergySaverStatus> {
    public fun setValue(newValue: EnergySaverStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EnergySaverStatus =
        EnergySaverStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EnergySaverStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EnergySaverStatus =
        EnergySaverStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: EnergySaverStatus): Int = obj.value
  }
}
