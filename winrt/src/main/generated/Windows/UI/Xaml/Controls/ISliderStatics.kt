package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(ISliderStatics.ABI::class)
@Signature("{8a4363d7-7fdf-4d30-98fe-ce78c05b31cf}")
@Guid("8a4363d77fdf4d3098fece78c05b31cf")
@WinRTInterface("8a4363d77fdf4d3098fece78c05b31cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISliderStatics.ByReference::class)
public interface ISliderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IntermediateValueProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_StepFrequencyProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_SnapsToProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_TickFrequencyProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_TickPlacementProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_OrientationProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_IsDirectionReversedProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_IsThumbToolTipEnabledProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_ThumbToolTipValueConverterProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISliderStatics>
      {
    public override fun getValue() = ABI.makeISliderStatics(pointer.getPointer(0))

    public fun setValue(value: ISliderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISliderStatics {
    public val __1773060360_Ptr: Pointer?

    public val _1773060360_VtblPtr: Pointer?
      get() = __1773060360_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IntermediateValueProperty(): DependencyProperty? {
      val fnPtr = _1773060360_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1773060360_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StepFrequencyProperty(): DependencyProperty? {
      val fnPtr = _1773060360_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1773060360_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SnapsToProperty(): DependencyProperty? {
      val fnPtr = _1773060360_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1773060360_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TickFrequencyProperty(): DependencyProperty? {
      val fnPtr = _1773060360_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1773060360_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TickPlacementProperty(): DependencyProperty? {
      val fnPtr = _1773060360_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1773060360_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _1773060360_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1773060360_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsDirectionReversedProperty(): DependencyProperty? {
      val fnPtr = _1773060360_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1773060360_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_IsThumbToolTipEnabledProperty(): DependencyProperty? {
      val fnPtr = _1773060360_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1773060360_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ThumbToolTipValueConverterProperty(): DependencyProperty? {
      val fnPtr = _1773060360_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1773060360_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISliderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1773060360_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISliderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a4363d77fdf4d3098fece78c05b31cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISliderStatics(ptr: Pointer?): WithDefault = ISliderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISliderStatics {
      val address = segment.toRawLongValue()
      return makeISliderStatics(Pointer(address))
    }

    public override fun toNative(obj: ISliderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1773060360_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISliderStatics): Array<ISliderStatics?> = (elements as
        Array<ISliderStatics?>).castToImpl<ISliderStatics,ISliderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISliderStatics?> =
        arrayOfNulls<ISliderStatics_Impl>(size) as Array<ISliderStatics?>
  }
}
