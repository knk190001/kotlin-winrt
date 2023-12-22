package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.DateTime
import Windows.UI.Color
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICalendarViewDayItem.ABI::class)
@Signature("{0fdb2dc5-32c1-4b8f-befc-017b555b32d2}")
@Guid("0fdb2dc532c14b8fbefc017b555b32d2")
@WinRTInterface("0fdb2dc532c14b8fbefc017b555b32d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarViewDayItem.ByReference::class)
public interface ICalendarViewDayItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsBlackout(): Boolean

  @InterfaceMethod(1)
  public fun put_IsBlackout(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Date(): DateTime?

  @InterfaceMethod(3)
  public fun SetDensityColors(colors: IIterable<Color?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarViewDayItem> {
    public override fun getValue() = ABI.makeICalendarViewDayItem(pointer.getPointer(0))

    public fun setValue(value: ICalendarViewDayItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarViewDayItem {
    public val __1470414512_Ptr: Pointer?

    public val _1470414512_VtblPtr: Pointer?
      get() = __1470414512_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsBlackout(): Boolean {
      val fnPtr = _1470414512_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1470414512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsBlackout(value: Boolean): Unit {
      val fnPtr = _1470414512_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1470414512_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Date(): DateTime? {
      val fnPtr = _1470414512_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1470414512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetDensityColors(colors: IIterable<Color?>?): Unit {
      val fnPtr = _1470414512_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1470414512_Ptr, marshalToNative(colors),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICalendarViewDayItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1470414512_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarViewDayItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0fdb2dc532c14b8fbefc017b555b32d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarViewDayItem(ptr: Pointer?): WithDefault = ICalendarViewDayItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarViewDayItem {
      val address = segment.toRawLongValue()
      return makeICalendarViewDayItem(Pointer(address))
    }

    public override fun toNative(obj: ICalendarViewDayItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1470414512_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarViewDayItem): Array<ICalendarViewDayItem?> =
        (elements as
        Array<ICalendarViewDayItem?>).castToImpl<ICalendarViewDayItem,ICalendarViewDayItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarViewDayItem?> =
        arrayOfNulls<ICalendarViewDayItem_Impl>(size) as Array<ICalendarViewDayItem?>
  }
}
