package Windows.Globalization.NumberFormatting

import Windows.Foundation.Collections.IVectorView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INumberFormatterOptions.ABI::class)
@Signature("{80332d21-aee1-4a39-baa2-07ed8c96daf6}")
@Guid("80332d21aee14a39baa207ed8c96daf6")
@WinRTInterface("80332d21aee14a39baa207ed8c96daf6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INumberFormatterOptions.ByReference::class)
public interface INumberFormatterOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Languages(): IVectorView<String?>?

  @InterfaceMethod(1)
  public fun get_GeographicRegion(): String?

  @InterfaceMethod(2)
  public fun get_IntegerDigits(): Int

  @InterfaceMethod(3)
  public fun put_IntegerDigits(value: Int): Unit

  @InterfaceMethod(4)
  public fun get_FractionDigits(): Int

  @InterfaceMethod(5)
  public fun put_FractionDigits(value: Int): Unit

  @InterfaceMethod(6)
  public fun get_IsGrouped(): Boolean

  @InterfaceMethod(7)
  public fun put_IsGrouped(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_IsDecimalPointAlwaysDisplayed(): Boolean

  @InterfaceMethod(9)
  public fun put_IsDecimalPointAlwaysDisplayed(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_NumeralSystem(): String?

  @InterfaceMethod(11)
  public fun put_NumeralSystem(value: String?): Unit

  @InterfaceMethod(12)
  public fun get_ResolvedLanguage(): String?

  @InterfaceMethod(13)
  public fun get_ResolvedGeographicRegion(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INumberFormatterOptions> {
    public override fun getValue() = ABI.makeINumberFormatterOptions(pointer.getPointer(0))

    public fun setValue(value: INumberFormatterOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INumberFormatterOptions {
    public val __297696544_Ptr: Pointer?

    public val _297696544_VtblPtr: Pointer?
      get() = __297696544_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Languages(): IVectorView<String?>? {
      val fnPtr = _297696544_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_GeographicRegion(): String? {
      val fnPtr = _297696544_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IntegerDigits(): Int {
      val fnPtr = _297696544_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IntegerDigits(value: Int): Unit {
      val fnPtr = _297696544_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FractionDigits(): Int {
      val fnPtr = _297696544_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_FractionDigits(value: Int): Unit {
      val fnPtr = _297696544_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsGrouped(): Boolean {
      val fnPtr = _297696544_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsGrouped(value: Boolean): Unit {
      val fnPtr = _297696544_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsDecimalPointAlwaysDisplayed(): Boolean {
      val fnPtr = _297696544_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsDecimalPointAlwaysDisplayed(value: Boolean): Unit {
      val fnPtr = _297696544_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_NumeralSystem(): String? {
      val fnPtr = _297696544_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_NumeralSystem(value: String?): Unit {
      val fnPtr = _297696544_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ResolvedLanguage(): String? {
      val fnPtr = _297696544_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_ResolvedGeographicRegion(): String? {
      val fnPtr = _297696544_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__297696544_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class INumberFormatterOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __297696544_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INumberFormatterOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80332d21aee14a39baa207ed8c96daf6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINumberFormatterOptions(ptr: Pointer?): WithDefault =
        INumberFormatterOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INumberFormatterOptions {
      val address = segment.toRawLongValue()
      return makeINumberFormatterOptions(Pointer(address))
    }

    public override fun toNative(obj: INumberFormatterOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__297696544_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INumberFormatterOptions): Array<INumberFormatterOptions?>
        = (elements as
        Array<INumberFormatterOptions?>).castToImpl<INumberFormatterOptions,INumberFormatterOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INumberFormatterOptions?> =
        arrayOfNulls<INumberFormatterOptions_Impl>(size) as Array<INumberFormatterOptions?>
  }
}
