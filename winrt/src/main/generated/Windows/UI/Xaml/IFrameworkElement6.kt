package Windows.UI.Xaml

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IFrameworkElement6.ABI::class)
@Signature("{792a5d91-62a1-40bf-a0ce-f9c131fcb7a7}")
@Guid("792a5d9162a140bfa0cef9c131fcb7a7")
@WinRTInterface("792a5d9162a140bfa0cef9c131fcb7a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElement6.ByReference::class)
public interface IFrameworkElement6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActualTheme(): ElementTheme?

  @InterfaceMethod(1)
  public fun add_ActualThemeChanged(handler: TypedEventHandler<FrameworkElement?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_ActualThemeChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElement6> {
    public override fun getValue() = ABI.makeIFrameworkElement6(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElement6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElement6 {
    public val __329359558_Ptr: Pointer?

    public val _329359558_VtblPtr: Pointer?
      get() = __329359558_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActualTheme(): ElementTheme? {
      val fnPtr = _329359558_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementTheme>()
      val hr = fn.invokeHR(arrayOf(__329359558_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementTheme>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_ActualThemeChanged(handler: TypedEventHandler<FrameworkElement?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _329359558_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__329359558_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_ActualThemeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _329359558_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__329359558_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameworkElement6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __329359558_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElement6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("792a5d9162a140bfa0cef9c131fcb7a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElement6(ptr: Pointer?): WithDefault = IFrameworkElement6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElement6 {
      val address = segment.toRawLongValue()
      return makeIFrameworkElement6(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElement6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__329359558_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElement6): Array<IFrameworkElement6?> =
        (elements as
        Array<IFrameworkElement6?>).castToImpl<IFrameworkElement6,IFrameworkElement6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElement6?> =
        arrayOfNulls<IFrameworkElement6_Impl>(size) as Array<IFrameworkElement6?>
  }
}
