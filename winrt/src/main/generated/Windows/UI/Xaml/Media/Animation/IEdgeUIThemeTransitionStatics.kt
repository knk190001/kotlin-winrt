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

@ABIMarker(IEdgeUIThemeTransitionStatics.ABI::class)
@Signature("{16a2b13b-4705-302b-27c6-2aac92f645ac}")
@Guid("16a2b13b4705302b27c62aac92f645ac")
@WinRTInterface("16a2b13b4705302b27c62aac92f645ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEdgeUIThemeTransitionStatics.ByReference::class)
public interface IEdgeUIThemeTransitionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EdgeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEdgeUIThemeTransitionStatics> {
    public override fun getValue() = ABI.makeIEdgeUIThemeTransitionStatics(pointer.getPointer(0))

    public fun setValue(value: IEdgeUIThemeTransitionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEdgeUIThemeTransitionStatics {
    public val __512254626_Ptr: Pointer?

    public val _512254626_VtblPtr: Pointer?
      get() = __512254626_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EdgeProperty(): DependencyProperty? {
      val fnPtr = _512254626_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__512254626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IEdgeUIThemeTransitionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __512254626_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEdgeUIThemeTransitionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16a2b13b4705302b27c62aac92f645ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEdgeUIThemeTransitionStatics(ptr: Pointer?): WithDefault =
        IEdgeUIThemeTransitionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEdgeUIThemeTransitionStatics {
      val address = segment.toRawLongValue()
      return makeIEdgeUIThemeTransitionStatics(Pointer(address))
    }

    public override fun toNative(obj: IEdgeUIThemeTransitionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__512254626_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEdgeUIThemeTransitionStatics):
        Array<IEdgeUIThemeTransitionStatics?> = (elements as
        Array<IEdgeUIThemeTransitionStatics?>).castToImpl<IEdgeUIThemeTransitionStatics,IEdgeUIThemeTransitionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEdgeUIThemeTransitionStatics?> =
        arrayOfNulls<IEdgeUIThemeTransitionStatics_Impl>(size) as
        Array<IEdgeUIThemeTransitionStatics?>
  }
}
