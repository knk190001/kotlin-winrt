package Microsoft.UI.Xaml.Markup

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

@ABIMarker(IXamlBindingHelper.ABI::class)
@Signature("{607a9bf2-5a6d-5c89-a756-bb44f24f28f8}")
@Guid("607a9bf25a6d5c89a756bb44f24f28f8")
@WinRTInterface("607a9bf25a6d5c89a756bb44f24f28f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlBindingHelper.ByReference::class)
public interface IXamlBindingHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlBindingHelper> {
    public override fun getValue() = ABI.makeIXamlBindingHelper(pointer.getPointer(0))

    public fun setValue(value: IXamlBindingHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlBindingHelper {
    public val __2089837514_Ptr: Pointer?

    public val _2089837514_VtblPtr: Pointer?
      get() = __2089837514_Ptr?.getPointer(0)
  }

  public class IXamlBindingHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2089837514_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlBindingHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("607a9bf25a6d5c89a756bb44f24f28f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlBindingHelper(ptr: Pointer?): WithDefault = IXamlBindingHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlBindingHelper {
      val address = segment.toRawLongValue()
      return makeIXamlBindingHelper(Pointer(address))
    }

    public override fun toNative(obj: IXamlBindingHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2089837514_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlBindingHelper): Array<IXamlBindingHelper?> =
        (elements as
        Array<IXamlBindingHelper?>).castToImpl<IXamlBindingHelper,IXamlBindingHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlBindingHelper?> =
        arrayOfNulls<IXamlBindingHelper_Impl>(size) as Array<IXamlBindingHelper?>
  }
}
