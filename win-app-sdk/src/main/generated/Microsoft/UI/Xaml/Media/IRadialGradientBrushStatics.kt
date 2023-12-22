package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IRadialGradientBrushStatics.ABI::class)
@Signature("{f275a0b8-66f9-5b7d-a415-7eda65fe6dd3}")
@Guid("f275a0b866f95b7da4157eda65fe6dd3")
@WinRTInterface("f275a0b866f95b7da4157eda65fe6dd3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialGradientBrushStatics.ByReference::class)
public interface IRadialGradientBrushStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CenterProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_RadiusXProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_RadiusYProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_GradientOriginProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_InterpolationSpaceProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_MappingModeProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_SpreadMethodProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialGradientBrushStatics> {
    public override fun getValue() = ABI.makeIRadialGradientBrushStatics(pointer.getPointer(0))

    public fun setValue(value: IRadialGradientBrushStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialGradientBrushStatics {
    public val __1314859989_Ptr: Pointer?

    public val _1314859989_VtblPtr: Pointer?
      get() = __1314859989_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CenterProperty(): DependencyProperty? {
      val fnPtr = _1314859989_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1314859989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RadiusXProperty(): DependencyProperty? {
      val fnPtr = _1314859989_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1314859989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RadiusYProperty(): DependencyProperty? {
      val fnPtr = _1314859989_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1314859989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_GradientOriginProperty(): DependencyProperty? {
      val fnPtr = _1314859989_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1314859989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_InterpolationSpaceProperty(): DependencyProperty? {
      val fnPtr = _1314859989_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1314859989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MappingModeProperty(): DependencyProperty? {
      val fnPtr = _1314859989_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1314859989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_SpreadMethodProperty(): DependencyProperty? {
      val fnPtr = _1314859989_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1314859989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRadialGradientBrushStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1314859989_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialGradientBrushStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f275a0b866f95b7da4157eda65fe6dd3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialGradientBrushStatics(ptr: Pointer?): WithDefault =
        IRadialGradientBrushStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialGradientBrushStatics {
      val address = segment.toRawLongValue()
      return makeIRadialGradientBrushStatics(Pointer(address))
    }

    public override fun toNative(obj: IRadialGradientBrushStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1314859989_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialGradientBrushStatics):
        Array<IRadialGradientBrushStatics?> = (elements as
        Array<IRadialGradientBrushStatics?>).castToImpl<IRadialGradientBrushStatics,IRadialGradientBrushStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialGradientBrushStatics?> =
        arrayOfNulls<IRadialGradientBrushStatics_Impl>(size) as Array<IRadialGradientBrushStatics?>
  }
}
