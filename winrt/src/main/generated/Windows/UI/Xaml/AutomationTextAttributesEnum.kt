package Windows.UI.Xaml

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

@ABIMarker(AutomationTextAttributesEnum.ABI::class)
@Signature("enum(Windows.UI.Xaml.AutomationTextAttributesEnum;i4)")
@WinRTByReference(brClass = AutomationTextAttributesEnum.ByReference::class)
public enum class AutomationTextAttributesEnum(
  public val value: Int
) : NativeMapped {
  AnimationStyleAttribute(40000),
  BackgroundColorAttribute(40001),
  BulletStyleAttribute(40002),
  CapStyleAttribute(40003),
  CultureAttribute(40004),
  FontNameAttribute(40005),
  FontSizeAttribute(40006),
  FontWeightAttribute(40007),
  ForegroundColorAttribute(40008),
  HorizontalTextAlignmentAttribute(40009),
  IndentationFirstLineAttribute(40010),
  IndentationLeadingAttribute(40011),
  IndentationTrailingAttribute(40012),
  IsHiddenAttribute(40013),
  IsItalicAttribute(40014),
  IsReadOnlyAttribute(40015),
  IsSubscriptAttribute(40016),
  IsSuperscriptAttribute(40017),
  MarginBottomAttribute(40018),
  MarginLeadingAttribute(40019),
  MarginTopAttribute(40020),
  MarginTrailingAttribute(40021),
  OutlineStylesAttribute(40022),
  OverlineColorAttribute(40023),
  OverlineStyleAttribute(40024),
  StrikethroughColorAttribute(40025),
  StrikethroughStyleAttribute(40026),
  TabsAttribute(40027),
  TextFlowDirectionsAttribute(40028),
  UnderlineColorAttribute(40029),
  UnderlineStyleAttribute(40030),
  AnnotationTypesAttribute(40031),
  AnnotationObjectsAttribute(40032),
  StyleNameAttribute(40033),
  StyleIdAttribute(40034),
  LinkAttribute(40035),
  IsActiveAttribute(40036),
  SelectionActiveEndAttribute(40037),
  CaretPositionAttribute(40038),
  CaretBidiModeAttribute(40039),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationTextAttributesEnum {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      40000 -> AnimationStyleAttribute
      40001 -> BackgroundColorAttribute
      40002 -> BulletStyleAttribute
      40003 -> CapStyleAttribute
      40004 -> CultureAttribute
      40005 -> FontNameAttribute
      40006 -> FontSizeAttribute
      40007 -> FontWeightAttribute
      40008 -> ForegroundColorAttribute
      40009 -> HorizontalTextAlignmentAttribute
      40010 -> IndentationFirstLineAttribute
      40011 -> IndentationLeadingAttribute
      40012 -> IndentationTrailingAttribute
      40013 -> IsHiddenAttribute
      40014 -> IsItalicAttribute
      40015 -> IsReadOnlyAttribute
      40016 -> IsSubscriptAttribute
      40017 -> IsSuperscriptAttribute
      40018 -> MarginBottomAttribute
      40019 -> MarginLeadingAttribute
      40020 -> MarginTopAttribute
      40021 -> MarginTrailingAttribute
      40022 -> OutlineStylesAttribute
      40023 -> OverlineColorAttribute
      40024 -> OverlineStyleAttribute
      40025 -> StrikethroughColorAttribute
      40026 -> StrikethroughStyleAttribute
      40027 -> TabsAttribute
      40028 -> TextFlowDirectionsAttribute
      40029 -> UnderlineColorAttribute
      40030 -> UnderlineStyleAttribute
      40031 -> AnnotationTypesAttribute
      40032 -> AnnotationObjectsAttribute
      40033 -> StyleNameAttribute
      40034 -> StyleIdAttribute
      40035 -> LinkAttribute
      40036 -> IsActiveAttribute
      40037 -> SelectionActiveEndAttribute
      40038 -> CaretPositionAttribute
      40039 -> CaretBidiModeAttribute
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AutomationTextAttributesEnum> {
    public fun setValue(newValue: AutomationTextAttributesEnum): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationTextAttributesEnum =
        AutomationTextAttributesEnum.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationTextAttributesEnum, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationTextAttributesEnum =
        AutomationTextAttributesEnum.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationTextAttributesEnum): Int = obj.value
  }
}
