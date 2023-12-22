package Windows.Networking.Sockets

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Networking.EndpointPair
import Windows.Networking.HostName
import Windows.Networking.HostNameSortOptions
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStreamSocketStatics.ABI::class)
@Signature("{a420bc4a-6e2e-4af5-b556-355ae0cd4f29}")
@Guid("a420bc4a6e2e4af5b556355ae0cd4f29")
@WinRTInterface("a420bc4a6e2e4af5b556355ae0cd4f29")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocketStatics.ByReference::class)
public interface IStreamSocketStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetEndpointPairsAsync(remoteHostName: HostName?, remoteServiceName: String?):
      IAsyncOperation<IVectorView<EndpointPair?>?>?

  @InterfaceMethod(1)
  public fun GetEndpointPairsAsync(
    remoteHostName: HostName?,
    remoteServiceName: String?,
    sortOptions: HostNameSortOptions?
  ): IAsyncOperation<IVectorView<EndpointPair?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamSocketStatics> {
    public override fun getValue() = ABI.makeIStreamSocketStatics(pointer.getPointer(0))

    public fun setValue(value: IStreamSocketStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocketStatics {
    public val __950176634_Ptr: Pointer?

    public val _950176634_VtblPtr: Pointer?
      get() = __950176634_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetEndpointPairsAsync(remoteHostName: HostName?,
        remoteServiceName: String?): IAsyncOperation<IVectorView<EndpointPair?>?>? {
      val fnPtr = _950176634_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<EndpointPair?>?>>()
      val hr = fn.invokeHR(arrayOf(__950176634_Ptr, marshalToNative(remoteHostName),
          marshalToNative(remoteServiceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<EndpointPair?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetEndpointPairsAsync(
      remoteHostName: HostName?,
      remoteServiceName: String?,
      sortOptions: HostNameSortOptions?
    ): IAsyncOperation<IVectorView<EndpointPair?>?>? {
      val fnPtr = _950176634_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<EndpointPair?>?>>()
      val hr = fn.invokeHR(arrayOf(__950176634_Ptr, marshalToNative(remoteHostName),
          marshalToNative(remoteServiceName), marshalToNative(sortOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<EndpointPair?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IStreamSocketStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __950176634_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocketStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a420bc4a6e2e4af5b556355ae0cd4f29")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocketStatics(ptr: Pointer?): WithDefault = IStreamSocketStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocketStatics {
      val address = segment.toRawLongValue()
      return makeIStreamSocketStatics(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocketStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__950176634_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocketStatics): Array<IStreamSocketStatics?> =
        (elements as
        Array<IStreamSocketStatics?>).castToImpl<IStreamSocketStatics,IStreamSocketStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocketStatics?> =
        arrayOfNulls<IStreamSocketStatics_Impl>(size) as Array<IStreamSocketStatics?>
  }
}
