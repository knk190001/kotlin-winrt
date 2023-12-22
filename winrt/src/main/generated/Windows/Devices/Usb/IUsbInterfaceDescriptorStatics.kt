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

@ABIMarker(IUsbInterfaceDescriptorStatics.ABI::class)
@Signature("{e34a9ff5-77d6-48b6-b0be-16c6422316fe}")
@Guid("e34a9ff577d648b6b0be16c6422316fe")
@WinRTInterface("e34a9ff577d648b6b0be16c6422316fe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbInterfaceDescriptorStatics.ByReference::class)
public interface IUsbInterfaceDescriptorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryParse(descriptor: UsbDescriptor?,
      parsed: Windows.Devices.Usb.UsbInterfaceDescriptor.ByReference?): Boolean

  @InterfaceMethod(1)
  public fun Parse(descriptor: UsbDescriptor?): UsbInterfaceDescriptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbInterfaceDescriptorStatics> {
    public override fun getValue() = ABI.makeIUsbInterfaceDescriptorStatics(pointer.getPointer(0))

    public fun setValue(value: IUsbInterfaceDescriptorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbInterfaceDescriptorStatics {
    public val __975454816_Ptr: Pointer?

    public val _975454816_VtblPtr: Pointer?
      get() = __975454816_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryParse(descriptor: UsbDescriptor?,
        parsed: Windows.Devices.Usb.UsbInterfaceDescriptor.ByReference?): Boolean {
      val fnPtr = _975454816_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__975454816_Ptr, marshalToNative(descriptor),
          marshalToNative(parsed), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun Parse(descriptor: UsbDescriptor?): UsbInterfaceDescriptor? {
      val fnPtr = _975454816_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbInterfaceDescriptor>()
      val hr = fn.invokeHR(arrayOf(__975454816_Ptr, marshalToNative(descriptor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbInterfaceDescriptor>(result.getValue())
      return resultValue
    }
  }

  public class IUsbInterfaceDescriptorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __975454816_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbInterfaceDescriptorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e34a9ff577d648b6b0be16c6422316fe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbInterfaceDescriptorStatics(ptr: Pointer?): WithDefault =
        IUsbInterfaceDescriptorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbInterfaceDescriptorStatics {
      val address = segment.toRawLongValue()
      return makeIUsbInterfaceDescriptorStatics(Pointer(address))
    }

    public override fun toNative(obj: IUsbInterfaceDescriptorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__975454816_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbInterfaceDescriptorStatics):
        Array<IUsbInterfaceDescriptorStatics?> = (elements as
        Array<IUsbInterfaceDescriptorStatics?>).castToImpl<IUsbInterfaceDescriptorStatics,IUsbInterfaceDescriptorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbInterfaceDescriptorStatics?> =
        arrayOfNulls<IUsbInterfaceDescriptorStatics_Impl>(size) as
        Array<IUsbInterfaceDescriptorStatics?>
  }
}
