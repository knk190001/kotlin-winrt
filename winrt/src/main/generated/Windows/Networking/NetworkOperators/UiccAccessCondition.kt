package Windows.Networking.NetworkOperators

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

@ABIMarker(UiccAccessCondition.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.UiccAccessCondition;i4)")
@WinRTByReference(brClass = UiccAccessCondition.ByReference::class)
public enum class UiccAccessCondition(
  public val value: Int
) : NativeMapped {
  AlwaysAllowed(0),
  Pin1(1),
  Pin2(2),
  Pin3(3),
  Pin4(4),
  Administrative5(5),
  Administrative6(6),
  NeverAllowed(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UiccAccessCondition {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AlwaysAllowed
      1 -> Pin1
      2 -> Pin2
      3 -> Pin3
      4 -> Pin4
      5 -> Administrative5
      6 -> Administrative6
      7 -> NeverAllowed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UiccAccessCondition> {
    public fun setValue(newValue: UiccAccessCondition): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UiccAccessCondition =
        UiccAccessCondition.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UiccAccessCondition, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UiccAccessCondition =
        UiccAccessCondition.values()[0].fromNative(value, null)

    public override fun toNative(obj: UiccAccessCondition): Int = obj.value
  }
}
