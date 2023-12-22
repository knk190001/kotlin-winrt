package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.DatePicker
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

@ABIMarker(IDatePickerAutomationPeerFactory.ABI::class)
@Signature("{480f7825-b4a7-5c56-9f8a-fed84b9348ae}")
@Guid("480f7825b4a75c569f8afed84b9348ae")
@WinRTInterface("480f7825b4a75c569f8afed84b9348ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerAutomationPeerFactory.ByReference::class)
public interface IDatePickerAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: DatePicker?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): DatePickerAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIDatePickerAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IDatePickerAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerAutomationPeerFactory {
    public val __1504972430_Ptr: Pointer?

    public val _1504972430_VtblPtr: Pointer?
      get() = __1504972430_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: DatePicker?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): DatePickerAutomationPeer? {
      val fnPtr = _1504972430_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DatePickerAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1504972430_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DatePickerAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IDatePickerAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1504972430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("480f7825b4a75c569f8afed84b9348ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IDatePickerAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIDatePickerAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1504972430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerAutomationPeerFactory):
        Array<IDatePickerAutomationPeerFactory?> = (elements as
        Array<IDatePickerAutomationPeerFactory?>).castToImpl<IDatePickerAutomationPeerFactory,IDatePickerAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerAutomationPeerFactory?> =
        arrayOfNulls<IDatePickerAutomationPeerFactory_Impl>(size) as
        Array<IDatePickerAutomationPeerFactory?>
  }
}
