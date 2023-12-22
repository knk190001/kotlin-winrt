package Windows.UI.Input.Inking.Analysis

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

@ABIMarker(InkAnalysisNodeKind.ABI::class)
@Signature("enum(Windows.UI.Input.Inking.Analysis.InkAnalysisNodeKind;i4)")
@WinRTByReference(brClass = InkAnalysisNodeKind.ByReference::class)
public enum class InkAnalysisNodeKind(
  public val value: Int
) : NativeMapped {
  UnclassifiedInk(0),
  Root(1),
  WritingRegion(2),
  Paragraph(3),
  Line(4),
  InkWord(5),
  InkBullet(6),
  InkDrawing(7),
  ListItem(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InkAnalysisNodeKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UnclassifiedInk
      1 -> Root
      2 -> WritingRegion
      3 -> Paragraph
      4 -> Line
      5 -> InkWord
      6 -> InkBullet
      7 -> InkDrawing
      8 -> ListItem
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InkAnalysisNodeKind> {
    public fun setValue(newValue: InkAnalysisNodeKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InkAnalysisNodeKind =
        InkAnalysisNodeKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InkAnalysisNodeKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InkAnalysisNodeKind =
        InkAnalysisNodeKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: InkAnalysisNodeKind): Int = obj.value
  }
}
