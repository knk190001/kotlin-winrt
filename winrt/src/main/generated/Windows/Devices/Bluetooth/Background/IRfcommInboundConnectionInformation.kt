package Windows.Devices.Bluetooth.Background

import Windows.Devices.Bluetooth.BluetoothServiceCapabilities
import Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRfcommInboundConnectionInformation.ABI::class)
@Signature("{6d3e75a8-5429-4059-92e3-1e8b65528707}")
@Guid("6d3e75a85429405992e31e8b65528707")
@WinRTInterface("6d3e75a85429405992e31e8b65528707")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRfcommInboundConnectionInformation.ByReference::class)
public interface IRfcommInboundConnectionInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SdpRecord(): IBuffer?

  @InterfaceMethod(1)
  public fun put_SdpRecord(value: IBuffer?): Unit

  @InterfaceMethod(2)
  public fun get_LocalServiceId(): RfcommServiceId?

  @InterfaceMethod(3)
  public fun put_LocalServiceId(value: RfcommServiceId?): Unit

  @InterfaceMethod(4)
  public fun get_ServiceCapabilities(): BluetoothServiceCapabilities?

  @InterfaceMethod(5)
  public fun put_ServiceCapabilities(value: BluetoothServiceCapabilities?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRfcommInboundConnectionInformation> {
    public override fun getValue() =
        ABI.makeIRfcommInboundConnectionInformation(pointer.getPointer(0))

    public fun setValue(value: IRfcommInboundConnectionInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRfcommInboundConnectionInformation {
    public val __1898054188_Ptr: Pointer?

    public val _1898054188_VtblPtr: Pointer?
      get() = __1898054188_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SdpRecord(): IBuffer? {
      val fnPtr = _1898054188_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1898054188_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SdpRecord(value: IBuffer?): Unit {
      val fnPtr = _1898054188_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1898054188_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_LocalServiceId(): RfcommServiceId? {
      val fnPtr = _1898054188_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RfcommServiceId>()
      val hr = fn.invokeHR(arrayOf(__1898054188_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RfcommServiceId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_LocalServiceId(value: RfcommServiceId?): Unit {
      val fnPtr = _1898054188_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1898054188_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ServiceCapabilities(): BluetoothServiceCapabilities? {
      val fnPtr = _1898054188_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothServiceCapabilities>()
      val hr = fn.invokeHR(arrayOf(__1898054188_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothServiceCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ServiceCapabilities(value: BluetoothServiceCapabilities?): Unit {
      val fnPtr = _1898054188_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1898054188_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRfcommInboundConnectionInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1898054188_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRfcommInboundConnectionInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d3e75a85429405992e31e8b65528707")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRfcommInboundConnectionInformation(ptr: Pointer?): WithDefault =
        IRfcommInboundConnectionInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRfcommInboundConnectionInformation {
      val address = segment.toRawLongValue()
      return makeIRfcommInboundConnectionInformation(Pointer(address))
    }

    public override fun toNative(obj: IRfcommInboundConnectionInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1898054188_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRfcommInboundConnectionInformation):
        Array<IRfcommInboundConnectionInformation?> = (elements as
        Array<IRfcommInboundConnectionInformation?>).castToImpl<IRfcommInboundConnectionInformation,IRfcommInboundConnectionInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRfcommInboundConnectionInformation?> =
        arrayOfNulls<IRfcommInboundConnectionInformation_Impl>(size) as
        Array<IRfcommInboundConnectionInformation?>
  }
}
