package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.DependencyProperty
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IListViewItemPresenterStatics.ABI::class)
@Signature("{fb0810f9-3475-593a-88a8-edbbf76fa90c}")
@Guid("fb0810f93475593a88a8edbbf76fa90c")
@WinRTInterface("fb0810f93475593a88a8edbbf76fa90c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemPresenterStatics.ByReference::class)
public interface IListViewItemPresenterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionCheckMarkVisualEnabledProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CheckHintBrushProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_CheckSelectingBrushProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_CheckBrushProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_DragBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_DragForegroundProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_FocusBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_PlaceholderBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_PointerOverBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_SelectedBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_SelectedForegroundProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_SelectedPointerOverBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_SelectedPointerOverBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_SelectedBorderThicknessProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_DisabledOpacityProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_DragOpacityProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_ReorderHintOffsetProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_ListViewItemPresenterHorizontalContentAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(18)
  public fun get_ListViewItemPresenterVerticalContentAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun get_ListViewItemPresenterPaddingProperty(): DependencyProperty?

  @InterfaceMethod(20)
  public fun get_PointerOverBackgroundMarginProperty(): DependencyProperty?

  @InterfaceMethod(21)
  public fun get_ContentMarginProperty(): DependencyProperty?

  @InterfaceMethod(22)
  public fun get_SelectedPressedBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(23)
  public fun get_PressedBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(24)
  public fun get_CheckBoxBrushProperty(): DependencyProperty?

  @InterfaceMethod(25)
  public fun get_FocusSecondaryBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(26)
  public fun get_CheckModeProperty(): DependencyProperty?

  @InterfaceMethod(27)
  public fun get_PointerOverForegroundProperty(): DependencyProperty?

  @InterfaceMethod(28)
  public fun get_RevealBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(29)
  public fun get_RevealBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(30)
  public fun get_RevealBorderThicknessProperty(): DependencyProperty?

  @InterfaceMethod(31)
  public fun get_RevealBackgroundShowsAboveContentProperty(): DependencyProperty?

  @InterfaceMethod(32)
  public fun get_SelectedDisabledBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(33)
  public fun get_CheckPressedBrushProperty(): DependencyProperty?

  @InterfaceMethod(34)
  public fun get_CheckDisabledBrushProperty(): DependencyProperty?

  @InterfaceMethod(35)
  public fun get_CheckBoxPointerOverBrushProperty(): DependencyProperty?

  @InterfaceMethod(36)
  public fun get_CheckBoxPressedBrushProperty(): DependencyProperty?

  @InterfaceMethod(37)
  public fun get_CheckBoxDisabledBrushProperty(): DependencyProperty?

  @InterfaceMethod(38)
  public fun get_CheckBoxSelectedBrushProperty(): DependencyProperty?

  @InterfaceMethod(39)
  public fun get_CheckBoxSelectedPointerOverBrushProperty(): DependencyProperty?

  @InterfaceMethod(40)
  public fun get_CheckBoxSelectedPressedBrushProperty(): DependencyProperty?

  @InterfaceMethod(41)
  public fun get_CheckBoxSelectedDisabledBrushProperty(): DependencyProperty?

  @InterfaceMethod(42)
  public fun get_CheckBoxBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(43)
  public fun get_CheckBoxPointerOverBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(44)
  public fun get_CheckBoxPressedBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(45)
  public fun get_CheckBoxDisabledBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(46)
  public fun get_CheckBoxCornerRadiusProperty(): DependencyProperty?

  @InterfaceMethod(47)
  public fun get_SelectionIndicatorCornerRadiusProperty(): DependencyProperty?

  @InterfaceMethod(48)
  public fun get_SelectionIndicatorVisualEnabledProperty(): DependencyProperty?

  @InterfaceMethod(49)
  public fun get_SelectionIndicatorModeProperty(): DependencyProperty?

  @InterfaceMethod(50)
  public fun get_SelectionIndicatorBrushProperty(): DependencyProperty?

  @InterfaceMethod(51)
  public fun get_SelectionIndicatorPointerOverBrushProperty(): DependencyProperty?

  @InterfaceMethod(52)
  public fun get_SelectionIndicatorPressedBrushProperty(): DependencyProperty?

  @InterfaceMethod(53)
  public fun get_SelectionIndicatorDisabledBrushProperty(): DependencyProperty?

  @InterfaceMethod(54)
  public fun get_SelectedBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(55)
  public fun get_SelectedPressedBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(56)
  public fun get_SelectedDisabledBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(57)
  public fun get_SelectedInnerBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(58)
  public fun get_PointerOverBorderBrushProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemPresenterStatics> {
    public override fun getValue() = ABI.makeIListViewItemPresenterStatics(pointer.getPointer(0))

    public fun setValue(value: IListViewItemPresenterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemPresenterStatics {
    public val __679394556_Ptr: Pointer?

    public val _679394556_VtblPtr: Pointer?
      get() = __679394556_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionCheckMarkVisualEnabledProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CheckHintBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CheckSelectingBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CheckBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DragBackgroundProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DragForegroundProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_FocusBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_PlaceholderBackgroundProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_PointerOverBackgroundProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_SelectedBackgroundProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_SelectedForegroundProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_SelectedPointerOverBackgroundProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_SelectedPointerOverBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_SelectedBorderThicknessProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_DisabledOpacityProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_DragOpacityProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_ReorderHintOffsetProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_ListViewItemPresenterHorizontalContentAlignmentProperty():
        DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_ListViewItemPresenterVerticalContentAlignmentProperty():
        DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_ListViewItemPresenterPaddingProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_PointerOverBackgroundMarginProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_ContentMarginProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_SelectedPressedBackgroundProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_PressedBackgroundProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_CheckBoxBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_FocusSecondaryBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun get_CheckModeProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun get_PointerOverForegroundProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun get_RevealBackgroundProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun get_RevealBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun get_RevealBorderThicknessProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun get_RevealBackgroundShowsAboveContentProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun get_SelectedDisabledBackgroundProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun get_CheckPressedBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun get_CheckDisabledBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun get_CheckBoxPointerOverBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun get_CheckBoxPressedBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun get_CheckBoxDisabledBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun get_CheckBoxSelectedBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun get_CheckBoxSelectedPointerOverBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun get_CheckBoxSelectedPressedBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun get_CheckBoxSelectedDisabledBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun get_CheckBoxBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun get_CheckBoxPointerOverBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun get_CheckBoxPressedBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun get_CheckBoxDisabledBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun get_CheckBoxCornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun get_SelectionIndicatorCornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun get_SelectionIndicatorVisualEnabledProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun get_SelectionIndicatorModeProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(50)
    public override fun get_SelectionIndicatorBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun get_SelectionIndicatorPointerOverBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(52)
    public override fun get_SelectionIndicatorPressedBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun get_SelectionIndicatorDisabledBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(54)
    public override fun get_SelectedBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun get_SelectedPressedBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(56)
    public override fun get_SelectedDisabledBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(57)
    public override fun get_SelectedInnerBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(58)
    public override fun get_PointerOverBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _679394556_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__679394556_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IListViewItemPresenterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __679394556_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemPresenterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb0810f93475593a88a8edbbf76fa90c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemPresenterStatics(ptr: Pointer?): WithDefault =
        IListViewItemPresenterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemPresenterStatics {
      val address = segment.toRawLongValue()
      return makeIListViewItemPresenterStatics(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemPresenterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__679394556_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemPresenterStatics):
        Array<IListViewItemPresenterStatics?> = (elements as
        Array<IListViewItemPresenterStatics?>).castToImpl<IListViewItemPresenterStatics,IListViewItemPresenterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemPresenterStatics?> =
        arrayOfNulls<IListViewItemPresenterStatics_Impl>(size) as
        Array<IListViewItemPresenterStatics?>
  }
}
