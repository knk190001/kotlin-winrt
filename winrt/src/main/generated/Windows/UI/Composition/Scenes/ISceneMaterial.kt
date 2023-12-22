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

@ABIMarker(ISceneMaterial.ABI::class)
@Signature("{8ca74b7c-30df-4e07-9490-37875af1a123}")
@Guid("8ca74b7c30df4e07949037875af1a123")
@WinRTInterface("8ca74b7c30df4e07949037875af1a123")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneMaterial.ByReference::class)
public interface ISceneMaterial : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISceneMaterial>
      {
    public override fun getValue() = ABI.makeISceneMaterial(pointer.getPointer(0))

    public fun setValue(value: ISceneMaterial_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneMaterial {
    public val __1723571524_Ptr: Pointer?

    public val _1723571524_VtblPtr: Pointer?
      get() = __1723571524_Ptr?.getPointer(0)
  }

  public class ISceneMaterial_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1723571524_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneMaterial, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8ca74b7c30df4e07949037875af1a123")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneMaterial(ptr: Pointer?): WithDefault = ISceneMaterial_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneMaterial {
      val address = segment.toRawLongValue()
      return makeISceneMaterial(Pointer(address))
    }

    public override fun toNative(obj: ISceneMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1723571524_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneMaterial): Array<ISceneMaterial?> = (elements as
        Array<ISceneMaterial?>).castToImpl<ISceneMaterial,ISceneMaterial_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneMaterial?> =
        arrayOfNulls<ISceneMaterial_Impl>(size) as Array<ISceneMaterial?>
  }
}
