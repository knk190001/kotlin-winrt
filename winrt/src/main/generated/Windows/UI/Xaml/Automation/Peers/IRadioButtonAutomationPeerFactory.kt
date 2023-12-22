package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.RadioButton
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

@ABIMarker(IRadioButtonAutomationPeerFactory.ABI::class)
@Signature("{4940c4fd-3d88-49ca-8f31-924187af0bfe}")
@Guid("4940c4fd3d8849ca8f31924187af0bfe")
@WinRTInterface("4940c4fd3d8849ca8f31924187af0bfe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadioButtonAutomationPeerFactory.ByReference::class)
public interface IRadioButtonAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: RadioButton?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): RadioButtonAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadioButtonAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIRadioButtonAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IRadioButtonAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadioButtonAutomationPeerFactory {
    public val __1072650916_Ptr: Pointer?

    public val _1072650916_VtblPtr: Pointer?
      get() = __1072650916_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: RadioButton?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): RadioButtonAutomationPeer? {
      val fnPtr = _1072650916_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadioButtonAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1072650916_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadioButtonAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IRadioButtonAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1072650916_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadioButtonAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4940c4fd3d8849ca8f31924187af0bfe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadioButtonAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IRadioButtonAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadioButtonAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIRadioButtonAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IRadioButtonAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1072650916_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadioButtonAutomationPeerFactory):
        Array<IRadioButtonAutomationPeerFactory?> = (elements as
        Array<IRadioButtonAutomationPeerFactory?>).castToImpl<IRadioButtonAutomationPeerFactory,IRadioButtonAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadioButtonAutomationPeerFactory?> =
        arrayOfNulls<IRadioButtonAutomationPeerFactory_Impl>(size) as
        Array<IRadioButtonAutomationPeerFactory?>
  }
}
