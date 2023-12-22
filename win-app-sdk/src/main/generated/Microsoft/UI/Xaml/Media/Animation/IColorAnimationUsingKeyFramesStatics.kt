package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IColorAnimationUsingKeyFramesStatics.ABI::class)
@Signature("{5b0f4840-0ef7-5ad7-a8f2-d49424ed906f}")
@Guid("5b0f48400ef75ad7a8f2d49424ed906f")
@WinRTInterface("5b0f48400ef75ad7a8f2d49424ed906f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorAnimationUsingKeyFramesStatics.ByReference::class)
public interface IColorAnimationUsingKeyFramesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnableDependentAnimationProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorAnimationUsingKeyFramesStatics> {
    public override fun getValue() =
        ABI.makeIColorAnimationUsingKeyFramesStatics(pointer.getPointer(0))

    public fun setValue(value: IColorAnimationUsingKeyFramesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorAnimationUsingKeyFramesStatics {
    public val __1447779336_Ptr: Pointer?

    public val _1447779336_VtblPtr: Pointer?
      get() = __1447779336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnableDependentAnimationProperty(): DependencyProperty? {
      val fnPtr = _1447779336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1447779336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IColorAnimationUsingKeyFramesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1447779336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorAnimationUsingKeyFramesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b0f48400ef75ad7a8f2d49424ed906f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorAnimationUsingKeyFramesStatics(ptr: Pointer?): WithDefault =
        IColorAnimationUsingKeyFramesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorAnimationUsingKeyFramesStatics {
      val address = segment.toRawLongValue()
      return makeIColorAnimationUsingKeyFramesStatics(Pointer(address))
    }

    public override fun toNative(obj: IColorAnimationUsingKeyFramesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1447779336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorAnimationUsingKeyFramesStatics):
        Array<IColorAnimationUsingKeyFramesStatics?> = (elements as
        Array<IColorAnimationUsingKeyFramesStatics?>).castToImpl<IColorAnimationUsingKeyFramesStatics,IColorAnimationUsingKeyFramesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorAnimationUsingKeyFramesStatics?> =
        arrayOfNulls<IColorAnimationUsingKeyFramesStatics_Impl>(size) as
        Array<IColorAnimationUsingKeyFramesStatics?>
  }
}
