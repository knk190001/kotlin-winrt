package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.ProgressRing
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
@Signature("{f3db204b-157e-40bc-9593-55bc5c71a4f6}")
@Guid("f3db204b157e40bc959355bc5c71a4f6")
@WinRTInterface("f3db204b157e40bc959355bc5c71a4f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressRingAutomationPeerFactory.ByReference::class)
public interface IProgressRingAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
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
    public val __2043649540_Ptr: Pointer?

    public val _2043649540_VtblPtr: Pointer?
      get() = __2043649540_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ProgressRing?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ProgressRingAutomationPeer? {
      val fnPtr = _2043649540_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProgressRingAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__2043649540_Ptr, marshalToNative(owner),
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
    public override val __2043649540_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressRingAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3db204b157e40bc959355bc5c71a4f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressRingAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IProgressRingAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressRingAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIProgressRingAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IProgressRingAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2043649540_Ptr))
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
