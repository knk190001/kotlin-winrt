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

@ABIMarker(INavigationThemeTransition.ABI::class)
@Signature("{8833848c-4eb7-41f2-8799-9eef0a213b73}")
@Guid("8833848c4eb741f287999eef0a213b73")
@WinRTInterface("8833848c4eb741f287999eef0a213b73")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationThemeTransition.ByReference::class)
public interface INavigationThemeTransition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DefaultNavigationTransitionInfo(): NavigationTransitionInfo?

  @InterfaceMethod(1)
  public fun put_DefaultNavigationTransitionInfo(value: NavigationTransitionInfo?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationThemeTransition> {
    public override fun getValue() = ABI.makeINavigationThemeTransition(pointer.getPointer(0))

    public fun setValue(value: INavigationThemeTransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationThemeTransition {
    public val __1575712764_Ptr: Pointer?

    public val _1575712764_VtblPtr: Pointer?
      get() = __1575712764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DefaultNavigationTransitionInfo(): NavigationTransitionInfo? {
      val fnPtr = _1575712764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationTransitionInfo>()
      val hr = fn.invokeHR(arrayOf(__1575712764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationTransitionInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DefaultNavigationTransitionInfo(value: NavigationTransitionInfo?):
        Unit {
      val fnPtr = _1575712764_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1575712764_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INavigationThemeTransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1575712764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationThemeTransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8833848c4eb741f287999eef0a213b73")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationThemeTransition(ptr: Pointer?): WithDefault =
        INavigationThemeTransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationThemeTransition {
      val address = segment.toRawLongValue()
      return makeINavigationThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: INavigationThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1575712764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationThemeTransition):
        Array<INavigationThemeTransition?> = (elements as
        Array<INavigationThemeTransition?>).castToImpl<INavigationThemeTransition,INavigationThemeTransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationThemeTransition?> =
        arrayOfNulls<INavigationThemeTransition_Impl>(size) as Array<INavigationThemeTransition?>
  }
}
