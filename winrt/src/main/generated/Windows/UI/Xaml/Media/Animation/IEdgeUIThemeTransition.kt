package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.Controls.Primitives.EdgeTransitionLocation
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

@ABIMarker(IEdgeUIThemeTransition.ABI::class)
@Signature("{5c86c19b-49d7-19ec-cf19-83a73c6de75e}")
@Guid("5c86c19b49d719eccf1983a73c6de75e")
@WinRTInterface("5c86c19b49d719eccf1983a73c6de75e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEdgeUIThemeTransition.ByReference::class)
public interface IEdgeUIThemeTransition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Edge(): EdgeTransitionLocation?

  @InterfaceMethod(1)
  public fun put_Edge(value: EdgeTransitionLocation?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEdgeUIThemeTransition> {
    public override fun getValue() = ABI.makeIEdgeUIThemeTransition(pointer.getPointer(0))

    public fun setValue(value: IEdgeUIThemeTransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEdgeUIThemeTransition {
    public val __1928525721_Ptr: Pointer?

    public val _1928525721_VtblPtr: Pointer?
      get() = __1928525721_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Edge(): EdgeTransitionLocation? {
      val fnPtr = _1928525721_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EdgeTransitionLocation>()
      val hr = fn.invokeHR(arrayOf(__1928525721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EdgeTransitionLocation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Edge(value: EdgeTransitionLocation?): Unit {
      val fnPtr = _1928525721_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1928525721_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEdgeUIThemeTransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1928525721_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEdgeUIThemeTransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c86c19b49d719eccf1983a73c6de75e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEdgeUIThemeTransition(ptr: Pointer?): WithDefault =
        IEdgeUIThemeTransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEdgeUIThemeTransition {
      val address = segment.toRawLongValue()
      return makeIEdgeUIThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: IEdgeUIThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1928525721_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEdgeUIThemeTransition): Array<IEdgeUIThemeTransition?> =
        (elements as
        Array<IEdgeUIThemeTransition?>).castToImpl<IEdgeUIThemeTransition,IEdgeUIThemeTransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEdgeUIThemeTransition?> =
        arrayOfNulls<IEdgeUIThemeTransition_Impl>(size) as Array<IEdgeUIThemeTransition?>
  }
}
