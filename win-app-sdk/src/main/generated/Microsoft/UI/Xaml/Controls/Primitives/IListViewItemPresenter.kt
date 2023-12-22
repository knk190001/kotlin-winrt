package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.CornerRadius
import Microsoft.UI.Xaml.HorizontalAlignment
import Microsoft.UI.Xaml.Media.Brush
import Microsoft.UI.Xaml.Thickness
import Microsoft.UI.Xaml.VerticalAlignment
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IListViewItemPresenter.ABI::class)
@Signature("{81012623-d987-5582-bc28-755a95caaf1c}")
@Guid("81012623d9875582bc28755a95caaf1c")
@WinRTInterface("81012623d9875582bc28755a95caaf1c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemPresenter.ByReference::class)
public interface IListViewItemPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionCheckMarkVisualEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_SelectionCheckMarkVisualEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_CheckHintBrush(): Brush?

  @InterfaceMethod(3)
  public fun put_CheckHintBrush(value: Brush?): Unit

  @InterfaceMethod(4)
  public fun get_CheckSelectingBrush(): Brush?

  @InterfaceMethod(5)
  public fun put_CheckSelectingBrush(value: Brush?): Unit

  @InterfaceMethod(6)
  public fun get_CheckBrush(): Brush?

  @InterfaceMethod(7)
  public fun put_CheckBrush(value: Brush?): Unit

  @InterfaceMethod(8)
  public fun get_DragBackground(): Brush?

  @InterfaceMethod(9)
  public fun put_DragBackground(value: Brush?): Unit

  @InterfaceMethod(10)
  public fun get_DragForeground(): Brush?

  @InterfaceMethod(11)
  public fun put_DragForeground(value: Brush?): Unit

  @InterfaceMethod(12)
  public fun get_FocusBorderBrush(): Brush?

  @InterfaceMethod(13)
  public fun put_FocusBorderBrush(value: Brush?): Unit

  @InterfaceMethod(14)
  public fun get_PlaceholderBackground(): Brush?

  @InterfaceMethod(15)
  public fun put_PlaceholderBackground(value: Brush?): Unit

  @InterfaceMethod(16)
  public fun get_PointerOverBackground(): Brush?

  @InterfaceMethod(17)
  public fun put_PointerOverBackground(value: Brush?): Unit

  @InterfaceMethod(18)
  public fun get_SelectedBackground(): Brush?

  @InterfaceMethod(19)
  public fun put_SelectedBackground(value: Brush?): Unit

  @InterfaceMethod(20)
  public fun get_SelectedForeground(): Brush?

  @InterfaceMethod(21)
  public fun put_SelectedForeground(value: Brush?): Unit

  @InterfaceMethod(22)
  public fun get_SelectedPointerOverBackground(): Brush?

  @InterfaceMethod(23)
  public fun put_SelectedPointerOverBackground(value: Brush?): Unit

  @InterfaceMethod(24)
  public fun get_SelectedPointerOverBorderBrush(): Brush?

  @InterfaceMethod(25)
  public fun put_SelectedPointerOverBorderBrush(value: Brush?): Unit

  @InterfaceMethod(26)
  public fun get_SelectedBorderThickness(): Thickness?

  @InterfaceMethod(27)
  public fun put_SelectedBorderThickness(value: Thickness?): Unit

  @InterfaceMethod(28)
  public fun get_DisabledOpacity(): Double

  @InterfaceMethod(29)
  public fun put_DisabledOpacity(value: Double): Unit

  @InterfaceMethod(30)
  public fun get_DragOpacity(): Double

  @InterfaceMethod(31)
  public fun put_DragOpacity(value: Double): Unit

  @InterfaceMethod(32)
  public fun get_ReorderHintOffset(): Double

  @InterfaceMethod(33)
  public fun put_ReorderHintOffset(value: Double): Unit

  @InterfaceMethod(34)
  public fun get_ListViewItemPresenterHorizontalContentAlignment(): HorizontalAlignment?

  @InterfaceMethod(35)
  public fun put_ListViewItemPresenterHorizontalContentAlignment(value: HorizontalAlignment?): Unit

  @InterfaceMethod(36)
  public fun get_ListViewItemPresenterVerticalContentAlignment(): VerticalAlignment?

  @InterfaceMethod(37)
  public fun put_ListViewItemPresenterVerticalContentAlignment(value: VerticalAlignment?): Unit

  @InterfaceMethod(38)
  public fun get_ListViewItemPresenterPadding(): Thickness?

  @InterfaceMethod(39)
  public fun put_ListViewItemPresenterPadding(value: Thickness?): Unit

  @InterfaceMethod(40)
  public fun get_PointerOverBackgroundMargin(): Thickness?

  @InterfaceMethod(41)
  public fun put_PointerOverBackgroundMargin(value: Thickness?): Unit

  @InterfaceMethod(42)
  public fun get_ContentMargin(): Thickness?

  @InterfaceMethod(43)
  public fun put_ContentMargin(value: Thickness?): Unit

  @InterfaceMethod(44)
  public fun get_SelectedPressedBackground(): Brush?

  @InterfaceMethod(45)
  public fun put_SelectedPressedBackground(value: Brush?): Unit

  @InterfaceMethod(46)
  public fun get_PressedBackground(): Brush?

  @InterfaceMethod(47)
  public fun put_PressedBackground(value: Brush?): Unit

  @InterfaceMethod(48)
  public fun get_CheckBoxBrush(): Brush?

  @InterfaceMethod(49)
  public fun put_CheckBoxBrush(value: Brush?): Unit

  @InterfaceMethod(50)
  public fun get_FocusSecondaryBorderBrush(): Brush?

  @InterfaceMethod(51)
  public fun put_FocusSecondaryBorderBrush(value: Brush?): Unit

  @InterfaceMethod(52)
  public fun get_CheckMode(): ListViewItemPresenterCheckMode?

  @InterfaceMethod(53)
  public fun put_CheckMode(value: ListViewItemPresenterCheckMode?): Unit

  @InterfaceMethod(54)
  public fun get_PointerOverForeground(): Brush?

  @InterfaceMethod(55)
  public fun put_PointerOverForeground(value: Brush?): Unit

  @InterfaceMethod(56)
  public fun get_RevealBackground(): Brush?

  @InterfaceMethod(57)
  public fun put_RevealBackground(value: Brush?): Unit

  @InterfaceMethod(58)
  public fun get_RevealBorderBrush(): Brush?

  @InterfaceMethod(59)
  public fun put_RevealBorderBrush(value: Brush?): Unit

  @InterfaceMethod(60)
  public fun get_RevealBorderThickness(): Thickness?

  @InterfaceMethod(61)
  public fun put_RevealBorderThickness(value: Thickness?): Unit

  @InterfaceMethod(62)
  public fun get_RevealBackgroundShowsAboveContent(): Boolean

  @InterfaceMethod(63)
  public fun put_RevealBackgroundShowsAboveContent(value: Boolean): Unit

  @InterfaceMethod(64)
  public fun get_SelectedDisabledBackground(): Brush?

  @InterfaceMethod(65)
  public fun put_SelectedDisabledBackground(value: Brush?): Unit

  @InterfaceMethod(66)
  public fun get_CheckPressedBrush(): Brush?

  @InterfaceMethod(67)
  public fun put_CheckPressedBrush(value: Brush?): Unit

  @InterfaceMethod(68)
  public fun get_CheckDisabledBrush(): Brush?

  @InterfaceMethod(69)
  public fun put_CheckDisabledBrush(value: Brush?): Unit

  @InterfaceMethod(70)
  public fun get_CheckBoxPointerOverBrush(): Brush?

  @InterfaceMethod(71)
  public fun put_CheckBoxPointerOverBrush(value: Brush?): Unit

  @InterfaceMethod(72)
  public fun get_CheckBoxPressedBrush(): Brush?

  @InterfaceMethod(73)
  public fun put_CheckBoxPressedBrush(value: Brush?): Unit

  @InterfaceMethod(74)
  public fun get_CheckBoxDisabledBrush(): Brush?

  @InterfaceMethod(75)
  public fun put_CheckBoxDisabledBrush(value: Brush?): Unit

  @InterfaceMethod(76)
  public fun get_CheckBoxSelectedBrush(): Brush?

  @InterfaceMethod(77)
  public fun put_CheckBoxSelectedBrush(value: Brush?): Unit

  @InterfaceMethod(78)
  public fun get_CheckBoxSelectedPointerOverBrush(): Brush?

  @InterfaceMethod(79)
  public fun put_CheckBoxSelectedPointerOverBrush(value: Brush?): Unit

  @InterfaceMethod(80)
  public fun get_CheckBoxSelectedPressedBrush(): Brush?

  @InterfaceMethod(81)
  public fun put_CheckBoxSelectedPressedBrush(value: Brush?): Unit

  @InterfaceMethod(82)
  public fun get_CheckBoxSelectedDisabledBrush(): Brush?

  @InterfaceMethod(83)
  public fun put_CheckBoxSelectedDisabledBrush(value: Brush?): Unit

  @InterfaceMethod(84)
  public fun get_CheckBoxBorderBrush(): Brush?

  @InterfaceMethod(85)
  public fun put_CheckBoxBorderBrush(value: Brush?): Unit

  @InterfaceMethod(86)
  public fun get_CheckBoxPointerOverBorderBrush(): Brush?

  @InterfaceMethod(87)
  public fun put_CheckBoxPointerOverBorderBrush(value: Brush?): Unit

  @InterfaceMethod(88)
  public fun get_CheckBoxPressedBorderBrush(): Brush?

  @InterfaceMethod(89)
  public fun put_CheckBoxPressedBorderBrush(value: Brush?): Unit

  @InterfaceMethod(90)
  public fun get_CheckBoxDisabledBorderBrush(): Brush?

  @InterfaceMethod(91)
  public fun put_CheckBoxDisabledBorderBrush(value: Brush?): Unit

  @InterfaceMethod(92)
  public fun get_CheckBoxCornerRadius(): CornerRadius?

  @InterfaceMethod(93)
  public fun put_CheckBoxCornerRadius(value: CornerRadius?): Unit

  @InterfaceMethod(94)
  public fun get_SelectionIndicatorCornerRadius(): CornerRadius?

  @InterfaceMethod(95)
  public fun put_SelectionIndicatorCornerRadius(value: CornerRadius?): Unit

  @InterfaceMethod(96)
  public fun get_SelectionIndicatorVisualEnabled(): Boolean

  @InterfaceMethod(97)
  public fun put_SelectionIndicatorVisualEnabled(value: Boolean): Unit

  @InterfaceMethod(98)
  public fun get_SelectionIndicatorMode(): ListViewItemPresenterSelectionIndicatorMode?

  @InterfaceMethod(99)
  public fun put_SelectionIndicatorMode(value: ListViewItemPresenterSelectionIndicatorMode?): Unit

  @InterfaceMethod(100)
  public fun get_SelectionIndicatorBrush(): Brush?

  @InterfaceMethod(101)
  public fun put_SelectionIndicatorBrush(value: Brush?): Unit

  @InterfaceMethod(102)
  public fun get_SelectionIndicatorPointerOverBrush(): Brush?

  @InterfaceMethod(103)
  public fun put_SelectionIndicatorPointerOverBrush(value: Brush?): Unit

  @InterfaceMethod(104)
  public fun get_SelectionIndicatorPressedBrush(): Brush?

  @InterfaceMethod(105)
  public fun put_SelectionIndicatorPressedBrush(value: Brush?): Unit

  @InterfaceMethod(106)
  public fun get_SelectionIndicatorDisabledBrush(): Brush?

  @InterfaceMethod(107)
  public fun put_SelectionIndicatorDisabledBrush(value: Brush?): Unit

  @InterfaceMethod(108)
  public fun get_SelectedBorderBrush(): Brush?

  @InterfaceMethod(109)
  public fun put_SelectedBorderBrush(value: Brush?): Unit

  @InterfaceMethod(110)
  public fun get_SelectedPressedBorderBrush(): Brush?

  @InterfaceMethod(111)
  public fun put_SelectedPressedBorderBrush(value: Brush?): Unit

  @InterfaceMethod(112)
  public fun get_SelectedDisabledBorderBrush(): Brush?

  @InterfaceMethod(113)
  public fun put_SelectedDisabledBorderBrush(value: Brush?): Unit

  @InterfaceMethod(114)
  public fun get_SelectedInnerBorderBrush(): Brush?

  @InterfaceMethod(115)
  public fun put_SelectedInnerBorderBrush(value: Brush?): Unit

  @InterfaceMethod(116)
  public fun get_PointerOverBorderBrush(): Brush?

  @InterfaceMethod(117)
  public fun put_PointerOverBorderBrush(value: Brush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemPresenter> {
    public override fun getValue() = ABI.makeIListViewItemPresenter(pointer.getPointer(0))

    public fun setValue(value: IListViewItemPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemPresenter {
    public val __1642212991_Ptr: Pointer?

    public val _1642212991_VtblPtr: Pointer?
      get() = __1642212991_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionCheckMarkVisualEnabled(): Boolean {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SelectionCheckMarkVisualEnabled(value: Boolean): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CheckHintBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CheckHintBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CheckSelectingBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_CheckSelectingBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CheckBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_CheckBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_DragBackground(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_DragBackground(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_DragForeground(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_DragForeground(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_FocusBorderBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_FocusBorderBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_PlaceholderBackground(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_PlaceholderBackground(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_PointerOverBackground(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_PointerOverBackground(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_SelectedBackground(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_SelectedBackground(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_SelectedForeground(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_SelectedForeground(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_SelectedPointerOverBackground(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_SelectedPointerOverBackground(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_SelectedPointerOverBorderBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_SelectedPointerOverBorderBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_SelectedBorderThickness(): Thickness? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_SelectedBorderThickness(value: Thickness?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_DisabledOpacity(): Double {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun put_DisabledOpacity(value: Double): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_DragOpacity(): Double {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun put_DragOpacity(value: Double): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_ReorderHintOffset(): Double {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun put_ReorderHintOffset(value: Double): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_ListViewItemPresenterHorizontalContentAlignment():
        HorizontalAlignment? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HorizontalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HorizontalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override
        fun put_ListViewItemPresenterHorizontalContentAlignment(value: HorizontalAlignment?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_ListViewItemPresenterVerticalContentAlignment(): VerticalAlignment? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VerticalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VerticalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override
        fun put_ListViewItemPresenterVerticalContentAlignment(value: VerticalAlignment?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_ListViewItemPresenterPadding(): Thickness? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_ListViewItemPresenterPadding(value: Thickness?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_PointerOverBackgroundMargin(): Thickness? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun put_PointerOverBackgroundMargin(value: Thickness?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_ContentMargin(): Thickness? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun put_ContentMargin(value: Thickness?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_SelectedPressedBackground(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun put_SelectedPressedBackground(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_PressedBackground(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun put_PressedBackground(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_CheckBoxBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun put_CheckBoxBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun get_FocusSecondaryBorderBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun put_FocusSecondaryBorderBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun get_CheckMode(): ListViewItemPresenterCheckMode? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewItemPresenterCheckMode>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewItemPresenterCheckMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun put_CheckMode(value: ListViewItemPresenterCheckMode?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun get_PointerOverForeground(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun put_PointerOverForeground(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(56)
    public override fun get_RevealBackground(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(57)
    public override fun put_RevealBackground(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(58)
    public override fun get_RevealBorderBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(59)
    public override fun put_RevealBorderBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(60)
    public override fun get_RevealBorderThickness(): Thickness? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(61)
    public override fun put_RevealBorderThickness(value: Thickness?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(62)
    public override fun get_RevealBackgroundShowsAboveContent(): Boolean {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(63)
    public override fun put_RevealBackgroundShowsAboveContent(value: Boolean): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(64)
    public override fun get_SelectedDisabledBackground(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(65)
    public override fun put_SelectedDisabledBackground(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(66)
    public override fun get_CheckPressedBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(67)
    public override fun put_CheckPressedBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(68)
    public override fun get_CheckDisabledBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(69)
    public override fun put_CheckDisabledBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(70)
    public override fun get_CheckBoxPointerOverBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(71)
    public override fun put_CheckBoxPointerOverBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(72)
    public override fun get_CheckBoxPressedBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(73)
    public override fun put_CheckBoxPressedBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(74)
    public override fun get_CheckBoxDisabledBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(80L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(75)
    public override fun put_CheckBoxDisabledBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(81L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(76)
    public override fun get_CheckBoxSelectedBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(82L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(77)
    public override fun put_CheckBoxSelectedBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(83L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(78)
    public override fun get_CheckBoxSelectedPointerOverBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(84L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(79)
    public override fun put_CheckBoxSelectedPointerOverBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(85L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(80)
    public override fun get_CheckBoxSelectedPressedBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(86L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(81)
    public override fun put_CheckBoxSelectedPressedBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(87L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(82)
    public override fun get_CheckBoxSelectedDisabledBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(88L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(83)
    public override fun put_CheckBoxSelectedDisabledBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(89L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(84)
    public override fun get_CheckBoxBorderBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(90L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(85)
    public override fun put_CheckBoxBorderBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(91L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(86)
    public override fun get_CheckBoxPointerOverBorderBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(92L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(87)
    public override fun put_CheckBoxPointerOverBorderBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(93L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(88)
    public override fun get_CheckBoxPressedBorderBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(94L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(89)
    public override fun put_CheckBoxPressedBorderBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(95L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(90)
    public override fun get_CheckBoxDisabledBorderBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(96L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(91)
    public override fun put_CheckBoxDisabledBorderBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(97L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(92)
    public override fun get_CheckBoxCornerRadius(): CornerRadius? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(98L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadius>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadius>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(93)
    public override fun put_CheckBoxCornerRadius(value: CornerRadius?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(99L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(94)
    public override fun get_SelectionIndicatorCornerRadius(): CornerRadius? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(100L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadius>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadius>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(95)
    public override fun put_SelectionIndicatorCornerRadius(value: CornerRadius?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(101L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(96)
    public override fun get_SelectionIndicatorVisualEnabled(): Boolean {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(102L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(97)
    public override fun put_SelectionIndicatorVisualEnabled(value: Boolean): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(103L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(98)
    public override fun get_SelectionIndicatorMode(): ListViewItemPresenterSelectionIndicatorMode? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(104L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewItemPresenterSelectionIndicatorMode>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ListViewItemPresenterSelectionIndicatorMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(99)
    public override
        fun put_SelectionIndicatorMode(value: ListViewItemPresenterSelectionIndicatorMode?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(105L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(100)
    public override fun get_SelectionIndicatorBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(106L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(101)
    public override fun put_SelectionIndicatorBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(107L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(102)
    public override fun get_SelectionIndicatorPointerOverBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(108L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(103)
    public override fun put_SelectionIndicatorPointerOverBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(109L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(104)
    public override fun get_SelectionIndicatorPressedBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(110L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(105)
    public override fun put_SelectionIndicatorPressedBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(111L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(106)
    public override fun get_SelectionIndicatorDisabledBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(112L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(107)
    public override fun put_SelectionIndicatorDisabledBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(113L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(108)
    public override fun get_SelectedBorderBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(114L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(109)
    public override fun put_SelectedBorderBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(115L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(110)
    public override fun get_SelectedPressedBorderBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(116L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(111)
    public override fun put_SelectedPressedBorderBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(117L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(112)
    public override fun get_SelectedDisabledBorderBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(118L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(113)
    public override fun put_SelectedDisabledBorderBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(119L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(114)
    public override fun get_SelectedInnerBorderBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(120L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(115)
    public override fun put_SelectedInnerBorderBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(121L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(116)
    public override fun get_PointerOverBorderBrush(): Brush? {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(122L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(117)
    public override fun put_PointerOverBorderBrush(value: Brush?): Unit {
      val fnPtr = _1642212991_VtblPtr!!.getPointer(123L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1642212991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IListViewItemPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1642212991_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81012623d9875582bc28755a95caaf1c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemPresenter(ptr: Pointer?): WithDefault =
        IListViewItemPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemPresenter {
      val address = segment.toRawLongValue()
      return makeIListViewItemPresenter(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1642212991_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemPresenter): Array<IListViewItemPresenter?> =
        (elements as
        Array<IListViewItemPresenter?>).castToImpl<IListViewItemPresenter,IListViewItemPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemPresenter?> =
        arrayOfNulls<IListViewItemPresenter_Impl>(size) as Array<IListViewItemPresenter?>
  }
}
