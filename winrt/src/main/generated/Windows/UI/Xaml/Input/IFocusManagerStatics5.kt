package Windows.UI.Xaml.Input

import Windows.Foundation.IAsyncOperation
import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.FocusState
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

@ABIMarker(IFocusManagerStatics5.ABI::class)
@Signature("{280edc61-207a-4d7b-b98f-ce165e1b2015}")
@Guid("280edc61207a4d7bb98fce165e1b2015")
@WinRTInterface("280edc61207a4d7bb98fce165e1b2015")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusManagerStatics5.ByReference::class)
public interface IFocusManagerStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryFocusAsync(element: DependencyObject?, value: FocusState?):
      IAsyncOperation<FocusMovementResult?>?

  @InterfaceMethod(1)
  public fun TryMoveFocusAsync(focusNavigationDirection: FocusNavigationDirection?):
      IAsyncOperation<FocusMovementResult?>?

  @InterfaceMethod(2)
  public fun TryMoveFocusAsync(focusNavigationDirection: FocusNavigationDirection?,
      focusNavigationOptions: FindNextElementOptions?): IAsyncOperation<FocusMovementResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFocusManagerStatics5> {
    public override fun getValue() = ABI.makeIFocusManagerStatics5(pointer.getPointer(0))

    public fun setValue(value: IFocusManagerStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusManagerStatics5 {
    public val __687728571_Ptr: Pointer?

    public val _687728571_VtblPtr: Pointer?
      get() = __687728571_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryFocusAsync(element: DependencyObject?, value: FocusState?):
        IAsyncOperation<FocusMovementResult?>? {
      val fnPtr = _687728571_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FocusMovementResult?>>()
      val hr = fn.invokeHR(arrayOf(__687728571_Ptr, marshalToNative(element),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FocusMovementResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryMoveFocusAsync(focusNavigationDirection: FocusNavigationDirection?):
        IAsyncOperation<FocusMovementResult?>? {
      val fnPtr = _687728571_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FocusMovementResult?>>()
      val hr = fn.invokeHR(arrayOf(__687728571_Ptr, marshalToNative(focusNavigationDirection),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FocusMovementResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryMoveFocusAsync(focusNavigationDirection: FocusNavigationDirection?,
        focusNavigationOptions: FindNextElementOptions?): IAsyncOperation<FocusMovementResult?>? {
      val fnPtr = _687728571_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FocusMovementResult?>>()
      val hr = fn.invokeHR(arrayOf(__687728571_Ptr, marshalToNative(focusNavigationDirection),
          marshalToNative(focusNavigationOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FocusMovementResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IFocusManagerStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __687728571_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusManagerStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("280edc61207a4d7bb98fce165e1b2015")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusManagerStatics5(ptr: Pointer?): WithDefault =
        IFocusManagerStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusManagerStatics5 {
      val address = segment.toRawLongValue()
      return makeIFocusManagerStatics5(Pointer(address))
    }

    public override fun toNative(obj: IFocusManagerStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__687728571_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusManagerStatics5): Array<IFocusManagerStatics5?> =
        (elements as
        Array<IFocusManagerStatics5?>).castToImpl<IFocusManagerStatics5,IFocusManagerStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusManagerStatics5?> =
        arrayOfNulls<IFocusManagerStatics5_Impl>(size) as Array<IFocusManagerStatics5?>
  }
}
