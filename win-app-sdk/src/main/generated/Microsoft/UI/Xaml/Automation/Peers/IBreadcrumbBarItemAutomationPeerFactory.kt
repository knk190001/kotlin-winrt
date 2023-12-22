package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.BreadcrumbBarItem
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

@ABIMarker(IBreadcrumbBarItemAutomationPeerFactory.ABI::class)
@Signature("{dfb02146-405f-52ed-a873-0ed4942850be}")
@Guid("dfb02146405f52eda8730ed4942850be")
@WinRTInterface("dfb02146405f52eda8730ed4942850be")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBreadcrumbBarItemAutomationPeerFactory.ByReference::class)
public interface IBreadcrumbBarItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: BreadcrumbBarItem?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): BreadcrumbBarItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBreadcrumbBarItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIBreadcrumbBarItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IBreadcrumbBarItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBreadcrumbBarItemAutomationPeerFactory {
    public val __1314070959_Ptr: Pointer?

    public val _1314070959_VtblPtr: Pointer?
      get() = __1314070959_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: BreadcrumbBarItem?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): BreadcrumbBarItemAutomationPeer? {
      val fnPtr = _1314070959_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BreadcrumbBarItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1314070959_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BreadcrumbBarItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IBreadcrumbBarItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1314070959_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBreadcrumbBarItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dfb02146405f52eda8730ed4942850be")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBreadcrumbBarItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IBreadcrumbBarItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBreadcrumbBarItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIBreadcrumbBarItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IBreadcrumbBarItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1314070959_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBreadcrumbBarItemAutomationPeerFactory):
        Array<IBreadcrumbBarItemAutomationPeerFactory?> = (elements as
        Array<IBreadcrumbBarItemAutomationPeerFactory?>).castToImpl<IBreadcrumbBarItemAutomationPeerFactory,IBreadcrumbBarItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBreadcrumbBarItemAutomationPeerFactory?> =
        arrayOfNulls<IBreadcrumbBarItemAutomationPeerFactory_Impl>(size) as
        Array<IBreadcrumbBarItemAutomationPeerFactory?>
  }
}
