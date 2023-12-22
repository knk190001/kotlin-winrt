package Windows.UI.Xaml.Media.Animation

import Windows.Foundation.IReference
import Windows.UI.Color
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IColorAnimation.ABI::class)
@Signature("{b8ae8a15-0f63-4694-9467-bdafac1253ea}")
@Guid("b8ae8a150f6346949467bdafac1253ea")
@WinRTInterface("b8ae8a150f6346949467bdafac1253ea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorAnimation.ByReference::class)
public interface IColorAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_From(): IReference<Color?>?

  @InterfaceMethod(1)
  public fun put_From(value: IReference<Color?>?): Unit

  @InterfaceMethod(2)
  public fun get_To(): IReference<Color?>?

  @InterfaceMethod(3)
  public fun put_To(value: IReference<Color?>?): Unit

  @InterfaceMethod(4)
  public fun get_By(): IReference<Color?>?

  @InterfaceMethod(5)
  public fun put_By(value: IReference<Color?>?): Unit

  @InterfaceMethod(6)
  public fun get_EasingFunction(): EasingFunctionBase?

  @InterfaceMethod(7)
  public fun put_EasingFunction(value: EasingFunctionBase?): Unit

  @InterfaceMethod(8)
  public fun get_EnableDependentAnimation(): Boolean

  @InterfaceMethod(9)
  public fun put_EnableDependentAnimation(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorAnimation> {
    public override fun getValue() = ABI.makeIColorAnimation(pointer.getPointer(0))

    public fun setValue(value: IColorAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorAnimation {
    public val __1744736537_Ptr: Pointer?

    public val _1744736537_VtblPtr: Pointer?
      get() = __1744736537_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_From(): IReference<Color?>? {
      val fnPtr = _1744736537_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1744736537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_From(value: IReference<Color?>?): Unit {
      val fnPtr = _1744736537_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1744736537_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_To(): IReference<Color?>? {
      val fnPtr = _1744736537_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1744736537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_To(value: IReference<Color?>?): Unit {
      val fnPtr = _1744736537_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1744736537_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_By(): IReference<Color?>? {
      val fnPtr = _1744736537_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1744736537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_By(value: IReference<Color?>?): Unit {
      val fnPtr = _1744736537_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1744736537_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_EasingFunction(): EasingFunctionBase? {
      val fnPtr = _1744736537_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasingFunctionBase>()
      val hr = fn.invokeHR(arrayOf(__1744736537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasingFunctionBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_EasingFunction(value: EasingFunctionBase?): Unit {
      val fnPtr = _1744736537_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1744736537_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_EnableDependentAnimation(): Boolean {
      val fnPtr = _1744736537_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1744736537_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_EnableDependentAnimation(value: Boolean): Unit {
      val fnPtr = _1744736537_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1744736537_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IColorAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1744736537_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8ae8a150f6346949467bdafac1253ea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorAnimation(ptr: Pointer?): WithDefault = IColorAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorAnimation {
      val address = segment.toRawLongValue()
      return makeIColorAnimation(Pointer(address))
    }

    public override fun toNative(obj: IColorAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1744736537_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorAnimation): Array<IColorAnimation?> = (elements as
        Array<IColorAnimation?>).castToImpl<IColorAnimation,IColorAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorAnimation?> =
        arrayOfNulls<IColorAnimation_Impl>(size) as Array<IColorAnimation?>
  }
}
