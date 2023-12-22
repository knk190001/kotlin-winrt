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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUsbEndpointDescriptorStatics.ABI::class)
@Signature("{c890b201-9a6a-495e-a82c-295b9e708106}")
@Guid("c890b2019a6a495ea82c295b9e708106")
@WinRTInterface("c890b2019a6a495ea82c295b9e708106")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbEndpointDescriptorStatics.ByReference::class)
public interface IUsbEndpointDescriptorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryParse(descriptor: UsbDescriptor?,
      parsed: Windows.Devices.Usb.UsbEndpointDescriptor.ByReference?): Boolean

  @InterfaceMethod(1)
  public fun Parse(descriptor: UsbDescriptor?): UsbEndpointDescriptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbEndpointDescriptorStatics> {
    public override fun getValue() = ABI.makeIUsbEndpointDescriptorStatics(pointer.getPointer(0))

    public fun setValue(value: IUsbEndpointDescriptorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbEndpointDescriptorStatics {
    public val __473989982_Ptr: Pointer?

    public val _473989982_VtblPtr: Pointer?
      get() = __473989982_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryParse(descriptor: UsbDescriptor?,
        parsed: Windows.Devices.Usb.UsbEndpointDescriptor.ByReference?): Boolean {
      val fnPtr = _473989982_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__473989982_Ptr, marshalToNative(descriptor),
          marshalToNative(parsed), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun Parse(descriptor: UsbDescriptor?): UsbEndpointDescriptor? {
      val fnPtr = _473989982_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbEndpointDescriptor>()
      val hr = fn.invokeHR(arrayOf(__473989982_Ptr, marshalToNative(descriptor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbEndpointDescriptor>(result.getValue())
      return resultValue
    }
  }

  public class IUsbEndpointDescriptorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __473989982_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbEndpointDescriptorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c890b2019a6a495ea82c295b9e708106")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbEndpointDescriptorStatics(ptr: Pointer?): WithDefault =
        IUsbEndpointDescriptorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbEndpointDescriptorStatics {
      val address = segment.toRawLongValue()
      return makeIUsbEndpointDescriptorStatics(Pointer(address))
    }

    public override fun toNative(obj: IUsbEndpointDescriptorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__473989982_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbEndpointDescriptorStatics):
        Array<IUsbEndpointDescriptorStatics?> = (elements as
        Array<IUsbEndpointDescriptorStatics?>).castToImpl<IUsbEndpointDescriptorStatics,IUsbEndpointDescriptorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbEndpointDescriptorStatics?> =
        arrayOfNulls<IUsbEndpointDescriptorStatics_Impl>(size) as
        Array<IUsbEndpointDescriptorStatics?>
  }
}
