package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.SettingsFlyout
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

@ABIMarker(ISettingsFlyoutAutomationPeerFactory.ABI::class)
@Signature("{f94762bd-8a14-40e4-94a7-3f33c922e945}")
@Guid("f94762bd8a1440e494a73f33c922e945")
@WinRTInterface("f94762bd8a1440e494a73f33c922e945")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISettingsFlyoutAutomationPeerFactory.ByReference::class)
public interface ISettingsFlyoutAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: SettingsFlyout?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): SettingsFlyoutAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISettingsFlyoutAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeISettingsFlyoutAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ISettingsFlyoutAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISettingsFlyoutAutomationPeerFactory {
    public val __1540325221_Ptr: Pointer?

    public val _1540325221_VtblPtr: Pointer?
      get() = __1540325221_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: SettingsFlyout?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): SettingsFlyoutAutomationPeer? {
      val fnPtr = _1540325221_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SettingsFlyoutAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1540325221_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SettingsFlyoutAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ISettingsFlyoutAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1540325221_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISettingsFlyoutAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f94762bd8a1440e494a73f33c922e945")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISettingsFlyoutAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ISettingsFlyoutAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISettingsFlyoutAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeISettingsFlyoutAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ISettingsFlyoutAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1540325221_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISettingsFlyoutAutomationPeerFactory):
        Array<ISettingsFlyoutAutomationPeerFactory?> = (elements as
        Array<ISettingsFlyoutAutomationPeerFactory?>).castToImpl<ISettingsFlyoutAutomationPeerFactory,ISettingsFlyoutAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISettingsFlyoutAutomationPeerFactory?> =
        arrayOfNulls<ISettingsFlyoutAutomationPeerFactory_Impl>(size) as
        Array<ISettingsFlyoutAutomationPeerFactory?>
  }
}
