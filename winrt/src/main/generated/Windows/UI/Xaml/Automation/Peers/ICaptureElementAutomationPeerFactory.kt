package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.CaptureElement
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

@ABIMarker(ICaptureElementAutomationPeerFactory.ABI::class)
@Signature("{9b92ef48-85e9-4869-b175-8f7cf45a6d9f}")
@Guid("9b92ef4885e94869b1758f7cf45a6d9f")
@WinRTInterface("9b92ef4885e94869b1758f7cf45a6d9f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICaptureElementAutomationPeerFactory.ByReference::class)
public interface ICaptureElementAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: CaptureElement?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): CaptureElementAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICaptureElementAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeICaptureElementAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ICaptureElementAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICaptureElementAutomationPeerFactory {
    public val __329010883_Ptr: Pointer?

    public val _329010883_VtblPtr: Pointer?
      get() = __329010883_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: CaptureElement?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): CaptureElementAutomationPeer? {
      val fnPtr = _329010883_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CaptureElementAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__329010883_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CaptureElementAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ICaptureElementAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __329010883_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICaptureElementAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b92ef4885e94869b1758f7cf45a6d9f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICaptureElementAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ICaptureElementAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICaptureElementAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeICaptureElementAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ICaptureElementAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__329010883_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICaptureElementAutomationPeerFactory):
        Array<ICaptureElementAutomationPeerFactory?> = (elements as
        Array<ICaptureElementAutomationPeerFactory?>).castToImpl<ICaptureElementAutomationPeerFactory,ICaptureElementAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICaptureElementAutomationPeerFactory?> =
        arrayOfNulls<ICaptureElementAutomationPeerFactory_Impl>(size) as
        Array<ICaptureElementAutomationPeerFactory?>
  }
}
