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

@ABIMarker(IRepositionThemeTransitionStatics2.ABI::class)
@Signature("{9240e930-0a19-468b-8c2a-68fab4500027}")
@Guid("9240e9300a19468b8c2a68fab4500027")
@WinRTInterface("9240e9300a19468b8c2a68fab4500027")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepositionThemeTransitionStatics2.ByReference::class)
public interface IRepositionThemeTransitionStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsStaggeringEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepositionThemeTransitionStatics2> {
    public override fun getValue() =
        ABI.makeIRepositionThemeTransitionStatics2(pointer.getPointer(0))

    public fun setValue(value: IRepositionThemeTransitionStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepositionThemeTransitionStatics2 {
    public val __1636488681_Ptr: Pointer?

    public val _1636488681_VtblPtr: Pointer?
      get() = __1636488681_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsStaggeringEnabledProperty(): DependencyProperty? {
      val fnPtr = _1636488681_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1636488681_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRepositionThemeTransitionStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1636488681_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepositionThemeTransitionStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9240e9300a19468b8c2a68fab4500027")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepositionThemeTransitionStatics2(ptr: Pointer?): WithDefault =
        IRepositionThemeTransitionStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepositionThemeTransitionStatics2 {
      val address = segment.toRawLongValue()
      return makeIRepositionThemeTransitionStatics2(Pointer(address))
    }

    public override fun toNative(obj: IRepositionThemeTransitionStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1636488681_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepositionThemeTransitionStatics2):
        Array<IRepositionThemeTransitionStatics2?> = (elements as
        Array<IRepositionThemeTransitionStatics2?>).castToImpl<IRepositionThemeTransitionStatics2,IRepositionThemeTransitionStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepositionThemeTransitionStatics2?> =
        arrayOfNulls<IRepositionThemeTransitionStatics2_Impl>(size) as
        Array<IRepositionThemeTransitionStatics2?>
  }
}
