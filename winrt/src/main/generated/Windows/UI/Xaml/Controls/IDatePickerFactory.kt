package Windows.UI.Xaml.Controls

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDatePickerFactory.ABI::class)
@Signature("{eec3ca84-9896-4a7d-bb35-6fb21eaeca11}")
@Guid("eec3ca8498964a7dbb356fb21eaeca11")
@WinRTInterface("eec3ca8498964a7dbb356fb21eaeca11")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerFactory.ByReference::class)
public interface IDatePickerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): DatePicker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerFactory> {
    public override fun getValue() = ABI.makeIDatePickerFactory(pointer.getPointer(0))

    public fun setValue(value: IDatePickerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerFactory {
    public val __111005966_Ptr: Pointer?

    public val _111005966_VtblPtr: Pointer?
      get() = __111005966_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        DatePicker? {
      val fnPtr = _111005966_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DatePicker>()
      val hr = fn.invokeHR(arrayOf(__111005966_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DatePicker>(result.getValue())
      return resultValue
    }
  }

  public class IDatePickerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __111005966_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eec3ca8498964a7dbb356fb21eaeca11")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerFactory(ptr: Pointer?): WithDefault = IDatePickerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerFactory {
      val address = segment.toRawLongValue()
      return makeIDatePickerFactory(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__111005966_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerFactory): Array<IDatePickerFactory?> =
        (elements as
        Array<IDatePickerFactory?>).castToImpl<IDatePickerFactory,IDatePickerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerFactory?> =
        arrayOfNulls<IDatePickerFactory_Impl>(size) as Array<IDatePickerFactory?>
  }
}
