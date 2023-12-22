package Microsoft.UI.Composition

import Windows.Foundation.IReference
import Windows.Foundation.Numerics.Vector3
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

@ABIMarker(IVector3NaturalMotionAnimation.ABI::class)
@Signature("{13feeef2-d2c0-5b72-ad67-983a19b9b783}")
@Guid("13feeef2d2c05b72ad67983a19b9b783")
@WinRTInterface("13feeef2d2c05b72ad67983a19b9b783")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVector3NaturalMotionAnimation.ByReference::class)
public interface IVector3NaturalMotionAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FinalValue(): IReference<Vector3?>?

  @InterfaceMethod(1)
  public fun put_FinalValue(value: IReference<Vector3?>?): Unit

  @InterfaceMethod(2)
  public fun get_InitialValue(): IReference<Vector3?>?

  @InterfaceMethod(3)
  public fun put_InitialValue(value: IReference<Vector3?>?): Unit

  @InterfaceMethod(4)
  public fun get_InitialVelocity(): Vector3?

  @InterfaceMethod(5)
  public fun put_InitialVelocity(value: Vector3?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVector3NaturalMotionAnimation> {
    public override fun getValue() = ABI.makeIVector3NaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: IVector3NaturalMotionAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVector3NaturalMotionAnimation {
    public val __479691516_Ptr: Pointer?

    public val _479691516_VtblPtr: Pointer?
      get() = __479691516_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FinalValue(): IReference<Vector3?>? {
      val fnPtr = _479691516_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Vector3?>>()
      val hr = fn.invokeHR(arrayOf(__479691516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Vector3?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FinalValue(value: IReference<Vector3?>?): Unit {
      val fnPtr = _479691516_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__479691516_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_InitialValue(): IReference<Vector3?>? {
      val fnPtr = _479691516_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Vector3?>>()
      val hr = fn.invokeHR(arrayOf(__479691516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Vector3?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_InitialValue(value: IReference<Vector3?>?): Unit {
      val fnPtr = _479691516_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__479691516_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_InitialVelocity(): Vector3? {
      val fnPtr = _479691516_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__479691516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_InitialVelocity(value: Vector3?): Unit {
      val fnPtr = _479691516_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__479691516_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVector3NaturalMotionAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __479691516_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVector3NaturalMotionAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("13feeef2d2c05b72ad67983a19b9b783")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVector3NaturalMotionAnimation(ptr: Pointer?): WithDefault =
        IVector3NaturalMotionAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVector3NaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return makeIVector3NaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: IVector3NaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__479691516_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVector3NaturalMotionAnimation):
        Array<IVector3NaturalMotionAnimation?> = (elements as
        Array<IVector3NaturalMotionAnimation?>).castToImpl<IVector3NaturalMotionAnimation,IVector3NaturalMotionAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVector3NaturalMotionAnimation?> =
        arrayOfNulls<IVector3NaturalMotionAnimation_Impl>(size) as
        Array<IVector3NaturalMotionAnimation?>
  }
}
