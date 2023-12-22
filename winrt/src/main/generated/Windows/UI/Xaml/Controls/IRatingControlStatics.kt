package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IRatingControlStatics.ABI::class)
@Signature("{d062d399-ad85-4c1c-b2c4-35dd4432275e}")
@Guid("d062d399ad854c1cb2c435dd4432275e")
@WinRTInterface("d062d399ad854c1cb2c435dd4432275e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatingControlStatics.ByReference::class)
public interface IRatingControlStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CaptionProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_InitialSetValueProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsClearEnabledProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_IsReadOnlyProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_MaxRatingProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_PlaceholderValueProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_ItemInfoProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_ValueProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatingControlStatics> {
    public override fun getValue() = ABI.makeIRatingControlStatics(pointer.getPointer(0))

    public fun setValue(value: IRatingControlStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatingControlStatics {
    public val __1809515327_Ptr: Pointer?

    public val _1809515327_VtblPtr: Pointer?
      get() = __1809515327_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CaptionProperty(): DependencyProperty? {
      val fnPtr = _1809515327_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1809515327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InitialSetValueProperty(): DependencyProperty? {
      val fnPtr = _1809515327_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1809515327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsClearEnabledProperty(): DependencyProperty? {
      val fnPtr = _1809515327_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1809515327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsReadOnlyProperty(): DependencyProperty? {
      val fnPtr = _1809515327_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1809515327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MaxRatingProperty(): DependencyProperty? {
      val fnPtr = _1809515327_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1809515327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PlaceholderValueProperty(): DependencyProperty? {
      val fnPtr = _1809515327_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1809515327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ItemInfoProperty(): DependencyProperty? {
      val fnPtr = _1809515327_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1809515327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ValueProperty(): DependencyProperty? {
      val fnPtr = _1809515327_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1809515327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRatingControlStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1809515327_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatingControlStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d062d399ad854c1cb2c435dd4432275e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatingControlStatics(ptr: Pointer?): WithDefault =
        IRatingControlStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatingControlStatics {
      val address = segment.toRawLongValue()
      return makeIRatingControlStatics(Pointer(address))
    }

    public override fun toNative(obj: IRatingControlStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1809515327_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatingControlStatics): Array<IRatingControlStatics?> =
        (elements as
        Array<IRatingControlStatics?>).castToImpl<IRatingControlStatics,IRatingControlStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatingControlStatics?> =
        arrayOfNulls<IRatingControlStatics_Impl>(size) as Array<IRatingControlStatics?>
  }
}
