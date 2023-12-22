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

@ABIMarker(IScenePbrMaterialFactory.ABI::class)
@Signature("{2e3f3dfe-0b85-5727-b5be-b7d3cbac37fa}")
@Guid("2e3f3dfe0b855727b5beb7d3cbac37fa")
@WinRTInterface("2e3f3dfe0b855727b5beb7d3cbac37fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScenePbrMaterialFactory.ByReference::class)
public interface IScenePbrMaterialFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScenePbrMaterialFactory> {
    public override fun getValue() = ABI.makeIScenePbrMaterialFactory(pointer.getPointer(0))

    public fun setValue(value: IScenePbrMaterialFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScenePbrMaterialFactory {
    public val __415334176_Ptr: Pointer?

    public val _415334176_VtblPtr: Pointer?
      get() = __415334176_Ptr?.getPointer(0)
  }

  public class IScenePbrMaterialFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __415334176_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScenePbrMaterialFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e3f3dfe0b855727b5beb7d3cbac37fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScenePbrMaterialFactory(ptr: Pointer?): WithDefault =
        IScenePbrMaterialFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScenePbrMaterialFactory {
      val address = segment.toRawLongValue()
      return makeIScenePbrMaterialFactory(Pointer(address))
    }

    public override fun toNative(obj: IScenePbrMaterialFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__415334176_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScenePbrMaterialFactory):
        Array<IScenePbrMaterialFactory?> = (elements as
        Array<IScenePbrMaterialFactory?>).castToImpl<IScenePbrMaterialFactory,IScenePbrMaterialFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScenePbrMaterialFactory?> =
        arrayOfNulls<IScenePbrMaterialFactory_Impl>(size) as Array<IScenePbrMaterialFactory?>
  }
}
