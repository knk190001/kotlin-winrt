package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(ISelectorFactory.ABI::class)
@Signature("{21a42024-af07-58f9-8789-848d3324d901}")
@Guid("21a42024af0758f98789848d3324d901")
@WinRTInterface("21a42024af0758f98789848d3324d901")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectorFactory.ByReference::class)
public interface ISelectorFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectorFactory> {
    public override fun getValue() = ABI.makeISelectorFactory(pointer.getPointer(0))

    public fun setValue(value: ISelectorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectorFactory {
    public val __1323790406_Ptr: Pointer?

    public val _1323790406_VtblPtr: Pointer?
      get() = __1323790406_Ptr?.getPointer(0)
  }

  public class ISelectorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1323790406_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("21a42024af0758f98789848d3324d901")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectorFactory(ptr: Pointer?): WithDefault = ISelectorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectorFactory {
      val address = segment.toRawLongValue()
      return makeISelectorFactory(Pointer(address))
    }

    public override fun toNative(obj: ISelectorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1323790406_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectorFactory): Array<ISelectorFactory?> = (elements as
        Array<ISelectorFactory?>).castToImpl<ISelectorFactory,ISelectorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectorFactory?> =
        arrayOfNulls<ISelectorFactory_Impl>(size) as Array<ISelectorFactory?>
  }
}
