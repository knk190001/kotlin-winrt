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

@ABIMarker(ICalendarViewDayItemFactory.ABI::class)
@Signature("{e6159e51-1c48-5a77-a3a1-aef59d6a8c4e}")
@Guid("e6159e511c485a77a3a1aef59d6a8c4e")
@WinRTInterface("e6159e511c485a77a3a1aef59d6a8c4e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarViewDayItemFactory.ByReference::class)
public interface ICalendarViewDayItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      CalendarViewDayItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarViewDayItemFactory> {
    public override fun getValue() = ABI.makeICalendarViewDayItemFactory(pointer.getPointer(0))

    public fun setValue(value: ICalendarViewDayItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarViewDayItemFactory {
    public val __768571867_Ptr: Pointer?

    public val _768571867_VtblPtr: Pointer?
      get() = __768571867_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        CalendarViewDayItem? {
      val fnPtr = _768571867_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CalendarViewDayItem>()
      val hr = fn.invokeHR(arrayOf(__768571867_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CalendarViewDayItem>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarViewDayItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __768571867_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarViewDayItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6159e511c485a77a3a1aef59d6a8c4e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarViewDayItemFactory(ptr: Pointer?): WithDefault =
        ICalendarViewDayItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarViewDayItemFactory {
      val address = segment.toRawLongValue()
      return makeICalendarViewDayItemFactory(Pointer(address))
    }

    public override fun toNative(obj: ICalendarViewDayItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__768571867_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarViewDayItemFactory):
        Array<ICalendarViewDayItemFactory?> = (elements as
        Array<ICalendarViewDayItemFactory?>).castToImpl<ICalendarViewDayItemFactory,ICalendarViewDayItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarViewDayItemFactory?> =
        arrayOfNulls<ICalendarViewDayItemFactory_Impl>(size) as Array<ICalendarViewDayItemFactory?>
  }
}
