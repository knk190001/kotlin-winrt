package Windows.Globalization

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(ICalendarFactory.ABI::class)
@Signature("{83f58412-e56b-4c75-a66e-0f63d57758a6}")
@Guid("83f58412e56b4c75a66e0f63d57758a6")
@WinRTInterface("83f58412e56b4c75a66e0f63d57758a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarFactory.ByReference::class)
public interface ICalendarFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCalendarDefaultCalendarAndClock(languages: IIterable<String?>?): Calendar?

  @InterfaceMethod(1)
  public fun CreateCalendar(
    languages: IIterable<String?>?,
    calendar: String?,
    clock: String?
  ): Calendar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarFactory> {
    public override fun getValue() = ABI.makeICalendarFactory(pointer.getPointer(0))

    public fun setValue(value: ICalendarFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarFactory {
    public val __1710082905_Ptr: Pointer?

    public val _1710082905_VtblPtr: Pointer?
      get() = __1710082905_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateCalendarDefaultCalendarAndClock(languages: IIterable<String?>?):
        Calendar? {
      val fnPtr = _1710082905_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Calendar>()
      val hr = fn.invokeHR(arrayOf(__1710082905_Ptr, marshalToNative(languages), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Calendar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateCalendar(
      languages: IIterable<String?>?,
      calendar: String?,
      clock: String?
    ): Calendar? {
      val fnPtr = _1710082905_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Calendar>()
      val hr = fn.invokeHR(arrayOf(__1710082905_Ptr, marshalToNative(languages),
          marshalToNative(calendar), marshalToNative(clock), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Calendar>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1710082905_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("83f58412e56b4c75a66e0f63d57758a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarFactory(ptr: Pointer?): WithDefault = ICalendarFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarFactory {
      val address = segment.toRawLongValue()
      return makeICalendarFactory(Pointer(address))
    }

    public override fun toNative(obj: ICalendarFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1710082905_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarFactory): Array<ICalendarFactory?> = (elements as
        Array<ICalendarFactory?>).castToImpl<ICalendarFactory,ICalendarFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarFactory?> =
        arrayOfNulls<ICalendarFactory_Impl>(size) as Array<ICalendarFactory?>
  }
}
