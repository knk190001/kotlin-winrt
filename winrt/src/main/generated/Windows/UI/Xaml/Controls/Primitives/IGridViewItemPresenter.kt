package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.HorizontalAlignment
import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.Thickness
import Windows.UI.Xaml.VerticalAlignment
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

@ABIMarker(IGridViewItemPresenter.ABI::class)
@Signature("{214f9010-56e2-4821-8a1c-2305709af94b}")
@Guid("214f901056e248218a1c2305709af94b")
@WinRTInterface("214f901056e248218a1c2305709af94b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridViewItemPresenter.ByReference::class)
public interface IGridViewItemPresenter : NativeMapped, IWinRTInterface {
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
  public fun get_GridViewItemPresenterHorizontalContentAlignment(): HorizontalAlignment?

  @InterfaceMethod(35)
  public fun put_GridViewItemPresenterHorizontalContentAlignment(value: HorizontalAlignment?): Unit

  @InterfaceMethod(36)
  public fun get_GridViewItemPresenterVerticalContentAlignment(): VerticalAlignment?

  @InterfaceMethod(37)
  public fun put_GridViewItemPresenterVerticalContentAlignment(value: VerticalAlignment?): Unit

  @InterfaceMethod(38)
  public fun get_GridViewItemPresenterPadding(): Thickness?

  @InterfaceMethod(39)
  public fun put_GridViewItemPresenterPadding(value: Thickness?): Unit

  @InterfaceMethod(40)
  public fun get_PointerOverBackgroundMargin(): Thickness?

  @InterfaceMethod(41)
  public fun put_PointerOverBackgroundMargin(value: Thickness?): Unit

  @InterfaceMethod(42)
  public fun get_ContentMargin(): Thickness?

  @InterfaceMethod(43)
  public fun put_ContentMargin(value: Thickness?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridViewItemPresenter> {
    public override fun getValue() = ABI.makeIGridViewItemPresenter(pointer.getPointer(0))

    public fun setValue(value: IGridViewItemPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridViewItemPresenter {
    public val __1490315730_Ptr: Pointer?

    public val _1490315730_VtblPtr: Pointer?
      get() = __1490315730_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionCheckMarkVisualEnabled(): Boolean {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SelectionCheckMarkVisualEnabled(value: Boolean): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CheckHintBrush(): Brush? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CheckHintBrush(value: Brush?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CheckSelectingBrush(): Brush? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_CheckSelectingBrush(value: Brush?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CheckBrush(): Brush? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_CheckBrush(value: Brush?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_DragBackground(): Brush? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_DragBackground(value: Brush?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_DragForeground(): Brush? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_DragForeground(value: Brush?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_FocusBorderBrush(): Brush? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_FocusBorderBrush(value: Brush?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_PlaceholderBackground(): Brush? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_PlaceholderBackground(value: Brush?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_PointerOverBackground(): Brush? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_PointerOverBackground(value: Brush?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_SelectedBackground(): Brush? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_SelectedBackground(value: Brush?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_SelectedForeground(): Brush? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_SelectedForeground(value: Brush?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_SelectedPointerOverBackground(): Brush? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_SelectedPointerOverBackground(value: Brush?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_SelectedPointerOverBorderBrush(): Brush? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_SelectedPointerOverBorderBrush(value: Brush?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_SelectedBorderThickness(): Thickness? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_SelectedBorderThickness(value: Thickness?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_DisabledOpacity(): Double {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun put_DisabledOpacity(value: Double): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_DragOpacity(): Double {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun put_DragOpacity(value: Double): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_ReorderHintOffset(): Double {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun put_ReorderHintOffset(value: Double): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_GridViewItemPresenterHorizontalContentAlignment():
        HorizontalAlignment? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HorizontalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HorizontalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override
        fun put_GridViewItemPresenterHorizontalContentAlignment(value: HorizontalAlignment?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_GridViewItemPresenterVerticalContentAlignment(): VerticalAlignment? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VerticalAlignment>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VerticalAlignment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override
        fun put_GridViewItemPresenterVerticalContentAlignment(value: VerticalAlignment?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_GridViewItemPresenterPadding(): Thickness? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_GridViewItemPresenterPadding(value: Thickness?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_PointerOverBackgroundMargin(): Thickness? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun put_PointerOverBackgroundMargin(value: Thickness?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_ContentMargin(): Thickness? {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun put_ContentMargin(value: Thickness?): Unit {
      val fnPtr = _1490315730_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1490315730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGridViewItemPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1490315730_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewItemPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("214f901056e248218a1c2305709af94b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewItemPresenter(ptr: Pointer?): WithDefault =
        IGridViewItemPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridViewItemPresenter {
      val address = segment.toRawLongValue()
      return makeIGridViewItemPresenter(Pointer(address))
    }

    public override fun toNative(obj: IGridViewItemPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1490315730_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridViewItemPresenter): Array<IGridViewItemPresenter?> =
        (elements as
        Array<IGridViewItemPresenter?>).castToImpl<IGridViewItemPresenter,IGridViewItemPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridViewItemPresenter?> =
        arrayOfNulls<IGridViewItemPresenter_Impl>(size) as Array<IGridViewItemPresenter?>
  }
}
