package Windows.Networking.XboxLive

import Windows.Networking.HostName
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
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXboxLiveEndpointPairStatics.ABI::class)
@Signature("{64316b30-217a-4243-8ee1-6729281d27db}")
@Guid("64316b30217a42438ee16729281d27db")
@WinRTInterface("64316b30217a42438ee16729281d27db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXboxLiveEndpointPairStatics.ByReference::class)
public interface IXboxLiveEndpointPairStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindEndpointPairBySocketAddressBytes(localSocketAddress: Array<Byte>,
      remoteSocketAddress: Array<Byte>): XboxLiveEndpointPair?

  @InterfaceMethod(1)
  public fun FindEndpointPairByHostNamesAndPorts(
    localHostName: HostName?,
    localPort: String?,
    remoteHostName: HostName?,
    remotePort: String?
  ): XboxLiveEndpointPair?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXboxLiveEndpointPairStatics> {
    public override fun getValue() = ABI.makeIXboxLiveEndpointPairStatics(pointer.getPointer(0))

    public fun setValue(value: IXboxLiveEndpointPairStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXboxLiveEndpointPairStatics {
    public val __788788956_Ptr: Pointer?

    public val _788788956_VtblPtr: Pointer?
      get() = __788788956_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindEndpointPairBySocketAddressBytes(localSocketAddress: Array<Byte>,
        remoteSocketAddress: Array<Byte>): XboxLiveEndpointPair? {
      val fnPtr = _788788956_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveEndpointPair>()
      val hr = fn.invokeHR(arrayOf(__788788956_Ptr,
          localSocketAddress.size,marshalToNative(localSocketAddress),
          remoteSocketAddress.size,marshalToNative(remoteSocketAddress), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveEndpointPair>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindEndpointPairByHostNamesAndPorts(
      localHostName: HostName?,
      localPort: String?,
      remoteHostName: HostName?,
      remotePort: String?
    ): XboxLiveEndpointPair? {
      val fnPtr = _788788956_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveEndpointPair>()
      val hr = fn.invokeHR(arrayOf(__788788956_Ptr, marshalToNative(localHostName),
          marshalToNative(localPort), marshalToNative(remoteHostName), marshalToNative(remotePort),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveEndpointPair>(result.getValue())
      return resultValue
    }
  }

  public class IXboxLiveEndpointPairStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __788788956_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXboxLiveEndpointPairStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64316b30217a42438ee16729281d27db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXboxLiveEndpointPairStatics(ptr: Pointer?): WithDefault =
        IXboxLiveEndpointPairStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXboxLiveEndpointPairStatics {
      val address = segment.toRawLongValue()
      return makeIXboxLiveEndpointPairStatics(Pointer(address))
    }

    public override fun toNative(obj: IXboxLiveEndpointPairStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__788788956_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXboxLiveEndpointPairStatics):
        Array<IXboxLiveEndpointPairStatics?> = (elements as
        Array<IXboxLiveEndpointPairStatics?>).castToImpl<IXboxLiveEndpointPairStatics,IXboxLiveEndpointPairStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXboxLiveEndpointPairStatics?> =
        arrayOfNulls<IXboxLiveEndpointPairStatics_Impl>(size) as
        Array<IXboxLiveEndpointPairStatics?>
  }
}
