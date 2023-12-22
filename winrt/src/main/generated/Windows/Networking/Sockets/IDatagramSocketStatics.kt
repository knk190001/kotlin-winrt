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

@ABIMarker(IDatagramSocketStatics.ABI::class)
@Signature("{e9c62aee-1494-4a21-bb7e-8589fc751d9d}")
@Guid("e9c62aee14944a21bb7e8589fc751d9d")
@WinRTInterface("e9c62aee14944a21bb7e8589fc751d9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatagramSocketStatics.ByReference::class)
public interface IDatagramSocketStatics : NativeMapped, IWinRTInterface {
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
      IByReference<IDatagramSocketStatics> {
    public override fun getValue() = ABI.makeIDatagramSocketStatics(pointer.getPointer(0))

    public fun setValue(value: IDatagramSocketStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatagramSocketStatics {
    public val __1520333415_Ptr: Pointer?

    public val _1520333415_VtblPtr: Pointer?
      get() = __1520333415_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetEndpointPairsAsync(remoteHostName: HostName?,
        remoteServiceName: String?): IAsyncOperation<IVectorView<EndpointPair?>?>? {
      val fnPtr = _1520333415_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<EndpointPair?>?>>()
      val hr = fn.invokeHR(arrayOf(__1520333415_Ptr, marshalToNative(remoteHostName),
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
      val fnPtr = _1520333415_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<EndpointPair?>?>>()
      val hr = fn.invokeHR(arrayOf(__1520333415_Ptr, marshalToNative(remoteHostName),
          marshalToNative(remoteServiceName), marshalToNative(sortOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<EndpointPair?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IDatagramSocketStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1520333415_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatagramSocketStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e9c62aee14944a21bb7e8589fc751d9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatagramSocketStatics(ptr: Pointer?): WithDefault =
        IDatagramSocketStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatagramSocketStatics {
      val address = segment.toRawLongValue()
      return makeIDatagramSocketStatics(Pointer(address))
    }

    public override fun toNative(obj: IDatagramSocketStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1520333415_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatagramSocketStatics): Array<IDatagramSocketStatics?> =
        (elements as
        Array<IDatagramSocketStatics?>).castToImpl<IDatagramSocketStatics,IDatagramSocketStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatagramSocketStatics?> =
        arrayOfNulls<IDatagramSocketStatics_Impl>(size) as Array<IDatagramSocketStatics?>
  }
}
