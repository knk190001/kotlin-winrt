package Windows.UI.Composition.Scenes

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

@ABIMarker(ISceneRendererComponent.ABI::class)
@Signature("{f1acb857-cf4f-4025-9b25-a2d1944cf507}")
@Guid("f1acb857cf4f40259b25a2d1944cf507")
@WinRTInterface("f1acb857cf4f40259b25a2d1944cf507")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneRendererComponent.ByReference::class)
public interface ISceneRendererComponent : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneRendererComponent> {
    public override fun getValue() = ABI.makeISceneRendererComponent(pointer.getPointer(0))

    public fun setValue(value: ISceneRendererComponent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneRendererComponent {
    public val __1610727421_Ptr: Pointer?

    public val _1610727421_VtblPtr: Pointer?
      get() = __1610727421_Ptr?.getPointer(0)
  }

  public class ISceneRendererComponent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1610727421_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneRendererComponent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f1acb857cf4f40259b25a2d1944cf507")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneRendererComponent(ptr: Pointer?): WithDefault =
        ISceneRendererComponent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneRendererComponent {
      val address = segment.toRawLongValue()
      return makeISceneRendererComponent(Pointer(address))
    }

    public override fun toNative(obj: ISceneRendererComponent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1610727421_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneRendererComponent): Array<ISceneRendererComponent?>
        = (elements as
        Array<ISceneRendererComponent?>).castToImpl<ISceneRendererComponent,ISceneRendererComponent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneRendererComponent?> =
        arrayOfNulls<ISceneRendererComponent_Impl>(size) as Array<ISceneRendererComponent?>
  }
}
