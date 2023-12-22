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

@ABIMarker(LoggingFieldFormat.ABI::class)
@Signature("enum(Windows.Foundation.Diagnostics.LoggingFieldFormat;i4)")
@WinRTByReference(brClass = LoggingFieldFormat.ByReference::class)
public enum class LoggingFieldFormat(
  public val value: Int
) : NativeMapped {
  Default(0),
  Hidden(1),
  String(2),
  Boolean(3),
  Hexadecimal(4),
  ProcessId(5),
  ThreadId(6),
  Port(7),
  Ipv4Address(8),
  Ipv6Address(9),
  SocketAddress(10),
  Xml(11),
  Json(12),
  Win32Error(13),
  NTStatus(14),
  HResult(15),
  FileTime(16),
  Signed(17),
  Unsigned(18),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LoggingFieldFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Hidden
      2 -> String
      3 -> Boolean
      4 -> Hexadecimal
      5 -> ProcessId
      6 -> ThreadId
      7 -> Port
      8 -> Ipv4Address
      9 -> Ipv6Address
      10 -> SocketAddress
      11 -> Xml
      12 -> Json
      13 -> Win32Error
      14 -> NTStatus
      15 -> HResult
      16 -> FileTime
      17 -> Signed
      18 -> Unsigned
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LoggingFieldFormat> {
    public fun setValue(newValue: LoggingFieldFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LoggingFieldFormat =
        LoggingFieldFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LoggingFieldFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LoggingFieldFormat =
        LoggingFieldFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: LoggingFieldFormat): Int = obj.value
  }
}
