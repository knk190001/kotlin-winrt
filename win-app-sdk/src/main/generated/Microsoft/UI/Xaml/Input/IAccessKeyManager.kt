package Microsoft.UI.Xaml.Input

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

@ABIMarker(IAccessKeyManager.ABI::class)
@Signature("{8f2a4402-a635-53dc-bc17-da911eabaade}")
@Guid("8f2a4402a63553dcbc17da911eabaade")
@WinRTInterface("8f2a4402a63553dcbc17da911eabaade")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccessKeyManager.ByReference::class)
public interface IAccessKeyManager : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccessKeyManager> {
    public override fun getValue() = ABI.makeIAccessKeyManager(pointer.getPointer(0))

    public fun setValue(value: IAccessKeyManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccessKeyManager {
    public val __423144413_Ptr: Pointer?

    public val _423144413_VtblPtr: Pointer?
      get() = __423144413_Ptr?.getPointer(0)
  }

  public class IAccessKeyManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __423144413_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccessKeyManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f2a4402a63553dcbc17da911eabaade")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccessKeyManager(ptr: Pointer?): WithDefault = IAccessKeyManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccessKeyManager {
      val address = segment.toRawLongValue()
      return makeIAccessKeyManager(Pointer(address))
    }

    public override fun toNative(obj: IAccessKeyManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__423144413_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccessKeyManager): Array<IAccessKeyManager?> = (elements
        as Array<IAccessKeyManager?>).castToImpl<IAccessKeyManager,IAccessKeyManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccessKeyManager?> =
        arrayOfNulls<IAccessKeyManager_Impl>(size) as Array<IAccessKeyManager?>
  }
}
