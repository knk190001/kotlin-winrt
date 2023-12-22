package Windows.Devices.PointOfService

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILineDisplay.ABI::class)
@Signature("{24f5df4e-3c99-44e2-b73f-e51be3637a8c}")
@Guid("24f5df4e3c9944e2b73fe51be3637a8c")
@WinRTInterface("24f5df4e3c9944e2b73fe51be3637a8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplay.ByReference::class)
public interface ILineDisplay : NativeMapped, IWinRTInterface {
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
  public fun ClaimAsync(): IAsyncOperation<ClaimedLineDisplay?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILineDisplay> {
    public override fun getValue() = ABI.makeILineDisplay(pointer.getPointer(0))

    public fun setValue(value: ILineDisplay_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplay {
    public val __915136943_Ptr: Pointer?

    public val _915136943_VtblPtr: Pointer?
      get() = __915136943_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _915136943_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__915136943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Capabilities(): LineDisplayCapabilities? {
      val fnPtr = _915136943_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayCapabilities>()
      val hr = fn.invokeHR(arrayOf(__915136943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PhysicalDeviceName(): String? {
      val fnPtr = _915136943_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__915136943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PhysicalDeviceDescription(): String? {
      val fnPtr = _915136943_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__915136943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DeviceControlDescription(): String? {
      val fnPtr = _915136943_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__915136943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DeviceControlVersion(): String? {
      val fnPtr = _915136943_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__915136943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DeviceServiceVersion(): String? {
      val fnPtr = _915136943_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__915136943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ClaimAsync(): IAsyncOperation<ClaimedLineDisplay?>? {
      val fnPtr = _915136943_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ClaimedLineDisplay?>>()
      val hr = fn.invokeHR(arrayOf(__915136943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ClaimedLineDisplay?>>(result.getValue())
      return resultValue
    }
  }

  public class ILineDisplay_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __915136943_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplay, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24f5df4e3c9944e2b73fe51be3637a8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplay(ptr: Pointer?): WithDefault = ILineDisplay_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplay {
      val address = segment.toRawLongValue()
      return makeILineDisplay(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplay): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__915136943_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplay): Array<ILineDisplay?> = (elements as
        Array<ILineDisplay?>).castToImpl<ILineDisplay,ILineDisplay_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplay?> =
        arrayOfNulls<ILineDisplay_Impl>(size) as Array<ILineDisplay?>
  }
}
