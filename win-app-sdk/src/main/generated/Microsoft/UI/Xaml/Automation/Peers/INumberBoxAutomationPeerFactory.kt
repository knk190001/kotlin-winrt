package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.NumberBox
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

@ABIMarker(INumberBoxAutomationPeerFactory.ABI::class)
@Signature("{659719ac-4405-58f4-bde2-ef61dfe64c21}")
@Guid("659719ac440558f4bde2ef61dfe64c21")
@WinRTInterface("659719ac440558f4bde2ef61dfe64c21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INumberBoxAutomationPeerFactory.ByReference::class)
public interface INumberBoxAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: NumberBox?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): NumberBoxAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INumberBoxAutomationPeerFactory> {
    public override fun getValue() = ABI.makeINumberBoxAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: INumberBoxAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INumberBoxAutomationPeerFactory {
    public val __535329486_Ptr: Pointer?

    public val _535329486_VtblPtr: Pointer?
      get() = __535329486_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: NumberBox?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): NumberBoxAutomationPeer? {
      val fnPtr = _535329486_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NumberBoxAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__535329486_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NumberBoxAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class INumberBoxAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __535329486_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INumberBoxAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("659719ac440558f4bde2ef61dfe64c21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINumberBoxAutomationPeerFactory(ptr: Pointer?): WithDefault =
        INumberBoxAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INumberBoxAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeINumberBoxAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: INumberBoxAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__535329486_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INumberBoxAutomationPeerFactory):
        Array<INumberBoxAutomationPeerFactory?> = (elements as
        Array<INumberBoxAutomationPeerFactory?>).castToImpl<INumberBoxAutomationPeerFactory,INumberBoxAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INumberBoxAutomationPeerFactory?> =
        arrayOfNulls<INumberBoxAutomationPeerFactory_Impl>(size) as
        Array<INumberBoxAutomationPeerFactory?>
  }
}
