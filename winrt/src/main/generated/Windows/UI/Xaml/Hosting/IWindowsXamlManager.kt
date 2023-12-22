package Windows.UI.Xaml.Hosting

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
@Signature("{56096c31-1aa0-5288-8818-6e74a2dcaff5}")
@Guid("56096c311aa0528888186e74a2dcaff5")
@WinRTInterface("56096c311aa0528888186e74a2dcaff5")
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
    public val __1292923368_Ptr: Pointer?

    public val _1292923368_VtblPtr: Pointer?
      get() = __1292923368_Ptr?.getPointer(0)
  }

  public class IWindowsXamlManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1292923368_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowsXamlManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56096c311aa0528888186e74a2dcaff5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowsXamlManager(ptr: Pointer?): WithDefault = IWindowsXamlManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowsXamlManager {
      val address = segment.toRawLongValue()
      return makeIWindowsXamlManager(Pointer(address))
    }

    public override fun toNative(obj: IWindowsXamlManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1292923368_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowsXamlManager): Array<IWindowsXamlManager?> =
        (elements as
        Array<IWindowsXamlManager?>).castToImpl<IWindowsXamlManager,IWindowsXamlManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowsXamlManager?> =
        arrayOfNulls<IWindowsXamlManager_Impl>(size) as Array<IWindowsXamlManager?>
  }
}
