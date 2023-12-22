package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(ICalendarViewDayItemStatics.ABI::class)
@Signature("{c3a1dbbf-bd88-488b-b916-d00d69b1735a}")
@Guid("c3a1dbbfbd88488bb916d00d69b1735a")
@WinRTInterface("c3a1dbbfbd88488bb916d00d69b1735a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarViewDayItemStatics.ByReference::class)
public interface ICalendarViewDayItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsBlackoutProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_DateProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarViewDayItemStatics> {
    public override fun getValue() = ABI.makeICalendarViewDayItemStatics(pointer.getPointer(0))

    public fun setValue(value: ICalendarViewDayItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarViewDayItemStatics {
    public val __69006069_Ptr: Pointer?

    public val _69006069_VtblPtr: Pointer?
      get() = __69006069_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsBlackoutProperty(): DependencyProperty? {
      val fnPtr = _69006069_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__69006069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DateProperty(): DependencyProperty? {
      val fnPtr = _69006069_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__69006069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarViewDayItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __69006069_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarViewDayItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3a1dbbfbd88488bb916d00d69b1735a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarViewDayItemStatics(ptr: Pointer?): WithDefault =
        ICalendarViewDayItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarViewDayItemStatics {
      val address = segment.toRawLongValue()
      return makeICalendarViewDayItemStatics(Pointer(address))
    }

    public override fun toNative(obj: ICalendarViewDayItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__69006069_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarViewDayItemStatics):
        Array<ICalendarViewDayItemStatics?> = (elements as
        Array<ICalendarViewDayItemStatics?>).castToImpl<ICalendarViewDayItemStatics,ICalendarViewDayItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarViewDayItemStatics?> =
        arrayOfNulls<ICalendarViewDayItemStatics_Impl>(size) as Array<ICalendarViewDayItemStatics?>
  }
}
