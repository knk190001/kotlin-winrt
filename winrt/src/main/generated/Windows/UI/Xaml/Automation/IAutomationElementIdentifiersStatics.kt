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

@ABIMarker(IAutomationElementIdentifiersStatics.ABI::class)
@Signature("{4549399f-8340-4d67-b9bf-8c2ac6a0773a}")
@Guid("4549399f83404d67b9bf8c2ac6a0773a")
@WinRTInterface("4549399f83404d67b9bf8c2ac6a0773a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationElementIdentifiersStatics.ByReference::class)
public interface IAutomationElementIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AcceleratorKeyProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_AccessKeyProperty(): AutomationProperty?

  @InterfaceMethod(2)
  public fun get_AutomationIdProperty(): AutomationProperty?

  @InterfaceMethod(3)
  public fun get_BoundingRectangleProperty(): AutomationProperty?

  @InterfaceMethod(4)
  public fun get_ClassNameProperty(): AutomationProperty?

  @InterfaceMethod(5)
  public fun get_ClickablePointProperty(): AutomationProperty?

  @InterfaceMethod(6)
  public fun get_ControlTypeProperty(): AutomationProperty?

  @InterfaceMethod(7)
  public fun get_HasKeyboardFocusProperty(): AutomationProperty?

  @InterfaceMethod(8)
  public fun get_HelpTextProperty(): AutomationProperty?

  @InterfaceMethod(9)
  public fun get_IsContentElementProperty(): AutomationProperty?

  @InterfaceMethod(10)
  public fun get_IsControlElementProperty(): AutomationProperty?

  @InterfaceMethod(11)
  public fun get_IsEnabledProperty(): AutomationProperty?

  @InterfaceMethod(12)
  public fun get_IsKeyboardFocusableProperty(): AutomationProperty?

  @InterfaceMethod(13)
  public fun get_IsOffscreenProperty(): AutomationProperty?

  @InterfaceMethod(14)
  public fun get_IsPasswordProperty(): AutomationProperty?

  @InterfaceMethod(15)
  public fun get_IsRequiredForFormProperty(): AutomationProperty?

  @InterfaceMethod(16)
  public fun get_ItemStatusProperty(): AutomationProperty?

  @InterfaceMethod(17)
  public fun get_ItemTypeProperty(): AutomationProperty?

  @InterfaceMethod(18)
  public fun get_LabeledByProperty(): AutomationProperty?

  @InterfaceMethod(19)
  public fun get_LocalizedControlTypeProperty(): AutomationProperty?

  @InterfaceMethod(20)
  public fun get_NameProperty(): AutomationProperty?

  @InterfaceMethod(21)
  public fun get_OrientationProperty(): AutomationProperty?

  @InterfaceMethod(22)
  public fun get_LiveSettingProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationElementIdentifiersStatics> {
    public override fun getValue() =
        ABI.makeIAutomationElementIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IAutomationElementIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationElementIdentifiersStatics {
    public val __2132007109_Ptr: Pointer?

    public val _2132007109_VtblPtr: Pointer?
      get() = __2132007109_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AcceleratorKeyProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AccessKeyProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AutomationIdProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BoundingRectangleProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ClassNameProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ClickablePointProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ControlTypeProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_HasKeyboardFocusProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_HelpTextProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_IsContentElementProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_IsControlElementProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_IsEnabledProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_IsKeyboardFocusableProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_IsOffscreenProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_IsPasswordProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_IsRequiredForFormProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_ItemStatusProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_ItemTypeProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_LabeledByProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_LocalizedControlTypeProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_NameProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_OrientationProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_LiveSettingProperty(): AutomationProperty? {
      val fnPtr = _2132007109_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__2132007109_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationElementIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2132007109_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationElementIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4549399f83404d67b9bf8c2ac6a0773a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationElementIdentifiersStatics(ptr: Pointer?): WithDefault =
        IAutomationElementIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationElementIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIAutomationElementIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IAutomationElementIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2132007109_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationElementIdentifiersStatics):
        Array<IAutomationElementIdentifiersStatics?> = (elements as
        Array<IAutomationElementIdentifiersStatics?>).castToImpl<IAutomationElementIdentifiersStatics,IAutomationElementIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationElementIdentifiersStatics?> =
        arrayOfNulls<IAutomationElementIdentifiersStatics_Impl>(size) as
        Array<IAutomationElementIdentifiersStatics?>
  }
}
