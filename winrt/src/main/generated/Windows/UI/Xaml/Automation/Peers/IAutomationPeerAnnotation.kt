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

@ABIMarker(IAutomationPeerAnnotation.ABI::class)
@Signature("{0c456061-52cf-43fa-82f8-07f137351e5a}")
@Guid("0c45606152cf43fa82f807f137351e5a")
@WinRTInterface("0c45606152cf43fa82f807f137351e5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerAnnotation.ByReference::class)
public interface IAutomationPeerAnnotation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): AnnotationType?

  @InterfaceMethod(1)
  public fun put_Type(value: AnnotationType?): Unit

  @InterfaceMethod(2)
  public fun get_Peer(): AutomationPeer?

  @InterfaceMethod(3)
  public fun put_Peer(value: AutomationPeer?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerAnnotation> {
    public override fun getValue() = ABI.makeIAutomationPeerAnnotation(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerAnnotation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerAnnotation {
    public val __925831648_Ptr: Pointer?

    public val _925831648_VtblPtr: Pointer?
      get() = __925831648_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): AnnotationType? {
      val fnPtr = _925831648_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnnotationType>()
      val hr = fn.invokeHR(arrayOf(__925831648_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnnotationType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Type(value: AnnotationType?): Unit {
      val fnPtr = _925831648_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__925831648_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Peer(): AutomationPeer? {
      val fnPtr = _925831648_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__925831648_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationPeer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Peer(value: AutomationPeer?): Unit {
      val fnPtr = _925831648_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__925831648_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutomationPeerAnnotation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __925831648_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerAnnotation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c45606152cf43fa82f807f137351e5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerAnnotation(ptr: Pointer?): WithDefault =
        IAutomationPeerAnnotation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerAnnotation {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerAnnotation(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerAnnotation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__925831648_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerAnnotation):
        Array<IAutomationPeerAnnotation?> = (elements as
        Array<IAutomationPeerAnnotation?>).castToImpl<IAutomationPeerAnnotation,IAutomationPeerAnnotation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerAnnotation?> =
        arrayOfNulls<IAutomationPeerAnnotation_Impl>(size) as Array<IAutomationPeerAnnotation?>
  }
}
