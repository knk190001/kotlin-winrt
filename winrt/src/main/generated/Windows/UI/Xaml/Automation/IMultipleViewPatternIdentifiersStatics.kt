package Windows.UI.Xaml.Automation

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

@ABIMarker(IMultipleViewPatternIdentifiersStatics.ABI::class)
@Signature("{a9cfa66f-6b84-4d71-9e48-d764d3bcda8e}")
@Guid("a9cfa66f6b844d719e48d764d3bcda8e")
@WinRTInterface("a9cfa66f6b844d719e48d764d3bcda8e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMultipleViewPatternIdentifiersStatics.ByReference::class)
public interface IMultipleViewPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentViewProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_SupportedViewsProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMultipleViewPatternIdentifiersStatics> {
    public override fun getValue() =
        ABI.makeIMultipleViewPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IMultipleViewPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMultipleViewPatternIdentifiersStatics {
    public val __1547269403_Ptr: Pointer?

    public val _1547269403_VtblPtr: Pointer?
      get() = __1547269403_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentViewProperty(): AutomationProperty? {
      val fnPtr = _1547269403_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1547269403_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedViewsProperty(): AutomationProperty? {
      val fnPtr = _1547269403_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1547269403_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMultipleViewPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1547269403_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMultipleViewPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9cfa66f6b844d719e48d764d3bcda8e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMultipleViewPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        IMultipleViewPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMultipleViewPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIMultipleViewPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IMultipleViewPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1547269403_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMultipleViewPatternIdentifiersStatics):
        Array<IMultipleViewPatternIdentifiersStatics?> = (elements as
        Array<IMultipleViewPatternIdentifiersStatics?>).castToImpl<IMultipleViewPatternIdentifiersStatics,IMultipleViewPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMultipleViewPatternIdentifiersStatics?> =
        arrayOfNulls<IMultipleViewPatternIdentifiersStatics_Impl>(size) as
        Array<IMultipleViewPatternIdentifiersStatics?>
  }
}
