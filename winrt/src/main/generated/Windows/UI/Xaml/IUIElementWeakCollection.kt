package Windows.UI.Xaml

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

@ABIMarker(IUIElementWeakCollection.ABI::class)
@Signature("{10341223-e66d-519e-acf8-556bd244eac3}")
@Guid("10341223e66d519eacf8556bd244eac3")
@WinRTInterface("10341223e66d519eacf8556bd244eac3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementWeakCollection.ByReference::class)
public interface IUIElementWeakCollection : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementWeakCollection> {
    public override fun getValue() = ABI.makeIUIElementWeakCollection(pointer.getPointer(0))

    public fun setValue(value: IUIElementWeakCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementWeakCollection {
    public val __179701164_Ptr: Pointer?

    public val _179701164_VtblPtr: Pointer?
      get() = __179701164_Ptr?.getPointer(0)
  }

  public class IUIElementWeakCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __179701164_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementWeakCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10341223e66d519eacf8556bd244eac3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementWeakCollection(ptr: Pointer?): WithDefault =
        IUIElementWeakCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementWeakCollection {
      val address = segment.toRawLongValue()
      return makeIUIElementWeakCollection(Pointer(address))
    }

    public override fun toNative(obj: IUIElementWeakCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__179701164_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementWeakCollection):
        Array<IUIElementWeakCollection?> = (elements as
        Array<IUIElementWeakCollection?>).castToImpl<IUIElementWeakCollection,IUIElementWeakCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementWeakCollection?> =
        arrayOfNulls<IUIElementWeakCollection_Impl>(size) as Array<IUIElementWeakCollection?>
  }
}
