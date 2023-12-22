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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollPatternIdentifiersStatics.ABI::class)
@Signature("{0f94f2f0-e0d2-5a24-b415-8d1506ce47aa}")
@Guid("0f94f2f0e0d25a24b4158d1506ce47aa")
@WinRTInterface("0f94f2f0e0d25a24b4158d1506ce47aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollPatternIdentifiersStatics.ByReference::class)
public interface IScrollPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontallyScrollableProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_HorizontalScrollPercentProperty(): AutomationProperty?

  @InterfaceMethod(2)
  public fun get_HorizontalViewSizeProperty(): AutomationProperty?

  @InterfaceMethod(3)
  public fun get_NoScroll(): Double

  @InterfaceMethod(4)
  public fun get_VerticallyScrollableProperty(): AutomationProperty?

  @InterfaceMethod(5)
  public fun get_VerticalScrollPercentProperty(): AutomationProperty?

  @InterfaceMethod(6)
  public fun get_VerticalViewSizeProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollPatternIdentifiersStatics> {
    public override fun getValue() = ABI.makeIScrollPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IScrollPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollPatternIdentifiersStatics {
    public val __1422952_Ptr: Pointer?

    public val _1422952_VtblPtr: Pointer?
      get() = __1422952_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontallyScrollableProperty(): AutomationProperty? {
      val fnPtr = _1422952_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1422952_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HorizontalScrollPercentProperty(): AutomationProperty? {
      val fnPtr = _1422952_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1422952_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HorizontalViewSizeProperty(): AutomationProperty? {
      val fnPtr = _1422952_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1422952_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_NoScroll(): Double {
      val fnPtr = _1422952_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1422952_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_VerticallyScrollableProperty(): AutomationProperty? {
      val fnPtr = _1422952_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1422952_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_VerticalScrollPercentProperty(): AutomationProperty? {
      val fnPtr = _1422952_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1422952_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_VerticalViewSizeProperty(): AutomationProperty? {
      val fnPtr = _1422952_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1422952_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IScrollPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1422952_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f94f2f0e0d25a24b4158d1506ce47aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        IScrollPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIScrollPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IScrollPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1422952_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollPatternIdentifiersStatics):
        Array<IScrollPatternIdentifiersStatics?> = (elements as
        Array<IScrollPatternIdentifiersStatics?>).castToImpl<IScrollPatternIdentifiersStatics,IScrollPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollPatternIdentifiersStatics?> =
        arrayOfNulls<IScrollPatternIdentifiersStatics_Impl>(size) as
        Array<IScrollPatternIdentifiersStatics?>
  }
}
