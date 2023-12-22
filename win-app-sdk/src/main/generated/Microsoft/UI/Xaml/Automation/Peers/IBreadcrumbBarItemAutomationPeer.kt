package Microsoft.UI.Xaml.Automation.Peers

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBreadcrumbBarItemAutomationPeer.ABI::class)
@Signature("{48e81612-7de0-5065-b881-04ebfff90497}")
@Guid("48e816127de05065b88104ebfff90497")
@WinRTInterface("48e816127de05065b88104ebfff90497")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBreadcrumbBarItemAutomationPeer.ByReference::class)
public interface IBreadcrumbBarItemAutomationPeer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBreadcrumbBarItemAutomationPeer> {
    public override fun getValue() = ABI.makeIBreadcrumbBarItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: IBreadcrumbBarItemAutomationPeer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBreadcrumbBarItemAutomationPeer {
    public val __1335811975_Ptr: Pointer?

    public val _1335811975_VtblPtr: Pointer?
      get() = __1335811975_Ptr?.getPointer(0)
  }

  public class IBreadcrumbBarItemAutomationPeer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1335811975_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBreadcrumbBarItemAutomationPeer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48e816127de05065b88104ebfff90497")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBreadcrumbBarItemAutomationPeer(ptr: Pointer?): WithDefault =
        IBreadcrumbBarItemAutomationPeer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBreadcrumbBarItemAutomationPeer {
      val address = segment.toRawLongValue()
      return makeIBreadcrumbBarItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: IBreadcrumbBarItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1335811975_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBreadcrumbBarItemAutomationPeer):
        Array<IBreadcrumbBarItemAutomationPeer?> = (elements as
        Array<IBreadcrumbBarItemAutomationPeer?>).castToImpl<IBreadcrumbBarItemAutomationPeer,IBreadcrumbBarItemAutomationPeer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBreadcrumbBarItemAutomationPeer?> =
        arrayOfNulls<IBreadcrumbBarItemAutomationPeer_Impl>(size) as
        Array<IBreadcrumbBarItemAutomationPeer?>
  }
}
