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

@ABIMarker(ISceneMaterialInput.ABI::class)
@Signature("{446bdade-719b-5db4-b699-f226d0062a2e}")
@Guid("446bdade719b5db4b699f226d0062a2e")
@WinRTInterface("446bdade719b5db4b699f226d0062a2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneMaterialInput.ByReference::class)
public interface ISceneMaterialInput : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneMaterialInput> {
    public override fun getValue() = ABI.makeISceneMaterialInput(pointer.getPointer(0))

    public fun setValue(value: ISceneMaterialInput_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneMaterialInput {
    public val __462269733_Ptr: Pointer?

    public val _462269733_VtblPtr: Pointer?
      get() = __462269733_Ptr?.getPointer(0)
  }

  public class ISceneMaterialInput_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __462269733_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneMaterialInput, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("446bdade719b5db4b699f226d0062a2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneMaterialInput(ptr: Pointer?): WithDefault = ISceneMaterialInput_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneMaterialInput {
      val address = segment.toRawLongValue()
      return makeISceneMaterialInput(Pointer(address))
    }

    public override fun toNative(obj: ISceneMaterialInput): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__462269733_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneMaterialInput): Array<ISceneMaterialInput?> =
        (elements as
        Array<ISceneMaterialInput?>).castToImpl<ISceneMaterialInput,ISceneMaterialInput_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneMaterialInput?> =
        arrayOfNulls<ISceneMaterialInput_Impl>(size) as Array<ISceneMaterialInput?>
  }
}
