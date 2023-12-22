package Microsoft.UI.Composition

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

@ABIMarker(ICompositorWithRadialGradient.ABI::class)
@Signature("{fa4f8f7d-5cc7-5c9c-883b-fe878a2f3e30}")
@Guid("fa4f8f7d5cc75c9c883bfe878a2f3e30")
@WinRTInterface("fa4f8f7d5cc75c9c883bfe878a2f3e30")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositorWithRadialGradient.ByReference::class)
public interface ICompositorWithRadialGradient : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateRadialGradientBrush(): CompositionRadialGradientBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositorWithRadialGradient> {
    public override fun getValue() = ABI.makeICompositorWithRadialGradient(pointer.getPointer(0))

    public fun setValue(value: ICompositorWithRadialGradient_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositorWithRadialGradient {
    public val __1860171599_Ptr: Pointer?

    public val _1860171599_VtblPtr: Pointer?
      get() = __1860171599_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateRadialGradientBrush(): CompositionRadialGradientBrush? {
      val fnPtr = _1860171599_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionRadialGradientBrush>()
      val hr = fn.invokeHR(arrayOf(__1860171599_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionRadialGradientBrush>(result.getValue())
      return resultValue
    }
  }

  public class ICompositorWithRadialGradient_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1860171599_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositorWithRadialGradient, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa4f8f7d5cc75c9c883bfe878a2f3e30")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositorWithRadialGradient(ptr: Pointer?): WithDefault =
        ICompositorWithRadialGradient_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositorWithRadialGradient {
      val address = segment.toRawLongValue()
      return makeICompositorWithRadialGradient(Pointer(address))
    }

    public override fun toNative(obj: ICompositorWithRadialGradient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1860171599_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositorWithRadialGradient):
        Array<ICompositorWithRadialGradient?> = (elements as
        Array<ICompositorWithRadialGradient?>).castToImpl<ICompositorWithRadialGradient,ICompositorWithRadialGradient_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositorWithRadialGradient?> =
        arrayOfNulls<ICompositorWithRadialGradient_Impl>(size) as
        Array<ICompositorWithRadialGradient?>
  }
}
