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

@ABIMarker(IPointerDownThemeAnimationStatics.ABI::class)
@Signature("{12268b39-fb7d-53da-8ccc-5967dc06bce9}")
@Guid("12268b39fb7d53da8ccc5967dc06bce9")
@WinRTInterface("12268b39fb7d53da8ccc5967dc06bce9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerDownThemeAnimationStatics.ByReference::class)
public interface IPointerDownThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetNameProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerDownThemeAnimationStatics> {
    public override fun getValue() =
        ABI.makeIPointerDownThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: IPointerDownThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerDownThemeAnimationStatics {
    public val __1199390278_Ptr: Pointer?

    public val _1199390278_VtblPtr: Pointer?
      get() = __1199390278_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetNameProperty(): DependencyProperty? {
      val fnPtr = _1199390278_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1199390278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPointerDownThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1199390278_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerDownThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12268b39fb7d53da8ccc5967dc06bce9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerDownThemeAnimationStatics(ptr: Pointer?): WithDefault =
        IPointerDownThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerDownThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeIPointerDownThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: IPointerDownThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1199390278_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerDownThemeAnimationStatics):
        Array<IPointerDownThemeAnimationStatics?> = (elements as
        Array<IPointerDownThemeAnimationStatics?>).castToImpl<IPointerDownThemeAnimationStatics,IPointerDownThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerDownThemeAnimationStatics?> =
        arrayOfNulls<IPointerDownThemeAnimationStatics_Impl>(size) as
        Array<IPointerDownThemeAnimationStatics?>
  }
}
