package Windows.UI.Xaml.Automation

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

@ABIMarker(AnnotationType.ABI::class)
@Signature("enum(Windows.UI.Xaml.Automation.AnnotationType;i4)")
@WinRTByReference(brClass = AnnotationType.ByReference::class)
public enum class AnnotationType(
  public val value: Int
) : NativeMapped {
  Unknown(60000),
  SpellingError(60001),
  GrammarError(60002),
  Comment(60003),
  FormulaError(60004),
  TrackChanges(60005),
  Header(60006),
  Footer(60007),
  Highlighted(60008),
  Endnote(60009),
  Footnote(60010),
  InsertionChange(60011),
  DeletionChange(60012),
  MoveChange(60013),
  FormatChange(60014),
  UnsyncedChange(60015),
  EditingLockedChange(60016),
  ExternalChange(60017),
  ConflictingChange(60018),
  Author(60019),
  AdvancedProofingIssue(60020),
  DataValidationError(60021),
  CircularReferenceError(60022),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AnnotationType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      60000 -> Unknown
      60001 -> SpellingError
      60002 -> GrammarError
      60003 -> Comment
      60004 -> FormulaError
      60005 -> TrackChanges
      60006 -> Header
      60007 -> Footer
      60008 -> Highlighted
      60009 -> Endnote
      60010 -> Footnote
      60011 -> InsertionChange
      60012 -> DeletionChange
      60013 -> MoveChange
      60014 -> FormatChange
      60015 -> UnsyncedChange
      60016 -> EditingLockedChange
      60017 -> ExternalChange
      60018 -> ConflictingChange
      60019 -> Author
      60020 -> AdvancedProofingIssue
      60021 -> DataValidationError
      60022 -> CircularReferenceError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AnnotationType> {
    public fun setValue(newValue: AnnotationType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AnnotationType =
        AnnotationType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AnnotationType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AnnotationType =
        AnnotationType.values()[0].fromNative(value, null)

    public override fun toNative(obj: AnnotationType): Int = obj.value
  }
}
