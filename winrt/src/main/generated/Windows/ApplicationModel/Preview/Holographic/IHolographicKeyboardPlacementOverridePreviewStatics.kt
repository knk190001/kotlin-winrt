package Windows.ApplicationModel.Preview.Holographic

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

@ABIMarker(IHolographicKeyboardPlacementOverridePreviewStatics.ABI::class)
@Signature("{202e6039-1ff6-5a06-aac4-a5e24fa3ec4b}")
@Guid("202e60391ff65a06aac4a5e24fa3ec4b")
@WinRTInterface("202e60391ff65a06aac4a5e24fa3ec4b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicKeyboardPlacementOverridePreviewStatics.ByReference::class)
public interface IHolographicKeyboardPlacementOverridePreviewStatics : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): HolographicKeyboardPlacementOverridePreview?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicKeyboardPlacementOverridePreviewStatics> {
    public override fun getValue() =
        ABI.makeIHolographicKeyboardPlacementOverridePreviewStatics(pointer.getPointer(0))

    public fun setValue(value: IHolographicKeyboardPlacementOverridePreviewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicKeyboardPlacementOverridePreviewStatics {
    public val __958441028_Ptr: Pointer?

    public val _958441028_VtblPtr: Pointer?
      get() = __958441028_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): HolographicKeyboardPlacementOverridePreview? {
      val fnPtr = _958441028_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicKeyboardPlacementOverridePreview>()
      val hr = fn.invokeHR(arrayOf(__958441028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HolographicKeyboardPlacementOverridePreview>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicKeyboardPlacementOverridePreviewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __958441028_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicKeyboardPlacementOverridePreviewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("202e60391ff65a06aac4a5e24fa3ec4b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicKeyboardPlacementOverridePreviewStatics(ptr: Pointer?): WithDefault =
        IHolographicKeyboardPlacementOverridePreviewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHolographicKeyboardPlacementOverridePreviewStatics {
      val address = segment.toRawLongValue()
      return makeIHolographicKeyboardPlacementOverridePreviewStatics(Pointer(address))
    }

    public override fun toNative(obj: IHolographicKeyboardPlacementOverridePreviewStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__958441028_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicKeyboardPlacementOverridePreviewStatics):
        Array<IHolographicKeyboardPlacementOverridePreviewStatics?> = (elements as
        Array<IHolographicKeyboardPlacementOverridePreviewStatics?>).castToImpl<IHolographicKeyboardPlacementOverridePreviewStatics,IHolographicKeyboardPlacementOverridePreviewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IHolographicKeyboardPlacementOverridePreviewStatics?> =
        arrayOfNulls<IHolographicKeyboardPlacementOverridePreviewStatics_Impl>(size) as
        Array<IHolographicKeyboardPlacementOverridePreviewStatics?>
  }
}
