package Windows.UI.Xaml.Media.Animation

import Windows.Foundation.IReference
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDoubleAnimation.ABI::class)
@Signature("{7e9f3d59-0f07-4bc9-977d-03763ff8154f}")
@Guid("7e9f3d590f074bc9977d03763ff8154f")
@WinRTInterface("7e9f3d590f074bc9977d03763ff8154f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDoubleAnimation.ByReference::class)
public interface IDoubleAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_From(): IReference<Double>?

  @InterfaceMethod(1)
  public fun put_From(value: IReference<Double>?): Unit

  @InterfaceMethod(2)
  public fun get_To(): IReference<Double>?

  @InterfaceMethod(3)
  public fun put_To(value: IReference<Double>?): Unit

  @InterfaceMethod(4)
  public fun get_By(): IReference<Double>?

  @InterfaceMethod(5)
  public fun put_By(value: IReference<Double>?): Unit

  @InterfaceMethod(6)
  public fun get_EasingFunction(): EasingFunctionBase?

  @InterfaceMethod(7)
  public fun put_EasingFunction(value: EasingFunctionBase?): Unit

  @InterfaceMethod(8)
  public fun get_EnableDependentAnimation(): Boolean

  @InterfaceMethod(9)
  public fun put_EnableDependentAnimation(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDoubleAnimation> {
    public override fun getValue() = ABI.makeIDoubleAnimation(pointer.getPointer(0))

    public fun setValue(value: IDoubleAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDoubleAnimation {
    public val __724686867_Ptr: Pointer?

    public val _724686867_VtblPtr: Pointer?
      get() = __724686867_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_From(): IReference<Double>? {
      val fnPtr = _724686867_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__724686867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_From(value: IReference<Double>?): Unit {
      val fnPtr = _724686867_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__724686867_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_To(): IReference<Double>? {
      val fnPtr = _724686867_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__724686867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_To(value: IReference<Double>?): Unit {
      val fnPtr = _724686867_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__724686867_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_By(): IReference<Double>? {
      val fnPtr = _724686867_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__724686867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_By(value: IReference<Double>?): Unit {
      val fnPtr = _724686867_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__724686867_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_EasingFunction(): EasingFunctionBase? {
      val fnPtr = _724686867_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasingFunctionBase>()
      val hr = fn.invokeHR(arrayOf(__724686867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasingFunctionBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_EasingFunction(value: EasingFunctionBase?): Unit {
      val fnPtr = _724686867_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__724686867_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_EnableDependentAnimation(): Boolean {
      val fnPtr = _724686867_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__724686867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_EnableDependentAnimation(value: Boolean): Unit {
      val fnPtr = _724686867_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__724686867_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDoubleAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __724686867_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDoubleAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e9f3d590f074bc9977d03763ff8154f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDoubleAnimation(ptr: Pointer?): WithDefault = IDoubleAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDoubleAnimation {
      val address = segment.toRawLongValue()
      return makeIDoubleAnimation(Pointer(address))
    }

    public override fun toNative(obj: IDoubleAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__724686867_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDoubleAnimation): Array<IDoubleAnimation?> = (elements as
        Array<IDoubleAnimation?>).castToImpl<IDoubleAnimation,IDoubleAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDoubleAnimation?> =
        arrayOfNulls<IDoubleAnimation_Impl>(size) as Array<IDoubleAnimation?>
  }
}
