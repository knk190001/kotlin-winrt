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

@ABIMarker(IUsbDeviceDescriptor.ABI::class)
@Signature("{1f48d1f6-ba97-4322-b92c-b5b189216588}")
@Guid("1f48d1f6ba974322b92cb5b189216588")
@WinRTInterface("1f48d1f6ba974322b92cb5b189216588")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbDeviceDescriptor.ByReference::class)
public interface IUsbDeviceDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BcdUsb(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_MaxPacketSize0(): Byte

  @InterfaceMethod(2)
  public fun get_VendorId(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_ProductId(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_BcdDeviceRevision(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_NumberOfConfigurations(): Byte

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbDeviceDescriptor> {
    public override fun getValue() = ABI.makeIUsbDeviceDescriptor(pointer.getPointer(0))

    public fun setValue(value: IUsbDeviceDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbDeviceDescriptor {
    public val __29141672_Ptr: Pointer?

    public val _29141672_VtblPtr: Pointer?
      get() = __29141672_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BcdUsb(): WinDef.UINT {
      val fnPtr = _29141672_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__29141672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MaxPacketSize0(): Byte {
      val fnPtr = _29141672_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__29141672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_VendorId(): WinDef.UINT {
      val fnPtr = _29141672_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__29141672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ProductId(): WinDef.UINT {
      val fnPtr = _29141672_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__29141672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_BcdDeviceRevision(): WinDef.UINT {
      val fnPtr = _29141672_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__29141672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_NumberOfConfigurations(): Byte {
      val fnPtr = _29141672_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__29141672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }
  }

  public class IUsbDeviceDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __29141672_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbDeviceDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f48d1f6ba974322b92cb5b189216588")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbDeviceDescriptor(ptr: Pointer?): WithDefault = IUsbDeviceDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbDeviceDescriptor {
      val address = segment.toRawLongValue()
      return makeIUsbDeviceDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IUsbDeviceDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__29141672_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbDeviceDescriptor): Array<IUsbDeviceDescriptor?> =
        (elements as
        Array<IUsbDeviceDescriptor?>).castToImpl<IUsbDeviceDescriptor,IUsbDeviceDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbDeviceDescriptor?> =
        arrayOfNulls<IUsbDeviceDescriptor_Impl>(size) as Array<IUsbDeviceDescriptor?>
  }
}
