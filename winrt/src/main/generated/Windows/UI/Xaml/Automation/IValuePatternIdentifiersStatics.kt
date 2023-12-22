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

@ABIMarker(IValuePatternIdentifiersStatics.ABI::class)
@Signature("{c247e8f7-adcc-440f-b123-33788a40525a}")
@Guid("c247e8f7adcc440fb12333788a40525a")
@WinRTInterface("c247e8f7adcc440fb12333788a40525a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IValuePatternIdentifiersStatics.ByReference::class)
public interface IValuePatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsReadOnlyProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_ValueProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IValuePatternIdentifiersStatics> {
    public override fun getValue() = ABI.makeIValuePatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IValuePatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IValuePatternIdentifiersStatics {
    public val __175458581_Ptr: Pointer?

    public val _175458581_VtblPtr: Pointer?
      get() = __175458581_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsReadOnlyProperty(): AutomationProperty? {
      val fnPtr = _175458581_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__175458581_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ValueProperty(): AutomationProperty? {
      val fnPtr = _175458581_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__175458581_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IValuePatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __175458581_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IValuePatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c247e8f7adcc440fb12333788a40525a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIValuePatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        IValuePatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IValuePatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIValuePatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IValuePatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__175458581_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IValuePatternIdentifiersStatics):
        Array<IValuePatternIdentifiersStatics?> = (elements as
        Array<IValuePatternIdentifiersStatics?>).castToImpl<IValuePatternIdentifiersStatics,IValuePatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IValuePatternIdentifiersStatics?> =
        arrayOfNulls<IValuePatternIdentifiersStatics_Impl>(size) as
        Array<IValuePatternIdentifiersStatics?>
  }
}
