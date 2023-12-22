package Windows.UI.Xaml.Input

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

@ABIMarker(IInertiaTranslationBehavior.ABI::class)
@Signature("{45d3a512-3b32-4882-a4c2-ecfa2d4b6df0}")
@Guid("45d3a5123b324882a4c2ecfa2d4b6df0")
@WinRTInterface("45d3a5123b324882a4c2ecfa2d4b6df0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInertiaTranslationBehavior.ByReference::class)
public interface IInertiaTranslationBehavior : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredDeceleration(): Double

  @InterfaceMethod(1)
  public fun put_DesiredDeceleration(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_DesiredDisplacement(): Double

  @InterfaceMethod(3)
  public fun put_DesiredDisplacement(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInertiaTranslationBehavior> {
    public override fun getValue() = ABI.makeIInertiaTranslationBehavior(pointer.getPointer(0))

    public fun setValue(value: IInertiaTranslationBehavior_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInertiaTranslationBehavior {
    public val __1956938145_Ptr: Pointer?

    public val _1956938145_VtblPtr: Pointer?
      get() = __1956938145_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredDeceleration(): Double {
      val fnPtr = _1956938145_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1956938145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_DesiredDeceleration(value: Double): Unit {
      val fnPtr = _1956938145_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1956938145_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DesiredDisplacement(): Double {
      val fnPtr = _1956938145_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1956938145_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_DesiredDisplacement(value: Double): Unit {
      val fnPtr = _1956938145_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1956938145_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInertiaTranslationBehavior_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1956938145_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInertiaTranslationBehavior, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("45d3a5123b324882a4c2ecfa2d4b6df0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInertiaTranslationBehavior(ptr: Pointer?): WithDefault =
        IInertiaTranslationBehavior_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInertiaTranslationBehavior {
      val address = segment.toRawLongValue()
      return makeIInertiaTranslationBehavior(Pointer(address))
    }

    public override fun toNative(obj: IInertiaTranslationBehavior): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1956938145_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInertiaTranslationBehavior):
        Array<IInertiaTranslationBehavior?> = (elements as
        Array<IInertiaTranslationBehavior?>).castToImpl<IInertiaTranslationBehavior,IInertiaTranslationBehavior_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInertiaTranslationBehavior?> =
        arrayOfNulls<IInertiaTranslationBehavior_Impl>(size) as Array<IInertiaTranslationBehavior?>
  }
}
