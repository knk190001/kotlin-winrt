package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ILayoutFactory.ABI::class)
@Signature("{eaf956b4-59c9-5e13-a49d-f35b171d8fc9}")
@Guid("eaf956b459c95e13a49df35b171d8fc9")
@WinRTInterface("eaf956b459c95e13a49df35b171d8fc9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILayoutFactory.ByReference::class)
public interface ILayoutFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILayoutFactory>
      {
    public override fun getValue() = ABI.makeILayoutFactory(pointer.getPointer(0))

    public fun setValue(value: ILayoutFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILayoutFactory {
    public val __787404825_Ptr: Pointer?

    public val _787404825_VtblPtr: Pointer?
      get() = __787404825_Ptr?.getPointer(0)
  }

  public class ILayoutFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __787404825_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILayoutFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eaf956b459c95e13a49df35b171d8fc9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILayoutFactory(ptr: Pointer?): WithDefault = ILayoutFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILayoutFactory {
      val address = segment.toRawLongValue()
      return makeILayoutFactory(Pointer(address))
    }

    public override fun toNative(obj: ILayoutFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__787404825_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILayoutFactory): Array<ILayoutFactory?> = (elements as
        Array<ILayoutFactory?>).castToImpl<ILayoutFactory,ILayoutFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILayoutFactory?> =
        arrayOfNulls<ILayoutFactory_Impl>(size) as Array<ILayoutFactory?>
  }
}
