package Windows.Media.Editing

import Windows.Media.Effects.IVideoCompositorDefinition
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

@ABIMarker(IMediaOverlayLayerFactory.ABI::class)
@Signature("{947cb473-a39e-4362-abbf-9f8b5070a062}")
@Guid("947cb473a39e4362abbf9f8b5070a062")
@WinRTInterface("947cb473a39e4362abbf9f8b5070a062")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaOverlayLayerFactory.ByReference::class)
public interface IMediaOverlayLayerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithCompositorDefinition(compositorDefinition: IVideoCompositorDefinition?):
      MediaOverlayLayer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaOverlayLayerFactory> {
    public override fun getValue() = ABI.makeIMediaOverlayLayerFactory(pointer.getPointer(0))

    public fun setValue(value: IMediaOverlayLayerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaOverlayLayerFactory {
    public val __569664981_Ptr: Pointer?

    public val _569664981_VtblPtr: Pointer?
      get() = __569664981_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun CreateWithCompositorDefinition(compositorDefinition: IVideoCompositorDefinition?):
        MediaOverlayLayer? {
      val fnPtr = _569664981_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaOverlayLayer>()
      val hr = fn.invokeHR(arrayOf(__569664981_Ptr, marshalToNative(compositorDefinition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaOverlayLayer>(result.getValue())
      return resultValue
    }
  }

  public class IMediaOverlayLayerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __569664981_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaOverlayLayerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("947cb473a39e4362abbf9f8b5070a062")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaOverlayLayerFactory(ptr: Pointer?): WithDefault =
        IMediaOverlayLayerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaOverlayLayerFactory {
      val address = segment.toRawLongValue()
      return makeIMediaOverlayLayerFactory(Pointer(address))
    }

    public override fun toNative(obj: IMediaOverlayLayerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__569664981_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaOverlayLayerFactory):
        Array<IMediaOverlayLayerFactory?> = (elements as
        Array<IMediaOverlayLayerFactory?>).castToImpl<IMediaOverlayLayerFactory,IMediaOverlayLayerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaOverlayLayerFactory?> =
        arrayOfNulls<IMediaOverlayLayerFactory_Impl>(size) as Array<IMediaOverlayLayerFactory?>
  }
}
