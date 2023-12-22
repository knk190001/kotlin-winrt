package Windows.Globalization.NumberFormatting

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

@ABIMarker(ICurrencyFormatterFactory.ABI::class)
@Signature("{86c7537e-b938-4aa2-84b0-2c33dc5b1450}")
@Guid("86c7537eb9384aa284b02c33dc5b1450")
@WinRTInterface("86c7537eb9384aa284b02c33dc5b1450")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrencyFormatterFactory.ByReference::class)
public interface ICurrencyFormatterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCurrencyFormatterCode(currencyCode: String?): CurrencyFormatter?

  @InterfaceMethod(1)
  public fun CreateCurrencyFormatterCodeContext(
    currencyCode: String?,
    languages: IIterable<String?>?,
    geographicRegion: String?
  ): CurrencyFormatter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrencyFormatterFactory> {
    public override fun getValue() = ABI.makeICurrencyFormatterFactory(pointer.getPointer(0))

    public fun setValue(value: ICurrencyFormatterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrencyFormatterFactory {
    public val __583374956_Ptr: Pointer?

    public val _583374956_VtblPtr: Pointer?
      get() = __583374956_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateCurrencyFormatterCode(currencyCode: String?): CurrencyFormatter? {
      val fnPtr = _583374956_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CurrencyFormatter>()
      val hr = fn.invokeHR(arrayOf(__583374956_Ptr, marshalToNative(currencyCode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CurrencyFormatter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateCurrencyFormatterCodeContext(
      currencyCode: String?,
      languages: IIterable<String?>?,
      geographicRegion: String?
    ): CurrencyFormatter? {
      val fnPtr = _583374956_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CurrencyFormatter>()
      val hr = fn.invokeHR(arrayOf(__583374956_Ptr, marshalToNative(currencyCode),
          marshalToNative(languages), marshalToNative(geographicRegion), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CurrencyFormatter>(result.getValue())
      return resultValue
    }
  }

  public class ICurrencyFormatterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __583374956_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrencyFormatterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("86c7537eb9384aa284b02c33dc5b1450")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrencyFormatterFactory(ptr: Pointer?): WithDefault =
        ICurrencyFormatterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrencyFormatterFactory {
      val address = segment.toRawLongValue()
      return makeICurrencyFormatterFactory(Pointer(address))
    }

    public override fun toNative(obj: ICurrencyFormatterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__583374956_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrencyFormatterFactory):
        Array<ICurrencyFormatterFactory?> = (elements as
        Array<ICurrencyFormatterFactory?>).castToImpl<ICurrencyFormatterFactory,ICurrencyFormatterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrencyFormatterFactory?> =
        arrayOfNulls<ICurrencyFormatterFactory_Impl>(size) as Array<ICurrencyFormatterFactory?>
  }
}
