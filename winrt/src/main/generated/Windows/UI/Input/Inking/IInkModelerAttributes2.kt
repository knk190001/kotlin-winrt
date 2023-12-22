package Windows.UI.Input.Inking

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

@ABIMarker(IInkModelerAttributes2.ABI::class)
@Signature("{86d1d09a-4ef8-5e25-b7bc-b65424f16bb3}")
@Guid("86d1d09a4ef85e25b7bcb65424f16bb3")
@WinRTInterface("86d1d09a4ef85e25b7bcb65424f16bb3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkModelerAttributes2.ByReference::class)
public interface IInkModelerAttributes2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UseVelocityBasedPressure(): Boolean

  @InterfaceMethod(1)
  public fun put_UseVelocityBasedPressure(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkModelerAttributes2> {
    public override fun getValue() = ABI.makeIInkModelerAttributes2(pointer.getPointer(0))

    public fun setValue(value: IInkModelerAttributes2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkModelerAttributes2 {
    public val __1443587953_Ptr: Pointer?

    public val _1443587953_VtblPtr: Pointer?
      get() = __1443587953_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UseVelocityBasedPressure(): Boolean {
      val fnPtr = _1443587953_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1443587953_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_UseVelocityBasedPressure(value: Boolean): Unit {
      val fnPtr = _1443587953_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1443587953_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkModelerAttributes2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1443587953_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkModelerAttributes2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("86d1d09a4ef85e25b7bcb65424f16bb3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkModelerAttributes2(ptr: Pointer?): WithDefault =
        IInkModelerAttributes2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkModelerAttributes2 {
      val address = segment.toRawLongValue()
      return makeIInkModelerAttributes2(Pointer(address))
    }

    public override fun toNative(obj: IInkModelerAttributes2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1443587953_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkModelerAttributes2): Array<IInkModelerAttributes2?> =
        (elements as
        Array<IInkModelerAttributes2?>).castToImpl<IInkModelerAttributes2,IInkModelerAttributes2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkModelerAttributes2?> =
        arrayOfNulls<IInkModelerAttributes2_Impl>(size) as Array<IInkModelerAttributes2?>
  }
}
