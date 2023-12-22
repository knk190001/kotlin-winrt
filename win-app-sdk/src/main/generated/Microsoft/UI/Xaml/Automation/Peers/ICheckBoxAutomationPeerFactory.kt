package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.CheckBox
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

@ABIMarker(ICheckBoxAutomationPeerFactory.ABI::class)
@Signature("{0f5b9e3c-6de5-588e-835f-3228be930fea}")
@Guid("0f5b9e3c6de5588e835f3228be930fea")
@WinRTInterface("0f5b9e3c6de5588e835f3228be930fea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICheckBoxAutomationPeerFactory.ByReference::class)
public interface ICheckBoxAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(
    owner: CheckBox?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): CheckBoxAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICheckBoxAutomationPeerFactory> {
    public override fun getValue() = ABI.makeICheckBoxAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ICheckBoxAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICheckBoxAutomationPeerFactory {
    public val __851225269_Ptr: Pointer?

    public val _851225269_VtblPtr: Pointer?
      get() = __851225269_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(
      owner: CheckBox?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): CheckBoxAutomationPeer? {
      val fnPtr = _851225269_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CheckBoxAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__851225269_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CheckBoxAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ICheckBoxAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __851225269_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICheckBoxAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f5b9e3c6de5588e835f3228be930fea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICheckBoxAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ICheckBoxAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICheckBoxAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeICheckBoxAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ICheckBoxAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__851225269_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICheckBoxAutomationPeerFactory):
        Array<ICheckBoxAutomationPeerFactory?> = (elements as
        Array<ICheckBoxAutomationPeerFactory?>).castToImpl<ICheckBoxAutomationPeerFactory,ICheckBoxAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICheckBoxAutomationPeerFactory?> =
        arrayOfNulls<ICheckBoxAutomationPeerFactory_Impl>(size) as
        Array<ICheckBoxAutomationPeerFactory?>
  }
}
