package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.ProgressBar
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

@ABIMarker(IProgressBarAutomationPeerFactory.ABI::class)
@Signature("{364679ab-b80f-41b4-8eea-2f5251bc739c}")
@Guid("364679abb80f41b48eea2f5251bc739c")
@WinRTInterface("364679abb80f41b48eea2f5251bc739c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressBarAutomationPeerFactory.ByReference::class)
public interface IProgressBarAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ProgressBar?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ProgressBarAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProgressBarAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIProgressBarAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IProgressBarAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProgressBarAutomationPeerFactory {
    public val __1146546333_Ptr: Pointer?

    public val _1146546333_VtblPtr: Pointer?
      get() = __1146546333_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ProgressBar?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ProgressBarAutomationPeer? {
      val fnPtr = _1146546333_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProgressBarAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1146546333_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProgressBarAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IProgressBarAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1146546333_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressBarAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("364679abb80f41b48eea2f5251bc739c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressBarAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IProgressBarAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressBarAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIProgressBarAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IProgressBarAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1146546333_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressBarAutomationPeerFactory):
        Array<IProgressBarAutomationPeerFactory?> = (elements as
        Array<IProgressBarAutomationPeerFactory?>).castToImpl<IProgressBarAutomationPeerFactory,IProgressBarAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressBarAutomationPeerFactory?> =
        arrayOfNulls<IProgressBarAutomationPeerFactory_Impl>(size) as
        Array<IProgressBarAutomationPeerFactory?>
  }
}
