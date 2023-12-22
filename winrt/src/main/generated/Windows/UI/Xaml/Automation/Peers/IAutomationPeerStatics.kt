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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPeerStatics.ABI::class)
@Signature("{562f7fb0-a331-4a9c-9dec-bfb7586fffff}")
@Guid("562f7fb0a3314a9c9decbfb7586fffff")
@WinRTInterface("562f7fb0a3314a9c9decbfb7586fffff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerStatics.ByReference::class)
public interface IAutomationPeerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ListenerExists(eventId: AutomationEvents?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerStatics> {
    public override fun getValue() = ABI.makeIAutomationPeerStatics(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerStatics {
    public val __1973895500_Ptr: Pointer?

    public val _1973895500_VtblPtr: Pointer?
      get() = __1973895500_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ListenerExists(eventId: AutomationEvents?): Boolean {
      val fnPtr = _1973895500_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1973895500_Ptr, marshalToNative(eventId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAutomationPeerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1973895500_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("562f7fb0a3314a9c9decbfb7586fffff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerStatics(ptr: Pointer?): WithDefault =
        IAutomationPeerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerStatics {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1973895500_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerStatics): Array<IAutomationPeerStatics?> =
        (elements as
        Array<IAutomationPeerStatics?>).castToImpl<IAutomationPeerStatics,IAutomationPeerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerStatics?> =
        arrayOfNulls<IAutomationPeerStatics_Impl>(size) as Array<IAutomationPeerStatics?>
  }
}
