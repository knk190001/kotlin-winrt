package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.Primitives.RepeatButton
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

@ABIMarker(IRepeatButtonAutomationPeerFactory.ABI::class)
@Signature("{0fad55a4-1c62-595e-a189-bb43a219c699}")
@Guid("0fad55a41c62595ea189bb43a219c699")
@WinRTInterface("0fad55a41c62595ea189bb43a219c699")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepeatButtonAutomationPeerFactory.ByReference::class)
public interface IRepeatButtonAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: RepeatButton?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): RepeatButtonAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepeatButtonAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIRepeatButtonAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IRepeatButtonAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepeatButtonAutomationPeerFactory {
    public val __1143669759_Ptr: Pointer?

    public val _1143669759_VtblPtr: Pointer?
      get() = __1143669759_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: RepeatButton?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): RepeatButtonAutomationPeer? {
      val fnPtr = _1143669759_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RepeatButtonAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1143669759_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RepeatButtonAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IRepeatButtonAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1143669759_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepeatButtonAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0fad55a41c62595ea189bb43a219c699")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepeatButtonAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IRepeatButtonAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepeatButtonAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIRepeatButtonAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IRepeatButtonAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1143669759_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepeatButtonAutomationPeerFactory):
        Array<IRepeatButtonAutomationPeerFactory?> = (elements as
        Array<IRepeatButtonAutomationPeerFactory?>).castToImpl<IRepeatButtonAutomationPeerFactory,IRepeatButtonAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepeatButtonAutomationPeerFactory?> =
        arrayOfNulls<IRepeatButtonAutomationPeerFactory_Impl>(size) as
        Array<IRepeatButtonAutomationPeerFactory?>
  }
}
