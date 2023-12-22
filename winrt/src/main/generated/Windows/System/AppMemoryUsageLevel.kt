package Windows.System

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

@ABIMarker(AppMemoryUsageLevel.ABI::class)
@Signature("enum(Windows.System.AppMemoryUsageLevel;i4)")
@WinRTByReference(brClass = AppMemoryUsageLevel.ByReference::class)
public enum class AppMemoryUsageLevel(
  public val value: Int
) : NativeMapped {
  Low(0),
  Medium(1),
  High(2),
  OverLimit(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppMemoryUsageLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Low
      1 -> Medium
      2 -> High
      3 -> OverLimit
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppMemoryUsageLevel> {
    public fun setValue(newValue: AppMemoryUsageLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppMemoryUsageLevel =
        AppMemoryUsageLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppMemoryUsageLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppMemoryUsageLevel =
        AppMemoryUsageLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppMemoryUsageLevel): Int = obj.value
  }
}
