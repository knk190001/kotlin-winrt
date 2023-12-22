package Windows.Media.DialProtocol

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

@ABIMarker(IDialDevicePickerFilter.ABI::class)
@Signature("{c17c93ba-86c0-485d-b8d6-0f9a8f641590}")
@Guid("c17c93ba86c0485db8d60f9a8f641590")
@WinRTInterface("c17c93ba86c0485db8d60f9a8f641590")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDialDevicePickerFilter.ByReference::class)
public interface IDialDevicePickerFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportedAppNames(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDialDevicePickerFilter> {
    public override fun getValue() = ABI.makeIDialDevicePickerFilter(pointer.getPointer(0))

    public fun setValue(value: IDialDevicePickerFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDialDevicePickerFilter {
    public val __1377476632_Ptr: Pointer?

    public val _1377476632_VtblPtr: Pointer?
      get() = __1377476632_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportedAppNames(): IVector<String?>? {
      val fnPtr = _1377476632_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1377476632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IDialDevicePickerFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1377476632_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDialDevicePickerFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c17c93ba86c0485db8d60f9a8f641590")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDialDevicePickerFilter(ptr: Pointer?): WithDefault =
        IDialDevicePickerFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDialDevicePickerFilter {
      val address = segment.toRawLongValue()
      return makeIDialDevicePickerFilter(Pointer(address))
    }

    public override fun toNative(obj: IDialDevicePickerFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1377476632_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDialDevicePickerFilter): Array<IDialDevicePickerFilter?>
        = (elements as
        Array<IDialDevicePickerFilter?>).castToImpl<IDialDevicePickerFilter,IDialDevicePickerFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDialDevicePickerFilter?> =
        arrayOfNulls<IDialDevicePickerFilter_Impl>(size) as Array<IDialDevicePickerFilter?>
  }
}
