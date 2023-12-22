package Windows.UI.Xaml.Input

import Windows.Foundation.Rect
import Windows.UI.Xaml.UIElement
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

@ABIMarker(IFocusManagerStatics3.ABI::class)
@Signature("{60805ebf-b149-417d-83f1-baeb560e2a47}")
@Guid("60805ebfb149417d83f1baeb560e2a47")
@WinRTInterface("60805ebfb149417d83f1baeb560e2a47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusManagerStatics3.ByReference::class)
public interface IFocusManagerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindNextFocusableElement(focusNavigationDirection: FocusNavigationDirection?):
      UIElement?

  @InterfaceMethod(1)
  public fun FindNextFocusableElement(focusNavigationDirection: FocusNavigationDirection?,
      hintRect: Rect?): UIElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFocusManagerStatics3> {
    public override fun getValue() = ABI.makeIFocusManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IFocusManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusManagerStatics3 {
    public val __687728569_Ptr: Pointer?

    public val _687728569_VtblPtr: Pointer?
      get() = __687728569_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun FindNextFocusableElement(focusNavigationDirection: FocusNavigationDirection?):
        UIElement? {
      val fnPtr = _687728569_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__687728569_Ptr, marshalToNative(focusNavigationDirection),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun FindNextFocusableElement(focusNavigationDirection: FocusNavigationDirection?,
        hintRect: Rect?): UIElement? {
      val fnPtr = _687728569_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__687728569_Ptr, marshalToNative(focusNavigationDirection),
          marshalToNative(hintRect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }
  }

  public class IFocusManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __687728569_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("60805ebfb149417d83f1baeb560e2a47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusManagerStatics3(ptr: Pointer?): WithDefault =
        IFocusManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIFocusManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IFocusManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__687728569_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusManagerStatics3): Array<IFocusManagerStatics3?> =
        (elements as
        Array<IFocusManagerStatics3?>).castToImpl<IFocusManagerStatics3,IFocusManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusManagerStatics3?> =
        arrayOfNulls<IFocusManagerStatics3_Impl>(size) as Array<IFocusManagerStatics3?>
  }
}
