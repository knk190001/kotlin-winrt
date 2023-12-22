package Windows.Devices.Bluetooth.Rfcomm

import Windows.Devices.Bluetooth.BluetoothCacheMode
import Windows.Foundation.Collections.IMapView
import Windows.Foundation.IAsyncOperation
import Windows.Networking.HostName
import Windows.Networking.Sockets.SocketProtectionLevel
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

@ABIMarker(IRfcommDeviceService.ABI::class)
@Signature("{ae81ff1f-c5a1-4c40-8c28-f3efd69062f3}")
@Guid("ae81ff1fc5a14c408c28f3efd69062f3")
@WinRTInterface("ae81ff1fc5a14c408c28f3efd69062f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRfcommDeviceService.ByReference::class)
public interface IRfcommDeviceService : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ConnectionHostName(): HostName?

  @InterfaceMethod(1)
  public fun get_ConnectionServiceName(): String?

  @InterfaceMethod(2)
  public fun get_ServiceId(): RfcommServiceId?

  @InterfaceMethod(3)
  public fun get_ProtectionLevel(): SocketProtectionLevel?

  @InterfaceMethod(4)
  public fun get_MaxProtectionLevel(): SocketProtectionLevel?

  @InterfaceMethod(5)
  public fun GetSdpRawAttributesAsync(): IAsyncOperation<IMapView<WinDef.UINT, IBuffer?>?>?

  @InterfaceMethod(6)
  public fun GetSdpRawAttributesAsync(cacheMode: BluetoothCacheMode?):
      IAsyncOperation<IMapView<WinDef.UINT, IBuffer?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRfcommDeviceService> {
    public override fun getValue() = ABI.makeIRfcommDeviceService(pointer.getPointer(0))

    public fun setValue(value: IRfcommDeviceService_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRfcommDeviceService {
    public val __1202125806_Ptr: Pointer?

    public val _1202125806_VtblPtr: Pointer?
      get() = __1202125806_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConnectionHostName(): HostName? {
      val fnPtr = _1202125806_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__1202125806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ConnectionServiceName(): String? {
      val fnPtr = _1202125806_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1202125806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ServiceId(): RfcommServiceId? {
      val fnPtr = _1202125806_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RfcommServiceId>()
      val hr = fn.invokeHR(arrayOf(__1202125806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RfcommServiceId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ProtectionLevel(): SocketProtectionLevel? {
      val fnPtr = _1202125806_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__1202125806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MaxProtectionLevel(): SocketProtectionLevel? {
      val fnPtr = _1202125806_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__1202125806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetSdpRawAttributesAsync(): IAsyncOperation<IMapView<WinDef.UINT,
        IBuffer?>?>? {
      val fnPtr = _1202125806_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IMapView<WinDef.UINT, IBuffer?>?>>()
      val hr = fn.invokeHR(arrayOf(__1202125806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IMapView<WinDef.UINT,
          IBuffer?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetSdpRawAttributesAsync(cacheMode: BluetoothCacheMode?):
        IAsyncOperation<IMapView<WinDef.UINT, IBuffer?>?>? {
      val fnPtr = _1202125806_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IMapView<WinDef.UINT, IBuffer?>?>>()
      val hr = fn.invokeHR(arrayOf(__1202125806_Ptr, marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IMapView<WinDef.UINT,
          IBuffer?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IRfcommDeviceService_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1202125806_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRfcommDeviceService, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae81ff1fc5a14c408c28f3efd69062f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRfcommDeviceService(ptr: Pointer?): WithDefault = IRfcommDeviceService_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRfcommDeviceService {
      val address = segment.toRawLongValue()
      return makeIRfcommDeviceService(Pointer(address))
    }

    public override fun toNative(obj: IRfcommDeviceService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1202125806_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRfcommDeviceService): Array<IRfcommDeviceService?> =
        (elements as
        Array<IRfcommDeviceService?>).castToImpl<IRfcommDeviceService,IRfcommDeviceService_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRfcommDeviceService?> =
        arrayOfNulls<IRfcommDeviceService_Impl>(size) as Array<IRfcommDeviceService?>
  }
}
