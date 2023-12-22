package Microsoft.UI.Input.Experimental

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

@ABIMarker(IExpFocusNavigationHost.ABI::class)
@Signature("{49b02d03-b0d8-55db-985a-48611e47e838}")
@Guid("49b02d03b0d855db985a48611e47e838")
@WinRTInterface("49b02d03b0d855db985a48611e47e838")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpFocusNavigationHost.ByReference::class)
public interface IExpFocusNavigationHost : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun NavigateFocus(request: ExpFocusNavigationRequest?): ExpFocusNavigationResult?

  @InterfaceMethod(1)
  public fun add_TakeFocusRequested(handler: TypedEventHandler<ExpFocusNavigationHost?,
      ExpNavigateFocusRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_TakeFocusRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpFocusNavigationHost> {
    public override fun getValue() = ABI.makeIExpFocusNavigationHost(pointer.getPointer(0))

    public fun setValue(value: IExpFocusNavigationHost_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpFocusNavigationHost {
    public val __765784294_Ptr: Pointer?

    public val _765784294_VtblPtr: Pointer?
      get() = __765784294_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun NavigateFocus(request: ExpFocusNavigationRequest?):
        ExpFocusNavigationResult? {
      val fnPtr = _765784294_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpFocusNavigationResult>()
      val hr = fn.invokeHR(arrayOf(__765784294_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpFocusNavigationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_TakeFocusRequested(handler: TypedEventHandler<ExpFocusNavigationHost?,
        ExpNavigateFocusRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _765784294_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__765784294_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_TakeFocusRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _765784294_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__765784294_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IExpFocusNavigationHost_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __765784294_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpFocusNavigationHost, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49b02d03b0d855db985a48611e47e838")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpFocusNavigationHost(ptr: Pointer?): WithDefault =
        IExpFocusNavigationHost_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpFocusNavigationHost {
      val address = segment.toRawLongValue()
      return makeIExpFocusNavigationHost(Pointer(address))
    }

    public override fun toNative(obj: IExpFocusNavigationHost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__765784294_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpFocusNavigationHost): Array<IExpFocusNavigationHost?>
        = (elements as
        Array<IExpFocusNavigationHost?>).castToImpl<IExpFocusNavigationHost,IExpFocusNavigationHost_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpFocusNavigationHost?> =
        arrayOfNulls<IExpFocusNavigationHost_Impl>(size) as Array<IExpFocusNavigationHost?>
  }
}
