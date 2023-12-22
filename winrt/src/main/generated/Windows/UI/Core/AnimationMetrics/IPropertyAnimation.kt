package Windows.UI.Core.AnimationMetrics

import Windows.Foundation.Point
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPropertyAnimation.ABI::class)
@Signature("{3a01b4da-4d8c-411e-b615-1ade683a9903}")
@Guid("3a01b4da4d8c411eb6151ade683a9903")
@WinRTInterface("3a01b4da4d8c411eb6151ade683a9903")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPropertyAnimation.ByReference::class)
public interface IPropertyAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): PropertyAnimationType?

  @InterfaceMethod(1)
  public fun get_Delay(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_Control1(): Point?

  @InterfaceMethod(4)
  public fun get_Control2(): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPropertyAnimation> {
    public override fun getValue() = ABI.makeIPropertyAnimation(pointer.getPointer(0))

    public fun setValue(value: IPropertyAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPropertyAnimation {
    public val __359196293_Ptr: Pointer?

    public val _359196293_VtblPtr: Pointer?
      get() = __359196293_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): PropertyAnimationType? {
      val fnPtr = _359196293_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyAnimationType>()
      val hr = fn.invokeHR(arrayOf(__359196293_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyAnimationType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Delay(): TimeSpan? {
      val fnPtr = _359196293_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__359196293_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _359196293_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__359196293_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Control1(): Point? {
      val fnPtr = _359196293_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__359196293_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Control2(): Point? {
      val fnPtr = _359196293_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__359196293_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class IPropertyAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __359196293_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPropertyAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a01b4da4d8c411eb6151ade683a9903")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPropertyAnimation(ptr: Pointer?): WithDefault = IPropertyAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPropertyAnimation {
      val address = segment.toRawLongValue()
      return makeIPropertyAnimation(Pointer(address))
    }

    public override fun toNative(obj: IPropertyAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__359196293_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPropertyAnimation): Array<IPropertyAnimation?> =
        (elements as
        Array<IPropertyAnimation?>).castToImpl<IPropertyAnimation,IPropertyAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPropertyAnimation?> =
        arrayOfNulls<IPropertyAnimation_Impl>(size) as Array<IPropertyAnimation?>
  }
}
