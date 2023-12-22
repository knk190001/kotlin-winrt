package Windows.ApplicationModel.ExtendedExecution.Foreground

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

@ABIMarker(ExtendedExecutionForegroundReason.ABI::class)
@Signature("enum(Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason;i4)")
@WinRTByReference(brClass = ExtendedExecutionForegroundReason.ByReference::class)
public enum class ExtendedExecutionForegroundReason(
  public val value: Int
) : NativeMapped {
  Unspecified(0),
  SavingData(1),
  BackgroundAudio(2),
  Unconstrained(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ExtendedExecutionForegroundReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> SavingData
      2 -> BackgroundAudio
      3 -> Unconstrained
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ExtendedExecutionForegroundReason> {
    public fun setValue(newValue: ExtendedExecutionForegroundReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ExtendedExecutionForegroundReason =
        ExtendedExecutionForegroundReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ExtendedExecutionForegroundReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ExtendedExecutionForegroundReason =
        ExtendedExecutionForegroundReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: ExtendedExecutionForegroundReason): Int = obj.value
  }
}
