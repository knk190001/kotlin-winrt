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

@ABIMarker(UiccAppKind.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.UiccAppKind;i4)")
@WinRTByReference(brClass = UiccAppKind.ByReference::class)
public enum class UiccAppKind(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  MF(1),
  MFSim(2),
  MFRuim(3),
  USim(4),
  CSim(5),
  ISim(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UiccAppKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> MF
      2 -> MFSim
      3 -> MFRuim
      4 -> USim
      5 -> CSim
      6 -> ISim
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UiccAppKind> {
    public fun setValue(newValue: UiccAppKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UiccAppKind =
        UiccAppKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UiccAppKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UiccAppKind =
        UiccAppKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: UiccAppKind): Int = obj.value
  }
}
