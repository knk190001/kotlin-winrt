package Windows.System.Preview

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ITwoPanelHingedDevicePosturePreviewStatics.ABI::class)
@Signature("{0c4733d2-57e0-4180-bd5e-f31a2138423e}")
@Guid("0c4733d257e04180bd5ef31a2138423e")
@WinRTInterface("0c4733d257e04180bd5ef31a2138423e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITwoPanelHingedDevicePosturePreviewStatics.ByReference::class)
public interface ITwoPanelHingedDevicePosturePreviewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultAsync(): IAsyncOperation<TwoPanelHingedDevicePosturePreview?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITwoPanelHingedDevicePosturePreviewStatics> {
    public override fun getValue() =
        ABI.makeITwoPanelHingedDevicePosturePreviewStatics(pointer.getPointer(0))

    public fun setValue(value: ITwoPanelHingedDevicePosturePreviewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITwoPanelHingedDevicePosturePreviewStatics {
    public val __16375593_Ptr: Pointer?

    public val _16375593_VtblPtr: Pointer?
      get() = __16375593_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultAsync(): IAsyncOperation<TwoPanelHingedDevicePosturePreview?>? {
      val fnPtr = _16375593_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<TwoPanelHingedDevicePosturePreview?>>()
      val hr = fn.invokeHR(arrayOf(__16375593_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<TwoPanelHingedDevicePosturePreview?>>(result.getValue())
      return resultValue
    }
  }

  public class ITwoPanelHingedDevicePosturePreviewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __16375593_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITwoPanelHingedDevicePosturePreviewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c4733d257e04180bd5ef31a2138423e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITwoPanelHingedDevicePosturePreviewStatics(ptr: Pointer?): WithDefault =
        ITwoPanelHingedDevicePosturePreviewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ITwoPanelHingedDevicePosturePreviewStatics {
      val address = segment.toRawLongValue()
      return makeITwoPanelHingedDevicePosturePreviewStatics(Pointer(address))
    }

    public override fun toNative(obj: ITwoPanelHingedDevicePosturePreviewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__16375593_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITwoPanelHingedDevicePosturePreviewStatics):
        Array<ITwoPanelHingedDevicePosturePreviewStatics?> = (elements as
        Array<ITwoPanelHingedDevicePosturePreviewStatics?>).castToImpl<ITwoPanelHingedDevicePosturePreviewStatics,ITwoPanelHingedDevicePosturePreviewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITwoPanelHingedDevicePosturePreviewStatics?> =
        arrayOfNulls<ITwoPanelHingedDevicePosturePreviewStatics_Impl>(size) as
        Array<ITwoPanelHingedDevicePosturePreviewStatics?>
  }
}
