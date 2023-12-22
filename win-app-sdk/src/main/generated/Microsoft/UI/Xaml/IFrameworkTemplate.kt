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

@ABIMarker(IFrameworkTemplate.ABI::class)
@Signature("{0084c7c2-de48-5b0b-8a5a-e4fb76b7f7d1}")
@Guid("0084c7c2de485b0b8a5ae4fb76b7f7d1")
@WinRTInterface("0084c7c2de485b0b8a5ae4fb76b7f7d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkTemplate.ByReference::class)
public interface IFrameworkTemplate : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkTemplate> {
    public override fun getValue() = ABI.makeIFrameworkTemplate(pointer.getPointer(0))

    public fun setValue(value: IFrameworkTemplate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkTemplate {
    public val __791002319_Ptr: Pointer?

    public val _791002319_VtblPtr: Pointer?
      get() = __791002319_Ptr?.getPointer(0)
  }

  public class IFrameworkTemplate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __791002319_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkTemplate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0084c7c2de485b0b8a5ae4fb76b7f7d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkTemplate(ptr: Pointer?): WithDefault = IFrameworkTemplate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkTemplate {
      val address = segment.toRawLongValue()
      return makeIFrameworkTemplate(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkTemplate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__791002319_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkTemplate): Array<IFrameworkTemplate?> =
        (elements as
        Array<IFrameworkTemplate?>).castToImpl<IFrameworkTemplate,IFrameworkTemplate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkTemplate?> =
        arrayOfNulls<IFrameworkTemplate_Impl>(size) as Array<IFrameworkTemplate?>
  }
}
