package Windows.Services.TargetedContent

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

@ABIMarker(TargetedContentValueKind.ABI::class)
@Signature("enum(Windows.Services.TargetedContent.TargetedContentValueKind;i4)")
@WinRTByReference(brClass = TargetedContentValueKind.ByReference::class)
public enum class TargetedContentValueKind(
  public val value: Int
) : NativeMapped {
  String(0),
  Uri(1),
  Number(2),
  Boolean(3),
  File(4),
  ImageFile(5),
  Action(6),
  Strings(7),
  Uris(8),
  Numbers(9),
  Booleans(10),
  Files(11),
  ImageFiles(12),
  Actions(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TargetedContentValueKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> String
      1 -> Uri
      2 -> Number
      3 -> Boolean
      4 -> File
      5 -> ImageFile
      6 -> Action
      7 -> Strings
      8 -> Uris
      9 -> Numbers
      10 -> Booleans
      11 -> Files
      12 -> ImageFiles
      13 -> Actions
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TargetedContentValueKind>
      {
    public fun setValue(newValue: TargetedContentValueKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TargetedContentValueKind =
        TargetedContentValueKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TargetedContentValueKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TargetedContentValueKind =
        TargetedContentValueKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: TargetedContentValueKind): Int = obj.value
  }
}
