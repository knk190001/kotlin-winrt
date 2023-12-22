package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.TimePicker
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

@ABIMarker(ITimePickerAutomationPeerFactory.ABI::class)
@Signature("{7cdf2f82-7453-5d86-8ee3-60daaf345f47}")
@Guid("7cdf2f8274535d868ee360daaf345f47")
@WinRTInterface("7cdf2f8274535d868ee360daaf345f47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePickerAutomationPeerFactory.ByReference::class)
public interface ITimePickerAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: TimePicker?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): TimePickerAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimePickerAutomationPeerFactory> {
    public override fun getValue() = ABI.makeITimePickerAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ITimePickerAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePickerAutomationPeerFactory {
    public val __653356301_Ptr: Pointer?

    public val _653356301_VtblPtr: Pointer?
      get() = __653356301_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: TimePicker?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): TimePickerAutomationPeer? {
      val fnPtr = _653356301_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimePickerAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__653356301_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimePickerAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ITimePickerAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __653356301_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePickerAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7cdf2f8274535d868ee360daaf345f47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePickerAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ITimePickerAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimePickerAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeITimePickerAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ITimePickerAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__653356301_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePickerAutomationPeerFactory):
        Array<ITimePickerAutomationPeerFactory?> = (elements as
        Array<ITimePickerAutomationPeerFactory?>).castToImpl<ITimePickerAutomationPeerFactory,ITimePickerAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePickerAutomationPeerFactory?> =
        arrayOfNulls<ITimePickerAutomationPeerFactory_Impl>(size) as
        Array<ITimePickerAutomationPeerFactory?>
  }
}
