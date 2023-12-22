package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.ProgressRing
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

@ABIMarker(IProgressRingAutomationPeerFactory.ABI::class)
@Signature("{650f375c-3b29-5376-a7f7-c78082b82d13}")
@Guid("650f375c3b295376a7f7c78082b82d13")
@WinRTInterface("650f375c3b295376a7f7c78082b82d13")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressRingAutomationPeerFactory.ByReference::class)
public interface IProgressRingAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: ProgressRing?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ProgressRingAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProgressRingAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIProgressRingAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IProgressRingAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProgressRingAutomationPeerFactory {
    public val __745239375_Ptr: Pointer?

    public val _745239375_VtblPtr: Pointer?
      get() = __745239375_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: ProgressRing?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ProgressRingAutomationPeer? {
      val fnPtr = _745239375_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProgressRingAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__745239375_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProgressRingAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IProgressRingAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __745239375_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressRingAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("650f375c3b295376a7f7c78082b82d13")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressRingAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IProgressRingAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressRingAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIProgressRingAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IProgressRingAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__745239375_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressRingAutomationPeerFactory):
        Array<IProgressRingAutomationPeerFactory?> = (elements as
        Array<IProgressRingAutomationPeerFactory?>).castToImpl<IProgressRingAutomationPeerFactory,IProgressRingAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressRingAutomationPeerFactory?> =
        arrayOfNulls<IProgressRingAutomationPeerFactory_Impl>(size) as
        Array<IProgressRingAutomationPeerFactory?>
  }
}
