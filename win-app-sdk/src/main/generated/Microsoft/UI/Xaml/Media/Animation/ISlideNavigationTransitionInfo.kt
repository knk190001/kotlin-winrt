package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(ISlideNavigationTransitionInfo.ABI::class)
@Signature("{53eade0e-6b01-511f-a563-6f5724a6c1c1}")
@Guid("53eade0e6b01511fa5636f5724a6c1c1")
@WinRTInterface("53eade0e6b01511fa5636f5724a6c1c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISlideNavigationTransitionInfo.ByReference::class)
public interface ISlideNavigationTransitionInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Effect(): SlideNavigationTransitionEffect?

  @InterfaceMethod(1)
  public fun put_Effect(value: SlideNavigationTransitionEffect?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISlideNavigationTransitionInfo> {
    public override fun getValue() = ABI.makeISlideNavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: ISlideNavigationTransitionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISlideNavigationTransitionInfo {
    public val __1634995597_Ptr: Pointer?

    public val _1634995597_VtblPtr: Pointer?
      get() = __1634995597_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Effect(): SlideNavigationTransitionEffect? {
      val fnPtr = _1634995597_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SlideNavigationTransitionEffect>()
      val hr = fn.invokeHR(arrayOf(__1634995597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SlideNavigationTransitionEffect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Effect(value: SlideNavigationTransitionEffect?): Unit {
      val fnPtr = _1634995597_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1634995597_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISlideNavigationTransitionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1634995597_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISlideNavigationTransitionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53eade0e6b01511fa5636f5724a6c1c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISlideNavigationTransitionInfo(ptr: Pointer?): WithDefault =
        ISlideNavigationTransitionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISlideNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return makeISlideNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: ISlideNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1634995597_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISlideNavigationTransitionInfo):
        Array<ISlideNavigationTransitionInfo?> = (elements as
        Array<ISlideNavigationTransitionInfo?>).castToImpl<ISlideNavigationTransitionInfo,ISlideNavigationTransitionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISlideNavigationTransitionInfo?> =
        arrayOfNulls<ISlideNavigationTransitionInfo_Impl>(size) as
        Array<ISlideNavigationTransitionInfo?>
  }
}
