package Windows.UI.Xaml.Controls

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

@ABIMarker(ICommandBarElement2.ABI::class)
@Signature("{a9bf1236-4402-4688-b987-9d2b9b7bf2bd}")
@Guid("a9bf123644024688b9879d2b9b7bf2bd")
@WinRTInterface("a9bf123644024688b9879d2b9b7bf2bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarElement2.ByReference::class)
public interface ICommandBarElement2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsInOverflow(): Boolean

  @InterfaceMethod(1)
  public fun get_DynamicOverflowOrder(): Int

  @InterfaceMethod(2)
  public fun put_DynamicOverflowOrder(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarElement2> {
    public override fun getValue() = ABI.makeICommandBarElement2(pointer.getPointer(0))

    public fun setValue(value: ICommandBarElement2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarElement2 {
    public val __1656014522_Ptr: Pointer?

    public val _1656014522_VtblPtr: Pointer?
      get() = __1656014522_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsInOverflow(): Boolean {
      val fnPtr = _1656014522_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1656014522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_DynamicOverflowOrder(): Int {
      val fnPtr = _1656014522_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1656014522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_DynamicOverflowOrder(value: Int): Unit {
      val fnPtr = _1656014522_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1656014522_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICommandBarElement2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1656014522_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarElement2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9bf123644024688b9879d2b9b7bf2bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarElement2(ptr: Pointer?): WithDefault = ICommandBarElement2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarElement2 {
      val address = segment.toRawLongValue()
      return makeICommandBarElement2(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarElement2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1656014522_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarElement2): Array<ICommandBarElement2?> =
        (elements as
        Array<ICommandBarElement2?>).castToImpl<ICommandBarElement2,ICommandBarElement2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarElement2?> =
        arrayOfNulls<ICommandBarElement2_Impl>(size) as Array<ICommandBarElement2?>
  }
}
