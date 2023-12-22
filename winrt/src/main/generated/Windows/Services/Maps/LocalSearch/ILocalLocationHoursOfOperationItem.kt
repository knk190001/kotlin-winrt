package Windows.Services.Maps.LocalSearch

import Windows.Foundation.TimeSpan
import Windows.Globalization.DayOfWeek
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

@ABIMarker(ILocalLocationHoursOfOperationItem.ABI::class)
@Signature("{23548c72-a1c7-43f1-a4f0-1091c39ec640}")
@Guid("23548c72a1c743f1a4f01091c39ec640")
@WinRTInterface("23548c72a1c743f1a4f01091c39ec640")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILocalLocationHoursOfOperationItem.ByReference::class)
public interface ILocalLocationHoursOfOperationItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Day(): DayOfWeek?

  @InterfaceMethod(1)
  public fun get_Start(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_Span(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILocalLocationHoursOfOperationItem> {
    public override fun getValue() =
        ABI.makeILocalLocationHoursOfOperationItem(pointer.getPointer(0))

    public fun setValue(value: ILocalLocationHoursOfOperationItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILocalLocationHoursOfOperationItem {
    public val __1485566452_Ptr: Pointer?

    public val _1485566452_VtblPtr: Pointer?
      get() = __1485566452_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Day(): DayOfWeek? {
      val fnPtr = _1485566452_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DayOfWeek>()
      val hr = fn.invokeHR(arrayOf(__1485566452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DayOfWeek>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Start(): TimeSpan? {
      val fnPtr = _1485566452_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1485566452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Span(): TimeSpan? {
      val fnPtr = _1485566452_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1485566452_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class ILocalLocationHoursOfOperationItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1485566452_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILocalLocationHoursOfOperationItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23548c72a1c743f1a4f01091c39ec640")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILocalLocationHoursOfOperationItem(ptr: Pointer?): WithDefault =
        ILocalLocationHoursOfOperationItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILocalLocationHoursOfOperationItem {
      val address = segment.toRawLongValue()
      return makeILocalLocationHoursOfOperationItem(Pointer(address))
    }

    public override fun toNative(obj: ILocalLocationHoursOfOperationItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1485566452_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILocalLocationHoursOfOperationItem):
        Array<ILocalLocationHoursOfOperationItem?> = (elements as
        Array<ILocalLocationHoursOfOperationItem?>).castToImpl<ILocalLocationHoursOfOperationItem,ILocalLocationHoursOfOperationItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILocalLocationHoursOfOperationItem?> =
        arrayOfNulls<ILocalLocationHoursOfOperationItem_Impl>(size) as
        Array<ILocalLocationHoursOfOperationItem?>
  }
}
