package Windows.Devices.Usb

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IUsbInterface.ABI::class)
@Signature("{a0322b95-7f47-48ab-a727-678c25be2112}")
@Guid("a0322b957f4748aba727678c25be2112")
@WinRTInterface("a0322b957f4748aba727678c25be2112")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbInterface.ByReference::class)
public interface IUsbInterface : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BulkInPipes(): IVectorView<UsbBulkInPipe?>?

  @InterfaceMethod(1)
  public fun get_InterruptInPipes(): IVectorView<UsbInterruptInPipe?>?

  @InterfaceMethod(2)
  public fun get_BulkOutPipes(): IVectorView<UsbBulkOutPipe?>?

  @InterfaceMethod(3)
  public fun get_InterruptOutPipes(): IVectorView<UsbInterruptOutPipe?>?

  @InterfaceMethod(4)
  public fun get_InterfaceSettings(): IVectorView<UsbInterfaceSetting?>?

  @InterfaceMethod(5)
  public fun get_InterfaceNumber(): Byte

  @InterfaceMethod(6)
  public fun get_Descriptors(): IVectorView<UsbDescriptor?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUsbInterface>
      {
    public override fun getValue() = ABI.makeIUsbInterface(pointer.getPointer(0))

    public fun setValue(value: IUsbInterface_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbInterface {
    public val __463442518_Ptr: Pointer?

    public val _463442518_VtblPtr: Pointer?
      get() = __463442518_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BulkInPipes(): IVectorView<UsbBulkInPipe?>? {
      val fnPtr = _463442518_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UsbBulkInPipe?>>()
      val hr = fn.invokeHR(arrayOf(__463442518_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UsbBulkInPipe?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InterruptInPipes(): IVectorView<UsbInterruptInPipe?>? {
      val fnPtr = _463442518_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UsbInterruptInPipe?>>()
      val hr = fn.invokeHR(arrayOf(__463442518_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UsbInterruptInPipe?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BulkOutPipes(): IVectorView<UsbBulkOutPipe?>? {
      val fnPtr = _463442518_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UsbBulkOutPipe?>>()
      val hr = fn.invokeHR(arrayOf(__463442518_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UsbBulkOutPipe?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_InterruptOutPipes(): IVectorView<UsbInterruptOutPipe?>? {
      val fnPtr = _463442518_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UsbInterruptOutPipe?>>()
      val hr = fn.invokeHR(arrayOf(__463442518_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UsbInterruptOutPipe?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_InterfaceSettings(): IVectorView<UsbInterfaceSetting?>? {
      val fnPtr = _463442518_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UsbInterfaceSetting?>>()
      val hr = fn.invokeHR(arrayOf(__463442518_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UsbInterfaceSetting?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_InterfaceNumber(): Byte {
      val fnPtr = _463442518_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__463442518_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_Descriptors(): IVectorView<UsbDescriptor?>? {
      val fnPtr = _463442518_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UsbDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__463442518_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UsbDescriptor?>>(result.getValue())
      return resultValue
    }
  }

  public class IUsbInterface_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __463442518_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbInterface, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a0322b957f4748aba727678c25be2112")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbInterface(ptr: Pointer?): WithDefault = IUsbInterface_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbInterface {
      val address = segment.toRawLongValue()
      return makeIUsbInterface(Pointer(address))
    }

    public override fun toNative(obj: IUsbInterface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__463442518_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbInterface): Array<IUsbInterface?> = (elements as
        Array<IUsbInterface?>).castToImpl<IUsbInterface,IUsbInterface_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbInterface?> =
        arrayOfNulls<IUsbInterface_Impl>(size) as Array<IUsbInterface?>
  }
}
