package Microsoft.UI.Xaml.Media

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

@ABIMarker(IGradientBrush.ABI::class)
@Signature("{77c347fa-c4c4-5174-a945-65cab3aa1c75}")
@Guid("77c347fac4c45174a94565cab3aa1c75")
@WinRTInterface("77c347fac4c45174a94565cab3aa1c75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGradientBrush.ByReference::class)
public interface IGradientBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SpreadMethod(): GradientSpreadMethod?

  @InterfaceMethod(1)
  public fun put_SpreadMethod(value: GradientSpreadMethod?): Unit

  @InterfaceMethod(2)
  public fun get_MappingMode(): BrushMappingMode?

  @InterfaceMethod(3)
  public fun put_MappingMode(value: BrushMappingMode?): Unit

  @InterfaceMethod(4)
  public fun get_ColorInterpolationMode(): ColorInterpolationMode?

  @InterfaceMethod(5)
  public fun put_ColorInterpolationMode(value: ColorInterpolationMode?): Unit

  @InterfaceMethod(6)
  public fun get_GradientStops(): GradientStopCollection?

  @InterfaceMethod(7)
  public fun put_GradientStops(value: GradientStopCollection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGradientBrush>
      {
    public override fun getValue() = ABI.makeIGradientBrush(pointer.getPointer(0))

    public fun setValue(value: IGradientBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGradientBrush {
    public val __1957737127_Ptr: Pointer?

    public val _1957737127_VtblPtr: Pointer?
      get() = __1957737127_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SpreadMethod(): GradientSpreadMethod? {
      val fnPtr = _1957737127_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GradientSpreadMethod>()
      val hr = fn.invokeHR(arrayOf(__1957737127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GradientSpreadMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SpreadMethod(value: GradientSpreadMethod?): Unit {
      val fnPtr = _1957737127_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1957737127_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MappingMode(): BrushMappingMode? {
      val fnPtr = _1957737127_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrushMappingMode>()
      val hr = fn.invokeHR(arrayOf(__1957737127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrushMappingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_MappingMode(value: BrushMappingMode?): Unit {
      val fnPtr = _1957737127_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1957737127_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ColorInterpolationMode(): ColorInterpolationMode? {
      val fnPtr = _1957737127_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorInterpolationMode>()
      val hr = fn.invokeHR(arrayOf(__1957737127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorInterpolationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ColorInterpolationMode(value: ColorInterpolationMode?): Unit {
      val fnPtr = _1957737127_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1957737127_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_GradientStops(): GradientStopCollection? {
      val fnPtr = _1957737127_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GradientStopCollection>()
      val hr = fn.invokeHR(arrayOf(__1957737127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GradientStopCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_GradientStops(value: GradientStopCollection?): Unit {
      val fnPtr = _1957737127_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1957737127_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGradientBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1957737127_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGradientBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("77c347fac4c45174a94565cab3aa1c75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGradientBrush(ptr: Pointer?): WithDefault = IGradientBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGradientBrush {
      val address = segment.toRawLongValue()
      return makeIGradientBrush(Pointer(address))
    }

    public override fun toNative(obj: IGradientBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1957737127_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGradientBrush): Array<IGradientBrush?> = (elements as
        Array<IGradientBrush?>).castToImpl<IGradientBrush,IGradientBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGradientBrush?> =
        arrayOfNulls<IGradientBrush_Impl>(size) as Array<IGradientBrush?>
  }
}
