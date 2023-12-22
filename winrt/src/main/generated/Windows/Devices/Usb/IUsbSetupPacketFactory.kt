package Windows.Devices.Usb

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

@ABIMarker(IUsbSetupPacketFactory.ABI::class)
@Signature("{c9257d50-1b2e-4a41-a2a7-338f0cef3c14}")
@Guid("c9257d501b2e4a41a2a7338f0cef3c14")
@WinRTInterface("c9257d501b2e4a41a2a7338f0cef3c14")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbSetupPacketFactory.ByReference::class)
public interface IUsbSetupPacketFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithEightByteBuffer(eightByteBuffer: IBuffer?): UsbSetupPacket?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbSetupPacketFactory> {
    public override fun getValue() = ABI.makeIUsbSetupPacketFactory(pointer.getPointer(0))

    public fun setValue(value: IUsbSetupPacketFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbSetupPacketFactory {
    public val __432523112_Ptr: Pointer?

    public val _432523112_VtblPtr: Pointer?
      get() = __432523112_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithEightByteBuffer(eightByteBuffer: IBuffer?): UsbSetupPacket? {
      val fnPtr = _432523112_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbSetupPacket>()
      val hr = fn.invokeHR(arrayOf(__432523112_Ptr, marshalToNative(eightByteBuffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbSetupPacket>(result.getValue())
      return resultValue
    }
  }

  public class IUsbSetupPacketFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __432523112_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbSetupPacketFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9257d501b2e4a41a2a7338f0cef3c14")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbSetupPacketFactory(ptr: Pointer?): WithDefault =
        IUsbSetupPacketFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbSetupPacketFactory {
      val address = segment.toRawLongValue()
      return makeIUsbSetupPacketFactory(Pointer(address))
    }

    public override fun toNative(obj: IUsbSetupPacketFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__432523112_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbSetupPacketFactory): Array<IUsbSetupPacketFactory?> =
        (elements as
        Array<IUsbSetupPacketFactory?>).castToImpl<IUsbSetupPacketFactory,IUsbSetupPacketFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbSetupPacketFactory?> =
        arrayOfNulls<IUsbSetupPacketFactory_Impl>(size) as Array<IUsbSetupPacketFactory?>
  }
}
