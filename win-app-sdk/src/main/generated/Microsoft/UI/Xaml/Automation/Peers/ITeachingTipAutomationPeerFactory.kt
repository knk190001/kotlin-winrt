package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.TeachingTip
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

@ABIMarker(ITeachingTipAutomationPeerFactory.ABI::class)
@Signature("{71a061c1-3d71-5548-98fd-62167f246085}")
@Guid("71a061c13d71554898fd62167f246085")
@WinRTInterface("71a061c13d71554898fd62167f246085")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITeachingTipAutomationPeerFactory.ByReference::class)
public interface ITeachingTipAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: TeachingTip?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): TeachingTipAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITeachingTipAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeITeachingTipAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ITeachingTipAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITeachingTipAutomationPeerFactory {
    public val __1725775782_Ptr: Pointer?

    public val _1725775782_VtblPtr: Pointer?
      get() = __1725775782_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: TeachingTip?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): TeachingTipAutomationPeer? {
      val fnPtr = _1725775782_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TeachingTipAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1725775782_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TeachingTipAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ITeachingTipAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1725775782_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITeachingTipAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71a061c13d71554898fd62167f246085")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITeachingTipAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ITeachingTipAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITeachingTipAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeITeachingTipAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ITeachingTipAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1725775782_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITeachingTipAutomationPeerFactory):
        Array<ITeachingTipAutomationPeerFactory?> = (elements as
        Array<ITeachingTipAutomationPeerFactory?>).castToImpl<ITeachingTipAutomationPeerFactory,ITeachingTipAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITeachingTipAutomationPeerFactory?> =
        arrayOfNulls<ITeachingTipAutomationPeerFactory_Impl>(size) as
        Array<ITeachingTipAutomationPeerFactory?>
  }
}
