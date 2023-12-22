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

@ABIMarker(IRepositionThemeTransitionStatics.ABI::class)
@Signature("{c70a0f9a-485e-53bb-ad3c-8b41b6788bf9}")
@Guid("c70a0f9a485e53bbad3c8b41b6788bf9")
@WinRTInterface("c70a0f9a485e53bbad3c8b41b6788bf9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepositionThemeTransitionStatics.ByReference::class)
public interface IRepositionThemeTransitionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsStaggeringEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepositionThemeTransitionStatics> {
    public override fun getValue() =
        ABI.makeIRepositionThemeTransitionStatics(pointer.getPointer(0))

    public fun setValue(value: IRepositionThemeTransitionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepositionThemeTransitionStatics {
    public val __1881052322_Ptr: Pointer?

    public val _1881052322_VtblPtr: Pointer?
      get() = __1881052322_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsStaggeringEnabledProperty(): DependencyProperty? {
      val fnPtr = _1881052322_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1881052322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRepositionThemeTransitionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1881052322_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepositionThemeTransitionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c70a0f9a485e53bbad3c8b41b6788bf9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepositionThemeTransitionStatics(ptr: Pointer?): WithDefault =
        IRepositionThemeTransitionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepositionThemeTransitionStatics {
      val address = segment.toRawLongValue()
      return makeIRepositionThemeTransitionStatics(Pointer(address))
    }

    public override fun toNative(obj: IRepositionThemeTransitionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1881052322_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepositionThemeTransitionStatics):
        Array<IRepositionThemeTransitionStatics?> = (elements as
        Array<IRepositionThemeTransitionStatics?>).castToImpl<IRepositionThemeTransitionStatics,IRepositionThemeTransitionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepositionThemeTransitionStatics?> =
        arrayOfNulls<IRepositionThemeTransitionStatics_Impl>(size) as
        Array<IRepositionThemeTransitionStatics?>
  }
}
