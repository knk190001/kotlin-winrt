package Windows.UI.Input.Preview.Injection

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

@ABIMarker(InjectedInputKeyOptions.ABI::class)
@Signature("enum(Windows.UI.Input.Preview.Injection.InjectedInputKeyOptions;u4)")
@WinRTByReference(brClass = InjectedInputKeyOptions.ByReference::class)
public enum class InjectedInputKeyOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  ExtendedKey(1),
  KeyUp(2),
  ScanCode(8),
  Unicode(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InjectedInputKeyOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ExtendedKey
      2 -> KeyUp
      8 -> ScanCode
      4 -> Unicode
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InjectedInputKeyOptions> {
    public fun setValue(newValue: InjectedInputKeyOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InjectedInputKeyOptions =
        InjectedInputKeyOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InjectedInputKeyOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InjectedInputKeyOptions =
        InjectedInputKeyOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: InjectedInputKeyOptions): Int = obj.value
  }
}
