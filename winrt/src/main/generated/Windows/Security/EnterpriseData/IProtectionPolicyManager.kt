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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProtectionPolicyManager.ABI::class)
@Signature("{d5703e18-a08d-47e6-a240-9934d7165eb5}")
@Guid("d5703e18a08d47e6a2409934d7165eb5")
@WinRTInterface("d5703e18a08d47e6a2409934d7165eb5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectionPolicyManager.ByReference::class)
public interface IProtectionPolicyManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Identity(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_Identity(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectionPolicyManager> {
    public override fun getValue() = ABI.makeIProtectionPolicyManager(pointer.getPointer(0))

    public fun setValue(value: IProtectionPolicyManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectionPolicyManager {
    public val __1806157881_Ptr: Pointer?

    public val _1806157881_VtblPtr: Pointer?
      get() = __1806157881_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Identity(value: String?): Unit {
      val fnPtr = _1806157881_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1806157881_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Identity(): String? {
      val fnPtr = _1806157881_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1806157881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IProtectionPolicyManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1806157881_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectionPolicyManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d5703e18a08d47e6a2409934d7165eb5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectionPolicyManager(ptr: Pointer?): WithDefault =
        IProtectionPolicyManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectionPolicyManager {
      val address = segment.toRawLongValue()
      return makeIProtectionPolicyManager(Pointer(address))
    }

    public override fun toNative(obj: IProtectionPolicyManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1806157881_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectionPolicyManager):
        Array<IProtectionPolicyManager?> = (elements as
        Array<IProtectionPolicyManager?>).castToImpl<IProtectionPolicyManager,IProtectionPolicyManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectionPolicyManager?> =
        arrayOfNulls<IProtectionPolicyManager_Impl>(size) as Array<IProtectionPolicyManager?>
  }
}
