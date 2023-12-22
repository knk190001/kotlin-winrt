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

@ABIMarker(IDelegatedInkTrailVisualStatics.ABI::class)
@Signature("{0daf6bd5-42c6-555c-9267-e0ac663af836}")
@Guid("0daf6bd542c6555c9267e0ac663af836")
@WinRTInterface("0daf6bd542c6555c9267e0ac663af836")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDelegatedInkTrailVisualStatics.ByReference::class)
public interface IDelegatedInkTrailVisualStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): DelegatedInkTrailVisual?

  @InterfaceMethod(1)
  public fun CreateForSwapChain(compositor: Compositor?, swapChain: ICompositionSurface?):
      DelegatedInkTrailVisual?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDelegatedInkTrailVisualStatics> {
    public override fun getValue() = ABI.makeIDelegatedInkTrailVisualStatics(pointer.getPointer(0))

    public fun setValue(value: IDelegatedInkTrailVisualStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDelegatedInkTrailVisualStatics {
    public val __528434316_Ptr: Pointer?

    public val _528434316_VtblPtr: Pointer?
      get() = __528434316_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): DelegatedInkTrailVisual? {
      val fnPtr = _528434316_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DelegatedInkTrailVisual>()
      val hr = fn.invokeHR(arrayOf(__528434316_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DelegatedInkTrailVisual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateForSwapChain(compositor: Compositor?,
        swapChain: ICompositionSurface?): DelegatedInkTrailVisual? {
      val fnPtr = _528434316_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DelegatedInkTrailVisual>()
      val hr = fn.invokeHR(arrayOf(__528434316_Ptr, marshalToNative(compositor),
          marshalToNative(swapChain), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DelegatedInkTrailVisual>(result.getValue())
      return resultValue
    }
  }

  public class IDelegatedInkTrailVisualStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __528434316_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDelegatedInkTrailVisualStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0daf6bd542c6555c9267e0ac663af836")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDelegatedInkTrailVisualStatics(ptr: Pointer?): WithDefault =
        IDelegatedInkTrailVisualStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDelegatedInkTrailVisualStatics {
      val address = segment.toRawLongValue()
      return makeIDelegatedInkTrailVisualStatics(Pointer(address))
    }

    public override fun toNative(obj: IDelegatedInkTrailVisualStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__528434316_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDelegatedInkTrailVisualStatics):
        Array<IDelegatedInkTrailVisualStatics?> = (elements as
        Array<IDelegatedInkTrailVisualStatics?>).castToImpl<IDelegatedInkTrailVisualStatics,IDelegatedInkTrailVisualStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDelegatedInkTrailVisualStatics?> =
        arrayOfNulls<IDelegatedInkTrailVisualStatics_Impl>(size) as
        Array<IDelegatedInkTrailVisualStatics?>
  }
}
