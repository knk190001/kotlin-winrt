package Windows.UI.Xaml.Media

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

@ABIMarker(IArcSegmentStatics.ABI::class)
@Signature("{82348f6e-8a69-4204-9c12-7207df317643}")
@Guid("82348f6e8a6942049c127207df317643")
@WinRTInterface("82348f6e8a6942049c127207df317643")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IArcSegmentStatics.ByReference::class)
public interface IArcSegmentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_SizeProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_RotationAngleProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_IsLargeArcProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_SweepDirectionProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IArcSegmentStatics> {
    public override fun getValue() = ABI.makeIArcSegmentStatics(pointer.getPointer(0))

    public fun setValue(value: IArcSegmentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IArcSegmentStatics {
    public val __488145528_Ptr: Pointer?

    public val _488145528_VtblPtr: Pointer?
      get() = __488145528_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointProperty(): DependencyProperty? {
      val fnPtr = _488145528_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__488145528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SizeProperty(): DependencyProperty? {
      val fnPtr = _488145528_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__488145528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RotationAngleProperty(): DependencyProperty? {
      val fnPtr = _488145528_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__488145528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsLargeArcProperty(): DependencyProperty? {
      val fnPtr = _488145528_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__488145528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SweepDirectionProperty(): DependencyProperty? {
      val fnPtr = _488145528_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__488145528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IArcSegmentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __488145528_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IArcSegmentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82348f6e8a6942049c127207df317643")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIArcSegmentStatics(ptr: Pointer?): WithDefault = IArcSegmentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IArcSegmentStatics {
      val address = segment.toRawLongValue()
      return makeIArcSegmentStatics(Pointer(address))
    }

    public override fun toNative(obj: IArcSegmentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__488145528_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IArcSegmentStatics): Array<IArcSegmentStatics?> =
        (elements as
        Array<IArcSegmentStatics?>).castToImpl<IArcSegmentStatics,IArcSegmentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IArcSegmentStatics?> =
        arrayOfNulls<IArcSegmentStatics_Impl>(size) as Array<IArcSegmentStatics?>
  }
}
