package Windows.Media.Editing

import Windows.Foundation.Rect
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaOverlayFactory.ABI::class)
@Signature("{b584828a-6188-4f8f-a2e0-aa552d598e18}")
@Guid("b584828a61884f8fa2e0aa552d598e18")
@WinRTInterface("b584828a61884f8fa2e0aa552d598e18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaOverlayFactory.ByReference::class)
public interface IMediaOverlayFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(clip: MediaClip?): MediaOverlay?

  @InterfaceMethod(1)
  public fun CreateWithPositionAndOpacity(
    clip: MediaClip?,
    position: Rect?,
    opacity: Double
  ): MediaOverlay?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaOverlayFactory> {
    public override fun getValue() = ABI.makeIMediaOverlayFactory(pointer.getPointer(0))

    public fun setValue(value: IMediaOverlayFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaOverlayFactory {
    public val __2034505240_Ptr: Pointer?

    public val _2034505240_VtblPtr: Pointer?
      get() = __2034505240_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(clip: MediaClip?): MediaOverlay? {
      val fnPtr = _2034505240_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaOverlay>()
      val hr = fn.invokeHR(arrayOf(__2034505240_Ptr, marshalToNative(clip), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaOverlay>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithPositionAndOpacity(
      clip: MediaClip?,
      position: Rect?,
      opacity: Double
    ): MediaOverlay? {
      val fnPtr = _2034505240_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaOverlay>()
      val hr = fn.invokeHR(arrayOf(__2034505240_Ptr, marshalToNative(clip),
          marshalToNative(position), opacity, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaOverlay>(result.getValue())
      return resultValue
    }
  }

  public class IMediaOverlayFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2034505240_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaOverlayFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b584828a61884f8fa2e0aa552d598e18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaOverlayFactory(ptr: Pointer?): WithDefault = IMediaOverlayFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaOverlayFactory {
      val address = segment.toRawLongValue()
      return makeIMediaOverlayFactory(Pointer(address))
    }

    public override fun toNative(obj: IMediaOverlayFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2034505240_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaOverlayFactory): Array<IMediaOverlayFactory?> =
        (elements as
        Array<IMediaOverlayFactory?>).castToImpl<IMediaOverlayFactory,IMediaOverlayFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaOverlayFactory?> =
        arrayOfNulls<IMediaOverlayFactory_Impl>(size) as Array<IMediaOverlayFactory?>
  }
}
