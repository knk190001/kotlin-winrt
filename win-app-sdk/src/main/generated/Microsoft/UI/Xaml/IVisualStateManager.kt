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

@ABIMarker(IVisualStateManager.ABI::class)
@Signature("{342c8d32-ad61-5925-93d1-0c704df2a7d1}")
@Guid("342c8d32ad61592593d10c704df2a7d1")
@WinRTInterface("342c8d32ad61592593d10c704df2a7d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualStateManager.ByReference::class)
public interface IVisualStateManager : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualStateManager> {
    public override fun getValue() = ABI.makeIVisualStateManager(pointer.getPointer(0))

    public fun setValue(value: IVisualStateManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualStateManager {
    public val __996056515_Ptr: Pointer?

    public val _996056515_VtblPtr: Pointer?
      get() = __996056515_Ptr?.getPointer(0)
  }

  public class IVisualStateManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __996056515_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualStateManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("342c8d32ad61592593d10c704df2a7d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualStateManager(ptr: Pointer?): WithDefault = IVisualStateManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualStateManager {
      val address = segment.toRawLongValue()
      return makeIVisualStateManager(Pointer(address))
    }

    public override fun toNative(obj: IVisualStateManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__996056515_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualStateManager): Array<IVisualStateManager?> =
        (elements as
        Array<IVisualStateManager?>).castToImpl<IVisualStateManager,IVisualStateManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualStateManager?> =
        arrayOfNulls<IVisualStateManager_Impl>(size) as Array<IVisualStateManager?>
  }
}
