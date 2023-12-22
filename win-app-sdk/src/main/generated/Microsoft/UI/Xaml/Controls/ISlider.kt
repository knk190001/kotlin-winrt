package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.SliderSnapsTo
import Microsoft.UI.Xaml.Controls.Primitives.TickPlacement
import Microsoft.UI.Xaml.Data.IValueConverter
import Microsoft.UI.Xaml.DataTemplate
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISlider.ABI::class)
@Signature("{f7418ecf-7c35-5216-8bf1-d82d47cce5df}")
@Guid("f7418ecf7c3552168bf1d82d47cce5df")
@WinRTInterface("f7418ecf7c3552168bf1d82d47cce5df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISlider.ByReference::class)
public interface ISlider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IntermediateValue(): Double

  @InterfaceMethod(1)
  public fun put_IntermediateValue(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_StepFrequency(): Double

  @InterfaceMethod(3)
  public fun put_StepFrequency(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_SnapsTo(): SliderSnapsTo?

  @InterfaceMethod(5)
  public fun put_SnapsTo(value: SliderSnapsTo?): Unit

  @InterfaceMethod(6)
  public fun get_TickFrequency(): Double

  @InterfaceMethod(7)
  public fun put_TickFrequency(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_TickPlacement(): TickPlacement?

  @InterfaceMethod(9)
  public fun put_TickPlacement(value: TickPlacement?): Unit

  @InterfaceMethod(10)
  public fun get_Orientation(): Orientation?

  @InterfaceMethod(11)
  public fun put_Orientation(value: Orientation?): Unit

  @InterfaceMethod(12)
  public fun get_IsDirectionReversed(): Boolean

  @InterfaceMethod(13)
  public fun put_IsDirectionReversed(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_IsThumbToolTipEnabled(): Boolean

  @InterfaceMethod(15)
  public fun put_IsThumbToolTipEnabled(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_ThumbToolTipValueConverter(): IValueConverter?

  @InterfaceMethod(17)
  public fun put_ThumbToolTipValueConverter(value: IValueConverter?): Unit

  @InterfaceMethod(18)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(19)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(20)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(21)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISlider> {
    public override fun getValue() = ABI.makeISlider(pointer.getPointer(0))

    public fun setValue(value: ISlider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISlider {
    public val __1932356248_Ptr: Pointer?

    public val _1932356248_VtblPtr: Pointer?
      get() = __1932356248_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IntermediateValue(): Double {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IntermediateValue(value: Double): Unit {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_StepFrequency(): Double {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_StepFrequency(value: Double): Unit {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SnapsTo(): SliderSnapsTo? {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SliderSnapsTo>()
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SliderSnapsTo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_SnapsTo(value: SliderSnapsTo?): Unit {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_TickFrequency(): Double {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_TickFrequency(value: Double): Unit {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TickPlacement(): TickPlacement? {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TickPlacement>()
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TickPlacement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_TickPlacement(value: TickPlacement?): Unit {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Orientation(): Orientation? {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Orientation(value: Orientation?): Unit {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsDirectionReversed(): Boolean {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsDirectionReversed(value: Boolean): Unit {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_IsThumbToolTipEnabled(): Boolean {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_IsThumbToolTipEnabled(value: Boolean): Unit {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ThumbToolTipValueConverter(): IValueConverter? {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IValueConverter>()
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IValueConverter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_ThumbToolTipValueConverter(value: IValueConverter?): Unit {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _1932356248_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1932356248_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISlider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1932356248_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISlider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7418ecf7c3552168bf1d82d47cce5df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISlider(ptr: Pointer?): WithDefault = ISlider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISlider {
      val address = segment.toRawLongValue()
      return makeISlider(Pointer(address))
    }

    public override fun toNative(obj: ISlider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1932356248_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISlider): Array<ISlider?> = (elements as
        Array<ISlider?>).castToImpl<ISlider,ISlider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISlider?> = arrayOfNulls<ISlider_Impl>(size) as
        Array<ISlider?>
  }
}
