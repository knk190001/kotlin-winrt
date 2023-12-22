package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.ComboBox
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

@ABIMarker(IComboBoxAutomationPeerFactory.ABI::class)
@Signature("{098e5b0d-1b90-40b9-9be3-b23267eb13cf}")
@Guid("098e5b0d1b9040b99be3b23267eb13cf")
@WinRTInterface("098e5b0d1b9040b99be3b23267eb13cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxAutomationPeerFactory.ByReference::class)
public interface IComboBoxAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ComboBox?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ComboBoxAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIComboBoxAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IComboBoxAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxAutomationPeerFactory {
    public val __1329799836_Ptr: Pointer?

    public val _1329799836_VtblPtr: Pointer?
      get() = __1329799836_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ComboBox?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ComboBoxAutomationPeer? {
      val fnPtr = _1329799836_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ComboBoxAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1329799836_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ComboBoxAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IComboBoxAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1329799836_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("098e5b0d1b9040b99be3b23267eb13cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IComboBoxAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIComboBoxAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1329799836_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxAutomationPeerFactory):
        Array<IComboBoxAutomationPeerFactory?> = (elements as
        Array<IComboBoxAutomationPeerFactory?>).castToImpl<IComboBoxAutomationPeerFactory,IComboBoxAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxAutomationPeerFactory?> =
        arrayOfNulls<IComboBoxAutomationPeerFactory_Impl>(size) as
        Array<IComboBoxAutomationPeerFactory?>
  }
}
