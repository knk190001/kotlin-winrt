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

@ABIMarker(IPointerUpThemeAnimationStatics.ABI::class)
@Signature("{51a3117e-c6fa-5dc5-8db8-73f060003ae4}")
@Guid("51a3117ec6fa5dc58db873f060003ae4")
@WinRTInterface("51a3117ec6fa5dc58db873f060003ae4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerUpThemeAnimationStatics.ByReference::class)
public interface IPointerUpThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetNameProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerUpThemeAnimationStatics> {
    public override fun getValue() = ABI.makeIPointerUpThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: IPointerUpThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerUpThemeAnimationStatics {
    public val __358747795_Ptr: Pointer?

    public val _358747795_VtblPtr: Pointer?
      get() = __358747795_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetNameProperty(): DependencyProperty? {
      val fnPtr = _358747795_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__358747795_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPointerUpThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __358747795_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerUpThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("51a3117ec6fa5dc58db873f060003ae4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerUpThemeAnimationStatics(ptr: Pointer?): WithDefault =
        IPointerUpThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerUpThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeIPointerUpThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: IPointerUpThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__358747795_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerUpThemeAnimationStatics):
        Array<IPointerUpThemeAnimationStatics?> = (elements as
        Array<IPointerUpThemeAnimationStatics?>).castToImpl<IPointerUpThemeAnimationStatics,IPointerUpThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerUpThemeAnimationStatics?> =
        arrayOfNulls<IPointerUpThemeAnimationStatics_Impl>(size) as
        Array<IPointerUpThemeAnimationStatics?>
  }
}
