package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IListViewItemPresenterStatics4.ABI::class)
@Signature("{3917159e-74a1-5e7e-a743-e45be9fb919b}")
@Guid("3917159e74a15e7ea743e45be9fb919b")
@WinRTInterface("3917159e74a15e7ea743e45be9fb919b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemPresenterStatics4.ByReference::class)
public interface IListViewItemPresenterStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedDisabledBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CheckPressedBrushProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_CheckDisabledBrushProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_CheckBoxPointerOverBrushProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_CheckBoxPressedBrushProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_CheckBoxDisabledBrushProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_CheckBoxSelectedBrushProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_CheckBoxSelectedPointerOverBrushProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_CheckBoxSelectedPressedBrushProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_CheckBoxSelectedDisabledBrushProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_CheckBoxBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_CheckBoxPointerOverBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_CheckBoxPressedBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_CheckBoxDisabledBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_CheckBoxCornerRadiusProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_SelectionIndicatorCornerRadiusProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_SelectionIndicatorVisualEnabledProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_SelectionIndicatorModeProperty(): DependencyProperty?

  @InterfaceMethod(18)
  public fun get_SelectionIndicatorBrushProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun get_SelectionIndicatorPointerOverBrushProperty(): DependencyProperty?

  @InterfaceMethod(20)
  public fun get_SelectionIndicatorPressedBrushProperty(): DependencyProperty?

  @InterfaceMethod(21)
  public fun get_SelectionIndicatorDisabledBrushProperty(): DependencyProperty?

  @InterfaceMethod(22)
  public fun get_SelectedBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(23)
  public fun get_SelectedPressedBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(24)
  public fun get_SelectedDisabledBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(25)
  public fun get_SelectedInnerBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(26)
  public fun get_PointerOverBorderBrushProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemPresenterStatics4> {
    public override fun getValue() = ABI.makeIListViewItemPresenterStatics4(pointer.getPointer(0))

    public fun setValue(value: IListViewItemPresenterStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemPresenterStatics4 {
    public val __233173765_Ptr: Pointer?

    public val _233173765_VtblPtr: Pointer?
      get() = __233173765_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedDisabledBackgroundProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CheckPressedBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CheckDisabledBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CheckBoxPointerOverBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CheckBoxPressedBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CheckBoxDisabledBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CheckBoxSelectedBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_CheckBoxSelectedPointerOverBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_CheckBoxSelectedPressedBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_CheckBoxSelectedDisabledBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_CheckBoxBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_CheckBoxPointerOverBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_CheckBoxPressedBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_CheckBoxDisabledBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_CheckBoxCornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_SelectionIndicatorCornerRadiusProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_SelectionIndicatorVisualEnabledProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_SelectionIndicatorModeProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_SelectionIndicatorBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_SelectionIndicatorPointerOverBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_SelectionIndicatorPressedBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_SelectionIndicatorDisabledBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_SelectedBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_SelectedPressedBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_SelectedDisabledBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_SelectedInnerBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun get_PointerOverBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _233173765_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IListViewItemPresenterStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __233173765_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemPresenterStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3917159e74a15e7ea743e45be9fb919b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemPresenterStatics4(ptr: Pointer?): WithDefault =
        IListViewItemPresenterStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemPresenterStatics4 {
      val address = segment.toRawLongValue()
      return makeIListViewItemPresenterStatics4(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemPresenterStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__233173765_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemPresenterStatics4):
        Array<IListViewItemPresenterStatics4?> = (elements as
        Array<IListViewItemPresenterStatics4?>).castToImpl<IListViewItemPresenterStatics4,IListViewItemPresenterStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemPresenterStatics4?> =
        arrayOfNulls<IListViewItemPresenterStatics4_Impl>(size) as
        Array<IListViewItemPresenterStatics4?>
  }
}
