package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(ISlideNavigationTransitionInfo2.ABI::class)
@Signature("{90e2d9c0-5c81-5001-8013-4fbfea4bf139}")
@Guid("90e2d9c05c81500180134fbfea4bf139")
@WinRTInterface("90e2d9c05c81500180134fbfea4bf139")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISlideNavigationTransitionInfo2.ByReference::class)
public interface ISlideNavigationTransitionInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Effect(): SlideNavigationTransitionEffect?

  @InterfaceMethod(1)
  public fun put_Effect(value: SlideNavigationTransitionEffect?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISlideNavigationTransitionInfo2> {
    public override fun getValue() = ABI.makeISlideNavigationTransitionInfo2(pointer.getPointer(0))

    public fun setValue(value: ISlideNavigationTransitionInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISlideNavigationTransitionInfo2 {
    public val __538585328_Ptr: Pointer?

    public val _538585328_VtblPtr: Pointer?
      get() = __538585328_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Effect(): SlideNavigationTransitionEffect? {
      val fnPtr = _538585328_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SlideNavigationTransitionEffect>()
      val hr = fn.invokeHR(arrayOf(__538585328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SlideNavigationTransitionEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Effect(value: SlideNavigationTransitionEffect?): Unit {
      val fnPtr = _538585328_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__538585328_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISlideNavigationTransitionInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __538585328_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISlideNavigationTransitionInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90e2d9c05c81500180134fbfea4bf139")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISlideNavigationTransitionInfo2(ptr: Pointer?): WithDefault =
        ISlideNavigationTransitionInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISlideNavigationTransitionInfo2 {
      val address = segment.toRawLongValue()
      return makeISlideNavigationTransitionInfo2(Pointer(address))
    }

    public override fun toNative(obj: ISlideNavigationTransitionInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__538585328_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISlideNavigationTransitionInfo2):
        Array<ISlideNavigationTransitionInfo2?> = (elements as
        Array<ISlideNavigationTransitionInfo2?>).castToImpl<ISlideNavigationTransitionInfo2,ISlideNavigationTransitionInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISlideNavigationTransitionInfo2?> =
        arrayOfNulls<ISlideNavigationTransitionInfo2_Impl>(size) as
        Array<ISlideNavigationTransitionInfo2?>
  }
}
