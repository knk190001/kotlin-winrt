package Windows.Devices.WiFiDirect.Services

import Windows.Foundation.Collections.IVectorView
import Windows.Networking.EndpointPair
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

@ABIMarker(IWiFiDirectServiceRemotePortAddedEventArgs.ABI::class)
@Signature("{d4cebac1-3fd3-4f0e-b7bd-782906f44411}")
@Guid("d4cebac13fd34f0eb7bd782906f44411")
@WinRTInterface("d4cebac13fd34f0eb7bd782906f44411")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectServiceRemotePortAddedEventArgs.ByReference::class)
public interface IWiFiDirectServiceRemotePortAddedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EndpointPairs(): IVectorView<EndpointPair?>?

  @InterfaceMethod(1)
  public fun get_Protocol(): WiFiDirectServiceIPProtocol?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectServiceRemotePortAddedEventArgs> {
    public override fun getValue() =
        ABI.makeIWiFiDirectServiceRemotePortAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectServiceRemotePortAddedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectServiceRemotePortAddedEventArgs {
    public val __2108814338_Ptr: Pointer?

    public val _2108814338_VtblPtr: Pointer?
      get() = __2108814338_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EndpointPairs(): IVectorView<EndpointPair?>? {
      val fnPtr = _2108814338_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<EndpointPair?>>()
      val hr = fn.invokeHR(arrayOf(__2108814338_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<EndpointPair?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Protocol(): WiFiDirectServiceIPProtocol? {
      val fnPtr = _2108814338_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectServiceIPProtocol>()
      val hr = fn.invokeHR(arrayOf(__2108814338_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectServiceIPProtocol>(result.getValue())
      return resultValue
    }
  }

  public class IWiFiDirectServiceRemotePortAddedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2108814338_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectServiceRemotePortAddedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4cebac13fd34f0eb7bd782906f44411")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectServiceRemotePortAddedEventArgs(ptr: Pointer?): WithDefault =
        IWiFiDirectServiceRemotePortAddedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWiFiDirectServiceRemotePortAddedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectServiceRemotePortAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectServiceRemotePortAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2108814338_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectServiceRemotePortAddedEventArgs):
        Array<IWiFiDirectServiceRemotePortAddedEventArgs?> = (elements as
        Array<IWiFiDirectServiceRemotePortAddedEventArgs?>).castToImpl<IWiFiDirectServiceRemotePortAddedEventArgs,IWiFiDirectServiceRemotePortAddedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectServiceRemotePortAddedEventArgs?> =
        arrayOfNulls<IWiFiDirectServiceRemotePortAddedEventArgs_Impl>(size) as
        Array<IWiFiDirectServiceRemotePortAddedEventArgs?>
  }
}
