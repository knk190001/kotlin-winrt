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

@ABIMarker(ISlideNavigationTransitionInfoStatics.ABI::class)
@Signature("{90ba0c6c-cd45-5a6c-bbb2-88037d43cd79}")
@Guid("90ba0c6ccd455a6cbbb288037d43cd79")
@WinRTInterface("90ba0c6ccd455a6cbbb288037d43cd79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISlideNavigationTransitionInfoStatics.ByReference::class)
public interface ISlideNavigationTransitionInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EffectProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISlideNavigationTransitionInfoStatics> {
    public override fun getValue() =
        ABI.makeISlideNavigationTransitionInfoStatics(pointer.getPointer(0))

    public fun setValue(value: ISlideNavigationTransitionInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISlideNavigationTransitionInfoStatics {
    public val __1820172664_Ptr: Pointer?

    public val _1820172664_VtblPtr: Pointer?
      get() = __1820172664_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EffectProperty(): DependencyProperty? {
      val fnPtr = _1820172664_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1820172664_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISlideNavigationTransitionInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1820172664_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISlideNavigationTransitionInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90ba0c6ccd455a6cbbb288037d43cd79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISlideNavigationTransitionInfoStatics(ptr: Pointer?): WithDefault =
        ISlideNavigationTransitionInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISlideNavigationTransitionInfoStatics {
      val address = segment.toRawLongValue()
      return makeISlideNavigationTransitionInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: ISlideNavigationTransitionInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1820172664_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISlideNavigationTransitionInfoStatics):
        Array<ISlideNavigationTransitionInfoStatics?> = (elements as
        Array<ISlideNavigationTransitionInfoStatics?>).castToImpl<ISlideNavigationTransitionInfoStatics,ISlideNavigationTransitionInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISlideNavigationTransitionInfoStatics?> =
        arrayOfNulls<ISlideNavigationTransitionInfoStatics_Impl>(size) as
        Array<ISlideNavigationTransitionInfoStatics?>
  }
}
