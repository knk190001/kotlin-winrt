package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IAutomationPeerAnnotationStatics.ABI::class)
@Signature("{8809a87d-09b2-4d45-b78b-1d3b3b09f661}")
@Guid("8809a87d09b24d45b78b1d3b3b09f661")
@WinRTInterface("8809a87d09b24d45b78b1d3b3b09f661")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerAnnotationStatics.ByReference::class)
public interface IAutomationPeerAnnotationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TypeProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_PeerProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerAnnotationStatics> {
    public override fun getValue() = ABI.makeIAutomationPeerAnnotationStatics(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerAnnotationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerAnnotationStatics {
    public val __250107451_Ptr: Pointer?

    public val _250107451_VtblPtr: Pointer?
      get() = __250107451_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TypeProperty(): DependencyProperty? {
      val fnPtr = _250107451_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__250107451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PeerProperty(): DependencyProperty? {
      val fnPtr = _250107451_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__250107451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPeerAnnotationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __250107451_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerAnnotationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8809a87d09b24d45b78b1d3b3b09f661")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerAnnotationStatics(ptr: Pointer?): WithDefault =
        IAutomationPeerAnnotationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerAnnotationStatics {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerAnnotationStatics(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerAnnotationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__250107451_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerAnnotationStatics):
        Array<IAutomationPeerAnnotationStatics?> = (elements as
        Array<IAutomationPeerAnnotationStatics?>).castToImpl<IAutomationPeerAnnotationStatics,IAutomationPeerAnnotationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerAnnotationStatics?> =
        arrayOfNulls<IAutomationPeerAnnotationStatics_Impl>(size) as
        Array<IAutomationPeerAnnotationStatics?>
  }
}
