package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.CornerRadius
import Windows.UI.Xaml.Media.Brush
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IListViewItemPresenter4.ABI::class)
@Signature("{da600ac1-adea-5940-a18f-57582f96d99a}")
@Guid("da600ac1adea5940a18f57582f96d99a")
@WinRTInterface("da600ac1adea5940a18f57582f96d99a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemPresenter4.ByReference::class)
public interface IListViewItemPresenter4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedDisabledBackground(): Brush?

  @InterfaceMethod(1)
  public fun put_SelectedDisabledBackground(value: Brush?): Unit

  @InterfaceMethod(2)
  public fun get_CheckPressedBrush(): Brush?

  @InterfaceMethod(3)
  public fun put_CheckPressedBrush(value: Brush?): Unit

  @InterfaceMethod(4)
  public fun get_CheckDisabledBrush(): Brush?

  @InterfaceMethod(5)
  public fun put_CheckDisabledBrush(value: Brush?): Unit

  @InterfaceMethod(6)
  public fun get_CheckBoxPointerOverBrush(): Brush?

  @InterfaceMethod(7)
  public fun put_CheckBoxPointerOverBrush(value: Brush?): Unit

  @InterfaceMethod(8)
  public fun get_CheckBoxPressedBrush(): Brush?

  @InterfaceMethod(9)
  public fun put_CheckBoxPressedBrush(value: Brush?): Unit

  @InterfaceMethod(10)
  public fun get_CheckBoxDisabledBrush(): Brush?

  @InterfaceMethod(11)
  public fun put_CheckBoxDisabledBrush(value: Brush?): Unit

  @InterfaceMethod(12)
  public fun get_CheckBoxSelectedBrush(): Brush?

  @InterfaceMethod(13)
  public fun put_CheckBoxSelectedBrush(value: Brush?): Unit

  @InterfaceMethod(14)
  public fun get_CheckBoxSelectedPointerOverBrush(): Brush?

  @InterfaceMethod(15)
  public fun put_CheckBoxSelectedPointerOverBrush(value: Brush?): Unit

  @InterfaceMethod(16)
  public fun get_CheckBoxSelectedPressedBrush(): Brush?

  @InterfaceMethod(17)
  public fun put_CheckBoxSelectedPressedBrush(value: Brush?): Unit

  @InterfaceMethod(18)
  public fun get_CheckBoxSelectedDisabledBrush(): Brush?

  @InterfaceMethod(19)
  public fun put_CheckBoxSelectedDisabledBrush(value: Brush?): Unit

  @InterfaceMethod(20)
  public fun get_CheckBoxBorderBrush(): Brush?

  @InterfaceMethod(21)
  public fun put_CheckBoxBorderBrush(value: Brush?): Unit

  @InterfaceMethod(22)
  public fun get_CheckBoxPointerOverBorderBrush(): Brush?

  @InterfaceMethod(23)
  public fun put_CheckBoxPointerOverBorderBrush(value: Brush?): Unit

  @InterfaceMethod(24)
  public fun get_CheckBoxPressedBorderBrush(): Brush?

  @InterfaceMethod(25)
  public fun put_CheckBoxPressedBorderBrush(value: Brush?): Unit

  @InterfaceMethod(26)
  public fun get_CheckBoxDisabledBorderBrush(): Brush?

  @InterfaceMethod(27)
  public fun put_CheckBoxDisabledBorderBrush(value: Brush?): Unit

  @InterfaceMethod(28)
  public fun get_CheckBoxCornerRadius(): CornerRadius?

  @InterfaceMethod(29)
  public fun put_CheckBoxCornerRadius(value: CornerRadius?): Unit

  @InterfaceMethod(30)
  public fun get_SelectionIndicatorCornerRadius(): CornerRadius?

  @InterfaceMethod(31)
  public fun put_SelectionIndicatorCornerRadius(value: CornerRadius?): Unit

  @InterfaceMethod(32)
  public fun get_SelectionIndicatorVisualEnabled(): Boolean

  @InterfaceMethod(33)
  public fun put_SelectionIndicatorVisualEnabled(value: Boolean): Unit

  @InterfaceMethod(34)
  public fun get_SelectionIndicatorMode(): ListViewItemPresenterSelectionIndicatorMode?

  @InterfaceMethod(35)
  public fun put_SelectionIndicatorMode(value: ListViewItemPresenterSelectionIndicatorMode?): Unit

  @InterfaceMethod(36)
  public fun get_SelectionIndicatorBrush(): Brush?

  @InterfaceMethod(37)
  public fun put_SelectionIndicatorBrush(value: Brush?): Unit

  @InterfaceMethod(38)
  public fun get_SelectionIndicatorPointerOverBrush(): Brush?

  @InterfaceMethod(39)
  public fun put_SelectionIndicatorPointerOverBrush(value: Brush?): Unit

  @InterfaceMethod(40)
  public fun get_SelectionIndicatorPressedBrush(): Brush?

  @InterfaceMethod(41)
  public fun put_SelectionIndicatorPressedBrush(value: Brush?): Unit

  @InterfaceMethod(42)
  public fun get_SelectionIndicatorDisabledBrush(): Brush?

  @InterfaceMethod(43)
  public fun put_SelectionIndicatorDisabledBrush(value: Brush?): Unit

  @InterfaceMethod(44)
  public fun get_SelectedBorderBrush(): Brush?

  @InterfaceMethod(45)
  public fun put_SelectedBorderBrush(value: Brush?): Unit

  @InterfaceMethod(46)
  public fun get_SelectedPressedBorderBrush(): Brush?

  @InterfaceMethod(47)
  public fun put_SelectedPressedBorderBrush(value: Brush?): Unit

  @InterfaceMethod(48)
  public fun get_SelectedDisabledBorderBrush(): Brush?

  @InterfaceMethod(49)
  public fun put_SelectedDisabledBorderBrush(value: Brush?): Unit

  @InterfaceMethod(50)
  public fun get_SelectedInnerBorderBrush(): Brush?

  @InterfaceMethod(51)
  public fun put_SelectedInnerBorderBrush(value: Brush?): Unit

  @InterfaceMethod(52)
  public fun get_PointerOverBorderBrush(): Brush?

  @InterfaceMethod(53)
  public fun put_PointerOverBorderBrush(value: Brush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemPresenter4> {
    public override fun getValue() = ABI.makeIListViewItemPresenter4(pointer.getPointer(0))

    public fun setValue(value: IListViewItemPresenter4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemPresenter4 {
    public val __1417391902_Ptr: Pointer?

    public val _1417391902_VtblPtr: Pointer?
      get() = __1417391902_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedDisabledBackground(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SelectedDisabledBackground(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CheckPressedBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CheckPressedBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CheckDisabledBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_CheckDisabledBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CheckBoxPointerOverBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_CheckBoxPointerOverBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_CheckBoxPressedBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_CheckBoxPressedBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_CheckBoxDisabledBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_CheckBoxDisabledBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_CheckBoxSelectedBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_CheckBoxSelectedBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_CheckBoxSelectedPointerOverBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_CheckBoxSelectedPointerOverBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_CheckBoxSelectedPressedBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_CheckBoxSelectedPressedBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_CheckBoxSelectedDisabledBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_CheckBoxSelectedDisabledBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_CheckBoxBorderBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_CheckBoxBorderBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_CheckBoxPointerOverBorderBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_CheckBoxPointerOverBorderBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_CheckBoxPressedBorderBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_CheckBoxPressedBorderBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_CheckBoxDisabledBorderBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_CheckBoxDisabledBorderBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_CheckBoxCornerRadius(): CornerRadius? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadius>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadius>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_CheckBoxCornerRadius(value: CornerRadius?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_SelectionIndicatorCornerRadius(): CornerRadius? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadius>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadius>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_SelectionIndicatorCornerRadius(value: CornerRadius?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_SelectionIndicatorVisualEnabled(): Boolean {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun put_SelectionIndicatorVisualEnabled(value: Boolean): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_SelectionIndicatorMode(): ListViewItemPresenterSelectionIndicatorMode? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewItemPresenterSelectionIndicatorMode>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ListViewItemPresenterSelectionIndicatorMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override
        fun put_SelectionIndicatorMode(value: ListViewItemPresenterSelectionIndicatorMode?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_SelectionIndicatorBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_SelectionIndicatorBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_SelectionIndicatorPointerOverBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_SelectionIndicatorPointerOverBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_SelectionIndicatorPressedBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun put_SelectionIndicatorPressedBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_SelectionIndicatorDisabledBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun put_SelectionIndicatorDisabledBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_SelectedBorderBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun put_SelectedBorderBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_SelectedPressedBorderBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun put_SelectedPressedBorderBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_SelectedDisabledBorderBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun put_SelectedDisabledBorderBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun get_SelectedInnerBorderBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun put_SelectedInnerBorderBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun get_PointerOverBorderBrush(): Brush? {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun put_PointerOverBorderBrush(value: Brush?): Unit {
      val fnPtr = _1417391902_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1417391902_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IListViewItemPresenter4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1417391902_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemPresenter4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da600ac1adea5940a18f57582f96d99a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemPresenter4(ptr: Pointer?): WithDefault =
        IListViewItemPresenter4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemPresenter4 {
      val address = segment.toRawLongValue()
      return makeIListViewItemPresenter4(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemPresenter4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1417391902_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemPresenter4): Array<IListViewItemPresenter4?>
        = (elements as
        Array<IListViewItemPresenter4?>).castToImpl<IListViewItemPresenter4,IListViewItemPresenter4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemPresenter4?> =
        arrayOfNulls<IListViewItemPresenter4_Impl>(size) as Array<IListViewItemPresenter4?>
  }
}
