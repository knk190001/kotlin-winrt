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

@ABIMarker(IPopOutThemeAnimationStatics.ABI::class)
@Signature("{1d492c09-03c1-4490-99dc-909feab357fb}")
@Guid("1d492c0903c1449099dc909feab357fb")
@WinRTInterface("1d492c0903c1449099dc909feab357fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopOutThemeAnimationStatics.ByReference::class)
public interface IPopOutThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetNameProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPopOutThemeAnimationStatics> {
    public override fun getValue() = ABI.makeIPopOutThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: IPopOutThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopOutThemeAnimationStatics {
    public val __1360920199_Ptr: Pointer?

    public val _1360920199_VtblPtr: Pointer?
      get() = __1360920199_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetNameProperty(): DependencyProperty? {
      val fnPtr = _1360920199_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1360920199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPopOutThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1360920199_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopOutThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d492c0903c1449099dc909feab357fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopOutThemeAnimationStatics(ptr: Pointer?): WithDefault =
        IPopOutThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopOutThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeIPopOutThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: IPopOutThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1360920199_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopOutThemeAnimationStatics):
        Array<IPopOutThemeAnimationStatics?> = (elements as
        Array<IPopOutThemeAnimationStatics?>).castToImpl<IPopOutThemeAnimationStatics,IPopOutThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopOutThemeAnimationStatics?> =
        arrayOfNulls<IPopOutThemeAnimationStatics_Impl>(size) as
        Array<IPopOutThemeAnimationStatics?>
  }
}
