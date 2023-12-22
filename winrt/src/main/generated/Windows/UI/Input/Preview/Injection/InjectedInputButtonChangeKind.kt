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

@ABIMarker(InjectedInputButtonChangeKind.ABI::class)
@Signature("enum(Windows.UI.Input.Preview.Injection.InjectedInputButtonChangeKind;i4)")
@WinRTByReference(brClass = InjectedInputButtonChangeKind.ByReference::class)
public enum class InjectedInputButtonChangeKind(
  public val value: Int
) : NativeMapped {
  None(0),
  FirstButtonDown(1),
  FirstButtonUp(2),
  SecondButtonDown(3),
  SecondButtonUp(4),
  ThirdButtonDown(5),
  ThirdButtonUp(6),
  FourthButtonDown(7),
  FourthButtonUp(8),
  FifthButtonDown(9),
  FifthButtonUp(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InjectedInputButtonChangeKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> FirstButtonDown
      2 -> FirstButtonUp
      3 -> SecondButtonDown
      4 -> SecondButtonUp
      5 -> ThirdButtonDown
      6 -> ThirdButtonUp
      7 -> FourthButtonDown
      8 -> FourthButtonUp
      9 -> FifthButtonDown
      10 -> FifthButtonUp
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<InjectedInputButtonChangeKind> {
    public fun setValue(newValue: InjectedInputButtonChangeKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InjectedInputButtonChangeKind =
        InjectedInputButtonChangeKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InjectedInputButtonChangeKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InjectedInputButtonChangeKind =
        InjectedInputButtonChangeKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: InjectedInputButtonChangeKind): Int = obj.value
  }
}
