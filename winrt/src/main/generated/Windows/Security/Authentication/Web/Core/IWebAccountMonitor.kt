package Windows.Security.Authentication.Web.Core

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

@ABIMarker(IWebAccountMonitor.ABI::class)
@Signature("{7445f5fd-aa9d-4619-8d5d-c138a4ede3e5}")
@Guid("7445f5fdaa9d46198d5dc138a4ede3e5")
@WinRTInterface("7445f5fdaa9d46198d5dc138a4ede3e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountMonitor.ByReference::class)
public interface IWebAccountMonitor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Updated(handler: TypedEventHandler<WebAccountMonitor?, WebAccountEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Updated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_Removed(handler: TypedEventHandler<WebAccountMonitor?, WebAccountEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Removed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_DefaultSignInAccountChanged(handler: TypedEventHandler<WebAccountMonitor?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_DefaultSignInAccountChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountMonitor> {
    public override fun getValue() = ABI.makeIWebAccountMonitor(pointer.getPointer(0))

    public fun setValue(value: IWebAccountMonitor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountMonitor {
    public val __1062977276_Ptr: Pointer?

    public val _1062977276_VtblPtr: Pointer?
      get() = __1062977276_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Updated(handler: TypedEventHandler<WebAccountMonitor?,
        WebAccountEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1062977276_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1062977276_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Updated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1062977276_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1062977276_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Removed(handler: TypedEventHandler<WebAccountMonitor?,
        WebAccountEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1062977276_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1062977276_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Removed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1062977276_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1062977276_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_DefaultSignInAccountChanged(handler: TypedEventHandler<WebAccountMonitor?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1062977276_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1062977276_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_DefaultSignInAccountChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1062977276_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1062977276_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebAccountMonitor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1062977276_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountMonitor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7445f5fdaa9d46198d5dc138a4ede3e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountMonitor(ptr: Pointer?): WithDefault = IWebAccountMonitor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountMonitor {
      val address = segment.toRawLongValue()
      return makeIWebAccountMonitor(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1062977276_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountMonitor): Array<IWebAccountMonitor?> =
        (elements as
        Array<IWebAccountMonitor?>).castToImpl<IWebAccountMonitor,IWebAccountMonitor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountMonitor?> =
        arrayOfNulls<IWebAccountMonitor_Impl>(size) as Array<IWebAccountMonitor?>
  }
}
