package Microsoft.UI.Xaml

import Windows.Foundation.IReference
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IColorPaletteResources.ABI::class)
@Signature("{1903a03c-1750-54fe-a434-14b227cbe701}")
@Guid("1903a03c175054fea43414b227cbe701")
@WinRTInterface("1903a03c175054fea43414b227cbe701")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorPaletteResources.ByReference::class)
public interface IColorPaletteResources : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AltHigh(): IReference<Color?>?

  @InterfaceMethod(1)
  public fun put_AltHigh(value: IReference<Color?>?): Unit

  @InterfaceMethod(2)
  public fun get_AltLow(): IReference<Color?>?

  @InterfaceMethod(3)
  public fun put_AltLow(value: IReference<Color?>?): Unit

  @InterfaceMethod(4)
  public fun get_AltMedium(): IReference<Color?>?

  @InterfaceMethod(5)
  public fun put_AltMedium(value: IReference<Color?>?): Unit

  @InterfaceMethod(6)
  public fun get_AltMediumHigh(): IReference<Color?>?

  @InterfaceMethod(7)
  public fun put_AltMediumHigh(value: IReference<Color?>?): Unit

  @InterfaceMethod(8)
  public fun get_AltMediumLow(): IReference<Color?>?

  @InterfaceMethod(9)
  public fun put_AltMediumLow(value: IReference<Color?>?): Unit

  @InterfaceMethod(10)
  public fun get_BaseHigh(): IReference<Color?>?

  @InterfaceMethod(11)
  public fun put_BaseHigh(value: IReference<Color?>?): Unit

  @InterfaceMethod(12)
  public fun get_BaseLow(): IReference<Color?>?

  @InterfaceMethod(13)
  public fun put_BaseLow(value: IReference<Color?>?): Unit

  @InterfaceMethod(14)
  public fun get_BaseMedium(): IReference<Color?>?

  @InterfaceMethod(15)
  public fun put_BaseMedium(value: IReference<Color?>?): Unit

  @InterfaceMethod(16)
  public fun get_BaseMediumHigh(): IReference<Color?>?

  @InterfaceMethod(17)
  public fun put_BaseMediumHigh(value: IReference<Color?>?): Unit

  @InterfaceMethod(18)
  public fun get_BaseMediumLow(): IReference<Color?>?

  @InterfaceMethod(19)
  public fun put_BaseMediumLow(value: IReference<Color?>?): Unit

  @InterfaceMethod(20)
  public fun get_ChromeAltLow(): IReference<Color?>?

  @InterfaceMethod(21)
  public fun put_ChromeAltLow(value: IReference<Color?>?): Unit

  @InterfaceMethod(22)
  public fun get_ChromeBlackHigh(): IReference<Color?>?

  @InterfaceMethod(23)
  public fun put_ChromeBlackHigh(value: IReference<Color?>?): Unit

  @InterfaceMethod(24)
  public fun get_ChromeBlackLow(): IReference<Color?>?

  @InterfaceMethod(25)
  public fun put_ChromeBlackLow(value: IReference<Color?>?): Unit

  @InterfaceMethod(26)
  public fun get_ChromeBlackMediumLow(): IReference<Color?>?

  @InterfaceMethod(27)
  public fun put_ChromeBlackMediumLow(value: IReference<Color?>?): Unit

  @InterfaceMethod(28)
  public fun get_ChromeBlackMedium(): IReference<Color?>?

  @InterfaceMethod(29)
  public fun put_ChromeBlackMedium(value: IReference<Color?>?): Unit

  @InterfaceMethod(30)
  public fun get_ChromeDisabledHigh(): IReference<Color?>?

  @InterfaceMethod(31)
  public fun put_ChromeDisabledHigh(value: IReference<Color?>?): Unit

  @InterfaceMethod(32)
  public fun get_ChromeDisabledLow(): IReference<Color?>?

  @InterfaceMethod(33)
  public fun put_ChromeDisabledLow(value: IReference<Color?>?): Unit

  @InterfaceMethod(34)
  public fun get_ChromeHigh(): IReference<Color?>?

  @InterfaceMethod(35)
  public fun put_ChromeHigh(value: IReference<Color?>?): Unit

  @InterfaceMethod(36)
  public fun get_ChromeLow(): IReference<Color?>?

  @InterfaceMethod(37)
  public fun put_ChromeLow(value: IReference<Color?>?): Unit

  @InterfaceMethod(38)
  public fun get_ChromeMedium(): IReference<Color?>?

  @InterfaceMethod(39)
  public fun put_ChromeMedium(value: IReference<Color?>?): Unit

  @InterfaceMethod(40)
  public fun get_ChromeMediumLow(): IReference<Color?>?

  @InterfaceMethod(41)
  public fun put_ChromeMediumLow(value: IReference<Color?>?): Unit

  @InterfaceMethod(42)
  public fun get_ChromeWhite(): IReference<Color?>?

  @InterfaceMethod(43)
  public fun put_ChromeWhite(value: IReference<Color?>?): Unit

  @InterfaceMethod(44)
  public fun get_ChromeGray(): IReference<Color?>?

  @InterfaceMethod(45)
  public fun put_ChromeGray(value: IReference<Color?>?): Unit

  @InterfaceMethod(46)
  public fun get_ListLow(): IReference<Color?>?

  @InterfaceMethod(47)
  public fun put_ListLow(value: IReference<Color?>?): Unit

  @InterfaceMethod(48)
  public fun get_ListMedium(): IReference<Color?>?

  @InterfaceMethod(49)
  public fun put_ListMedium(value: IReference<Color?>?): Unit

  @InterfaceMethod(50)
  public fun get_ErrorText(): IReference<Color?>?

  @InterfaceMethod(51)
  public fun put_ErrorText(value: IReference<Color?>?): Unit

  @InterfaceMethod(52)
  public fun get_Accent(): IReference<Color?>?

  @InterfaceMethod(53)
  public fun put_Accent(value: IReference<Color?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorPaletteResources> {
    public override fun getValue() = ABI.makeIColorPaletteResources(pointer.getPointer(0))

    public fun setValue(value: IColorPaletteResources_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorPaletteResources {
    public val __2138880390_Ptr: Pointer?

    public val _2138880390_VtblPtr: Pointer?
      get() = __2138880390_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AltHigh(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AltHigh(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AltLow(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AltLow(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AltMedium(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_AltMedium(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AltMediumHigh(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_AltMediumHigh(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_AltMediumLow(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_AltMediumLow(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_BaseHigh(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_BaseHigh(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_BaseLow(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_BaseLow(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_BaseMedium(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_BaseMedium(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_BaseMediumHigh(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_BaseMediumHigh(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_BaseMediumLow(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_BaseMediumLow(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_ChromeAltLow(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_ChromeAltLow(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_ChromeBlackHigh(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_ChromeBlackHigh(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_ChromeBlackLow(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_ChromeBlackLow(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_ChromeBlackMediumLow(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_ChromeBlackMediumLow(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_ChromeBlackMedium(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_ChromeBlackMedium(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_ChromeDisabledHigh(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun put_ChromeDisabledHigh(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_ChromeDisabledLow(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun put_ChromeDisabledLow(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_ChromeHigh(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun put_ChromeHigh(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_ChromeLow(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun put_ChromeLow(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_ChromeMedium(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun put_ChromeMedium(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_ChromeMediumLow(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun put_ChromeMediumLow(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_ChromeWhite(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun put_ChromeWhite(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_ChromeGray(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun put_ChromeGray(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_ListLow(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun put_ListLow(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_ListMedium(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun put_ListMedium(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun get_ErrorText(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun put_ErrorText(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun get_Accent(): IReference<Color?>? {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun put_Accent(value: IReference<Color?>?): Unit {
      val fnPtr = _2138880390_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2138880390_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IColorPaletteResources_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2138880390_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorPaletteResources, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1903a03c175054fea43414b227cbe701")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorPaletteResources(ptr: Pointer?): WithDefault =
        IColorPaletteResources_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorPaletteResources {
      val address = segment.toRawLongValue()
      return makeIColorPaletteResources(Pointer(address))
    }

    public override fun toNative(obj: IColorPaletteResources): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2138880390_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorPaletteResources): Array<IColorPaletteResources?> =
        (elements as
        Array<IColorPaletteResources?>).castToImpl<IColorPaletteResources,IColorPaletteResources_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorPaletteResources?> =
        arrayOfNulls<IColorPaletteResources_Impl>(size) as Array<IColorPaletteResources?>
  }
}
