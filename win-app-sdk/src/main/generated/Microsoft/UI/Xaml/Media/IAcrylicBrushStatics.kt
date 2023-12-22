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

@ABIMarker(IAcrylicBrushStatics.ABI::class)
@Signature("{9d9d366b-00a3-5f3e-98b8-1df7fec1828c}")
@Guid("9d9d366b00a35f3e98b81df7fec1828c")
@WinRTInterface("9d9d366b00a35f3e98b81df7fec1828c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAcrylicBrushStatics.ByReference::class)
public interface IAcrylicBrushStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TintColorProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TintOpacityProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_TintTransitionDurationProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_AlwaysUseFallbackProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAcrylicBrushStatics> {
    public override fun getValue() = ABI.makeIAcrylicBrushStatics(pointer.getPointer(0))

    public fun setValue(value: IAcrylicBrushStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAcrylicBrushStatics {
    public val __796585975_Ptr: Pointer?

    public val _796585975_VtblPtr: Pointer?
      get() = __796585975_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TintColorProperty(): DependencyProperty? {
      val fnPtr = _796585975_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__796585975_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TintOpacityProperty(): DependencyProperty? {
      val fnPtr = _796585975_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__796585975_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TintTransitionDurationProperty(): DependencyProperty? {
      val fnPtr = _796585975_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__796585975_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AlwaysUseFallbackProperty(): DependencyProperty? {
      val fnPtr = _796585975_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__796585975_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAcrylicBrushStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __796585975_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAcrylicBrushStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d9d366b00a35f3e98b81df7fec1828c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAcrylicBrushStatics(ptr: Pointer?): WithDefault = IAcrylicBrushStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAcrylicBrushStatics {
      val address = segment.toRawLongValue()
      return makeIAcrylicBrushStatics(Pointer(address))
    }

    public override fun toNative(obj: IAcrylicBrushStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__796585975_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAcrylicBrushStatics): Array<IAcrylicBrushStatics?> =
        (elements as
        Array<IAcrylicBrushStatics?>).castToImpl<IAcrylicBrushStatics,IAcrylicBrushStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAcrylicBrushStatics?> =
        arrayOfNulls<IAcrylicBrushStatics_Impl>(size) as Array<IAcrylicBrushStatics?>
  }
}
