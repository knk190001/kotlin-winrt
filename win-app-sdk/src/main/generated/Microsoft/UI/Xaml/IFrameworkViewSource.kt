package Microsoft.UI.Xaml

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

@ABIMarker(IFrameworkViewSource.ABI::class)
@Signature("{52b5d975-6fa6-5b66-a248-d17443b2bca0}")
@Guid("52b5d9756fa65b66a248d17443b2bca0")
@WinRTInterface("52b5d9756fa65b66a248d17443b2bca0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkViewSource.ByReference::class)
public interface IFrameworkViewSource : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkViewSource> {
    public override fun getValue() = ABI.makeIFrameworkViewSource(pointer.getPointer(0))

    public fun setValue(value: IFrameworkViewSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkViewSource {
    public val __1180296215_Ptr: Pointer?

    public val _1180296215_VtblPtr: Pointer?
      get() = __1180296215_Ptr?.getPointer(0)
  }

  public class IFrameworkViewSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1180296215_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkViewSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52b5d9756fa65b66a248d17443b2bca0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkViewSource(ptr: Pointer?): WithDefault = IFrameworkViewSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkViewSource {
      val address = segment.toRawLongValue()
      return makeIFrameworkViewSource(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkViewSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1180296215_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkViewSource): Array<IFrameworkViewSource?> =
        (elements as
        Array<IFrameworkViewSource?>).castToImpl<IFrameworkViewSource,IFrameworkViewSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkViewSource?> =
        arrayOfNulls<IFrameworkViewSource_Impl>(size) as Array<IFrameworkViewSource?>
  }
}
