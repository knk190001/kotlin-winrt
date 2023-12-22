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

@ABIMarker(ISelectionItemPatternIdentifiersStatics.ABI::class)
@Signature("{a918d163-487e-4e3e-9f86-7b44acbe27ce}")
@Guid("a918d163487e4e3e9f867b44acbe27ce")
@WinRTInterface("a918d163487e4e3e9f867b44acbe27ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectionItemPatternIdentifiersStatics.ByReference::class)
public interface ISelectionItemPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSelectedProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_SelectionContainerProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectionItemPatternIdentifiersStatics> {
    public override fun getValue() =
        ABI.makeISelectionItemPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: ISelectionItemPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectionItemPatternIdentifiersStatics {
    public val __859506823_Ptr: Pointer?

    public val _859506823_VtblPtr: Pointer?
      get() = __859506823_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSelectedProperty(): AutomationProperty? {
      val fnPtr = _859506823_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__859506823_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SelectionContainerProperty(): AutomationProperty? {
      val fnPtr = _859506823_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__859506823_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISelectionItemPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __859506823_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectionItemPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a918d163487e4e3e9f867b44acbe27ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectionItemPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        ISelectionItemPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISelectionItemPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeISelectionItemPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: ISelectionItemPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__859506823_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectionItemPatternIdentifiersStatics):
        Array<ISelectionItemPatternIdentifiersStatics?> = (elements as
        Array<ISelectionItemPatternIdentifiersStatics?>).castToImpl<ISelectionItemPatternIdentifiersStatics,ISelectionItemPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectionItemPatternIdentifiersStatics?> =
        arrayOfNulls<ISelectionItemPatternIdentifiersStatics_Impl>(size) as
        Array<ISelectionItemPatternIdentifiersStatics?>
  }
}
