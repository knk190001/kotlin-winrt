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

@ABIMarker(IDockPatternIdentifiersStatics.ABI::class)
@Signature("{02d5a72c-f49d-53a9-b9fb-af2719d16ccf}")
@Guid("02d5a72cf49d53a9b9fbaf2719d16ccf")
@WinRTInterface("02d5a72cf49d53a9b9fbaf2719d16ccf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDockPatternIdentifiersStatics.ByReference::class)
public interface IDockPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DockPositionProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDockPatternIdentifiersStatics> {
    public override fun getValue() = ABI.makeIDockPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IDockPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDockPatternIdentifiersStatics {
    public val __155749518_Ptr: Pointer?

    public val _155749518_VtblPtr: Pointer?
      get() = __155749518_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DockPositionProperty(): AutomationProperty? {
      val fnPtr = _155749518_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__155749518_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDockPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __155749518_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDockPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02d5a72cf49d53a9b9fbaf2719d16ccf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDockPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        IDockPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDockPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIDockPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IDockPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__155749518_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDockPatternIdentifiersStatics):
        Array<IDockPatternIdentifiersStatics?> = (elements as
        Array<IDockPatternIdentifiersStatics?>).castToImpl<IDockPatternIdentifiersStatics,IDockPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDockPatternIdentifiersStatics?> =
        arrayOfNulls<IDockPatternIdentifiersStatics_Impl>(size) as
        Array<IDockPatternIdentifiersStatics?>
  }
}
