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

@ABIMarker(ICurrencyAmountFactory.ABI::class)
@Signature("{48d7168f-ef3b-4aee-a6a1-4b036fe03ff0}")
@Guid("48d7168fef3b4aeea6a14b036fe03ff0")
@WinRTInterface("48d7168fef3b4aeea6a14b036fe03ff0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrencyAmountFactory.ByReference::class)
public interface ICurrencyAmountFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(amount: String?, currency: String?): CurrencyAmount?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrencyAmountFactory> {
    public override fun getValue() = ABI.makeICurrencyAmountFactory(pointer.getPointer(0))

    public fun setValue(value: ICurrencyAmountFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrencyAmountFactory {
    public val __894894766_Ptr: Pointer?

    public val _894894766_VtblPtr: Pointer?
      get() = __894894766_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(amount: String?, currency: String?): CurrencyAmount? {
      val fnPtr = _894894766_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CurrencyAmount>()
      val hr = fn.invokeHR(arrayOf(__894894766_Ptr, marshalToNative(amount),
          marshalToNative(currency), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CurrencyAmount>(result.getValue())
      return resultValue
    }
  }

  public class ICurrencyAmountFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __894894766_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrencyAmountFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48d7168fef3b4aeea6a14b036fe03ff0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrencyAmountFactory(ptr: Pointer?): WithDefault =
        ICurrencyAmountFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrencyAmountFactory {
      val address = segment.toRawLongValue()
      return makeICurrencyAmountFactory(Pointer(address))
    }

    public override fun toNative(obj: ICurrencyAmountFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__894894766_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrencyAmountFactory): Array<ICurrencyAmountFactory?> =
        (elements as
        Array<ICurrencyAmountFactory?>).castToImpl<ICurrencyAmountFactory,ICurrencyAmountFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrencyAmountFactory?> =
        arrayOfNulls<ICurrencyAmountFactory_Impl>(size) as Array<ICurrencyAmountFactory?>
  }
}
