package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.RadioButtons
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

@ABIMarker(IRadioButtonsAutomationPeerFactory.ABI::class)
@Signature("{f13521d0-056e-598c-ad23-a7150049d80a}")
@Guid("f13521d0056e598cad23a7150049d80a")
@WinRTInterface("f13521d0056e598cad23a7150049d80a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadioButtonsAutomationPeerFactory.ByReference::class)
public interface IRadioButtonsAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: RadioButtons?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): RadioButtonsAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadioButtonsAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIRadioButtonsAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IRadioButtonsAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadioButtonsAutomationPeerFactory {
    public val __1340564664_Ptr: Pointer?

    public val _1340564664_VtblPtr: Pointer?
      get() = __1340564664_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: RadioButtons?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): RadioButtonsAutomationPeer? {
      val fnPtr = _1340564664_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadioButtonsAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1340564664_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadioButtonsAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IRadioButtonsAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1340564664_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadioButtonsAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f13521d0056e598cad23a7150049d80a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadioButtonsAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IRadioButtonsAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadioButtonsAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIRadioButtonsAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IRadioButtonsAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1340564664_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadioButtonsAutomationPeerFactory):
        Array<IRadioButtonsAutomationPeerFactory?> = (elements as
        Array<IRadioButtonsAutomationPeerFactory?>).castToImpl<IRadioButtonsAutomationPeerFactory,IRadioButtonsAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadioButtonsAutomationPeerFactory?> =
        arrayOfNulls<IRadioButtonsAutomationPeerFactory_Impl>(size) as
        Array<IRadioButtonsAutomationPeerFactory?>
  }
}
