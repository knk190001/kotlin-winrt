package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.PasswordBox
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

@ABIMarker(IPasswordBoxAutomationPeerFactory.ABI::class)
@Signature("{ac3d7ede-dca4-481c-b520-4a9b3f3b179c}")
@Guid("ac3d7ededca4481cb5204a9b3f3b179c")
@WinRTInterface("ac3d7ededca4481cb5204a9b3f3b179c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPasswordBoxAutomationPeerFactory.ByReference::class)
public interface IPasswordBoxAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: PasswordBox?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): PasswordBoxAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPasswordBoxAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeIPasswordBoxAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IPasswordBoxAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPasswordBoxAutomationPeerFactory {
    public val __1324357863_Ptr: Pointer?

    public val _1324357863_VtblPtr: Pointer?
      get() = __1324357863_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: PasswordBox?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): PasswordBoxAutomationPeer? {
      val fnPtr = _1324357863_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordBoxAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1324357863_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordBoxAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IPasswordBoxAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1324357863_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPasswordBoxAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac3d7ededca4481cb5204a9b3f3b179c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPasswordBoxAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IPasswordBoxAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPasswordBoxAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIPasswordBoxAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IPasswordBoxAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1324357863_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPasswordBoxAutomationPeerFactory):
        Array<IPasswordBoxAutomationPeerFactory?> = (elements as
        Array<IPasswordBoxAutomationPeerFactory?>).castToImpl<IPasswordBoxAutomationPeerFactory,IPasswordBoxAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPasswordBoxAutomationPeerFactory?> =
        arrayOfNulls<IPasswordBoxAutomationPeerFactory_Impl>(size) as
        Array<IPasswordBoxAutomationPeerFactory?>
  }
}
