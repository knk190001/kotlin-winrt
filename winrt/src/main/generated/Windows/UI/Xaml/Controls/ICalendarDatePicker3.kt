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

@ABIMarker(ICalendarDatePicker3.ABI::class)
@Signature("{645856c0-db7b-5e75-85e9-f623e3457ea6}")
@Guid("645856c0db7b5e7585e9f623e3457ea6")
@WinRTInterface("645856c0db7b5e7585e9f623e3457ea6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarDatePicker3.ByReference::class)
public interface ICalendarDatePicker3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Description(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Description(value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarDatePicker3> {
    public override fun getValue() = ABI.makeICalendarDatePicker3(pointer.getPointer(0))

    public fun setValue(value: ICalendarDatePicker3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarDatePicker3 {
    public val __649904669_Ptr: Pointer?

    public val _649904669_VtblPtr: Pointer?
      get() = __649904669_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Description(): IUnknown? {
      val fnPtr = _649904669_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__649904669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Description(value: IUnknown?): Unit {
      val fnPtr = _649904669_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__649904669_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICalendarDatePicker3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __649904669_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarDatePicker3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("645856c0db7b5e7585e9f623e3457ea6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarDatePicker3(ptr: Pointer?): WithDefault = ICalendarDatePicker3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarDatePicker3 {
      val address = segment.toRawLongValue()
      return makeICalendarDatePicker3(Pointer(address))
    }

    public override fun toNative(obj: ICalendarDatePicker3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__649904669_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarDatePicker3): Array<ICalendarDatePicker3?> =
        (elements as
        Array<ICalendarDatePicker3?>).castToImpl<ICalendarDatePicker3,ICalendarDatePicker3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarDatePicker3?> =
        arrayOfNulls<ICalendarDatePicker3_Impl>(size) as Array<ICalendarDatePicker3?>
  }
}
