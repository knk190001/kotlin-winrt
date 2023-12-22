package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.ScrollViewer
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

@ABIMarker(IScrollViewerAutomationPeerFactory.ABI::class)
@Signature("{3f1578f9-60ec-5f7c-8d11-10c535a75a12}")
@Guid("3f1578f960ec5f7c8d1110c535a75a12")
@WinRTInterface("3f1578f960ec5f7c8d1110c535a75a12")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollViewerAutomationPeerFactory.ByReference::class)
public interface IScrollViewerAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: ScrollViewer?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ScrollViewerAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollViewerAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIScrollViewerAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IScrollViewerAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollViewerAutomationPeerFactory {
    public val __1732220079_Ptr: Pointer?

    public val _1732220079_VtblPtr: Pointer?
      get() = __1732220079_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: ScrollViewer?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ScrollViewerAutomationPeer? {
      val fnPtr = _1732220079_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollViewerAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1732220079_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollViewerAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IScrollViewerAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1732220079_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollViewerAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f1578f960ec5f7c8d1110c535a75a12")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollViewerAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IScrollViewerAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollViewerAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIScrollViewerAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IScrollViewerAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1732220079_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollViewerAutomationPeerFactory):
        Array<IScrollViewerAutomationPeerFactory?> = (elements as
        Array<IScrollViewerAutomationPeerFactory?>).castToImpl<IScrollViewerAutomationPeerFactory,IScrollViewerAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollViewerAutomationPeerFactory?> =
        arrayOfNulls<IScrollViewerAutomationPeerFactory_Impl>(size) as
        Array<IScrollViewerAutomationPeerFactory?>
  }
}
