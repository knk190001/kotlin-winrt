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

@ABIMarker(IDoubleAnimationUsingKeyFramesStatics.ABI::class)
@Signature("{4c1c9bf1-3a03-5689-b18f-6c44251e13d9}")
@Guid("4c1c9bf13a035689b18f6c44251e13d9")
@WinRTInterface("4c1c9bf13a035689b18f6c44251e13d9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDoubleAnimationUsingKeyFramesStatics.ByReference::class)
public interface IDoubleAnimationUsingKeyFramesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnableDependentAnimationProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDoubleAnimationUsingKeyFramesStatics> {
    public override fun getValue() =
        ABI.makeIDoubleAnimationUsingKeyFramesStatics(pointer.getPointer(0))

    public fun setValue(value: IDoubleAnimationUsingKeyFramesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDoubleAnimationUsingKeyFramesStatics {
    public val __1105315916_Ptr: Pointer?

    public val _1105315916_VtblPtr: Pointer?
      get() = __1105315916_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnableDependentAnimationProperty(): DependencyProperty? {
      val fnPtr = _1105315916_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1105315916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDoubleAnimationUsingKeyFramesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1105315916_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDoubleAnimationUsingKeyFramesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c1c9bf13a035689b18f6c44251e13d9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDoubleAnimationUsingKeyFramesStatics(ptr: Pointer?): WithDefault =
        IDoubleAnimationUsingKeyFramesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDoubleAnimationUsingKeyFramesStatics {
      val address = segment.toRawLongValue()
      return makeIDoubleAnimationUsingKeyFramesStatics(Pointer(address))
    }

    public override fun toNative(obj: IDoubleAnimationUsingKeyFramesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1105315916_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDoubleAnimationUsingKeyFramesStatics):
        Array<IDoubleAnimationUsingKeyFramesStatics?> = (elements as
        Array<IDoubleAnimationUsingKeyFramesStatics?>).castToImpl<IDoubleAnimationUsingKeyFramesStatics,IDoubleAnimationUsingKeyFramesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDoubleAnimationUsingKeyFramesStatics?> =
        arrayOfNulls<IDoubleAnimationUsingKeyFramesStatics_Impl>(size) as
        Array<IDoubleAnimationUsingKeyFramesStatics?>
  }
}
