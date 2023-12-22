package Windows.Networking

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

@ABIMarker(IEndpointPairFactory.ABI::class)
@Signature("{b609d971-64e0-442b-aa6f-cc8c8f181f78}")
@Guid("b609d97164e0442baa6fcc8c8f181f78")
@WinRTInterface("b609d97164e0442baa6fcc8c8f181f78")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEndpointPairFactory.ByReference::class)
public interface IEndpointPairFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateEndpointPair(
    localHostName: HostName?,
    localServiceName: String?,
    remoteHostName: HostName?,
    remoteServiceName: String?
  ): EndpointPair?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEndpointPairFactory> {
    public override fun getValue() = ABI.makeIEndpointPairFactory(pointer.getPointer(0))

    public fun setValue(value: IEndpointPairFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEndpointPairFactory {
    public val __953379087_Ptr: Pointer?

    public val _953379087_VtblPtr: Pointer?
      get() = __953379087_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateEndpointPair(
      localHostName: HostName?,
      localServiceName: String?,
      remoteHostName: HostName?,
      remoteServiceName: String?
    ): EndpointPair? {
      val fnPtr = _953379087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EndpointPair>()
      val hr = fn.invokeHR(arrayOf(__953379087_Ptr, marshalToNative(localHostName),
          marshalToNative(localServiceName), marshalToNative(remoteHostName),
          marshalToNative(remoteServiceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EndpointPair>(result.getValue())
      return resultValue
    }
  }

  public class IEndpointPairFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __953379087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEndpointPairFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b609d97164e0442baa6fcc8c8f181f78")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEndpointPairFactory(ptr: Pointer?): WithDefault = IEndpointPairFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEndpointPairFactory {
      val address = segment.toRawLongValue()
      return makeIEndpointPairFactory(Pointer(address))
    }

    public override fun toNative(obj: IEndpointPairFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__953379087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEndpointPairFactory): Array<IEndpointPairFactory?> =
        (elements as
        Array<IEndpointPairFactory?>).castToImpl<IEndpointPairFactory,IEndpointPairFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEndpointPairFactory?> =
        arrayOfNulls<IEndpointPairFactory_Impl>(size) as Array<IEndpointPairFactory?>
  }
}
