package Microsoft.UI.Xaml.Automation.Peers

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

@ABIMarker(IAutomationPeerFactory.ABI::class)
@Signature("{a1af86a0-6ec6-5be2-858f-72808be6fddd}")
@Guid("a1af86a06ec65be2858f72808be6fddd")
@WinRTInterface("a1af86a06ec65be2858f72808be6fddd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerFactory.ByReference::class)
public interface IAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): AutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerFactory {
    public val __1605975506_Ptr: Pointer?

    public val _1605975506_VtblPtr: Pointer?
      get() = __1605975506_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        AutomationPeer? {
      val fnPtr = _1605975506_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1605975506_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1605975506_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1af86a06ec65be2858f72808be6fddd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1605975506_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerFactory): Array<IAutomationPeerFactory?> =
        (elements as
        Array<IAutomationPeerFactory?>).castToImpl<IAutomationPeerFactory,IAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerFactory?> =
        arrayOfNulls<IAutomationPeerFactory_Impl>(size) as Array<IAutomationPeerFactory?>
  }
}
