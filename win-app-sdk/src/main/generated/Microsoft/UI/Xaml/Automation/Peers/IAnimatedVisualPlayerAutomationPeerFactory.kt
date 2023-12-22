package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.AnimatedVisualPlayer
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

@ABIMarker(IAnimatedVisualPlayerAutomationPeerFactory.ABI::class)
@Signature("{d2a49198-80bb-51d6-b495-3dc5aab59589}")
@Guid("d2a4919880bb51d6b4953dc5aab59589")
@WinRTInterface("d2a4919880bb51d6b4953dc5aab59589")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedVisualPlayerAutomationPeerFactory.ByReference::class)
public interface IAnimatedVisualPlayerAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: AnimatedVisualPlayer?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): AnimatedVisualPlayerAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedVisualPlayerAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIAnimatedVisualPlayerAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IAnimatedVisualPlayerAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedVisualPlayerAutomationPeerFactory {
    public val __714158966_Ptr: Pointer?

    public val _714158966_VtblPtr: Pointer?
      get() = __714158966_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: AnimatedVisualPlayer?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): AnimatedVisualPlayerAutomationPeer? {
      val fnPtr = _714158966_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimatedVisualPlayerAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__714158966_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimatedVisualPlayerAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IAnimatedVisualPlayerAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __714158966_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedVisualPlayerAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2a4919880bb51d6b4953dc5aab59589")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedVisualPlayerAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IAnimatedVisualPlayerAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAnimatedVisualPlayerAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIAnimatedVisualPlayerAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedVisualPlayerAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__714158966_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedVisualPlayerAutomationPeerFactory):
        Array<IAnimatedVisualPlayerAutomationPeerFactory?> = (elements as
        Array<IAnimatedVisualPlayerAutomationPeerFactory?>).castToImpl<IAnimatedVisualPlayerAutomationPeerFactory,IAnimatedVisualPlayerAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedVisualPlayerAutomationPeerFactory?> =
        arrayOfNulls<IAnimatedVisualPlayerAutomationPeerFactory_Impl>(size) as
        Array<IAnimatedVisualPlayerAutomationPeerFactory?>
  }
}
