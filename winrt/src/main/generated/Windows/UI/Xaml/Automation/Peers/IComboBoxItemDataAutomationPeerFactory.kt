package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(IComboBoxItemDataAutomationPeerFactory.ABI::class)
@Signature("{14a8d4f6-469a-41ba-9d93-44a1a55da872}")
@Guid("14a8d4f6469a41ba9d9344a1a55da872")
@WinRTInterface("14a8d4f6469a41ba9d9344a1a55da872")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxItemDataAutomationPeerFactory.ByReference::class)
public interface IComboBoxItemDataAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithParentAndItem(
    item: IUnknown?,
    parent: ComboBoxAutomationPeer?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ComboBoxItemDataAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxItemDataAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIComboBoxItemDataAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IComboBoxItemDataAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxItemDataAutomationPeerFactory {
    public val __825828927_Ptr: Pointer?

    public val _825828927_VtblPtr: Pointer?
      get() = __825828927_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithParentAndItem(
      item: IUnknown?,
      parent: ComboBoxAutomationPeer?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ComboBoxItemDataAutomationPeer? {
      val fnPtr = _825828927_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ComboBoxItemDataAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__825828927_Ptr, marshalToNative(item), marshalToNative(parent),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ComboBoxItemDataAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IComboBoxItemDataAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __825828927_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxItemDataAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("14a8d4f6469a41ba9d9344a1a55da872")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxItemDataAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IComboBoxItemDataAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxItemDataAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIComboBoxItemDataAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxItemDataAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__825828927_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxItemDataAutomationPeerFactory):
        Array<IComboBoxItemDataAutomationPeerFactory?> = (elements as
        Array<IComboBoxItemDataAutomationPeerFactory?>).castToImpl<IComboBoxItemDataAutomationPeerFactory,IComboBoxItemDataAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxItemDataAutomationPeerFactory?> =
        arrayOfNulls<IComboBoxItemDataAutomationPeerFactory_Impl>(size) as
        Array<IComboBoxItemDataAutomationPeerFactory?>
  }
}
