package Windows.Foundation.Diagnostics

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

@ABIMarker(LoggingLevel.ABI::class)
@Signature("enum(Windows.Foundation.Diagnostics.LoggingLevel;i4)")
@WinRTByReference(brClass = LoggingLevel.ByReference::class)
public enum class LoggingLevel(
  public val value: Int
) : NativeMapped {
  Verbose(0),
  Information(1),
  Warning(2),
  Error(3),
  Critical(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LoggingLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Verbose
      1 -> Information
      2 -> Warning
      3 -> Error
      4 -> Critical
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LoggingLevel> {
    public fun setValue(newValue: LoggingLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LoggingLevel =
        LoggingLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LoggingLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LoggingLevel =
        LoggingLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: LoggingLevel): Int = obj.value
  }
}
