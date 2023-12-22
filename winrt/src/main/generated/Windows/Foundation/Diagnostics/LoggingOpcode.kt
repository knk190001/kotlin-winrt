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

@ABIMarker(LoggingOpcode.ABI::class)
@Signature("enum(Windows.Foundation.Diagnostics.LoggingOpcode;i4)")
@WinRTByReference(brClass = LoggingOpcode.ByReference::class)
public enum class LoggingOpcode(
  public val value: Int
) : NativeMapped {
  Info(0),
  Start(1),
  Stop(2),
  Reply(6),
  Resume(7),
  Suspend(8),
  Send(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LoggingOpcode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Info
      1 -> Start
      2 -> Stop
      6 -> Reply
      7 -> Resume
      8 -> Suspend
      9 -> Send
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LoggingOpcode> {
    public fun setValue(newValue: LoggingOpcode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LoggingOpcode =
        LoggingOpcode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LoggingOpcode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LoggingOpcode =
        LoggingOpcode.values()[0].fromNative(value, null)

    public override fun toNative(obj: LoggingOpcode): Int = obj.value
  }
}
