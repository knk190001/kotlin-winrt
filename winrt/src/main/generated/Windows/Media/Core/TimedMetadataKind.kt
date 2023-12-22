package Windows.Media.Core

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

@ABIMarker(TimedMetadataKind.ABI::class)
@Signature("enum(Windows.Media.Core.TimedMetadataKind;i4)")
@WinRTByReference(brClass = TimedMetadataKind.ByReference::class)
public enum class TimedMetadataKind(
  public val value: Int
) : NativeMapped {
  Caption(0),
  Chapter(1),
  Custom(2),
  Data(3),
  Description(4),
  Subtitle(5),
  ImageSubtitle(6),
  Speech(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TimedMetadataKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Caption
      1 -> Chapter
      2 -> Custom
      3 -> Data
      4 -> Description
      5 -> Subtitle
      6 -> ImageSubtitle
      7 -> Speech
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TimedMetadataKind> {
    public fun setValue(newValue: TimedMetadataKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TimedMetadataKind =
        TimedMetadataKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TimedMetadataKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TimedMetadataKind =
        TimedMetadataKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: TimedMetadataKind): Int = obj.value
  }
}
