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

@ABIMarker(IXamlMarkupHelper.ABI::class)
@Signature("{d0e6673c-5342-44ef-85a7-ed327a739d9a}")
@Guid("d0e6673c534244ef85a7ed327a739d9a")
@WinRTInterface("d0e6673c534244ef85a7ed327a739d9a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlMarkupHelper.ByReference::class)
public interface IXamlMarkupHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlMarkupHelper> {
    public override fun getValue() = ABI.makeIXamlMarkupHelper(pointer.getPointer(0))

    public fun setValue(value: IXamlMarkupHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlMarkupHelper {
    public val __1373782136_Ptr: Pointer?

    public val _1373782136_VtblPtr: Pointer?
      get() = __1373782136_Ptr?.getPointer(0)
  }

  public class IXamlMarkupHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1373782136_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlMarkupHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0e6673c534244ef85a7ed327a739d9a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlMarkupHelper(ptr: Pointer?): WithDefault = IXamlMarkupHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlMarkupHelper {
      val address = segment.toRawLongValue()
      return makeIXamlMarkupHelper(Pointer(address))
    }

    public override fun toNative(obj: IXamlMarkupHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1373782136_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlMarkupHelper): Array<IXamlMarkupHelper?> = (elements
        as Array<IXamlMarkupHelper?>).castToImpl<IXamlMarkupHelper,IXamlMarkupHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlMarkupHelper?> =
        arrayOfNulls<IXamlMarkupHelper_Impl>(size) as Array<IXamlMarkupHelper?>
  }
}
