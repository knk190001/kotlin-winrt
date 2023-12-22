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

@ABIMarker(ErrorOptions.ABI::class)
@Signature("enum(Windows.Foundation.Diagnostics.ErrorOptions;u4)")
@WinRTByReference(brClass = ErrorOptions.ByReference::class)
public enum class ErrorOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  SuppressExceptions(1),
  ForceExceptions(2),
  UseSetErrorInfo(4),
  SuppressSetErrorInfo(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ErrorOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> SuppressExceptions
      2 -> ForceExceptions
      4 -> UseSetErrorInfo
      8 -> SuppressSetErrorInfo
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ErrorOptions> {
    public fun setValue(newValue: ErrorOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ErrorOptions =
        ErrorOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ErrorOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ErrorOptions =
        ErrorOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: ErrorOptions): Int = obj.value
  }
}
