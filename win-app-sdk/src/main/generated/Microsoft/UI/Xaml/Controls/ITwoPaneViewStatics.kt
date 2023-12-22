package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(ITwoPaneViewStatics.ABI::class)
@Signature("{4fbd51c3-cee6-58de-a5e4-99abad873016}")
@Guid("4fbd51c3cee658dea5e499abad873016")
@WinRTInterface("4fbd51c3cee658dea5e499abad873016")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITwoPaneViewStatics.ByReference::class)
public interface ITwoPaneViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Pane1Property(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_Pane2Property(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_Pane1LengthProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_Pane2LengthProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_PanePriorityProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_ModeProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_WideModeConfigurationProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_TallModeConfigurationProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_MinWideModeWidthProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_MinTallModeHeightProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITwoPaneViewStatics> {
    public override fun getValue() = ABI.makeITwoPaneViewStatics(pointer.getPointer(0))

    public fun setValue(value: ITwoPaneViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITwoPaneViewStatics {
    public val __1129429747_Ptr: Pointer?

    public val _1129429747_VtblPtr: Pointer?
      get() = __1129429747_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Pane1Property(): DependencyProperty? {
      val fnPtr = _1129429747_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1129429747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Pane2Property(): DependencyProperty? {
      val fnPtr = _1129429747_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1129429747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Pane1LengthProperty(): DependencyProperty? {
      val fnPtr = _1129429747_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1129429747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Pane2LengthProperty(): DependencyProperty? {
      val fnPtr = _1129429747_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1129429747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PanePriorityProperty(): DependencyProperty? {
      val fnPtr = _1129429747_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1129429747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ModeProperty(): DependencyProperty? {
      val fnPtr = _1129429747_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1129429747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_WideModeConfigurationProperty(): DependencyProperty? {
      val fnPtr = _1129429747_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1129429747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_TallModeConfigurationProperty(): DependencyProperty? {
      val fnPtr = _1129429747_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1129429747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_MinWideModeWidthProperty(): DependencyProperty? {
      val fnPtr = _1129429747_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1129429747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_MinTallModeHeightProperty(): DependencyProperty? {
      val fnPtr = _1129429747_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1129429747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITwoPaneViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1129429747_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITwoPaneViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4fbd51c3cee658dea5e499abad873016")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITwoPaneViewStatics(ptr: Pointer?): WithDefault = ITwoPaneViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITwoPaneViewStatics {
      val address = segment.toRawLongValue()
      return makeITwoPaneViewStatics(Pointer(address))
    }

    public override fun toNative(obj: ITwoPaneViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1129429747_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITwoPaneViewStatics): Array<ITwoPaneViewStatics?> =
        (elements as
        Array<ITwoPaneViewStatics?>).castToImpl<ITwoPaneViewStatics,ITwoPaneViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITwoPaneViewStatics?> =
        arrayOfNulls<ITwoPaneViewStatics_Impl>(size) as Array<ITwoPaneViewStatics?>
  }
}
