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

@ABIMarker(CausalityRelation.ABI::class)
@Signature("enum(Windows.Foundation.Diagnostics.CausalityRelation;i4)")
@WinRTByReference(brClass = CausalityRelation.ByReference::class)
public enum class CausalityRelation(
  public val value: Int
) : NativeMapped {
  AssignDelegate(0),
  Join(1),
  Choice(2),
  Cancel(3),
  Error(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CausalityRelation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AssignDelegate
      1 -> Join
      2 -> Choice
      3 -> Cancel
      4 -> Error
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CausalityRelation> {
    public fun setValue(newValue: CausalityRelation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CausalityRelation =
        CausalityRelation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CausalityRelation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CausalityRelation =
        CausalityRelation.values()[0].fromNative(value, null)

    public override fun toNative(obj: CausalityRelation): Int = obj.value
  }
}
