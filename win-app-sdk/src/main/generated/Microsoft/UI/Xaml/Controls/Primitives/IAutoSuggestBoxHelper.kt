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

@ABIMarker(IAutoSuggestBoxHelper.ABI::class)
@Signature("{1e56736c-8248-57d9-ac04-e4e7dcc3f9e1}")
@Guid("1e56736c824857d9ac04e4e7dcc3f9e1")
@WinRTInterface("1e56736c824857d9ac04e4e7dcc3f9e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoSuggestBoxHelper.ByReference::class)
public interface IAutoSuggestBoxHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoSuggestBoxHelper> {
    public override fun getValue() = ABI.makeIAutoSuggestBoxHelper(pointer.getPointer(0))

    public fun setValue(value: IAutoSuggestBoxHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoSuggestBoxHelper {
    public val __392733739_Ptr: Pointer?

    public val _392733739_VtblPtr: Pointer?
      get() = __392733739_Ptr?.getPointer(0)
  }

  public class IAutoSuggestBoxHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __392733739_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoSuggestBoxHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e56736c824857d9ac04e4e7dcc3f9e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoSuggestBoxHelper(ptr: Pointer?): WithDefault =
        IAutoSuggestBoxHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoSuggestBoxHelper {
      val address = segment.toRawLongValue()
      return makeIAutoSuggestBoxHelper(Pointer(address))
    }

    public override fun toNative(obj: IAutoSuggestBoxHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__392733739_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoSuggestBoxHelper): Array<IAutoSuggestBoxHelper?> =
        (elements as
        Array<IAutoSuggestBoxHelper?>).castToImpl<IAutoSuggestBoxHelper,IAutoSuggestBoxHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoSuggestBoxHelper?> =
        arrayOfNulls<IAutoSuggestBoxHelper_Impl>(size) as Array<IAutoSuggestBoxHelper?>
  }
}
