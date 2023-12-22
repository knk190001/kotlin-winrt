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

@ABIMarker(INavigationThemeTransitionStatics.ABI::class)
@Signature("{78323eff-d543-551d-b2c7-94e93a16065b}")
@Guid("78323effd543551db2c794e93a16065b")
@WinRTInterface("78323effd543551db2c794e93a16065b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationThemeTransitionStatics.ByReference::class)
public interface INavigationThemeTransitionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DefaultNavigationTransitionInfoProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationThemeTransitionStatics> {
    public override fun getValue() =
        ABI.makeINavigationThemeTransitionStatics(pointer.getPointer(0))

    public fun setValue(value: INavigationThemeTransitionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationThemeTransitionStatics {
    public val __324343574_Ptr: Pointer?

    public val _324343574_VtblPtr: Pointer?
      get() = __324343574_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DefaultNavigationTransitionInfoProperty(): DependencyProperty? {
      val fnPtr = _324343574_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__324343574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INavigationThemeTransitionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __324343574_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationThemeTransitionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("78323effd543551db2c794e93a16065b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationThemeTransitionStatics(ptr: Pointer?): WithDefault =
        INavigationThemeTransitionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationThemeTransitionStatics {
      val address = segment.toRawLongValue()
      return makeINavigationThemeTransitionStatics(Pointer(address))
    }

    public override fun toNative(obj: INavigationThemeTransitionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__324343574_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationThemeTransitionStatics):
        Array<INavigationThemeTransitionStatics?> = (elements as
        Array<INavigationThemeTransitionStatics?>).castToImpl<INavigationThemeTransitionStatics,INavigationThemeTransitionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationThemeTransitionStatics?> =
        arrayOfNulls<INavigationThemeTransitionStatics_Impl>(size) as
        Array<INavigationThemeTransitionStatics?>
  }
}
