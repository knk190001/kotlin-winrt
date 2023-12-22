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

@ABIMarker(IObjectAnimationUsingKeyFramesStatics.ABI::class)
@Signature("{eb736182-6af1-49a3-97b6-783ed97400fe}")
@Guid("eb7361826af149a397b6783ed97400fe")
@WinRTInterface("eb7361826af149a397b6783ed97400fe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IObjectAnimationUsingKeyFramesStatics.ByReference::class)
public interface IObjectAnimationUsingKeyFramesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnableDependentAnimationProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IObjectAnimationUsingKeyFramesStatics> {
    public override fun getValue() =
        ABI.makeIObjectAnimationUsingKeyFramesStatics(pointer.getPointer(0))

    public fun setValue(value: IObjectAnimationUsingKeyFramesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IObjectAnimationUsingKeyFramesStatics {
    public val __877762107_Ptr: Pointer?

    public val _877762107_VtblPtr: Pointer?
      get() = __877762107_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnableDependentAnimationProperty(): DependencyProperty? {
      val fnPtr = _877762107_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__877762107_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IObjectAnimationUsingKeyFramesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __877762107_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IObjectAnimationUsingKeyFramesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb7361826af149a397b6783ed97400fe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIObjectAnimationUsingKeyFramesStatics(ptr: Pointer?): WithDefault =
        IObjectAnimationUsingKeyFramesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IObjectAnimationUsingKeyFramesStatics {
      val address = segment.toRawLongValue()
      return makeIObjectAnimationUsingKeyFramesStatics(Pointer(address))
    }

    public override fun toNative(obj: IObjectAnimationUsingKeyFramesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__877762107_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IObjectAnimationUsingKeyFramesStatics):
        Array<IObjectAnimationUsingKeyFramesStatics?> = (elements as
        Array<IObjectAnimationUsingKeyFramesStatics?>).castToImpl<IObjectAnimationUsingKeyFramesStatics,IObjectAnimationUsingKeyFramesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IObjectAnimationUsingKeyFramesStatics?> =
        arrayOfNulls<IObjectAnimationUsingKeyFramesStatics_Impl>(size) as
        Array<IObjectAnimationUsingKeyFramesStatics?>
  }
}
