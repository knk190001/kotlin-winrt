package Windows.Networking.ServiceDiscovery.Dnssd

import Windows.Foundation.Collections.IMap
import Windows.Foundation.IAsyncOperation
import Windows.Networking.Connectivity.NetworkAdapter
import Windows.Networking.HostName
import Windows.Networking.Sockets.DatagramSocket
import Windows.Networking.Sockets.StreamSocketListener
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IDnssdServiceInstance.ABI::class)
@Signature("{e246db7e-98a5-4ca1-b9e4-c253d33c35ff}")
@Guid("e246db7e98a54ca1b9e4c253d33c35ff")
@WinRTInterface("e246db7e98a54ca1b9e4c253d33c35ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDnssdServiceInstance.ByReference::class)
public interface IDnssdServiceInstance : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DnssdServiceInstanceName(): String?

  @InterfaceMethod(1)
  public fun put_DnssdServiceInstanceName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_HostName(): HostName?

  @InterfaceMethod(3)
  public fun put_HostName(value: HostName?): Unit

  @InterfaceMethod(4)
  public fun get_Port(): WinDef.USHORT

  @InterfaceMethod(5)
  public fun put_Port(value: WinDef.USHORT): Unit

  @InterfaceMethod(6)
  public fun get_Priority(): WinDef.USHORT

  @InterfaceMethod(7)
  public fun put_Priority(value: WinDef.USHORT): Unit

  @InterfaceMethod(8)
  public fun get_Weight(): WinDef.USHORT

  @InterfaceMethod(9)
  public fun put_Weight(value: WinDef.USHORT): Unit

  @InterfaceMethod(10)
  public fun get_TextAttributes(): IMap<String?, String?>?

  @InterfaceMethod(11)
  public fun RegisterStreamSocketListenerAsync(socket: StreamSocketListener?):
      IAsyncOperation<DnssdRegistrationResult?>?

  @InterfaceMethod(12)
  public fun RegisterStreamSocketListenerAsync(socket: StreamSocketListener?,
      adapter: NetworkAdapter?): IAsyncOperation<DnssdRegistrationResult?>?

  @InterfaceMethod(13)
  public fun RegisterDatagramSocketAsync(socket: DatagramSocket?):
      IAsyncOperation<DnssdRegistrationResult?>?

  @InterfaceMethod(14)
  public fun RegisterDatagramSocketAsync(socket: DatagramSocket?, adapter: NetworkAdapter?):
      IAsyncOperation<DnssdRegistrationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDnssdServiceInstance> {
    public override fun getValue() = ABI.makeIDnssdServiceInstance(pointer.getPointer(0))

    public fun setValue(value: IDnssdServiceInstance_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDnssdServiceInstance {
    public val __1822759459_Ptr: Pointer?

    public val _1822759459_VtblPtr: Pointer?
      get() = __1822759459_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DnssdServiceInstanceName(): String? {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DnssdServiceInstanceName(value: String?): Unit {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HostName(): HostName? {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_HostName(value: HostName?): Unit {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Port(): WinDef.USHORT {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Port(value: WinDef.USHORT): Unit {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Priority(): WinDef.USHORT {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Priority(value: WinDef.USHORT): Unit {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Weight(): WinDef.USHORT {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_Weight(value: WinDef.USHORT): Unit {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_TextAttributes(): IMap<String?, String?>? {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun RegisterStreamSocketListenerAsync(socket: StreamSocketListener?):
        IAsyncOperation<DnssdRegistrationResult?>? {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DnssdRegistrationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr, marshalToNative(socket), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<DnssdRegistrationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun RegisterStreamSocketListenerAsync(socket: StreamSocketListener?,
        adapter: NetworkAdapter?): IAsyncOperation<DnssdRegistrationResult?>? {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DnssdRegistrationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr, marshalToNative(socket),
          marshalToNative(adapter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<DnssdRegistrationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun RegisterDatagramSocketAsync(socket: DatagramSocket?):
        IAsyncOperation<DnssdRegistrationResult?>? {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DnssdRegistrationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr, marshalToNative(socket), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<DnssdRegistrationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun RegisterDatagramSocketAsync(socket: DatagramSocket?,
        adapter: NetworkAdapter?): IAsyncOperation<DnssdRegistrationResult?>? {
      val fnPtr = _1822759459_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DnssdRegistrationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1822759459_Ptr, marshalToNative(socket),
          marshalToNative(adapter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<DnssdRegistrationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IDnssdServiceInstance_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1822759459_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDnssdServiceInstance, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e246db7e98a54ca1b9e4c253d33c35ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDnssdServiceInstance(ptr: Pointer?): WithDefault =
        IDnssdServiceInstance_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDnssdServiceInstance {
      val address = segment.toRawLongValue()
      return makeIDnssdServiceInstance(Pointer(address))
    }

    public override fun toNative(obj: IDnssdServiceInstance): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1822759459_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDnssdServiceInstance): Array<IDnssdServiceInstance?> =
        (elements as
        Array<IDnssdServiceInstance?>).castToImpl<IDnssdServiceInstance,IDnssdServiceInstance_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDnssdServiceInstance?> =
        arrayOfNulls<IDnssdServiceInstance_Impl>(size) as Array<IDnssdServiceInstance?>
  }
}
