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

@ABIMarker(IUsbControlRequestType.ABI::class)
@Signature("{8e9465a6-d73d-46de-94be-aae7f07c0f5c}")
@Guid("8e9465a6d73d46de94beaae7f07c0f5c")
@WinRTInterface("8e9465a6d73d46de94beaae7f07c0f5c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbControlRequestType.ByReference::class)
public interface IUsbControlRequestType : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Direction(): UsbTransferDirection?

  @InterfaceMethod(1)
  public fun put_Direction(value: UsbTransferDirection?): Unit

  @InterfaceMethod(2)
  public fun get_ControlTransferType(): UsbControlTransferType?

  @InterfaceMethod(3)
  public fun put_ControlTransferType(value: UsbControlTransferType?): Unit

  @InterfaceMethod(4)
  public fun get_Recipient(): UsbControlRecipient?

  @InterfaceMethod(5)
  public fun put_Recipient(value: UsbControlRecipient?): Unit

  @InterfaceMethod(6)
  public fun get_AsByte(): Byte

  @InterfaceMethod(7)
  public fun put_AsByte(value: Byte): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbControlRequestType> {
    public override fun getValue() = ABI.makeIUsbControlRequestType(pointer.getPointer(0))

    public fun setValue(value: IUsbControlRequestType_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbControlRequestType {
    public val __1813473201_Ptr: Pointer?

    public val _1813473201_VtblPtr: Pointer?
      get() = __1813473201_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Direction(): UsbTransferDirection? {
      val fnPtr = _1813473201_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbTransferDirection>()
      val hr = fn.invokeHR(arrayOf(__1813473201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbTransferDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Direction(value: UsbTransferDirection?): Unit {
      val fnPtr = _1813473201_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1813473201_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ControlTransferType(): UsbControlTransferType? {
      val fnPtr = _1813473201_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbControlTransferType>()
      val hr = fn.invokeHR(arrayOf(__1813473201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbControlTransferType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ControlTransferType(value: UsbControlTransferType?): Unit {
      val fnPtr = _1813473201_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1813473201_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Recipient(): UsbControlRecipient? {
      val fnPtr = _1813473201_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbControlRecipient>()
      val hr = fn.invokeHR(arrayOf(__1813473201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbControlRecipient>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Recipient(value: UsbControlRecipient?): Unit {
      val fnPtr = _1813473201_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1813473201_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AsByte(): Byte {
      val fnPtr = _1813473201_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1813473201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_AsByte(value: Byte): Unit {
      val fnPtr = _1813473201_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1813473201_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUsbControlRequestType_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813473201_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbControlRequestType, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e9465a6d73d46de94beaae7f07c0f5c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbControlRequestType(ptr: Pointer?): WithDefault =
        IUsbControlRequestType_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbControlRequestType {
      val address = segment.toRawLongValue()
      return makeIUsbControlRequestType(Pointer(address))
    }

    public override fun toNative(obj: IUsbControlRequestType): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813473201_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbControlRequestType): Array<IUsbControlRequestType?> =
        (elements as
        Array<IUsbControlRequestType?>).castToImpl<IUsbControlRequestType,IUsbControlRequestType_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbControlRequestType?> =
        arrayOfNulls<IUsbControlRequestType_Impl>(size) as Array<IUsbControlRequestType?>
  }
}
