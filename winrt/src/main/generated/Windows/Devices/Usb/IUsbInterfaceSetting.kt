package Windows.Devices.Usb

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUsbInterfaceSetting.ABI::class)
@Signature("{1827bba7-8da7-4af7-8f4c-7f3032e781f5}")
@Guid("1827bba78da74af78f4c7f3032e781f5")
@WinRTInterface("1827bba78da74af78f4c7f3032e781f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbInterfaceSetting.ByReference::class)
public interface IUsbInterfaceSetting : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BulkInEndpoints(): IVectorView<UsbBulkInEndpointDescriptor?>?

  @InterfaceMethod(1)
  public fun get_InterruptInEndpoints(): IVectorView<UsbInterruptInEndpointDescriptor?>?

  @InterfaceMethod(2)
  public fun get_BulkOutEndpoints(): IVectorView<UsbBulkOutEndpointDescriptor?>?

  @InterfaceMethod(3)
  public fun get_InterruptOutEndpoints(): IVectorView<UsbInterruptOutEndpointDescriptor?>?

  @InterfaceMethod(4)
  public fun get_Selected(): Boolean

  @InterfaceMethod(5)
  public fun SelectSettingAsync(): IAsyncAction?

  @InterfaceMethod(6)
  public fun get_InterfaceDescriptor(): UsbInterfaceDescriptor?

  @InterfaceMethod(7)
  public fun get_Descriptors(): IVectorView<UsbDescriptor?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbInterfaceSetting> {
    public override fun getValue() = ABI.makeIUsbInterfaceSetting(pointer.getPointer(0))

    public fun setValue(value: IUsbInterfaceSetting_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbInterfaceSetting {
    public val __1907038438_Ptr: Pointer?

    public val _1907038438_VtblPtr: Pointer?
      get() = __1907038438_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BulkInEndpoints(): IVectorView<UsbBulkInEndpointDescriptor?>? {
      val fnPtr = _1907038438_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UsbBulkInEndpointDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__1907038438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<UsbBulkInEndpointDescriptor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InterruptInEndpoints():
        IVectorView<UsbInterruptInEndpointDescriptor?>? {
      val fnPtr = _1907038438_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UsbInterruptInEndpointDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__1907038438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<UsbInterruptInEndpointDescriptor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BulkOutEndpoints(): IVectorView<UsbBulkOutEndpointDescriptor?>? {
      val fnPtr = _1907038438_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UsbBulkOutEndpointDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__1907038438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<UsbBulkOutEndpointDescriptor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_InterruptOutEndpoints():
        IVectorView<UsbInterruptOutEndpointDescriptor?>? {
      val fnPtr = _1907038438_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UsbInterruptOutEndpointDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__1907038438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<UsbInterruptOutEndpointDescriptor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Selected(): Boolean {
      val fnPtr = _1907038438_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1907038438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun SelectSettingAsync(): IAsyncAction? {
      val fnPtr = _1907038438_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1907038438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_InterfaceDescriptor(): UsbInterfaceDescriptor? {
      val fnPtr = _1907038438_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbInterfaceDescriptor>()
      val hr = fn.invokeHR(arrayOf(__1907038438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbInterfaceDescriptor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Descriptors(): IVectorView<UsbDescriptor?>? {
      val fnPtr = _1907038438_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UsbDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__1907038438_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UsbDescriptor?>>(result.getValue())
      return resultValue
    }
  }

  public class IUsbInterfaceSetting_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1907038438_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbInterfaceSetting, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1827bba78da74af78f4c7f3032e781f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbInterfaceSetting(ptr: Pointer?): WithDefault = IUsbInterfaceSetting_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbInterfaceSetting {
      val address = segment.toRawLongValue()
      return makeIUsbInterfaceSetting(Pointer(address))
    }

    public override fun toNative(obj: IUsbInterfaceSetting): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1907038438_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbInterfaceSetting): Array<IUsbInterfaceSetting?> =
        (elements as
        Array<IUsbInterfaceSetting?>).castToImpl<IUsbInterfaceSetting,IUsbInterfaceSetting_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbInterfaceSetting?> =
        arrayOfNulls<IUsbInterfaceSetting_Impl>(size) as Array<IUsbInterfaceSetting?>
  }
}
