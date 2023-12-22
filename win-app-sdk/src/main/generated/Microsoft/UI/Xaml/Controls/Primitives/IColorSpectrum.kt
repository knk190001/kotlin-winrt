package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.ColorChangedEventArgs
import Microsoft.UI.Xaml.Controls.ColorSpectrumComponents
import Microsoft.UI.Xaml.Controls.ColorSpectrumShape
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Numerics.Vector4
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IColorSpectrum.ABI::class)
@Signature("{75305916-882d-5667-bfd0-0af72d502d72}")
@Guid("75305916882d5667bfd00af72d502d72")
@WinRTInterface("75305916882d5667bfd00af72d502d72")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorSpectrum.ByReference::class)
public interface IColorSpectrum : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Color(): Color?

  @InterfaceMethod(1)
  public fun put_Color(value: Color?): Unit

  @InterfaceMethod(2)
  public fun get_HsvColor(): Vector4?

  @InterfaceMethod(3)
  public fun put_HsvColor(value: Vector4?): Unit

  @InterfaceMethod(4)
  public fun get_MinHue(): Int

  @InterfaceMethod(5)
  public fun put_MinHue(value: Int): Unit

  @InterfaceMethod(6)
  public fun get_MaxHue(): Int

  @InterfaceMethod(7)
  public fun put_MaxHue(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_MinSaturation(): Int

  @InterfaceMethod(9)
  public fun put_MinSaturation(value: Int): Unit

  @InterfaceMethod(10)
  public fun get_MaxSaturation(): Int

  @InterfaceMethod(11)
  public fun put_MaxSaturation(value: Int): Unit

  @InterfaceMethod(12)
  public fun get_MinValue(): Int

  @InterfaceMethod(13)
  public fun put_MinValue(value: Int): Unit

  @InterfaceMethod(14)
  public fun get_MaxValue(): Int

  @InterfaceMethod(15)
  public fun put_MaxValue(value: Int): Unit

  @InterfaceMethod(16)
  public fun get_Shape(): ColorSpectrumShape?

  @InterfaceMethod(17)
  public fun put_Shape(value: ColorSpectrumShape?): Unit

  @InterfaceMethod(18)
  public fun get_Components(): ColorSpectrumComponents?

  @InterfaceMethod(19)
  public fun put_Components(value: ColorSpectrumComponents?): Unit

  @InterfaceMethod(20)
  public fun add_ColorChanged(handler: TypedEventHandler<ColorSpectrum?, ColorChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_ColorChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IColorSpectrum>
      {
    public override fun getValue() = ABI.makeIColorSpectrum(pointer.getPointer(0))

    public fun setValue(value: IColorSpectrum_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorSpectrum {
    public val __1810680925_Ptr: Pointer?

    public val _1810680925_VtblPtr: Pointer?
      get() = __1810680925_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Color(): Color? {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Color(value: Color?): Unit {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HsvColor(): Vector4? {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector4>()
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector4>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_HsvColor(value: Vector4?): Unit {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MinHue(): Int {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MinHue(value: Int): Unit {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_MaxHue(): Int {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_MaxHue(value: Int): Unit {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_MinSaturation(): Int {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_MinSaturation(value: Int): Unit {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_MaxSaturation(): Int {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_MaxSaturation(value: Int): Unit {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_MinValue(): Int {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_MinValue(value: Int): Unit {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_MaxValue(): Int {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_MaxValue(value: Int): Unit {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_Shape(): ColorSpectrumShape? {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorSpectrumShape>()
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorSpectrumShape>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_Shape(value: ColorSpectrumShape?): Unit {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_Components(): ColorSpectrumComponents? {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorSpectrumComponents>()
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorSpectrumComponents>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_Components(value: ColorSpectrumComponents?): Unit {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_ColorChanged(handler: TypedEventHandler<ColorSpectrum?,
        ColorChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_ColorChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1810680925_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1810680925_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IColorSpectrum_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1810680925_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorSpectrum, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75305916882d5667bfd00af72d502d72")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorSpectrum(ptr: Pointer?): WithDefault = IColorSpectrum_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorSpectrum {
      val address = segment.toRawLongValue()
      return makeIColorSpectrum(Pointer(address))
    }

    public override fun toNative(obj: IColorSpectrum): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1810680925_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorSpectrum): Array<IColorSpectrum?> = (elements as
        Array<IColorSpectrum?>).castToImpl<IColorSpectrum,IColorSpectrum_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorSpectrum?> =
        arrayOfNulls<IColorSpectrum_Impl>(size) as Array<IColorSpectrum?>
  }
}
