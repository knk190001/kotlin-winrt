package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.AnnotationType
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IAutomationPeerAnnotationFactory.ABI::class)
@Signature("{f59c439e-c65b-43cd-9009-03fc023363a7}")
@Guid("f59c439ec65b43cd900903fc023363a7")
@WinRTInterface("f59c439ec65b43cd900903fc023363a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerAnnotationFactory.ByReference::class)
public interface IAutomationPeerAnnotationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(type: AnnotationType?): AutomationPeerAnnotation?

  @InterfaceMethod(1)
  public fun CreateWithPeerParameter(type: AnnotationType?, peer: AutomationPeer?):
      AutomationPeerAnnotation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerAnnotationFactory> {
    public override fun getValue() = ABI.makeIAutomationPeerAnnotationFactory(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerAnnotationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerAnnotationFactory {
    public val __555145994_Ptr: Pointer?

    public val _555145994_VtblPtr: Pointer?
      get() = __555145994_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(type: AnnotationType?): AutomationPeerAnnotation? {
      val fnPtr = _555145994_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeerAnnotation>()
      val hr = fn.invokeHR(arrayOf(__555145994_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeerAnnotation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithPeerParameter(type: AnnotationType?, peer: AutomationPeer?):
        AutomationPeerAnnotation? {
      val fnPtr = _555145994_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeerAnnotation>()
      val hr = fn.invokeHR(arrayOf(__555145994_Ptr, marshalToNative(type), marshalToNative(peer),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeerAnnotation>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPeerAnnotationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __555145994_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerAnnotationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f59c439ec65b43cd900903fc023363a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerAnnotationFactory(ptr: Pointer?): WithDefault =
        IAutomationPeerAnnotationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerAnnotationFactory {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerAnnotationFactory(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerAnnotationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__555145994_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerAnnotationFactory):
        Array<IAutomationPeerAnnotationFactory?> = (elements as
        Array<IAutomationPeerAnnotationFactory?>).castToImpl<IAutomationPeerAnnotationFactory,IAutomationPeerAnnotationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerAnnotationFactory?> =
        arrayOfNulls<IAutomationPeerAnnotationFactory_Impl>(size) as
        Array<IAutomationPeerAnnotationFactory?>
  }
}
