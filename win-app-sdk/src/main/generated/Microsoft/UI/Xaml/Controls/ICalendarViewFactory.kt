package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ICalendarViewFactory.ABI::class)
@Signature("{2f31d1eb-8229-517c-b3a6-5a5f28724e8f}")
@Guid("2f31d1eb8229517cb3a65a5f28724e8f")
@WinRTInterface("2f31d1eb8229517cb3a65a5f28724e8f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarViewFactory.ByReference::class)
public interface ICalendarViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): CalendarView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarViewFactory> {
    public override fun getValue() = ABI.makeICalendarViewFactory(pointer.getPointer(0))

    public fun setValue(value: ICalendarViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarViewFactory {
    public val __1956629344_Ptr: Pointer?

    public val _1956629344_VtblPtr: Pointer?
      get() = __1956629344_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        CalendarView? {
      val fnPtr = _1956629344_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CalendarView>()
      val hr = fn.invokeHR(arrayOf(__1956629344_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CalendarView>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1956629344_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f31d1eb8229517cb3a65a5f28724e8f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarViewFactory(ptr: Pointer?): WithDefault = ICalendarViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarViewFactory {
      val address = segment.toRawLongValue()
      return makeICalendarViewFactory(Pointer(address))
    }

    public override fun toNative(obj: ICalendarViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1956629344_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarViewFactory): Array<ICalendarViewFactory?> =
        (elements as
        Array<ICalendarViewFactory?>).castToImpl<ICalendarViewFactory,ICalendarViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarViewFactory?> =
        arrayOfNulls<ICalendarViewFactory_Impl>(size) as Array<ICalendarViewFactory?>
  }
}
