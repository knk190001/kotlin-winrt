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

@ABIMarker(IStylesPatternIdentifiersStatics.ABI::class)
@Signature("{b232287a-bc4c-581e-a33c-3d6aee10d04b}")
@Guid("b232287abc4c581ea33c3d6aee10d04b")
@WinRTInterface("b232287abc4c581ea33c3d6aee10d04b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStylesPatternIdentifiersStatics.ByReference::class)
public interface IStylesPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedPropertiesProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_FillColorProperty(): AutomationProperty?

  @InterfaceMethod(2)
  public fun get_FillPatternColorProperty(): AutomationProperty?

  @InterfaceMethod(3)
  public fun get_FillPatternStyleProperty(): AutomationProperty?

  @InterfaceMethod(4)
  public fun get_ShapeProperty(): AutomationProperty?

  @InterfaceMethod(5)
  public fun get_StyleIdProperty(): AutomationProperty?

  @InterfaceMethod(6)
  public fun get_StyleNameProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStylesPatternIdentifiersStatics> {
    public override fun getValue() = ABI.makeIStylesPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IStylesPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStylesPatternIdentifiersStatics {
    public val __707286749_Ptr: Pointer?

    public val _707286749_VtblPtr: Pointer?
      get() = __707286749_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedPropertiesProperty(): AutomationProperty? {
      val fnPtr = _707286749_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__707286749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FillColorProperty(): AutomationProperty? {
      val fnPtr = _707286749_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__707286749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FillPatternColorProperty(): AutomationProperty? {
      val fnPtr = _707286749_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__707286749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FillPatternStyleProperty(): AutomationProperty? {
      val fnPtr = _707286749_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__707286749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ShapeProperty(): AutomationProperty? {
      val fnPtr = _707286749_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__707286749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_StyleIdProperty(): AutomationProperty? {
      val fnPtr = _707286749_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__707286749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_StyleNameProperty(): AutomationProperty? {
      val fnPtr = _707286749_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__707286749_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IStylesPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __707286749_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStylesPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b232287abc4c581ea33c3d6aee10d04b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStylesPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        IStylesPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStylesPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIStylesPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IStylesPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__707286749_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStylesPatternIdentifiersStatics):
        Array<IStylesPatternIdentifiersStatics?> = (elements as
        Array<IStylesPatternIdentifiersStatics?>).castToImpl<IStylesPatternIdentifiersStatics,IStylesPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStylesPatternIdentifiersStatics?> =
        arrayOfNulls<IStylesPatternIdentifiersStatics_Impl>(size) as
        Array<IStylesPatternIdentifiersStatics?>
  }
}
