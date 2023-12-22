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

@ABIMarker(IUsbConfigurationDescriptorStatics.ABI::class)
@Signature("{424ced93-e740-40a1-92bd-da120ea04914}")
@Guid("424ced93e74040a192bdda120ea04914")
@WinRTInterface("424ced93e74040a192bdda120ea04914")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbConfigurationDescriptorStatics.ByReference::class)
public interface IUsbConfigurationDescriptorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryParse(descriptor: UsbDescriptor?,
      parsed: Windows.Devices.Usb.UsbConfigurationDescriptor.ByReference?): Boolean

  @InterfaceMethod(1)
  public fun Parse(descriptor: UsbDescriptor?): UsbConfigurationDescriptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbConfigurationDescriptorStatics> {
    public override fun getValue() =
        ABI.makeIUsbConfigurationDescriptorStatics(pointer.getPointer(0))

    public fun setValue(value: IUsbConfigurationDescriptorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbConfigurationDescriptorStatics {
    public val __1831505411_Ptr: Pointer?

    public val _1831505411_VtblPtr: Pointer?
      get() = __1831505411_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryParse(descriptor: UsbDescriptor?,
        parsed: Windows.Devices.Usb.UsbConfigurationDescriptor.ByReference?): Boolean {
      val fnPtr = _1831505411_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1831505411_Ptr, marshalToNative(descriptor),
          marshalToNative(parsed), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun Parse(descriptor: UsbDescriptor?): UsbConfigurationDescriptor? {
      val fnPtr = _1831505411_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbConfigurationDescriptor>()
      val hr = fn.invokeHR(arrayOf(__1831505411_Ptr, marshalToNative(descriptor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbConfigurationDescriptor>(result.getValue())
      return resultValue
    }
  }

  public class IUsbConfigurationDescriptorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1831505411_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbConfigurationDescriptorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("424ced93e74040a192bdda120ea04914")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbConfigurationDescriptorStatics(ptr: Pointer?): WithDefault =
        IUsbConfigurationDescriptorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbConfigurationDescriptorStatics {
      val address = segment.toRawLongValue()
      return makeIUsbConfigurationDescriptorStatics(Pointer(address))
    }

    public override fun toNative(obj: IUsbConfigurationDescriptorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1831505411_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbConfigurationDescriptorStatics):
        Array<IUsbConfigurationDescriptorStatics?> = (elements as
        Array<IUsbConfigurationDescriptorStatics?>).castToImpl<IUsbConfigurationDescriptorStatics,IUsbConfigurationDescriptorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbConfigurationDescriptorStatics?> =
        arrayOfNulls<IUsbConfigurationDescriptorStatics_Impl>(size) as
        Array<IUsbConfigurationDescriptorStatics?>
  }
}
