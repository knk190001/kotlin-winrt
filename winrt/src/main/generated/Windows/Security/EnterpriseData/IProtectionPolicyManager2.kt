package Windows.Security.EnterpriseData

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

@ABIMarker(IProtectionPolicyManager2.ABI::class)
@Signature("{abf7527a-8435-417f-99b6-51beaf365888}")
@Guid("abf7527a8435417f99b651beaf365888")
@WinRTInterface("abf7527a8435417f99b651beaf365888")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectionPolicyManager2.ByReference::class)
public interface IProtectionPolicyManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ShowEnterpriseIndicator(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_ShowEnterpriseIndicator(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectionPolicyManager2> {
    public override fun getValue() = ABI.makeIProtectionPolicyManager2(pointer.getPointer(0))

    public fun setValue(value: IProtectionPolicyManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectionPolicyManager2 {
    public val __156319413_Ptr: Pointer?

    public val _156319413_VtblPtr: Pointer?
      get() = __156319413_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ShowEnterpriseIndicator(value: Boolean): Unit {
      val fnPtr = _156319413_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__156319413_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ShowEnterpriseIndicator(): Boolean {
      val fnPtr = _156319413_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__156319413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IProtectionPolicyManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __156319413_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectionPolicyManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("abf7527a8435417f99b651beaf365888")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectionPolicyManager2(ptr: Pointer?): WithDefault =
        IProtectionPolicyManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectionPolicyManager2 {
      val address = segment.toRawLongValue()
      return makeIProtectionPolicyManager2(Pointer(address))
    }

    public override fun toNative(obj: IProtectionPolicyManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__156319413_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectionPolicyManager2):
        Array<IProtectionPolicyManager2?> = (elements as
        Array<IProtectionPolicyManager2?>).castToImpl<IProtectionPolicyManager2,IProtectionPolicyManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectionPolicyManager2?> =
        arrayOfNulls<IProtectionPolicyManager2_Impl>(size) as Array<IProtectionPolicyManager2?>
  }
}
