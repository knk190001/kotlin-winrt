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

@ABIMarker(IListViewItemPresenterStatics2.ABI::class)
@Signature("{4cb3b945-d24d-42a3-9e83-a86d0618bf1b}")
@Guid("4cb3b945d24d42a39e83a86d0618bf1b")
@WinRTInterface("4cb3b945d24d42a39e83a86d0618bf1b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewItemPresenterStatics2.ByReference::class)
public interface IListViewItemPresenterStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedPressedBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_PressedBackgroundProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_CheckBoxBrushProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_FocusSecondaryBorderBrushProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_CheckModeProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_PointerOverForegroundProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewItemPresenterStatics2> {
    public override fun getValue() = ABI.makeIListViewItemPresenterStatics2(pointer.getPointer(0))

    public fun setValue(value: IListViewItemPresenterStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewItemPresenterStatics2 {
    public val __233173763_Ptr: Pointer?

    public val _233173763_VtblPtr: Pointer?
      get() = __233173763_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedPressedBackgroundProperty(): DependencyProperty? {
      val fnPtr = _233173763_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173763_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PressedBackgroundProperty(): DependencyProperty? {
      val fnPtr = _233173763_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173763_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CheckBoxBrushProperty(): DependencyProperty? {
      val fnPtr = _233173763_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173763_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FocusSecondaryBorderBrushProperty(): DependencyProperty? {
      val fnPtr = _233173763_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173763_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CheckModeProperty(): DependencyProperty? {
      val fnPtr = _233173763_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173763_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PointerOverForegroundProperty(): DependencyProperty? {
      val fnPtr = _233173763_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__233173763_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IListViewItemPresenterStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __233173763_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewItemPresenterStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4cb3b945d24d42a39e83a86d0618bf1b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewItemPresenterStatics2(ptr: Pointer?): WithDefault =
        IListViewItemPresenterStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewItemPresenterStatics2 {
      val address = segment.toRawLongValue()
      return makeIListViewItemPresenterStatics2(Pointer(address))
    }

    public override fun toNative(obj: IListViewItemPresenterStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__233173763_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewItemPresenterStatics2):
        Array<IListViewItemPresenterStatics2?> = (elements as
        Array<IListViewItemPresenterStatics2?>).castToImpl<IListViewItemPresenterStatics2,IListViewItemPresenterStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewItemPresenterStatics2?> =
        arrayOfNulls<IListViewItemPresenterStatics2_Impl>(size) as
        Array<IListViewItemPresenterStatics2?>
  }
}
