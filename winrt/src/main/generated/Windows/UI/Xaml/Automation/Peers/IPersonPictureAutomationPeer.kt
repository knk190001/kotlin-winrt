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

@ABIMarker(IPersonPictureAutomationPeer.ABI::class)
@Signature("{27156d4c-a66f-4aaf-8286-4f796d30628c}")
@Guid("27156d4ca66f4aaf82864f796d30628c")
@WinRTInterface("27156d4ca66f4aaf82864f796d30628c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPersonPictureAutomationPeer.ByReference::class)
public interface IPersonPictureAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPersonPictureAutomationPeer> {
    public override fun getValue() = ABI.makeIPersonPictureAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IPersonPictureAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPersonPictureAutomationPeer {
    public val __922131882_Ptr: Pointer?

    public val _922131882_VtblPtr: Pointer?
      get() = __922131882_Ptr?.getPointer(0)
  }

  public class IPersonPictureAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __922131882_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPersonPictureAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27156d4ca66f4aaf82864f796d30628c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPersonPictureAutomationPeer(ptr: Pointer?): WithDefault =
        IPersonPictureAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPersonPictureAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIPersonPictureAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IPersonPictureAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__922131882_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPersonPictureAutomationPeer):
        Array<IPersonPictureAutomationPeer?> = (elements as
        Array<IPersonPictureAutomationPeer?>).castToImpl<IPersonPictureAutomationPeer,IPersonPictureAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPersonPictureAutomationPeer?> =
        arrayOfNulls<IPersonPictureAutomationPeer_Impl>(size) as
        Array<IPersonPictureAutomationPeer?>
  }
}
