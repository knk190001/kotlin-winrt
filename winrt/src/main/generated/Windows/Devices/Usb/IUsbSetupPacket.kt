package Windows.Devices.Usb

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUsbSetupPacket.ABI::class)
@Signature("{104ba132-c78f-4c51-b654-e49d02f2cb03}")
@Guid("104ba132c78f4c51b654e49d02f2cb03")
@WinRTInterface("104ba132c78f4c51b654e49d02f2cb03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbSetupPacket.ByReference::class)
public interface IUsbSetupPacket : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequestType(): UsbControlRequestType?

  @InterfaceMethod(1)
  public fun put_RequestType(value: UsbControlRequestType?): Unit

  @InterfaceMethod(2)
  public fun get_Request(): Byte

  @InterfaceMethod(3)
  public fun put_Request(value: Byte): Unit

  @InterfaceMethod(4)
  public fun get_Value(): WinDef.UINT

  @InterfaceMethod(5)
  public fun put_Value(value: WinDef.UINT): Unit

  @InterfaceMethod(6)
  public fun get_Index(): WinDef.UINT

  @InterfaceMethod(7)
  public fun put_Index(value: WinDef.UINT): Unit

  @InterfaceMethod(8)
  public fun get_Length(): WinDef.UINT

  @InterfaceMethod(9)
  public fun put_Length(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbSetupPacket> {
    public override fun getValue() = ABI.makeIUsbSetupPacket(pointer.getPointer(0))

    public fun setValue(value: IUsbSetupPacket_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbSetupPacket {
    public val __619039934_Ptr: Pointer?

    public val _619039934_VtblPtr: Pointer?
      get() = __619039934_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestType(): UsbControlRequestType? {
      val fnPtr = _619039934_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbControlRequestType>()
      val hr = fn.invokeHR(arrayOf(__619039934_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbControlRequestType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_RequestType(value: UsbControlRequestType?): Unit {
      val fnPtr = _619039934_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__619039934_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Request(): Byte {
      val fnPtr = _619039934_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__619039934_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Request(value: Byte): Unit {
      val fnPtr = _619039934_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__619039934_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Value(): WinDef.UINT {
      val fnPtr = _619039934_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__619039934_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Value(value: WinDef.UINT): Unit {
      val fnPtr = _619039934_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__619039934_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Index(): WinDef.UINT {
      val fnPtr = _619039934_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__619039934_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Index(value: WinDef.UINT): Unit {
      val fnPtr = _619039934_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__619039934_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Length(): WinDef.UINT {
      val fnPtr = _619039934_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__619039934_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_Length(value: WinDef.UINT): Unit {
      val fnPtr = _619039934_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__619039934_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUsbSetupPacket_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __619039934_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbSetupPacket, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("104ba132c78f4c51b654e49d02f2cb03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbSetupPacket(ptr: Pointer?): WithDefault = IUsbSetupPacket_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbSetupPacket {
      val address = segment.toRawLongValue()
      return makeIUsbSetupPacket(Pointer(address))
    }

    public override fun toNative(obj: IUsbSetupPacket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__619039934_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbSetupPacket): Array<IUsbSetupPacket?> = (elements as
        Array<IUsbSetupPacket?>).castToImpl<IUsbSetupPacket,IUsbSetupPacket_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbSetupPacket?> =
        arrayOfNulls<IUsbSetupPacket_Impl>(size) as Array<IUsbSetupPacket?>
  }
}
