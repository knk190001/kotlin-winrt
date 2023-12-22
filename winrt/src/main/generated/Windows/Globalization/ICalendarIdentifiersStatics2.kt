package Windows.Globalization

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

@ABIMarker(ICalendarIdentifiersStatics2.ABI::class)
@Signature("{7df4d488-5fd0-42a7-95b5-7d98d823075f}")
@Guid("7df4d4885fd042a795b57d98d823075f")
@WinRTInterface("7df4d4885fd042a795b57d98d823075f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICalendarIdentifiersStatics2.ByReference::class)
public interface ICalendarIdentifiersStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Persian(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICalendarIdentifiersStatics2> {
    public override fun getValue() = ABI.makeICalendarIdentifiersStatics2(pointer.getPointer(0))

    public fun setValue(value: ICalendarIdentifiersStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICalendarIdentifiersStatics2 {
    public val __2089068570_Ptr: Pointer?

    public val _2089068570_VtblPtr: Pointer?
      get() = __2089068570_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Persian(): String? {
      val fnPtr = _2089068570_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2089068570_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICalendarIdentifiersStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2089068570_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICalendarIdentifiersStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7df4d4885fd042a795b57d98d823075f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICalendarIdentifiersStatics2(ptr: Pointer?): WithDefault =
        ICalendarIdentifiersStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICalendarIdentifiersStatics2 {
      val address = segment.toRawLongValue()
      return makeICalendarIdentifiersStatics2(Pointer(address))
    }

    public override fun toNative(obj: ICalendarIdentifiersStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2089068570_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICalendarIdentifiersStatics2):
        Array<ICalendarIdentifiersStatics2?> = (elements as
        Array<ICalendarIdentifiersStatics2?>).castToImpl<ICalendarIdentifiersStatics2,ICalendarIdentifiersStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICalendarIdentifiersStatics2?> =
        arrayOfNulls<ICalendarIdentifiersStatics2_Impl>(size) as
        Array<ICalendarIdentifiersStatics2?>
  }
}
