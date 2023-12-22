package Microsoft.UI.Xaml.Hosting

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

@ABIMarker(IWindowsXamlManager.ABI::class)
@Signature("{85a2e562-7e8f-5333-a104-a3e672a2ffee}")
@Guid("85a2e5627e8f5333a104a3e672a2ffee")
@WinRTInterface("85a2e5627e8f5333a104a3e672a2ffee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowsXamlManager.ByReference::class)
public interface IWindowsXamlManager : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowsXamlManager> {
    public override fun getValue() = ABI.makeIWindowsXamlManager(pointer.getPointer(0))

    public fun setValue(value: IWindowsXamlManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowsXamlManager {
    public val __2069288035_Ptr: Pointer?

    public val _2069288035_VtblPtr: Pointer?
      get() = __2069288035_Ptr?.getPointer(0)
  }

  public class IWindowsXamlManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2069288035_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowsXamlManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85a2e5627e8f5333a104a3e672a2ffee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowsXamlManager(ptr: Pointer?): WithDefault = IWindowsXamlManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowsXamlManager {
      val address = segment.toRawLongValue()
      return makeIWindowsXamlManager(Pointer(address))
    }

    public override fun toNative(obj: IWindowsXamlManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2069288035_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowsXamlManager): Array<IWindowsXamlManager?> =
        (elements as
        Array<IWindowsXamlManager?>).castToImpl<IWindowsXamlManager,IWindowsXamlManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowsXamlManager?> =
        arrayOfNulls<IWindowsXamlManager_Impl>(size) as Array<IWindowsXamlManager?>
  }
}
