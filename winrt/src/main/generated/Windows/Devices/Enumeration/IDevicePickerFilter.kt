package Windows.Devices.Enumeration

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IDevicePickerFilter.ABI::class)
@Signature("{91db92a2-57cb-48f1-9b59-a59b7a1f02a2}")
@Guid("91db92a257cb48f19b59a59b7a1f02a2")
@WinRTInterface("91db92a257cb48f19b59a59b7a1f02a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDevicePickerFilter.ByReference::class)
public interface IDevicePickerFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportedDeviceClasses(): IVector<DeviceClass?>?

  @InterfaceMethod(1)
  public fun get_SupportedDeviceSelectors(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDevicePickerFilter> {
    public override fun getValue() = ABI.makeIDevicePickerFilter(pointer.getPointer(0))

    public fun setValue(value: IDevicePickerFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDevicePickerFilter {
    public val __1524566778_Ptr: Pointer?

    public val _1524566778_VtblPtr: Pointer?
      get() = __1524566778_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportedDeviceClasses(): IVector<DeviceClass?>? {
      val fnPtr = _1524566778_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<DeviceClass?>>()
      val hr = fn.invokeHR(arrayOf(__1524566778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<DeviceClass?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedDeviceSelectors(): IVector<String?>? {
      val fnPtr = _1524566778_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1524566778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IDevicePickerFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1524566778_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDevicePickerFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("91db92a257cb48f19b59a59b7a1f02a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDevicePickerFilter(ptr: Pointer?): WithDefault = IDevicePickerFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDevicePickerFilter {
      val address = segment.toRawLongValue()
      return makeIDevicePickerFilter(Pointer(address))
    }

    public override fun toNative(obj: IDevicePickerFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1524566778_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDevicePickerFilter): Array<IDevicePickerFilter?> =
        (elements as
        Array<IDevicePickerFilter?>).castToImpl<IDevicePickerFilter,IDevicePickerFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDevicePickerFilter?> =
        arrayOfNulls<IDevicePickerFilter_Impl>(size) as Array<IDevicePickerFilter?>
  }
}
