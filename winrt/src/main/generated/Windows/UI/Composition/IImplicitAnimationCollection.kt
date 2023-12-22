package Windows.UI.Composition

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

@ABIMarker(IImplicitAnimationCollection.ABI::class)
@Signature("{0598a3ff-0a92-4c9d-a427-b25519250dbf}")
@Guid("0598a3ff0a924c9da427b25519250dbf")
@WinRTInterface("0598a3ff0a924c9da427b25519250dbf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImplicitAnimationCollection.ByReference::class)
public interface IImplicitAnimationCollection : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImplicitAnimationCollection> {
    public override fun getValue() = ABI.makeIImplicitAnimationCollection(pointer.getPointer(0))

    public fun setValue(value: IImplicitAnimationCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImplicitAnimationCollection {
    public val __501372241_Ptr: Pointer?

    public val _501372241_VtblPtr: Pointer?
      get() = __501372241_Ptr?.getPointer(0)
  }

  public class IImplicitAnimationCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __501372241_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImplicitAnimationCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0598a3ff0a924c9da427b25519250dbf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImplicitAnimationCollection(ptr: Pointer?): WithDefault =
        IImplicitAnimationCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImplicitAnimationCollection {
      val address = segment.toRawLongValue()
      return makeIImplicitAnimationCollection(Pointer(address))
    }

    public override fun toNative(obj: IImplicitAnimationCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__501372241_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImplicitAnimationCollection):
        Array<IImplicitAnimationCollection?> = (elements as
        Array<IImplicitAnimationCollection?>).castToImpl<IImplicitAnimationCollection,IImplicitAnimationCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImplicitAnimationCollection?> =
        arrayOfNulls<IImplicitAnimationCollection_Impl>(size) as
        Array<IImplicitAnimationCollection?>
  }
}
