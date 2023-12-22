package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.Primitives.RangeBase
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

@ABIMarker(IRangeBaseAutomationPeerFactory.ABI::class)
@Signature("{8c8f25e9-5194-54a9-b787-ce0293fd6721}")
@Guid("8c8f25e9519454a9b787ce0293fd6721")
@WinRTInterface("8c8f25e9519454a9b787ce0293fd6721")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRangeBaseAutomationPeerFactory.ByReference::class)
public interface IRangeBaseAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: RangeBase?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): RangeBaseAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRangeBaseAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIRangeBaseAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IRangeBaseAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRangeBaseAutomationPeerFactory {
    public val __1611785018_Ptr: Pointer?

    public val _1611785018_VtblPtr: Pointer?
      get() = __1611785018_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: RangeBase?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): RangeBaseAutomationPeer? {
      val fnPtr = _1611785018_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RangeBaseAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1611785018_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RangeBaseAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IRangeBaseAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1611785018_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRangeBaseAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c8f25e9519454a9b787ce0293fd6721")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRangeBaseAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IRangeBaseAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRangeBaseAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIRangeBaseAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IRangeBaseAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1611785018_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRangeBaseAutomationPeerFactory):
        Array<IRangeBaseAutomationPeerFactory?> = (elements as
        Array<IRangeBaseAutomationPeerFactory?>).castToImpl<IRangeBaseAutomationPeerFactory,IRangeBaseAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRangeBaseAutomationPeerFactory?> =
        arrayOfNulls<IRangeBaseAutomationPeerFactory_Impl>(size) as
        Array<IRangeBaseAutomationPeerFactory?>
  }
}
