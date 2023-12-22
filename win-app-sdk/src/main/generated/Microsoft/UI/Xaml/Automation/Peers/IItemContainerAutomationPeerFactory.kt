package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.ItemContainer
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

@ABIMarker(IItemContainerAutomationPeerFactory.ABI::class)
@Signature("{4600cfb3-72e1-5181-95ec-653f30b01c78}")
@Guid("4600cfb372e1518195ec653f30b01c78")
@WinRTInterface("4600cfb372e1518195ec653f30b01c78")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemContainerAutomationPeerFactory.ByReference::class)
public interface IItemContainerAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: ItemContainer?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ItemContainerAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemContainerAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIItemContainerAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IItemContainerAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemContainerAutomationPeerFactory {
    public val __1049299526_Ptr: Pointer?

    public val _1049299526_VtblPtr: Pointer?
      get() = __1049299526_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: ItemContainer?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ItemContainerAutomationPeer? {
      val fnPtr = _1049299526_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemContainerAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1049299526_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemContainerAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IItemContainerAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1049299526_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemContainerAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4600cfb372e1518195ec653f30b01c78")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemContainerAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IItemContainerAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemContainerAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIItemContainerAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IItemContainerAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1049299526_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemContainerAutomationPeerFactory):
        Array<IItemContainerAutomationPeerFactory?> = (elements as
        Array<IItemContainerAutomationPeerFactory?>).castToImpl<IItemContainerAutomationPeerFactory,IItemContainerAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemContainerAutomationPeerFactory?> =
        arrayOfNulls<IItemContainerAutomationPeerFactory_Impl>(size) as
        Array<IItemContainerAutomationPeerFactory?>
  }
}
