package Microsoft.UI.Xaml.Automation

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

@ABIMarker(IDropTargetPatternIdentifiersStatics.ABI::class)
@Signature("{6da6f0bd-b942-5283-be35-501ae87f88c7}")
@Guid("6da6f0bdb9425283be35501ae87f88c7")
@WinRTInterface("6da6f0bdb9425283be35501ae87f88c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDropTargetPatternIdentifiersStatics.ByReference::class)
public interface IDropTargetPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DropTargetEffectProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_DropTargetEffectsProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDropTargetPatternIdentifiersStatics> {
    public override fun getValue() =
        ABI.makeIDropTargetPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IDropTargetPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDropTargetPatternIdentifiersStatics {
    public val __946561381_Ptr: Pointer?

    public val _946561381_VtblPtr: Pointer?
      get() = __946561381_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DropTargetEffectProperty(): AutomationProperty? {
      val fnPtr = _946561381_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__946561381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DropTargetEffectsProperty(): AutomationProperty? {
      val fnPtr = _946561381_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__946561381_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDropTargetPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __946561381_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDropTargetPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6da6f0bdb9425283be35501ae87f88c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDropTargetPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        IDropTargetPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDropTargetPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIDropTargetPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IDropTargetPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__946561381_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDropTargetPatternIdentifiersStatics):
        Array<IDropTargetPatternIdentifiersStatics?> = (elements as
        Array<IDropTargetPatternIdentifiersStatics?>).castToImpl<IDropTargetPatternIdentifiersStatics,IDropTargetPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDropTargetPatternIdentifiersStatics?> =
        arrayOfNulls<IDropTargetPatternIdentifiersStatics_Impl>(size) as
        Array<IDropTargetPatternIdentifiersStatics?>
  }
}
