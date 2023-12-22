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

@ABIMarker(InjectedInputPointerOptions.ABI::class)
@Signature("enum(Windows.UI.Input.Preview.Injection.InjectedInputPointerOptions;u4)")
@WinRTByReference(brClass = InjectedInputPointerOptions.ByReference::class)
public enum class InjectedInputPointerOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  New(1),
  InRange(2),
  InContact(4),
  FirstButton(16),
  SecondButton(32),
  Primary(8192),
  Confidence(16384),
  Canceled(32768),
  PointerDown(65536),
  Update(131072),
  PointerUp(262144),
  CaptureChanged(2097152),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InjectedInputPointerOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> New
      2 -> InRange
      4 -> InContact
      16 -> FirstButton
      32 -> SecondButton
      8192 -> Primary
      16384 -> Confidence
      32768 -> Canceled
      65536 -> PointerDown
      131072 -> Update
      262144 -> PointerUp
      2097152 -> CaptureChanged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<InjectedInputPointerOptions> {
    public fun setValue(newValue: InjectedInputPointerOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InjectedInputPointerOptions =
        InjectedInputPointerOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InjectedInputPointerOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InjectedInputPointerOptions =
        InjectedInputPointerOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: InjectedInputPointerOptions): Int = obj.value
  }
}
