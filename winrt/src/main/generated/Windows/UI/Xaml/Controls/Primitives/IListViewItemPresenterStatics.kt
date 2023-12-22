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

@ABIMarker(IListViewItemPresenterStatics.ABI::class)
@Signature("{6504a55a-15dd-42fb-aa5d-2d8ce2e9c294}")
@Guid("6504a55a15dd42fbaa5d2d8ce2e9c294")
@WinRTInterface("6504a55a15dd42fbaa5d2d8ce2e9c294")
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemPresenterStatics> {
    public override fun getValue() = ABI.makeIListViewItemPresenterStatics(pointer.getPointer(0))

    public fun setValue(value: IListViewItemPresenterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemPresenterStatics {
    public val __1793593585_Ptr: Pointer?

    public val _1793593585_VtblPtr: Pointer?
      get() = __1793593585_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionCheckMarkVisualEnabledProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CheckHintBrushProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CheckSelectingBrushProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CheckBrushProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DragBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DragForegroundProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_FocusBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_PlaceholderBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_PointerOverBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_SelectedBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_SelectedForegroundProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_SelectedPointerOverBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_SelectedPointerOverBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_SelectedBorderThicknessProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_DisabledOpacityProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_DragOpacityProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_ReorderHintOffsetProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_ListViewItemPresenterHorizontalContentAlignmentProperty():
        DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_ListViewItemPresenterVerticalContentAlignmentProperty():
        DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_ListViewItemPresenterPaddingProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_PointerOverBackgroundMarginProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_ContentMarginProperty(): DependencyProperty? {
      val fnPtr = _1793593585_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1793593585_Ptr,  result))
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
    public override val __1793593585_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemPresenterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6504a55a15dd42fbaa5d2d8ce2e9c294")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemPresenterStatics(ptr: Pointer?): WithDefault =
        IListViewItemPresenterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemPresenterStatics {
      val address = segment.toRawLongValue()
      return makeIListViewItemPresenterStatics(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemPresenterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1793593585_Ptr))
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
