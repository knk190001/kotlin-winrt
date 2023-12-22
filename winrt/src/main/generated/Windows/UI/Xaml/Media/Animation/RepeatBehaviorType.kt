package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(RepeatBehaviorType.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.Animation.RepeatBehaviorType;i4)")
@WinRTByReference(brClass = RepeatBehaviorType.ByReference::class)
public enum class RepeatBehaviorType(
  public val value: Int
) : NativeMapped {
  Count(0),
  Duration(1),
  Forever(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RepeatBehaviorType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Count
      1 -> Duration
      2 -> Forever
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RepeatBehaviorType> {
    public fun setValue(newValue: RepeatBehaviorType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RepeatBehaviorType =
        RepeatBehaviorType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RepeatBehaviorType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RepeatBehaviorType =
        RepeatBehaviorType.values()[0].fromNative(value, null)

    public override fun toNative(obj: RepeatBehaviorType): Int = obj.value
  }
}
