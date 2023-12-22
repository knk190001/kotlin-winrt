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

@ABIMarker(IPasswordBoxAutomationPeer.ABI::class)
@Signature("{684f065e-3df3-4b9f-82ad-8819db3b218a}")
@Guid("684f065e3df34b9f82ad8819db3b218a")
@WinRTInterface("684f065e3df34b9f82ad8819db3b218a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPasswordBoxAutomationPeer.ByReference::class)
public interface IPasswordBoxAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPasswordBoxAutomationPeer> {
    public override fun getValue() = ABI.makeIPasswordBoxAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IPasswordBoxAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPasswordBoxAutomationPeer {
    public val __1420748977_Ptr: Pointer?

    public val _1420748977_VtblPtr: Pointer?
      get() = __1420748977_Ptr?.getPointer(0)
  }

  public class IPasswordBoxAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1420748977_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPasswordBoxAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("684f065e3df34b9f82ad8819db3b218a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPasswordBoxAutomationPeer(ptr: Pointer?): WithDefault =
        IPasswordBoxAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPasswordBoxAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIPasswordBoxAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IPasswordBoxAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1420748977_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPasswordBoxAutomationPeer):
        Array<IPasswordBoxAutomationPeer?> = (elements as
        Array<IPasswordBoxAutomationPeer?>).castToImpl<IPasswordBoxAutomationPeer,IPasswordBoxAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPasswordBoxAutomationPeer?> =
        arrayOfNulls<IPasswordBoxAutomationPeer_Impl>(size) as Array<IPasswordBoxAutomationPeer?>
  }
}
