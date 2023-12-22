package Windows.System.Diagnostics.DevicePortal

import Windows.Web.Http.HttpRequestMessage
import Windows.Web.Http.HttpResponseMessage
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

@ABIMarker(IDevicePortalConnectionRequestReceivedEventArgs.ABI::class)
@Signature("{64dae045-6fda-4459-9ebd-ecce22e38559}")
@Guid("64dae0456fda44599ebdecce22e38559")
@WinRTInterface("64dae0456fda44599ebdecce22e38559")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDevicePortalConnectionRequestReceivedEventArgs.ByReference::class)
public interface IDevicePortalConnectionRequestReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequestMessage(): HttpRequestMessage?

  @InterfaceMethod(1)
  public fun get_ResponseMessage(): HttpResponseMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDevicePortalConnectionRequestReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIDevicePortalConnectionRequestReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDevicePortalConnectionRequestReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDevicePortalConnectionRequestReceivedEventArgs {
    public val __910125240_Ptr: Pointer?

    public val _910125240_VtblPtr: Pointer?
      get() = __910125240_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestMessage(): HttpRequestMessage? {
      val fnPtr = _910125240_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpRequestMessage>()
      val hr = fn.invokeHR(arrayOf(__910125240_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpRequestMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ResponseMessage(): HttpResponseMessage? {
      val fnPtr = _910125240_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpResponseMessage>()
      val hr = fn.invokeHR(arrayOf(__910125240_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpResponseMessage>(result.getValue())
      return resultValue
    }
  }

  public class IDevicePortalConnectionRequestReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __910125240_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDevicePortalConnectionRequestReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64dae0456fda44599ebdecce22e38559")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDevicePortalConnectionRequestReceivedEventArgs(ptr: Pointer?): WithDefault =
        IDevicePortalConnectionRequestReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDevicePortalConnectionRequestReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDevicePortalConnectionRequestReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDevicePortalConnectionRequestReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__910125240_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDevicePortalConnectionRequestReceivedEventArgs):
        Array<IDevicePortalConnectionRequestReceivedEventArgs?> = (elements as
        Array<IDevicePortalConnectionRequestReceivedEventArgs?>).castToImpl<IDevicePortalConnectionRequestReceivedEventArgs,IDevicePortalConnectionRequestReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDevicePortalConnectionRequestReceivedEventArgs?>
        = arrayOfNulls<IDevicePortalConnectionRequestReceivedEventArgs_Impl>(size) as
        Array<IDevicePortalConnectionRequestReceivedEventArgs?>
  }
}
