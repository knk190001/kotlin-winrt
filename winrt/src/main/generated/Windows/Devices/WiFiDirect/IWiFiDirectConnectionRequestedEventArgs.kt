package Windows.Devices.WiFiDirect

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

@ABIMarker(IWiFiDirectConnectionRequestedEventArgs.ABI::class)
@Signature("{f99d20be-d38d-484f-8215-e7b65abf244c}")
@Guid("f99d20bed38d484f8215e7b65abf244c")
@WinRTInterface("f99d20bed38d484f8215e7b65abf244c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectConnectionRequestedEventArgs.ByReference::class)
public interface IWiFiDirectConnectionRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetConnectionRequest(): WiFiDirectConnectionRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectConnectionRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIWiFiDirectConnectionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectConnectionRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectConnectionRequestedEventArgs {
    public val __354216564_Ptr: Pointer?

    public val _354216564_VtblPtr: Pointer?
      get() = __354216564_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetConnectionRequest(): WiFiDirectConnectionRequest? {
      val fnPtr = _354216564_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectConnectionRequest>()
      val hr = fn.invokeHR(arrayOf(__354216564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectConnectionRequest>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectConnectionRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __354216564_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectConnectionRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f99d20bed38d484f8215e7b65abf244c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectConnectionRequestedEventArgs(ptr: Pointer?): WithDefault =
        IWiFiDirectConnectionRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWiFiDirectConnectionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectConnectionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectConnectionRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__354216564_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectConnectionRequestedEventArgs):
        Array<IWiFiDirectConnectionRequestedEventArgs?> = (elements as
        Array<IWiFiDirectConnectionRequestedEventArgs?>).castToImpl<IWiFiDirectConnectionRequestedEventArgs,IWiFiDirectConnectionRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectConnectionRequestedEventArgs?> =
        arrayOfNulls<IWiFiDirectConnectionRequestedEventArgs_Impl>(size) as
        Array<IWiFiDirectConnectionRequestedEventArgs?>
  }
}
