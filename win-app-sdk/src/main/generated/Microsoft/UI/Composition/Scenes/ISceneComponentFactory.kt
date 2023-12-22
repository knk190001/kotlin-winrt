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

@ABIMarker(ISceneComponentFactory.ABI::class)
@Signature("{254088b0-babf-503d-9a66-0d86af5f7303}")
@Guid("254088b0babf503d9a660d86af5f7303")
@WinRTInterface("254088b0babf503d9a660d86af5f7303")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneComponentFactory.ByReference::class)
public interface ISceneComponentFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneComponentFactory> {
    public override fun getValue() = ABI.makeISceneComponentFactory(pointer.getPointer(0))

    public fun setValue(value: ISceneComponentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneComponentFactory {
    public val __1607749035_Ptr: Pointer?

    public val _1607749035_VtblPtr: Pointer?
      get() = __1607749035_Ptr?.getPointer(0)
  }

  public class ISceneComponentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1607749035_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneComponentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("254088b0babf503d9a660d86af5f7303")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneComponentFactory(ptr: Pointer?): WithDefault =
        ISceneComponentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneComponentFactory {
      val address = segment.toRawLongValue()
      return makeISceneComponentFactory(Pointer(address))
    }

    public override fun toNative(obj: ISceneComponentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1607749035_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneComponentFactory): Array<ISceneComponentFactory?> =
        (elements as
        Array<ISceneComponentFactory?>).castToImpl<ISceneComponentFactory,ISceneComponentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneComponentFactory?> =
        arrayOfNulls<ISceneComponentFactory_Impl>(size) as Array<ISceneComponentFactory?>
  }
}
