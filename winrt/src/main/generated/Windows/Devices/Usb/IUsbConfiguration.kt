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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUsbConfiguration.ABI::class)
@Signature("{68177429-36a9-46d7-b873-fc689251ec30}")
@Guid("6817742936a946d7b873fc689251ec30")
@WinRTInterface("6817742936a946d7b873fc689251ec30")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbConfiguration.ByReference::class)
public interface IUsbConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UsbInterfaces(): IVectorView<UsbInterface?>?

  @InterfaceMethod(1)
  public fun get_ConfigurationDescriptor(): UsbConfigurationDescriptor?

  @InterfaceMethod(2)
  public fun get_Descriptors(): IVectorView<UsbDescriptor?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbConfiguration> {
    public override fun getValue() = ABI.makeIUsbConfiguration(pointer.getPointer(0))

    public fun setValue(value: IUsbConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbConfiguration {
    public val __1763982445_Ptr: Pointer?

    public val _1763982445_VtblPtr: Pointer?
      get() = __1763982445_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UsbInterfaces(): IVectorView<UsbInterface?>? {
      val fnPtr = _1763982445_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UsbInterface?>>()
      val hr = fn.invokeHR(arrayOf(__1763982445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UsbInterface?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ConfigurationDescriptor(): UsbConfigurationDescriptor? {
      val fnPtr = _1763982445_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbConfigurationDescriptor>()
      val hr = fn.invokeHR(arrayOf(__1763982445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbConfigurationDescriptor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Descriptors(): IVectorView<UsbDescriptor?>? {
      val fnPtr = _1763982445_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UsbDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__1763982445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UsbDescriptor?>>(result.getValue())
      return resultValue
    }
  }

  public class IUsbConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1763982445_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6817742936a946d7b873fc689251ec30")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbConfiguration(ptr: Pointer?): WithDefault = IUsbConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbConfiguration {
      val address = segment.toRawLongValue()
      return makeIUsbConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IUsbConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1763982445_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbConfiguration): Array<IUsbConfiguration?> = (elements
        as Array<IUsbConfiguration?>).castToImpl<IUsbConfiguration,IUsbConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbConfiguration?> =
        arrayOfNulls<IUsbConfiguration_Impl>(size) as Array<IUsbConfiguration?>
  }
}
