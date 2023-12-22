package Windows.UI.Input

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

@ABIMarker(IAttachableInputObjectFactory.ABI::class)
@Signature("{a4c54c4e-42bc-58fa-a640-ea1516f4c06b}")
@Guid("a4c54c4e42bc58faa640ea1516f4c06b")
@WinRTInterface("a4c54c4e42bc58faa640ea1516f4c06b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAttachableInputObjectFactory.ByReference::class)
public interface IAttachableInputObjectFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAttachableInputObjectFactory> {
    public override fun getValue() = ABI.makeIAttachableInputObjectFactory(pointer.getPointer(0))

    public fun setValue(value: IAttachableInputObjectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAttachableInputObjectFactory {
    public val __1104853102_Ptr: Pointer?

    public val _1104853102_VtblPtr: Pointer?
      get() = __1104853102_Ptr?.getPointer(0)
  }

  public class IAttachableInputObjectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1104853102_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAttachableInputObjectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4c54c4e42bc58faa640ea1516f4c06b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAttachableInputObjectFactory(ptr: Pointer?): WithDefault =
        IAttachableInputObjectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAttachableInputObjectFactory {
      val address = segment.toRawLongValue()
      return makeIAttachableInputObjectFactory(Pointer(address))
    }

    public override fun toNative(obj: IAttachableInputObjectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1104853102_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAttachableInputObjectFactory):
        Array<IAttachableInputObjectFactory?> = (elements as
        Array<IAttachableInputObjectFactory?>).castToImpl<IAttachableInputObjectFactory,IAttachableInputObjectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAttachableInputObjectFactory?> =
        arrayOfNulls<IAttachableInputObjectFactory_Impl>(size) as
        Array<IAttachableInputObjectFactory?>
  }
}
