package Windows.Devices.PointOfService

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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IClaimedLineDisplay.ABI::class)
@Signature("{120ac970-9a75-4acf-aae7-09972bcf8794}")
@Guid("120ac9709a754acfaae709972bcf8794")
@WinRTInterface("120ac9709a754acfaae709972bcf8794")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedLineDisplay.ByReference::class)
public interface IClaimedLineDisplay : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_Capabilities(): LineDisplayCapabilities?

  @InterfaceMethod(2)
  public fun get_PhysicalDeviceName(): String?

  @InterfaceMethod(3)
  public fun get_PhysicalDeviceDescription(): String?

  @InterfaceMethod(4)
  public fun get_DeviceControlDescription(): String?

  @InterfaceMethod(5)
  public fun get_DeviceControlVersion(): String?

  @InterfaceMethod(6)
  public fun get_DeviceServiceVersion(): String?

  @InterfaceMethod(7)
  public fun get_DefaultWindow(): LineDisplayWindow?

  @InterfaceMethod(8)
  public fun RetainDevice(): Unit

  @InterfaceMethod(9)
  public fun add_ReleaseDeviceRequested(handler: TypedEventHandler<ClaimedLineDisplay?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_ReleaseDeviceRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedLineDisplay> {
    public override fun getValue() = ABI.makeIClaimedLineDisplay(pointer.getPointer(0))

    public fun setValue(value: IClaimedLineDisplay_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedLineDisplay {
    public val __1323330894_Ptr: Pointer?

    public val _1323330894_VtblPtr: Pointer?
      get() = __1323330894_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1323330894_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1323330894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Capabilities(): LineDisplayCapabilities? {
      val fnPtr = _1323330894_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayCapabilities>()
      val hr = fn.invokeHR(arrayOf(__1323330894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PhysicalDeviceName(): String? {
      val fnPtr = _1323330894_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1323330894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PhysicalDeviceDescription(): String? {
      val fnPtr = _1323330894_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1323330894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DeviceControlDescription(): String? {
      val fnPtr = _1323330894_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1323330894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DeviceControlVersion(): String? {
      val fnPtr = _1323330894_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1323330894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DeviceServiceVersion(): String? {
      val fnPtr = _1323330894_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1323330894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_DefaultWindow(): LineDisplayWindow? {
      val fnPtr = _1323330894_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayWindow>()
      val hr = fn.invokeHR(arrayOf(__1323330894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayWindow>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun RetainDevice(): Unit {
      val fnPtr = _1323330894_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1323330894_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_ReleaseDeviceRequested(handler: TypedEventHandler<ClaimedLineDisplay?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1323330894_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1323330894_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_ReleaseDeviceRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1323330894_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1323330894_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClaimedLineDisplay_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1323330894_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedLineDisplay, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("120ac9709a754acfaae709972bcf8794")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedLineDisplay(ptr: Pointer?): WithDefault = IClaimedLineDisplay_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedLineDisplay {
      val address = segment.toRawLongValue()
      return makeIClaimedLineDisplay(Pointer(address))
    }

    public override fun toNative(obj: IClaimedLineDisplay): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1323330894_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedLineDisplay): Array<IClaimedLineDisplay?> =
        (elements as
        Array<IClaimedLineDisplay?>).castToImpl<IClaimedLineDisplay,IClaimedLineDisplay_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedLineDisplay?> =
        arrayOfNulls<IClaimedLineDisplay_Impl>(size) as Array<IClaimedLineDisplay?>
  }
}
