package Windows.Globalization.NumberFormatting

import Windows.Globalization.NumberFormatting.INumberFormatterOptions.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ICurrencyFormatter.ABI::class)
@Signature("{11730ca5-4b00-41b2-b332-73b12a497d54}")
@Guid("11730ca54b0041b2b33273b12a497d54")
@WinRTInterface("11730ca54b0041b2b33273b12a497d54")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrencyFormatter.ByReference::class)
public interface ICurrencyFormatter : NativeMapped, IWinRTInterface, INumberFormatterOptions,
    INumberFormatter, INumberFormatter2, INumberParser {
  @InterfaceMethod(0)
  public fun get_Currency(): String?

  @InterfaceMethod(1)
  public fun put_Currency(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrencyFormatter> {
    public override fun getValue() = ABI.makeICurrencyFormatter(pointer.getPointer(0))

    public fun setValue(value: ICurrencyFormatter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrencyFormatter, INumberFormatterOptions.WithDefault,
      INumberFormatter.WithDefault, INumberFormatter2.WithDefault, INumberParser.WithDefault {
    public val __1802490730_Ptr: Pointer?

    public val _1802490730_VtblPtr: Pointer?
      get() = __1802490730_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Currency(): String? {
      val fnPtr = _1802490730_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1802490730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Currency(value: String?): Unit {
      val fnPtr = _1802490730_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1802490730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICurrencyFormatter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, INumberFormatterOptions,
      INumberFormatter, INumberFormatter2, INumberParser {
    public override val __297696544_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1802490730_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __559084446_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(INumberFormatter.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1802490730_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __151748692_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(INumberFormatter2.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1802490730_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __185731531_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(INumberParser.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1802490730_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1802490730_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrencyFormatter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("11730ca54b0041b2b33273b12a497d54")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrencyFormatter(ptr: Pointer?): WithDefault = ICurrencyFormatter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrencyFormatter {
      val address = segment.toRawLongValue()
      return makeICurrencyFormatter(Pointer(address))
    }

    public override fun toNative(obj: ICurrencyFormatter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1802490730_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrencyFormatter): Array<ICurrencyFormatter?> =
        (elements as
        Array<ICurrencyFormatter?>).castToImpl<ICurrencyFormatter,ICurrencyFormatter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrencyFormatter?> =
        arrayOfNulls<ICurrencyFormatter_Impl>(size) as Array<ICurrencyFormatter?>
  }
}
