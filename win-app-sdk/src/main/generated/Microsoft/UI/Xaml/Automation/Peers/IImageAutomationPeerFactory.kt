package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.Image
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

@ABIMarker(IImageAutomationPeerFactory.ABI::class)
@Signature("{1b26001b-49a6-5ff4-b1b1-2d504d2ef133}")
@Guid("1b26001b49a65ff4b1b12d504d2ef133")
@WinRTInterface("1b26001b49a65ff4b1b12d504d2ef133")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageAutomationPeerFactory.ByReference::class)
public interface IImageAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: Image?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ImageAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIImageAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IImageAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageAutomationPeerFactory {
    public val __69126329_Ptr: Pointer?

    public val _69126329_VtblPtr: Pointer?
      get() = __69126329_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: Image?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ImageAutomationPeer? {
      val fnPtr = _69126329_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__69126329_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IImageAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __69126329_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b26001b49a65ff4b1b12d504d2ef133")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IImageAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIImageAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IImageAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__69126329_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageAutomationPeerFactory):
        Array<IImageAutomationPeerFactory?> = (elements as
        Array<IImageAutomationPeerFactory?>).castToImpl<IImageAutomationPeerFactory,IImageAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageAutomationPeerFactory?> =
        arrayOfNulls<IImageAutomationPeerFactory_Impl>(size) as Array<IImageAutomationPeerFactory?>
  }
}
