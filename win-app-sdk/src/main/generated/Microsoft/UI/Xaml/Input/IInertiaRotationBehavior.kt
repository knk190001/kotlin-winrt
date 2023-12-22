package Microsoft.UI.Xaml.Input

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInertiaRotationBehavior.ABI::class)
@Signature("{27b4bd03-9149-5691-bce5-fa33b32c4a81}")
@Guid("27b4bd0391495691bce5fa33b32c4a81")
@WinRTInterface("27b4bd0391495691bce5fa33b32c4a81")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInertiaRotationBehavior.ByReference::class)
public interface IInertiaRotationBehavior : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredDeceleration(): Double

  @InterfaceMethod(1)
  public fun put_DesiredDeceleration(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_DesiredRotation(): Double

  @InterfaceMethod(3)
  public fun put_DesiredRotation(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInertiaRotationBehavior> {
    public override fun getValue() = ABI.makeIInertiaRotationBehavior(pointer.getPointer(0))

    public fun setValue(value: IInertiaRotationBehavior_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInertiaRotationBehavior {
    public val __1535833761_Ptr: Pointer?

    public val _1535833761_VtblPtr: Pointer?
      get() = __1535833761_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredDeceleration(): Double {
      val fnPtr = _1535833761_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1535833761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_DesiredDeceleration(value: Double): Unit {
      val fnPtr = _1535833761_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1535833761_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DesiredRotation(): Double {
      val fnPtr = _1535833761_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1535833761_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_DesiredRotation(value: Double): Unit {
      val fnPtr = _1535833761_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1535833761_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInertiaRotationBehavior_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1535833761_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInertiaRotationBehavior, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27b4bd0391495691bce5fa33b32c4a81")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInertiaRotationBehavior(ptr: Pointer?): WithDefault =
        IInertiaRotationBehavior_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInertiaRotationBehavior {
      val address = segment.toRawLongValue()
      return makeIInertiaRotationBehavior(Pointer(address))
    }

    public override fun toNative(obj: IInertiaRotationBehavior): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1535833761_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInertiaRotationBehavior):
        Array<IInertiaRotationBehavior?> = (elements as
        Array<IInertiaRotationBehavior?>).castToImpl<IInertiaRotationBehavior,IInertiaRotationBehavior_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInertiaRotationBehavior?> =
        arrayOfNulls<IInertiaRotationBehavior_Impl>(size) as Array<IInertiaRotationBehavior?>
  }
}
