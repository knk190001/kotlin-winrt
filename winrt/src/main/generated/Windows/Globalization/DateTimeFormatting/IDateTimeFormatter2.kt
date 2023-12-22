package Windows.Globalization.DateTimeFormatting

import Windows.Foundation.DateTime
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

@ABIMarker(IDateTimeFormatter2.ABI::class)
@Signature("{27c91a86-bdaa-4fd0-9e36-671d5aa5ee03}")
@Guid("27c91a86bdaa4fd09e36671d5aa5ee03")
@WinRTInterface("27c91a86bdaa4fd09e36671d5aa5ee03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDateTimeFormatter2.ByReference::class)
public interface IDateTimeFormatter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Format(datetime: DateTime?, timeZoneId: String?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDateTimeFormatter2> {
    public override fun getValue() = ABI.makeIDateTimeFormatter2(pointer.getPointer(0))

    public fun setValue(value: IDateTimeFormatter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDateTimeFormatter2 {
    public val __1558852524_Ptr: Pointer?

    public val _1558852524_VtblPtr: Pointer?
      get() = __1558852524_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Format(datetime: DateTime?, timeZoneId: String?): String? {
      val fnPtr = _1558852524_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1558852524_Ptr, marshalToNative(datetime),
          marshalToNative(timeZoneId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IDateTimeFormatter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1558852524_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDateTimeFormatter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27c91a86bdaa4fd09e36671d5aa5ee03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDateTimeFormatter2(ptr: Pointer?): WithDefault = IDateTimeFormatter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDateTimeFormatter2 {
      val address = segment.toRawLongValue()
      return makeIDateTimeFormatter2(Pointer(address))
    }

    public override fun toNative(obj: IDateTimeFormatter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1558852524_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDateTimeFormatter2): Array<IDateTimeFormatter2?> =
        (elements as
        Array<IDateTimeFormatter2?>).castToImpl<IDateTimeFormatter2,IDateTimeFormatter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDateTimeFormatter2?> =
        arrayOfNulls<IDateTimeFormatter2_Impl>(size) as Array<IDateTimeFormatter2?>
  }
}
