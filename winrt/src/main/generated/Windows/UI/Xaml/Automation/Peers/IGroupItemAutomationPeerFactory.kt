package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.GroupItem
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGroupItemAutomationPeerFactory.ABI::class)
@Signature("{56a64567-f21c-4c90-b379-15a27c7f8409}")
@Guid("56a64567f21c4c90b37915a27c7f8409")
@WinRTInterface("56a64567f21c4c90b37915a27c7f8409")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGroupItemAutomationPeerFactory.ByReference::class)
public interface IGroupItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: GroupItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): GroupItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGroupItemAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIGroupItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IGroupItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGroupItemAutomationPeerFactory {
    public val __1031585111_Ptr: Pointer?

    public val _1031585111_VtblPtr: Pointer?
      get() = __1031585111_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: GroupItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): GroupItemAutomationPeer? {
      val fnPtr = _1031585111_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GroupItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1031585111_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GroupItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IGroupItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1031585111_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGroupItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56a64567f21c4c90b37915a27c7f8409")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGroupItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IGroupItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGroupItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIGroupItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IGroupItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1031585111_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGroupItemAutomationPeerFactory):
        Array<IGroupItemAutomationPeerFactory?> = (elements as
        Array<IGroupItemAutomationPeerFactory?>).castToImpl<IGroupItemAutomationPeerFactory,IGroupItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGroupItemAutomationPeerFactory?> =
        arrayOfNulls<IGroupItemAutomationPeerFactory_Impl>(size) as
        Array<IGroupItemAutomationPeerFactory?>
  }
}
