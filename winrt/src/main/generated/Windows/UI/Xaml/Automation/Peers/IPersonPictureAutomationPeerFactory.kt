package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.PersonPicture
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

@ABIMarker(IPersonPictureAutomationPeerFactory.ABI::class)
@Signature("{a95f1f6d-2524-44a4-97fd-1181130100ad}")
@Guid("a95f1f6d252444a497fd1181130100ad")
@WinRTInterface("a95f1f6d252444a497fd1181130100ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPersonPictureAutomationPeerFactory.ByReference::class)
public interface IPersonPictureAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: PersonPicture?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): PersonPictureAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPersonPictureAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIPersonPictureAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IPersonPictureAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPersonPictureAutomationPeerFactory {
    public val __1585076224_Ptr: Pointer?

    public val _1585076224_VtblPtr: Pointer?
      get() = __1585076224_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: PersonPicture?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): PersonPictureAutomationPeer? {
      val fnPtr = _1585076224_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PersonPictureAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1585076224_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PersonPictureAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IPersonPictureAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1585076224_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPersonPictureAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a95f1f6d252444a497fd1181130100ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPersonPictureAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IPersonPictureAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPersonPictureAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIPersonPictureAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IPersonPictureAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1585076224_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPersonPictureAutomationPeerFactory):
        Array<IPersonPictureAutomationPeerFactory?> = (elements as
        Array<IPersonPictureAutomationPeerFactory?>).castToImpl<IPersonPictureAutomationPeerFactory,IPersonPictureAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPersonPictureAutomationPeerFactory?> =
        arrayOfNulls<IPersonPictureAutomationPeerFactory_Impl>(size) as
        Array<IPersonPictureAutomationPeerFactory?>
  }
}
