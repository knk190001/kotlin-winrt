package Windows.UI.Xaml.Input

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

@ABIMarker(IFocusManager.ABI::class)
@Signature("{c843f50b-3b83-4da1-9d6f-557c1169f341}")
@Guid("c843f50b3b834da19d6f557c1169f341")
@WinRTInterface("c843f50b3b834da19d6f557c1169f341")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusManager.ByReference::class)
public interface IFocusManager : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFocusManager>
      {
    public override fun getValue() = ABI.makeIFocusManager(pointer.getPointer(0))

    public fun setValue(value: IFocusManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusManager {
    public val __528237963_Ptr: Pointer?

    public val _528237963_VtblPtr: Pointer?
      get() = __528237963_Ptr?.getPointer(0)
  }

  public class IFocusManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __528237963_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c843f50b3b834da19d6f557c1169f341")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusManager(ptr: Pointer?): WithDefault = IFocusManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusManager {
      val address = segment.toRawLongValue()
      return makeIFocusManager(Pointer(address))
    }

    public override fun toNative(obj: IFocusManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__528237963_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusManager): Array<IFocusManager?> = (elements as
        Array<IFocusManager?>).castToImpl<IFocusManager,IFocusManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusManager?> =
        arrayOfNulls<IFocusManager_Impl>(size) as Array<IFocusManager?>
  }
}
