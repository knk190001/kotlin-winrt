package Windows.Foundation.Metadata

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

@ABIMarker(FeatureStage.ABI::class)
@Signature("enum(Windows.Foundation.Metadata.FeatureStage;i4)")
@WinRTByReference(brClass = FeatureStage.ByReference::class)
public enum class FeatureStage(
  public val value: Int
) : NativeMapped {
  AlwaysDisabled(0),
  DisabledByDefault(1),
  EnabledByDefault(2),
  AlwaysEnabled(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FeatureStage {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AlwaysDisabled
      1 -> DisabledByDefault
      2 -> EnabledByDefault
      3 -> AlwaysEnabled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FeatureStage> {
    public fun setValue(newValue: FeatureStage): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FeatureStage =
        FeatureStage.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FeatureStage, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FeatureStage =
        FeatureStage.values()[0].fromNative(value, null)

    public override fun toNative(obj: FeatureStage): Int = obj.value
  }
}
