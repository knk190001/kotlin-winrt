package Windows.Management.Core

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

@ABIMarker(IApplicationDataManager.ABI::class)
@Signature("{74d10432-2e99-4000-9a3a-64307e858129}")
@Guid("74d104322e9940009a3a64307e858129")
@WinRTInterface("74d104322e9940009a3a64307e858129")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationDataManager.ByReference::class)
public interface IApplicationDataManager : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationDataManager> {
    public override fun getValue() = ABI.makeIApplicationDataManager(pointer.getPointer(0))

    public fun setValue(value: IApplicationDataManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationDataManager {
    public val __1658492643_Ptr: Pointer?

    public val _1658492643_VtblPtr: Pointer?
      get() = __1658492643_Ptr?.getPointer(0)
  }

  public class IApplicationDataManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1658492643_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationDataManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("74d104322e9940009a3a64307e858129")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationDataManager(ptr: Pointer?): WithDefault =
        IApplicationDataManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationDataManager {
      val address = segment.toRawLongValue()
      return makeIApplicationDataManager(Pointer(address))
    }

    public override fun toNative(obj: IApplicationDataManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1658492643_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationDataManager): Array<IApplicationDataManager?>
        = (elements as
        Array<IApplicationDataManager?>).castToImpl<IApplicationDataManager,IApplicationDataManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationDataManager?> =
        arrayOfNulls<IApplicationDataManager_Impl>(size) as Array<IApplicationDataManager?>
  }
}
