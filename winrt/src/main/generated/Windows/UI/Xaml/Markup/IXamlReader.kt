package Windows.UI.Xaml.Markup

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

@ABIMarker(IXamlReader.ABI::class)
@Signature("{24374cf1-cceb-48bf-a514-41b0186f84c2}")
@Guid("24374cf1cceb48bfa51441b0186f84c2")
@WinRTInterface("24374cf1cceb48bfa51441b0186f84c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlReader.ByReference::class)
public interface IXamlReader : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXamlReader> {
    public override fun getValue() = ABI.makeIXamlReader(pointer.getPointer(0))

    public fun setValue(value: IXamlReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlReader {
    public val __560244267_Ptr: Pointer?

    public val _560244267_VtblPtr: Pointer?
      get() = __560244267_Ptr?.getPointer(0)
  }

  public class IXamlReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __560244267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24374cf1cceb48bfa51441b0186f84c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlReader(ptr: Pointer?): WithDefault = IXamlReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlReader {
      val address = segment.toRawLongValue()
      return makeIXamlReader(Pointer(address))
    }

    public override fun toNative(obj: IXamlReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__560244267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlReader): Array<IXamlReader?> = (elements as
        Array<IXamlReader?>).castToImpl<IXamlReader,IXamlReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlReader?> =
        arrayOfNulls<IXamlReader_Impl>(size) as Array<IXamlReader?>
  }
}
