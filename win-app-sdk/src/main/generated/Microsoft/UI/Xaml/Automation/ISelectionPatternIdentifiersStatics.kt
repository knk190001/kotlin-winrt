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

@ABIMarker(ISelectionPatternIdentifiersStatics.ABI::class)
@Signature("{f3ed111b-b20a-5e5e-a232-07f607fd5c07}")
@Guid("f3ed111bb20a5e5ea23207f607fd5c07")
@WinRTInterface("f3ed111bb20a5e5ea23207f607fd5c07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectionPatternIdentifiersStatics.ByReference::class)
public interface ISelectionPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanSelectMultipleProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_IsSelectionRequiredProperty(): AutomationProperty?

  @InterfaceMethod(2)
  public fun get_SelectionProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectionPatternIdentifiersStatics> {
    public override fun getValue() =
        ABI.makeISelectionPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: ISelectionPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectionPatternIdentifiersStatics {
    public val __534364165_Ptr: Pointer?

    public val _534364165_VtblPtr: Pointer?
      get() = __534364165_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanSelectMultipleProperty(): AutomationProperty? {
      val fnPtr = _534364165_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__534364165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsSelectionRequiredProperty(): AutomationProperty? {
      val fnPtr = _534364165_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__534364165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SelectionProperty(): AutomationProperty? {
      val fnPtr = _534364165_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__534364165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISelectionPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __534364165_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectionPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3ed111bb20a5e5ea23207f607fd5c07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectionPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        ISelectionPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectionPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeISelectionPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: ISelectionPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__534364165_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectionPatternIdentifiersStatics):
        Array<ISelectionPatternIdentifiersStatics?> = (elements as
        Array<ISelectionPatternIdentifiersStatics?>).castToImpl<ISelectionPatternIdentifiersStatics,ISelectionPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectionPatternIdentifiersStatics?> =
        arrayOfNulls<ISelectionPatternIdentifiersStatics_Impl>(size) as
        Array<ISelectionPatternIdentifiersStatics?>
  }
}
