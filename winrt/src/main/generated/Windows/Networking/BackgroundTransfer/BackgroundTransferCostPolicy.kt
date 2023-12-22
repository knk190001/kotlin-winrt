package Windows.Networking.BackgroundTransfer

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

@ABIMarker(BackgroundTransferCostPolicy.ABI::class)
@Signature("enum(Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy;i4)")
@WinRTByReference(brClass = BackgroundTransferCostPolicy.ByReference::class)
public enum class BackgroundTransferCostPolicy(
  public val value: Int
) : NativeMapped {
  Default(0),
  UnrestrictedOnly(1),
  Always(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BackgroundTransferCostPolicy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> UnrestrictedOnly
      2 -> Always
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<BackgroundTransferCostPolicy> {
    public fun setValue(newValue: BackgroundTransferCostPolicy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BackgroundTransferCostPolicy =
        BackgroundTransferCostPolicy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BackgroundTransferCostPolicy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BackgroundTransferCostPolicy =
        BackgroundTransferCostPolicy.values()[0].fromNative(value, null)

    public override fun toNative(obj: BackgroundTransferCostPolicy): Int = obj.value
  }
}
