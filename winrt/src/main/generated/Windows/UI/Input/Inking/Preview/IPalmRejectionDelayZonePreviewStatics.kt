package Windows.UI.Input.Inking.Preview

import Windows.Foundation.Rect
import Windows.UI.Composition.Visual
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

@ABIMarker(IPalmRejectionDelayZonePreviewStatics.ABI::class)
@Signature("{cdef5ee0-93d0-53a9-8f0e-9a379f8f7530}")
@Guid("cdef5ee093d053a98f0e9a379f8f7530")
@WinRTInterface("cdef5ee093d053a98f0e9a379f8f7530")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPalmRejectionDelayZonePreviewStatics.ByReference::class)
public interface IPalmRejectionDelayZonePreviewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForVisual(inputPanelVisual: Visual?, inputPanelRect: Rect?):
      PalmRejectionDelayZonePreview?

  @InterfaceMethod(1)
  public fun CreateForVisual(
    inputPanelVisual: Visual?,
    inputPanelRect: Rect?,
    viewportVisual: Visual?,
    viewportRect: Rect?
  ): PalmRejectionDelayZonePreview?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPalmRejectionDelayZonePreviewStatics> {
    public override fun getValue() =
        ABI.makeIPalmRejectionDelayZonePreviewStatics(pointer.getPointer(0))

    public fun setValue(value: IPalmRejectionDelayZonePreviewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPalmRejectionDelayZonePreviewStatics {
    public val __1814057547_Ptr: Pointer?

    public val _1814057547_VtblPtr: Pointer?
      get() = __1814057547_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForVisual(inputPanelVisual: Visual?, inputPanelRect: Rect?):
        PalmRejectionDelayZonePreview? {
      val fnPtr = _1814057547_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PalmRejectionDelayZonePreview>()
      val hr = fn.invokeHR(arrayOf(__1814057547_Ptr, marshalToNative(inputPanelVisual),
          marshalToNative(inputPanelRect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PalmRejectionDelayZonePreview>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateForVisual(
      inputPanelVisual: Visual?,
      inputPanelRect: Rect?,
      viewportVisual: Visual?,
      viewportRect: Rect?
    ): PalmRejectionDelayZonePreview? {
      val fnPtr = _1814057547_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PalmRejectionDelayZonePreview>()
      val hr = fn.invokeHR(arrayOf(__1814057547_Ptr, marshalToNative(inputPanelVisual),
          marshalToNative(inputPanelRect), marshalToNative(viewportVisual),
          marshalToNative(viewportRect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PalmRejectionDelayZonePreview>(result.getValue())
      return resultValue
    }
  }

  public class IPalmRejectionDelayZonePreviewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1814057547_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPalmRejectionDelayZonePreviewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cdef5ee093d053a98f0e9a379f8f7530")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPalmRejectionDelayZonePreviewStatics(ptr: Pointer?): WithDefault =
        IPalmRejectionDelayZonePreviewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPalmRejectionDelayZonePreviewStatics {
      val address = segment.toRawLongValue()
      return makeIPalmRejectionDelayZonePreviewStatics(Pointer(address))
    }

    public override fun toNative(obj: IPalmRejectionDelayZonePreviewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1814057547_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPalmRejectionDelayZonePreviewStatics):
        Array<IPalmRejectionDelayZonePreviewStatics?> = (elements as
        Array<IPalmRejectionDelayZonePreviewStatics?>).castToImpl<IPalmRejectionDelayZonePreviewStatics,IPalmRejectionDelayZonePreviewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPalmRejectionDelayZonePreviewStatics?> =
        arrayOfNulls<IPalmRejectionDelayZonePreviewStatics_Impl>(size) as
        Array<IPalmRejectionDelayZonePreviewStatics?>
  }
}
