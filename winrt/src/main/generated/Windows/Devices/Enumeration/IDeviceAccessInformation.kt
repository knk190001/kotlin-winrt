package Windows.Devices.Enumeration

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IDeviceAccessInformation.ABI::class)
@Signature("{0baa9a73-6de5-4915-8ddd-9a0554a6f545}")
@Guid("0baa9a736de549158ddd9a0554a6f545")
@WinRTInterface("0baa9a736de549158ddd9a0554a6f545")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceAccessInformation.ByReference::class)
public interface IDeviceAccessInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_AccessChanged(handler: TypedEventHandler<DeviceAccessInformation?,
      DeviceAccessChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_AccessChanged(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_CurrentStatus(): DeviceAccessStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceAccessInformation> {
    public override fun getValue() = ABI.makeIDeviceAccessInformation(pointer.getPointer(0))

    public fun setValue(value: IDeviceAccessInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceAccessInformation {
    public val __944789420_Ptr: Pointer?

    public val _944789420_VtblPtr: Pointer?
      get() = __944789420_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_AccessChanged(handler: TypedEventHandler<DeviceAccessInformation?,
        DeviceAccessChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _944789420_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__944789420_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_AccessChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _944789420_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__944789420_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CurrentStatus(): DeviceAccessStatus? {
      val fnPtr = _944789420_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccessStatus>()
      val hr = fn.invokeHR(arrayOf(__944789420_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccessStatus>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceAccessInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __944789420_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceAccessInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0baa9a736de549158ddd9a0554a6f545")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceAccessInformation(ptr: Pointer?): WithDefault =
        IDeviceAccessInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceAccessInformation {
      val address = segment.toRawLongValue()
      return makeIDeviceAccessInformation(Pointer(address))
    }

    public override fun toNative(obj: IDeviceAccessInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__944789420_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceAccessInformation):
        Array<IDeviceAccessInformation?> = (elements as
        Array<IDeviceAccessInformation?>).castToImpl<IDeviceAccessInformation,IDeviceAccessInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceAccessInformation?> =
        arrayOfNulls<IDeviceAccessInformation_Impl>(size) as Array<IDeviceAccessInformation?>
  }
}
