package Windows.Networking.Sockets

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IServerStreamWebSocketInformation.ABI::class)
@Signature("{fc32b45f-4448-5505-6cc9-09aba8915f5d}")
@Guid("fc32b45f444855056cc909aba8915f5d")
@WinRTInterface("fc32b45f444855056cc909aba8915f5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IServerStreamWebSocketInformation.ByReference::class)
public interface IServerStreamWebSocketInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BandwidthStatistics(): BandwidthStatistics?

  @InterfaceMethod(1)
  public fun get_Protocol(): String?

  @InterfaceMethod(2)
  public fun get_LocalAddress(): HostName?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IServerStreamWebSocketInformation> {
    public override fun getValue() =
        ABI.makeIServerStreamWebSocketInformation(pointer.getPointer(0))

    public fun setValue(value: IServerStreamWebSocketInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IServerStreamWebSocketInformation {
    public val __1735632192_Ptr: Pointer?

    public val _1735632192_VtblPtr: Pointer?
      get() = __1735632192_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BandwidthStatistics(): BandwidthStatistics? {
      val fnPtr = _1735632192_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BandwidthStatistics>()
      val hr = fn.invokeHR(arrayOf(__1735632192_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BandwidthStatistics>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Protocol(): String? {
      val fnPtr = _1735632192_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1735632192_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LocalAddress(): HostName? {
      val fnPtr = _1735632192_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__1735632192_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }
  }

  public class IServerStreamWebSocketInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1735632192_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IServerStreamWebSocketInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fc32b45f444855056cc909aba8915f5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIServerStreamWebSocketInformation(ptr: Pointer?): WithDefault =
        IServerStreamWebSocketInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IServerStreamWebSocketInformation {
      val address = segment.toRawLongValue()
      return makeIServerStreamWebSocketInformation(Pointer(address))
    }

    public override fun toNative(obj: IServerStreamWebSocketInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1735632192_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IServerStreamWebSocketInformation):
        Array<IServerStreamWebSocketInformation?> = (elements as
        Array<IServerStreamWebSocketInformation?>).castToImpl<IServerStreamWebSocketInformation,IServerStreamWebSocketInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IServerStreamWebSocketInformation?> =
        arrayOfNulls<IServerStreamWebSocketInformation_Impl>(size) as
        Array<IServerStreamWebSocketInformation?>
  }
}
