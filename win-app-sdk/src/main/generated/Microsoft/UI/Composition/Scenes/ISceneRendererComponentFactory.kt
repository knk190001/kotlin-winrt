package Microsoft.UI.Composition.Scenes

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISceneRendererComponentFactory.ABI::class)
@Signature("{3ccac1d6-6a0f-582e-bb1a-10ebc1e405ca}")
@Guid("3ccac1d66a0f582ebb1a10ebc1e405ca")
@WinRTInterface("3ccac1d66a0f582ebb1a10ebc1e405ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneRendererComponentFactory.ByReference::class)
public interface ISceneRendererComponentFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneRendererComponentFactory> {
    public override fun getValue() = ABI.makeISceneRendererComponentFactory(pointer.getPointer(0))

    public fun setValue(value: ISceneRendererComponentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneRendererComponentFactory {
    public val __335820488_Ptr: Pointer?

    public val _335820488_VtblPtr: Pointer?
      get() = __335820488_Ptr?.getPointer(0)
  }

  public class ISceneRendererComponentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __335820488_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneRendererComponentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ccac1d66a0f582ebb1a10ebc1e405ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneRendererComponentFactory(ptr: Pointer?): WithDefault =
        ISceneRendererComponentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneRendererComponentFactory {
      val address = segment.toRawLongValue()
      return makeISceneRendererComponentFactory(Pointer(address))
    }

    public override fun toNative(obj: ISceneRendererComponentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__335820488_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneRendererComponentFactory):
        Array<ISceneRendererComponentFactory?> = (elements as
        Array<ISceneRendererComponentFactory?>).castToImpl<ISceneRendererComponentFactory,ISceneRendererComponentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneRendererComponentFactory?> =
        arrayOfNulls<ISceneRendererComponentFactory_Impl>(size) as
        Array<ISceneRendererComponentFactory?>
  }
}
