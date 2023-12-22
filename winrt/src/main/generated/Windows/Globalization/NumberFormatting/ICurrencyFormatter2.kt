package Windows.Globalization.NumberFormatting

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

@ABIMarker(ICurrencyFormatter2.ABI::class)
@Signature("{072c2f1d-e7ba-4197-920e-247c92f7dea6}")
@Guid("072c2f1de7ba4197920e247c92f7dea6")
@WinRTInterface("072c2f1de7ba4197920e247c92f7dea6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrencyFormatter2.ByReference::class)
public interface ICurrencyFormatter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): CurrencyFormatterMode?

  @InterfaceMethod(1)
  public fun put_Mode(value: CurrencyFormatterMode?): Unit

  @InterfaceMethod(2)
  public fun ApplyRoundingForCurrency(roundingAlgorithm: RoundingAlgorithm?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrencyFormatter2> {
    public override fun getValue() = ABI.makeICurrencyFormatter2(pointer.getPointer(0))

    public fun setValue(value: ICurrencyFormatter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrencyFormatter2 {
    public val __42637732_Ptr: Pointer?

    public val _42637732_VtblPtr: Pointer?
      get() = __42637732_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): CurrencyFormatterMode? {
      val fnPtr = _42637732_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CurrencyFormatterMode>()
      val hr = fn.invokeHR(arrayOf(__42637732_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CurrencyFormatterMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Mode(value: CurrencyFormatterMode?): Unit {
      val fnPtr = _42637732_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__42637732_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ApplyRoundingForCurrency(roundingAlgorithm: RoundingAlgorithm?): Unit {
      val fnPtr = _42637732_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__42637732_Ptr, marshalToNative(roundingAlgorithm),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICurrencyFormatter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __42637732_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrencyFormatter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("072c2f1de7ba4197920e247c92f7dea6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrencyFormatter2(ptr: Pointer?): WithDefault = ICurrencyFormatter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrencyFormatter2 {
      val address = segment.toRawLongValue()
      return makeICurrencyFormatter2(Pointer(address))
    }

    public override fun toNative(obj: ICurrencyFormatter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__42637732_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrencyFormatter2): Array<ICurrencyFormatter2?> =
        (elements as
        Array<ICurrencyFormatter2?>).castToImpl<ICurrencyFormatter2,ICurrencyFormatter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrencyFormatter2?> =
        arrayOfNulls<ICurrencyFormatter2_Impl>(size) as Array<ICurrencyFormatter2?>
  }
}
