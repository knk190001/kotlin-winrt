package Windows.AI.MachineLearning.Preview

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

@ABIMarker(FeatureElementKindPreview.ABI::class)
@Signature("enum(Windows.AI.MachineLearning.Preview.FeatureElementKindPreview;i4)")
@WinRTByReference(brClass = FeatureElementKindPreview.ByReference::class)
public enum class FeatureElementKindPreview(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  Float(1),
  UInt8(2),
  Int8(3),
  UInt16(4),
  Int16(5),
  Int32(6),
  Int64(7),
  String(8),
  Boolean(9),
  Float16(10),
  Double(11),
  UInt32(12),
  UInt64(13),
  Complex64(14),
  Complex128(15),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FeatureElementKindPreview {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> Float
      2 -> UInt8
      3 -> Int8
      4 -> UInt16
      5 -> Int16
      6 -> Int32
      7 -> Int64
      8 -> String
      9 -> Boolean
      10 -> Float16
      11 -> Double
      12 -> UInt32
      13 -> UInt64
      14 -> Complex64
      15 -> Complex128
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FeatureElementKindPreview>
      {
    public fun setValue(newValue: FeatureElementKindPreview): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FeatureElementKindPreview =
        FeatureElementKindPreview.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FeatureElementKindPreview, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FeatureElementKindPreview =
        FeatureElementKindPreview.values()[0].fromNative(value, null)

    public override fun toNative(obj: FeatureElementKindPreview): Int = obj.value
  }
}
