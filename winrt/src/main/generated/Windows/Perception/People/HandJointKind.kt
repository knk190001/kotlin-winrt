package Windows.Perception.People

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

@ABIMarker(HandJointKind.ABI::class)
@Signature("enum(Windows.Perception.People.HandJointKind;i4)")
@WinRTByReference(brClass = HandJointKind.ByReference::class)
public enum class HandJointKind(
  public val value: Int
) : NativeMapped {
  Palm(0),
  Wrist(1),
  ThumbMetacarpal(2),
  ThumbProximal(3),
  ThumbDistal(4),
  ThumbTip(5),
  IndexMetacarpal(6),
  IndexProximal(7),
  IndexIntermediate(8),
  IndexDistal(9),
  IndexTip(10),
  MiddleMetacarpal(11),
  MiddleProximal(12),
  MiddleIntermediate(13),
  MiddleDistal(14),
  MiddleTip(15),
  RingMetacarpal(16),
  RingProximal(17),
  RingIntermediate(18),
  RingDistal(19),
  RingTip(20),
  LittleMetacarpal(21),
  LittleProximal(22),
  LittleIntermediate(23),
  LittleDistal(24),
  LittleTip(25),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HandJointKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Palm
      1 -> Wrist
      2 -> ThumbMetacarpal
      3 -> ThumbProximal
      4 -> ThumbDistal
      5 -> ThumbTip
      6 -> IndexMetacarpal
      7 -> IndexProximal
      8 -> IndexIntermediate
      9 -> IndexDistal
      10 -> IndexTip
      11 -> MiddleMetacarpal
      12 -> MiddleProximal
      13 -> MiddleIntermediate
      14 -> MiddleDistal
      15 -> MiddleTip
      16 -> RingMetacarpal
      17 -> RingProximal
      18 -> RingIntermediate
      19 -> RingDistal
      20 -> RingTip
      21 -> LittleMetacarpal
      22 -> LittleProximal
      23 -> LittleIntermediate
      24 -> LittleDistal
      25 -> LittleTip
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HandJointKind> {
    public fun setValue(newValue: HandJointKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HandJointKind =
        HandJointKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HandJointKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HandJointKind =
        HandJointKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: HandJointKind): Int = obj.value
  }
}
