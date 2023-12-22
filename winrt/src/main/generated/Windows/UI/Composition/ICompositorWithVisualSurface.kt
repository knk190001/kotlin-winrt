package Windows.UI.Composition

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

@ABIMarker(ICompositorWithVisualSurface.ABI::class)
@Signature("{cfa1658b-0123-4551-8891-89bdcc40322b}")
@Guid("cfa1658b01234551889189bdcc40322b")
@WinRTInterface("cfa1658b01234551889189bdcc40322b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositorWithVisualSurface.ByReference::class)
public interface ICompositorWithVisualSurface : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateVisualSurface(): CompositionVisualSurface?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositorWithVisualSurface> {
    public override fun getValue() = ABI.makeICompositorWithVisualSurface(pointer.getPointer(0))

    public fun setValue(value: ICompositorWithVisualSurface_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositorWithVisualSurface {
    public val __1824472136_Ptr: Pointer?

    public val _1824472136_VtblPtr: Pointer?
      get() = __1824472136_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateVisualSurface(): CompositionVisualSurface? {
      val fnPtr = _1824472136_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionVisualSurface>()
      val hr = fn.invokeHR(arrayOf(__1824472136_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionVisualSurface>(result.getValue())
      return resultValue
    }
  }

  public class ICompositorWithVisualSurface_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1824472136_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositorWithVisualSurface, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cfa1658b01234551889189bdcc40322b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositorWithVisualSurface(ptr: Pointer?): WithDefault =
        ICompositorWithVisualSurface_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositorWithVisualSurface {
      val address = segment.toRawLongValue()
      return makeICompositorWithVisualSurface(Pointer(address))
    }

    public override fun toNative(obj: ICompositorWithVisualSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1824472136_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositorWithVisualSurface):
        Array<ICompositorWithVisualSurface?> = (elements as
        Array<ICompositorWithVisualSurface?>).castToImpl<ICompositorWithVisualSurface,ICompositorWithVisualSurface_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositorWithVisualSurface?> =
        arrayOfNulls<ICompositorWithVisualSurface_Impl>(size) as
        Array<ICompositorWithVisualSurface?>
  }
}
