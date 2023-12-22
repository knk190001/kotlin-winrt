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

@ABIMarker(ILinearGradientBrushStatics.ABI::class)
@Signature("{df029e84-f6be-5b7e-ba22-3b4e7a6bceee}")
@Guid("df029e84f6be5b7eba223b4e7a6bceee")
@WinRTInterface("df029e84f6be5b7eba223b4e7a6bceee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILinearGradientBrushStatics.ByReference::class)
public interface ILinearGradientBrushStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartPointProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_EndPointProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILinearGradientBrushStatics> {
    public override fun getValue() = ABI.makeILinearGradientBrushStatics(pointer.getPointer(0))

    public fun setValue(value: ILinearGradientBrushStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILinearGradientBrushStatics {
    public val __1024837071_Ptr: Pointer?

    public val _1024837071_VtblPtr: Pointer?
      get() = __1024837071_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartPointProperty(): DependencyProperty? {
      val fnPtr = _1024837071_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1024837071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EndPointProperty(): DependencyProperty? {
      val fnPtr = _1024837071_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1024837071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ILinearGradientBrushStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1024837071_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILinearGradientBrushStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df029e84f6be5b7eba223b4e7a6bceee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILinearGradientBrushStatics(ptr: Pointer?): WithDefault =
        ILinearGradientBrushStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILinearGradientBrushStatics {
      val address = segment.toRawLongValue()
      return makeILinearGradientBrushStatics(Pointer(address))
    }

    public override fun toNative(obj: ILinearGradientBrushStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1024837071_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILinearGradientBrushStatics):
        Array<ILinearGradientBrushStatics?> = (elements as
        Array<ILinearGradientBrushStatics?>).castToImpl<ILinearGradientBrushStatics,ILinearGradientBrushStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILinearGradientBrushStatics?> =
        arrayOfNulls<ILinearGradientBrushStatics_Impl>(size) as Array<ILinearGradientBrushStatics?>
  }
}
