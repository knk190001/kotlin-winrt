package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IPointAnimationUsingKeyFramesStatics.ABI::class)
@Signature("{5f454c87-2390-46ea-baa7-762f4bc30d04}")
@Guid("5f454c87239046eabaa7762f4bc30d04")
@WinRTInterface("5f454c87239046eabaa7762f4bc30d04")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointAnimationUsingKeyFramesStatics.ByReference::class)
public interface IPointAnimationUsingKeyFramesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnableDependentAnimationProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointAnimationUsingKeyFramesStatics> {
    public override fun getValue() =
        ABI.makeIPointAnimationUsingKeyFramesStatics(pointer.getPointer(0))

    public fun setValue(value: IPointAnimationUsingKeyFramesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointAnimationUsingKeyFramesStatics {
    public val __1480984970_Ptr: Pointer?

    public val _1480984970_VtblPtr: Pointer?
      get() = __1480984970_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnableDependentAnimationProperty(): DependencyProperty? {
      val fnPtr = _1480984970_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1480984970_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPointAnimationUsingKeyFramesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1480984970_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointAnimationUsingKeyFramesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f454c87239046eabaa7762f4bc30d04")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointAnimationUsingKeyFramesStatics(ptr: Pointer?): WithDefault =
        IPointAnimationUsingKeyFramesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointAnimationUsingKeyFramesStatics {
      val address = segment.toRawLongValue()
      return makeIPointAnimationUsingKeyFramesStatics(Pointer(address))
    }

    public override fun toNative(obj: IPointAnimationUsingKeyFramesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1480984970_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointAnimationUsingKeyFramesStatics):
        Array<IPointAnimationUsingKeyFramesStatics?> = (elements as
        Array<IPointAnimationUsingKeyFramesStatics?>).castToImpl<IPointAnimationUsingKeyFramesStatics,IPointAnimationUsingKeyFramesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointAnimationUsingKeyFramesStatics?> =
        arrayOfNulls<IPointAnimationUsingKeyFramesStatics_Impl>(size) as
        Array<IPointAnimationUsingKeyFramesStatics?>
  }
}
