package Windows.ApplicationModel.ExtendedExecution

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

@ABIMarker(ExtendedExecutionReason.ABI::class)
@Signature("enum(Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason;i4)")
@WinRTByReference(brClass = ExtendedExecutionReason.ByReference::class)
public enum class ExtendedExecutionReason(
  public val value: Int
) : NativeMapped {
  Unspecified(0),
  LocationTracking(1),
  SavingData(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ExtendedExecutionReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> LocationTracking
      2 -> SavingData
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ExtendedExecutionReason> {
    public fun setValue(newValue: ExtendedExecutionReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ExtendedExecutionReason =
        ExtendedExecutionReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ExtendedExecutionReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ExtendedExecutionReason =
        ExtendedExecutionReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: ExtendedExecutionReason): Int = obj.value
  }
}
