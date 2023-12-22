package Microsoft.UI.Xaml.Data

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

@ABIMarker(IBindingOperations.ABI::class)
@Signature("{9a319b95-aabe-5075-b227-8eb07e443d8b}")
@Guid("9a319b95aabe5075b2278eb07e443d8b")
@WinRTInterface("9a319b95aabe5075b2278eb07e443d8b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindingOperations.ByReference::class)
public interface IBindingOperations : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBindingOperations> {
    public override fun getValue() = ABI.makeIBindingOperations(pointer.getPointer(0))

    public fun setValue(value: IBindingOperations_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindingOperations {
    public val __1996006238_Ptr: Pointer?

    public val _1996006238_VtblPtr: Pointer?
      get() = __1996006238_Ptr?.getPointer(0)
  }

  public class IBindingOperations_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1996006238_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindingOperations, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a319b95aabe5075b2278eb07e443d8b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindingOperations(ptr: Pointer?): WithDefault = IBindingOperations_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindingOperations {
      val address = segment.toRawLongValue()
      return makeIBindingOperations(Pointer(address))
    }

    public override fun toNative(obj: IBindingOperations): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1996006238_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindingOperations): Array<IBindingOperations?> =
        (elements as
        Array<IBindingOperations?>).castToImpl<IBindingOperations,IBindingOperations_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindingOperations?> =
        arrayOfNulls<IBindingOperations_Impl>(size) as Array<IBindingOperations?>
  }
}
