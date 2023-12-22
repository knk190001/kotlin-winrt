package Windows.Networking.Sockets

import Windows.Networking.HostName
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IStreamSocketInformation.ABI::class)
@Signature("{3b80ae30-5e68-4205-88f0-dc85d2e25ded}")
@Guid("3b80ae305e68420588f0dc85d2e25ded")
@WinRTInterface("3b80ae305e68420588f0dc85d2e25ded")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocketInformation.ByReference::class)
public interface IStreamSocketInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalAddress(): HostName?

  @InterfaceMethod(1)
  public fun get_LocalPort(): String?

  @InterfaceMethod(2)
  public fun get_RemoteHostName(): HostName?

  @InterfaceMethod(3)
  public fun get_RemoteAddress(): HostName?

  @InterfaceMethod(4)
  public fun get_RemoteServiceName(): String?

  @InterfaceMethod(5)
  public fun get_RemotePort(): String?

  @InterfaceMethod(6)
  public fun get_RoundTripTimeStatistics(): RoundTripTimeStatistics?

  @InterfaceMethod(7)
  public fun get_BandwidthStatistics(): BandwidthStatistics?

  @InterfaceMethod(8)
  public fun get_ProtectionLevel(): SocketProtectionLevel?

  @InterfaceMethod(9)
  public fun get_SessionKey(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamSocketInformation> {
    public override fun getValue() = ABI.makeIStreamSocketInformation(pointer.getPointer(0))

    public fun setValue(value: IStreamSocketInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocketInformation {
    public val __80092769_Ptr: Pointer?

    public val _80092769_VtblPtr: Pointer?
      get() = __80092769_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalAddress(): HostName? {
      val fnPtr = _80092769_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__80092769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LocalPort(): String? {
      val fnPtr = _80092769_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__80092769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RemoteHostName(): HostName? {
      val fnPtr = _80092769_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__80092769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RemoteAddress(): HostName? {
      val fnPtr = _80092769_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__80092769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_RemoteServiceName(): String? {
      val fnPtr = _80092769_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__80092769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RemotePort(): String? {
      val fnPtr = _80092769_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__80092769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_RoundTripTimeStatistics(): RoundTripTimeStatistics? {
      val fnPtr = _80092769_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoundTripTimeStatistics>()
      val hr = fn.invokeHR(arrayOf(__80092769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoundTripTimeStatistics>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_BandwidthStatistics(): BandwidthStatistics? {
      val fnPtr = _80092769_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BandwidthStatistics>()
      val hr = fn.invokeHR(arrayOf(__80092769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BandwidthStatistics>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ProtectionLevel(): SocketProtectionLevel? {
      val fnPtr = _80092769_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__80092769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_SessionKey(): IBuffer? {
      val fnPtr = _80092769_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__80092769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IStreamSocketInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __80092769_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocketInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b80ae305e68420588f0dc85d2e25ded")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocketInformation(ptr: Pointer?): WithDefault =
        IStreamSocketInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocketInformation {
      val address = segment.toRawLongValue()
      return makeIStreamSocketInformation(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocketInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__80092769_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocketInformation):
        Array<IStreamSocketInformation?> = (elements as
        Array<IStreamSocketInformation?>).castToImpl<IStreamSocketInformation,IStreamSocketInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocketInformation?> =
        arrayOfNulls<IStreamSocketInformation_Impl>(size) as Array<IStreamSocketInformation?>
  }
}
