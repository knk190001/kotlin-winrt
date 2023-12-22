package Windows.UI.Xaml.Automation.Peers

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPeer7.ABI::class)
@Signature("{796b3287-e642-48ab-b223-5208b41da9d6}")
@Guid("796b3287e64248abb2235208b41da9d6")
@WinRTInterface("796b3287e64248abb2235208b41da9d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeer7.ByReference::class)
public interface IAutomationPeer7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RaiseNotificationEvent(
    notificationKind: AutomationNotificationKind?,
    notificationProcessing: AutomationNotificationProcessing?,
    displayString: String?,
    activityId: String?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeer7> {
    public override fun getValue() = ABI.makeIAutomationPeer7(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeer7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeer7 {
    public val __1075421562_Ptr: Pointer?

    public val _1075421562_VtblPtr: Pointer?
      get() = __1075421562_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RaiseNotificationEvent(
      notificationKind: AutomationNotificationKind?,
      notificationProcessing: AutomationNotificationProcessing?,
      displayString: String?,
      activityId: String?
    ): Unit {
      val fnPtr = _1075421562_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1075421562_Ptr, marshalToNative(notificationKind),
          marshalToNative(notificationProcessing), marshalToNative(displayString),
          marshalToNative(activityId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutomationPeer7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1075421562_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeer7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("796b3287e64248abb2235208b41da9d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeer7(ptr: Pointer?): WithDefault = IAutomationPeer7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeer7 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeer7(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeer7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1075421562_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeer7): Array<IAutomationPeer7?> = (elements as
        Array<IAutomationPeer7?>).castToImpl<IAutomationPeer7,IAutomationPeer7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeer7?> =
        arrayOfNulls<IAutomationPeer7_Impl>(size) as Array<IAutomationPeer7?>
  }
}
