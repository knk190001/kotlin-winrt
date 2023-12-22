package Windows.Networking.Connectivity

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

@ABIMarker(TriStates.ABI::class)
@Signature("enum(Windows.Networking.Connectivity.TriStates;i4)")
@WinRTByReference(brClass = TriStates.ByReference::class)
public enum class TriStates(
  public val value: Int
) : NativeMapped {
  DoNotCare(0),
  No(1),
  Yes(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): TriStates {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DoNotCare
      1 -> No
      2 -> Yes
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TriStates> {
    public fun setValue(newValue: TriStates): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TriStates =
        TriStates.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TriStates, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TriStates =
        TriStates.values()[0].fromNative(value, null)

    public override fun toNative(obj: TriStates): Int = obj.value
  }
}
