package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.InfoBar
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

@ABIMarker(IInfoBarAutomationPeerFactory.ABI::class)
@Signature("{5fd3e590-68b9-5c9c-a572-0bc10167ce46}")
@Guid("5fd3e59068b95c9ca5720bc10167ce46")
@WinRTInterface("5fd3e59068b95c9ca5720bc10167ce46")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBarAutomationPeerFactory.ByReference::class)
public interface IInfoBarAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: InfoBar?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): InfoBarAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfoBarAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIInfoBarAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IInfoBarAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBarAutomationPeerFactory {
    public val __1082795249_Ptr: Pointer?

    public val _1082795249_VtblPtr: Pointer?
      get() = __1082795249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: InfoBar?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): InfoBarAutomationPeer? {
      val fnPtr = _1082795249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfoBarAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1082795249_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfoBarAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IInfoBarAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1082795249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBarAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5fd3e59068b95c9ca5720bc10167ce46")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBarAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IInfoBarAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBarAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIInfoBarAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IInfoBarAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1082795249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBarAutomationPeerFactory):
        Array<IInfoBarAutomationPeerFactory?> = (elements as
        Array<IInfoBarAutomationPeerFactory?>).castToImpl<IInfoBarAutomationPeerFactory,IInfoBarAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBarAutomationPeerFactory?> =
        arrayOfNulls<IInfoBarAutomationPeerFactory_Impl>(size) as
        Array<IInfoBarAutomationPeerFactory?>
  }
}
