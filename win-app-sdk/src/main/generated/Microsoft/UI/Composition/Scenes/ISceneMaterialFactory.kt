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

@ABIMarker(ISceneMaterialFactory.ABI::class)
@Signature("{25747893-8748-5f60-969f-318fa0b735ca}")
@Guid("2574789387485f60969f318fa0b735ca")
@WinRTInterface("2574789387485f60969f318fa0b735ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneMaterialFactory.ByReference::class)
public interface ISceneMaterialFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneMaterialFactory> {
    public override fun getValue() = ABI.makeISceneMaterialFactory(pointer.getPointer(0))

    public fun setValue(value: ISceneMaterialFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneMaterialFactory {
    public val __611341349_Ptr: Pointer?

    public val _611341349_VtblPtr: Pointer?
      get() = __611341349_Ptr?.getPointer(0)
  }

  public class ISceneMaterialFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __611341349_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneMaterialFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2574789387485f60969f318fa0b735ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneMaterialFactory(ptr: Pointer?): WithDefault =
        ISceneMaterialFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneMaterialFactory {
      val address = segment.toRawLongValue()
      return makeISceneMaterialFactory(Pointer(address))
    }

    public override fun toNative(obj: ISceneMaterialFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__611341349_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneMaterialFactory): Array<ISceneMaterialFactory?> =
        (elements as
        Array<ISceneMaterialFactory?>).castToImpl<ISceneMaterialFactory,ISceneMaterialFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneMaterialFactory?> =
        arrayOfNulls<ISceneMaterialFactory_Impl>(size) as Array<ISceneMaterialFactory?>
  }
}
