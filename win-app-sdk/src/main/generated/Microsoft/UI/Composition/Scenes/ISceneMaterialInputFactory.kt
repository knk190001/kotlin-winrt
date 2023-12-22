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

@ABIMarker(ISceneMaterialInputFactory.ABI::class)
@Signature("{b4dabd1d-58c0-5710-928a-bc49b0735694}")
@Guid("b4dabd1d58c05710928abc49b0735694")
@WinRTInterface("b4dabd1d58c05710928abc49b0735694")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneMaterialInputFactory.ByReference::class)
public interface ISceneMaterialInputFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneMaterialInputFactory> {
    public override fun getValue() = ABI.makeISceneMaterialInputFactory(pointer.getPointer(0))

    public fun setValue(value: ISceneMaterialInputFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneMaterialInputFactory {
    public val __1217226321_Ptr: Pointer?

    public val _1217226321_VtblPtr: Pointer?
      get() = __1217226321_Ptr?.getPointer(0)
  }

  public class ISceneMaterialInputFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1217226321_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneMaterialInputFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4dabd1d58c05710928abc49b0735694")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneMaterialInputFactory(ptr: Pointer?): WithDefault =
        ISceneMaterialInputFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneMaterialInputFactory {
      val address = segment.toRawLongValue()
      return makeISceneMaterialInputFactory(Pointer(address))
    }

    public override fun toNative(obj: ISceneMaterialInputFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1217226321_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneMaterialInputFactory):
        Array<ISceneMaterialInputFactory?> = (elements as
        Array<ISceneMaterialInputFactory?>).castToImpl<ISceneMaterialInputFactory,ISceneMaterialInputFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneMaterialInputFactory?> =
        arrayOfNulls<ISceneMaterialInputFactory_Impl>(size) as Array<ISceneMaterialInputFactory?>
  }
}
