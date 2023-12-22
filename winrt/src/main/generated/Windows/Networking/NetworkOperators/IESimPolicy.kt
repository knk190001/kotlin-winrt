package Windows.Networking.NetworkOperators

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

@ABIMarker(IESimPolicy.ABI::class)
@Signature("{41e1b99d-cf7e-4315-882b-6f1e74b0d38f}")
@Guid("41e1b99dcf7e4315882b6f1e74b0d38f")
@WinRTInterface("41e1b99dcf7e4315882b6f1e74b0d38f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IESimPolicy.ByReference::class)
public interface IESimPolicy : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShouldEnableManagingUi(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IESimPolicy> {
    public override fun getValue() = ABI.makeIESimPolicy(pointer.getPointer(0))

    public fun setValue(value: IESimPolicy_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IESimPolicy {
    public val __251224253_Ptr: Pointer?

    public val _251224253_VtblPtr: Pointer?
      get() = __251224253_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShouldEnableManagingUi(): Boolean {
      val fnPtr = _251224253_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__251224253_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IESimPolicy_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __251224253_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IESimPolicy, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41e1b99dcf7e4315882b6f1e74b0d38f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIESimPolicy(ptr: Pointer?): WithDefault = IESimPolicy_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IESimPolicy {
      val address = segment.toRawLongValue()
      return makeIESimPolicy(Pointer(address))
    }

    public override fun toNative(obj: IESimPolicy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__251224253_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IESimPolicy): Array<IESimPolicy?> = (elements as
        Array<IESimPolicy?>).castToImpl<IESimPolicy,IESimPolicy_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IESimPolicy?> =
        arrayOfNulls<IESimPolicy_Impl>(size) as Array<IESimPolicy?>
  }
}
