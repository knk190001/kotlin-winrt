package Windows.Foundation

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

@ABIMarker(PropertyType.ABI::class)
@Signature("enum(Windows.Foundation.PropertyType;i4)")
@WinRTByReference(brClass = PropertyType.ByReference::class)
public enum class PropertyType(
  public val value: Int
) : NativeMapped {
  Empty(0),
  UInt8(1),
  Int16(2),
  UInt16(3),
  Int32(4),
  UInt32(5),
  Int64(6),
  UInt64(7),
  Single(8),
  Double(9),
  Char16(10),
  Boolean(11),
  String(12),
  Inspectable(13),
  DateTime(14),
  TimeSpan(15),
  Guid(16),
  Point(17),
  Size(18),
  Rect(19),
  OtherType(20),
  UInt8Array(1025),
  Int16Array(1026),
  UInt16Array(1027),
  Int32Array(1028),
  UInt32Array(1029),
  Int64Array(1030),
  UInt64Array(1031),
  SingleArray(1032),
  DoubleArray(1033),
  Char16Array(1034),
  BooleanArray(1035),
  StringArray(1036),
  InspectableArray(1037),
  DateTimeArray(1038),
  TimeSpanArray(1039),
  GuidArray(1040),
  PointArray(1041),
  SizeArray(1042),
  RectArray(1043),
  OtherTypeArray(1044),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PropertyType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Empty
      1 -> UInt8
      2 -> Int16
      3 -> UInt16
      4 -> Int32
      5 -> UInt32
      6 -> Int64
      7 -> UInt64
      8 -> Single
      9 -> Double
      10 -> Char16
      11 -> Boolean
      12 -> String
      13 -> Inspectable
      14 -> DateTime
      15 -> TimeSpan
      16 -> Guid
      17 -> Point
      18 -> Size
      19 -> Rect
      20 -> OtherType
      1025 -> UInt8Array
      1026 -> Int16Array
      1027 -> UInt16Array
      1028 -> Int32Array
      1029 -> UInt32Array
      1030 -> Int64Array
      1031 -> UInt64Array
      1032 -> SingleArray
      1033 -> DoubleArray
      1034 -> Char16Array
      1035 -> BooleanArray
      1036 -> StringArray
      1037 -> InspectableArray
      1038 -> DateTimeArray
      1039 -> TimeSpanArray
      1040 -> GuidArray
      1041 -> PointArray
      1042 -> SizeArray
      1043 -> RectArray
      1044 -> OtherTypeArray
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PropertyType> {
    public fun setValue(newValue: PropertyType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PropertyType =
        PropertyType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PropertyType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PropertyType =
        PropertyType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PropertyType): Int = obj.value
  }
}
