package Windows.ApplicationModel.Email

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

@ABIMarker(IEmailMailboxPolicies2.ABI::class)
@Signature("{bab58afb-a14b-497c-a8e2-55eac29cc4b5}")
@Guid("bab58afba14b497ca8e255eac29cc4b5")
@WinRTInterface("bab58afba14b497ca8e255eac29cc4b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxPolicies2.ByReference::class)
public interface IEmailMailboxPolicies2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MustEncryptSmimeMessages(): Boolean

  @InterfaceMethod(1)
  public fun get_MustSignSmimeMessages(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxPolicies2> {
    public override fun getValue() = ABI.makeIEmailMailboxPolicies2(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxPolicies2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxPolicies2 {
    public val __1780575507_Ptr: Pointer?

    public val _1780575507_VtblPtr: Pointer?
      get() = __1780575507_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MustEncryptSmimeMessages(): Boolean {
      val fnPtr = _1780575507_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1780575507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MustSignSmimeMessages(): Boolean {
      val fnPtr = _1780575507_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1780575507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IEmailMailboxPolicies2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1780575507_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxPolicies2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bab58afba14b497ca8e255eac29cc4b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxPolicies2(ptr: Pointer?): WithDefault =
        IEmailMailboxPolicies2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxPolicies2 {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxPolicies2(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxPolicies2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1780575507_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxPolicies2): Array<IEmailMailboxPolicies2?> =
        (elements as
        Array<IEmailMailboxPolicies2?>).castToImpl<IEmailMailboxPolicies2,IEmailMailboxPolicies2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxPolicies2?> =
        arrayOfNulls<IEmailMailboxPolicies2_Impl>(size) as Array<IEmailMailboxPolicies2?>
  }
}
