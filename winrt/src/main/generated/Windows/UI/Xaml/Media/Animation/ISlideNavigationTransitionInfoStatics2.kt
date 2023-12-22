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

@ABIMarker(ISlideNavigationTransitionInfoStatics2.ABI::class)
@Signature("{8a861baa-981a-5ace-9f85-cb7fde648a67}")
@Guid("8a861baa981a5ace9f85cb7fde648a67")
@WinRTInterface("8a861baa981a5ace9f85cb7fde648a67")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISlideNavigationTransitionInfoStatics2.ByReference::class)
public interface ISlideNavigationTransitionInfoStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EffectProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISlideNavigationTransitionInfoStatics2> {
    public override fun getValue() =
        ABI.makeISlideNavigationTransitionInfoStatics2(pointer.getPointer(0))

    public fun setValue(value: ISlideNavigationTransitionInfoStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISlideNavigationTransitionInfoStatics2 {
    public val __129020047_Ptr: Pointer?

    public val _129020047_VtblPtr: Pointer?
      get() = __129020047_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EffectProperty(): DependencyProperty? {
      val fnPtr = _129020047_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__129020047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISlideNavigationTransitionInfoStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __129020047_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISlideNavigationTransitionInfoStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a861baa981a5ace9f85cb7fde648a67")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISlideNavigationTransitionInfoStatics2(ptr: Pointer?): WithDefault =
        ISlideNavigationTransitionInfoStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISlideNavigationTransitionInfoStatics2 {
      val address = segment.toRawLongValue()
      return makeISlideNavigationTransitionInfoStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISlideNavigationTransitionInfoStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__129020047_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISlideNavigationTransitionInfoStatics2):
        Array<ISlideNavigationTransitionInfoStatics2?> = (elements as
        Array<ISlideNavigationTransitionInfoStatics2?>).castToImpl<ISlideNavigationTransitionInfoStatics2,ISlideNavigationTransitionInfoStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISlideNavigationTransitionInfoStatics2?> =
        arrayOfNulls<ISlideNavigationTransitionInfoStatics2_Impl>(size) as
        Array<ISlideNavigationTransitionInfoStatics2?>
  }
}
