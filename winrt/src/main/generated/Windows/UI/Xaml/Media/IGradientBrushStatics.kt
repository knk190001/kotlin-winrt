package Windows.UI.Xaml.Media

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

@ABIMarker(IGradientBrushStatics.ABI::class)
@Signature("{961661f9-8bb4-4e6c-b923-b5d787e0f1a9}")
@Guid("961661f98bb44e6cb923b5d787e0f1a9")
@WinRTInterface("961661f98bb44e6cb923b5d787e0f1a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGradientBrushStatics.ByReference::class)
public interface IGradientBrushStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SpreadMethodProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_MappingModeProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ColorInterpolationModeProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_GradientStopsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGradientBrushStatics> {
    public override fun getValue() = ABI.makeIGradientBrushStatics(pointer.getPointer(0))

    public fun setValue(value: IGradientBrushStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGradientBrushStatics {
    public val __2145088905_Ptr: Pointer?

    public val _2145088905_VtblPtr: Pointer?
      get() = __2145088905_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SpreadMethodProperty(): DependencyProperty? {
      val fnPtr = _2145088905_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2145088905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MappingModeProperty(): DependencyProperty? {
      val fnPtr = _2145088905_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2145088905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ColorInterpolationModeProperty(): DependencyProperty? {
      val fnPtr = _2145088905_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2145088905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_GradientStopsProperty(): DependencyProperty? {
      val fnPtr = _2145088905_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2145088905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IGradientBrushStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2145088905_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGradientBrushStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("961661f98bb44e6cb923b5d787e0f1a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGradientBrushStatics(ptr: Pointer?): WithDefault =
        IGradientBrushStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGradientBrushStatics {
      val address = segment.toRawLongValue()
      return makeIGradientBrushStatics(Pointer(address))
    }

    public override fun toNative(obj: IGradientBrushStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2145088905_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGradientBrushStatics): Array<IGradientBrushStatics?> =
        (elements as
        Array<IGradientBrushStatics?>).castToImpl<IGradientBrushStatics,IGradientBrushStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGradientBrushStatics?> =
        arrayOfNulls<IGradientBrushStatics_Impl>(size) as Array<IGradientBrushStatics?>
  }
}
