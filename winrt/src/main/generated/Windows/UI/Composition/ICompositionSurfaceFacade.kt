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

@ABIMarker(ICompositionSurfaceFacade.ABI::class)
@Signature("{e01622c8-2332-55c7-8868-a7312c5c229d}")
@Guid("e01622c8233255c78868a7312c5c229d")
@WinRTInterface("e01622c8233255c78868a7312c5c229d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionSurfaceFacade.ByReference::class)
public interface ICompositionSurfaceFacade : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetRealSurface(): ICompositionSurface?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionSurfaceFacade> {
    public override fun getValue() = ABI.makeICompositionSurfaceFacade(pointer.getPointer(0))

    public fun setValue(value: ICompositionSurfaceFacade_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionSurfaceFacade {
    public val __1897759797_Ptr: Pointer?

    public val _1897759797_VtblPtr: Pointer?
      get() = __1897759797_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetRealSurface(): ICompositionSurface? {
      val fnPtr = _1897759797_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICompositionSurface>()
      val hr = fn.invokeHR(arrayOf(__1897759797_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICompositionSurface>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionSurfaceFacade_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1897759797_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionSurfaceFacade, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e01622c8233255c78868a7312c5c229d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionSurfaceFacade(ptr: Pointer?): WithDefault =
        ICompositionSurfaceFacade_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionSurfaceFacade {
      val address = segment.toRawLongValue()
      return makeICompositionSurfaceFacade(Pointer(address))
    }

    public override fun toNative(obj: ICompositionSurfaceFacade): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1897759797_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionSurfaceFacade):
        Array<ICompositionSurfaceFacade?> = (elements as
        Array<ICompositionSurfaceFacade?>).castToImpl<ICompositionSurfaceFacade,ICompositionSurfaceFacade_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionSurfaceFacade?> =
        arrayOfNulls<ICompositionSurfaceFacade_Impl>(size) as Array<ICompositionSurfaceFacade?>
  }
}
