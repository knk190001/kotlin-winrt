package Windows.Globalization.DateTimeFormatting

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

@ABIMarker(IDateTimeFormatterStatics.ABI::class)
@Signature("{bfcde7c0-df4c-4a2e-9012-f47daf3f1212}")
@Guid("bfcde7c0df4c4a2e9012f47daf3f1212")
@WinRTInterface("bfcde7c0df4c4a2e9012f47daf3f1212")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDateTimeFormatterStatics.ByReference::class)
public interface IDateTimeFormatterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LongDate(): DateTimeFormatter?

  @InterfaceMethod(1)
  public fun get_LongTime(): DateTimeFormatter?

  @InterfaceMethod(2)
  public fun get_ShortDate(): DateTimeFormatter?

  @InterfaceMethod(3)
  public fun get_ShortTime(): DateTimeFormatter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDateTimeFormatterStatics> {
    public override fun getValue() = ABI.makeIDateTimeFormatterStatics(pointer.getPointer(0))

    public fun setValue(value: IDateTimeFormatterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDateTimeFormatterStatics {
    public val __1354415545_Ptr: Pointer?

    public val _1354415545_VtblPtr: Pointer?
      get() = __1354415545_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LongDate(): DateTimeFormatter? {
      val fnPtr = _1354415545_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTimeFormatter>()
      val hr = fn.invokeHR(arrayOf(__1354415545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTimeFormatter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LongTime(): DateTimeFormatter? {
      val fnPtr = _1354415545_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTimeFormatter>()
      val hr = fn.invokeHR(arrayOf(__1354415545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTimeFormatter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ShortDate(): DateTimeFormatter? {
      val fnPtr = _1354415545_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTimeFormatter>()
      val hr = fn.invokeHR(arrayOf(__1354415545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTimeFormatter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ShortTime(): DateTimeFormatter? {
      val fnPtr = _1354415545_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTimeFormatter>()
      val hr = fn.invokeHR(arrayOf(__1354415545_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTimeFormatter>(result.getValue())
      return resultValue
    }
  }

  public class IDateTimeFormatterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1354415545_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDateTimeFormatterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bfcde7c0df4c4a2e9012f47daf3f1212")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDateTimeFormatterStatics(ptr: Pointer?): WithDefault =
        IDateTimeFormatterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDateTimeFormatterStatics {
      val address = segment.toRawLongValue()
      return makeIDateTimeFormatterStatics(Pointer(address))
    }

    public override fun toNative(obj: IDateTimeFormatterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1354415545_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDateTimeFormatterStatics):
        Array<IDateTimeFormatterStatics?> = (elements as
        Array<IDateTimeFormatterStatics?>).castToImpl<IDateTimeFormatterStatics,IDateTimeFormatterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDateTimeFormatterStatics?> =
        arrayOfNulls<IDateTimeFormatterStatics_Impl>(size) as Array<IDateTimeFormatterStatics?>
  }
}
