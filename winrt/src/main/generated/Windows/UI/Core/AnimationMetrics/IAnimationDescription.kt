package Windows.UI.Core.AnimationMetrics

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.TimeSpan
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAnimationDescription.ABI::class)
@Signature("{7d11a549-be3d-41de-b081-05c149962f9b}")
@Guid("7d11a549be3d41deb08105c149962f9b")
@WinRTInterface("7d11a549be3d41deb08105c149962f9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimationDescription.ByReference::class)
public interface IAnimationDescription : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Animations(): IVectorView<IPropertyAnimation?>?

  @InterfaceMethod(1)
  public fun get_StaggerDelay(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_StaggerDelayFactor(): Float

  @InterfaceMethod(3)
  public fun get_DelayLimit(): TimeSpan?

  @InterfaceMethod(4)
  public fun get_ZOrder(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimationDescription> {
    public override fun getValue() = ABI.makeIAnimationDescription(pointer.getPointer(0))

    public fun setValue(value: IAnimationDescription_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimationDescription {
    public val __1187980482_Ptr: Pointer?

    public val _1187980482_VtblPtr: Pointer?
      get() = __1187980482_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Animations(): IVectorView<IPropertyAnimation?>? {
      val fnPtr = _1187980482_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IPropertyAnimation?>>()
      val hr = fn.invokeHR(arrayOf(__1187980482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IPropertyAnimation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StaggerDelay(): TimeSpan? {
      val fnPtr = _1187980482_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1187980482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_StaggerDelayFactor(): Float {
      val fnPtr = _1187980482_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1187980482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_DelayLimit(): TimeSpan? {
      val fnPtr = _1187980482_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1187980482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ZOrder(): Int {
      val fnPtr = _1187980482_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1187980482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IAnimationDescription_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1187980482_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimationDescription, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d11a549be3d41deb08105c149962f9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimationDescription(ptr: Pointer?): WithDefault =
        IAnimationDescription_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimationDescription {
      val address = segment.toRawLongValue()
      return makeIAnimationDescription(Pointer(address))
    }

    public override fun toNative(obj: IAnimationDescription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1187980482_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimationDescription): Array<IAnimationDescription?> =
        (elements as
        Array<IAnimationDescription?>).castToImpl<IAnimationDescription,IAnimationDescription_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimationDescription?> =
        arrayOfNulls<IAnimationDescription_Impl>(size) as Array<IAnimationDescription?>
  }
}
