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

@ABIMarker(IRangeValuePatternIdentifiersStatics.ABI::class)
@Signature("{0aaa9ad7-f9b8-52a1-bc96-2a97fe389ed0}")
@Guid("0aaa9ad7f9b852a1bc962a97fe389ed0")
@WinRTInterface("0aaa9ad7f9b852a1bc962a97fe389ed0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRangeValuePatternIdentifiersStatics.ByReference::class)
public interface IRangeValuePatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsReadOnlyProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_LargeChangeProperty(): AutomationProperty?

  @InterfaceMethod(2)
  public fun get_MaximumProperty(): AutomationProperty?

  @InterfaceMethod(3)
  public fun get_MinimumProperty(): AutomationProperty?

  @InterfaceMethod(4)
  public fun get_SmallChangeProperty(): AutomationProperty?

  @InterfaceMethod(5)
  public fun get_ValueProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRangeValuePatternIdentifiersStatics> {
    public override fun getValue() =
        ABI.makeIRangeValuePatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IRangeValuePatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRangeValuePatternIdentifiersStatics {
    public val __1288040209_Ptr: Pointer?

    public val _1288040209_VtblPtr: Pointer?
      get() = __1288040209_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsReadOnlyProperty(): AutomationProperty? {
      val fnPtr = _1288040209_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1288040209_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LargeChangeProperty(): AutomationProperty? {
      val fnPtr = _1288040209_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1288040209_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MaximumProperty(): AutomationProperty? {
      val fnPtr = _1288040209_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1288040209_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MinimumProperty(): AutomationProperty? {
      val fnPtr = _1288040209_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1288040209_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SmallChangeProperty(): AutomationProperty? {
      val fnPtr = _1288040209_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1288040209_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ValueProperty(): AutomationProperty? {
      val fnPtr = _1288040209_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1288040209_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRangeValuePatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1288040209_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRangeValuePatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0aaa9ad7f9b852a1bc962a97fe389ed0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRangeValuePatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        IRangeValuePatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRangeValuePatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIRangeValuePatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IRangeValuePatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1288040209_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRangeValuePatternIdentifiersStatics):
        Array<IRangeValuePatternIdentifiersStatics?> = (elements as
        Array<IRangeValuePatternIdentifiersStatics?>).castToImpl<IRangeValuePatternIdentifiersStatics,IRangeValuePatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRangeValuePatternIdentifiersStatics?> =
        arrayOfNulls<IRangeValuePatternIdentifiersStatics_Impl>(size) as
        Array<IRangeValuePatternIdentifiersStatics?>
  }
}
