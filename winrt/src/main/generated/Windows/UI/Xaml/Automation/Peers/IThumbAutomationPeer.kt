package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(IThumbAutomationPeer.ABI::class)
@Signature("{dc2949b5-b45e-4d6d-892f-d9422c950efb}")
@Guid("dc2949b5b45e4d6d892fd9422c950efb")
@WinRTInterface("dc2949b5b45e4d6d892fd9422c950efb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IThumbAutomationPeer.ByReference::class)
public interface IThumbAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IThumbAutomationPeer> {
    public override fun getValue() = ABI.makeIThumbAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IThumbAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IThumbAutomationPeer {
    public val __1573115095_Ptr: Pointer?

    public val _1573115095_VtblPtr: Pointer?
      get() = __1573115095_Ptr?.getPointer(0)
  }

  public class IThumbAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1573115095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IThumbAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dc2949b5b45e4d6d892fd9422c950efb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIThumbAutomationPeer(ptr: Pointer?): WithDefault = IThumbAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IThumbAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIThumbAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IThumbAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1573115095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IThumbAutomationPeer): Array<IThumbAutomationPeer?> =
        (elements as
        Array<IThumbAutomationPeer?>).castToImpl<IThumbAutomationPeer,IThumbAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IThumbAutomationPeer?> =
        arrayOfNulls<IThumbAutomationPeer_Impl>(size) as Array<IThumbAutomationPeer?>
  }
}
