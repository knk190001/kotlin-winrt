package Microsoft.UI.Xaml.Media

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

@ABIMarker(IXamlLight.ABI::class)
@Signature("{dcd20139-8cd5-5da5-a25c-2b7b813d8d58}")
@Guid("dcd201398cd55da5a25c2b7b813d8d58")
@WinRTInterface("dcd201398cd55da5a25c2b7b813d8d58")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlLight.ByReference::class)
public interface IXamlLight : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXamlLight> {
    public override fun getValue() = ABI.makeIXamlLight(pointer.getPointer(0))

    public fun setValue(value: IXamlLight_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlLight {
    public val __654088861_Ptr: Pointer?

    public val _654088861_VtblPtr: Pointer?
      get() = __654088861_Ptr?.getPointer(0)
  }

  public class IXamlLight_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __654088861_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlLight, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dcd201398cd55da5a25c2b7b813d8d58")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlLight(ptr: Pointer?): WithDefault = IXamlLight_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlLight {
      val address = segment.toRawLongValue()
      return makeIXamlLight(Pointer(address))
    }

    public override fun toNative(obj: IXamlLight): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__654088861_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlLight): Array<IXamlLight?> = (elements as
        Array<IXamlLight?>).castToImpl<IXamlLight,IXamlLight_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlLight?> = arrayOfNulls<IXamlLight_Impl>(size)
        as Array<IXamlLight?>
  }
}
