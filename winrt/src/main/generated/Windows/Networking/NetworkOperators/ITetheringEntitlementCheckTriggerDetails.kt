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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITetheringEntitlementCheckTriggerDetails.ABI::class)
@Signature("{03c65e9d-5926-41f3-a94e-b50926fc421b}")
@Guid("03c65e9d592641f3a94eb50926fc421b")
@WinRTInterface("03c65e9d592641f3a94eb50926fc421b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITetheringEntitlementCheckTriggerDetails.ByReference::class)
public interface ITetheringEntitlementCheckTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NetworkAccountId(): String?

  @InterfaceMethod(1)
  public fun AllowTethering(): Unit

  @InterfaceMethod(2)
  public fun DenyTethering(entitlementFailureReason: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITetheringEntitlementCheckTriggerDetails> {
    public override fun getValue() =
        ABI.makeITetheringEntitlementCheckTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: ITetheringEntitlementCheckTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITetheringEntitlementCheckTriggerDetails {
    public val __2079689540_Ptr: Pointer?

    public val _2079689540_VtblPtr: Pointer?
      get() = __2079689540_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NetworkAccountId(): String? {
      val fnPtr = _2079689540_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2079689540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AllowTethering(): Unit {
      val fnPtr = _2079689540_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2079689540_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun DenyTethering(entitlementFailureReason: String?): Unit {
      val fnPtr = _2079689540_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2079689540_Ptr, marshalToNative(entitlementFailureReason),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITetheringEntitlementCheckTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2079689540_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITetheringEntitlementCheckTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03c65e9d592641f3a94eb50926fc421b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITetheringEntitlementCheckTriggerDetails(ptr: Pointer?): WithDefault =
        ITetheringEntitlementCheckTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ITetheringEntitlementCheckTriggerDetails {
      val address = segment.toRawLongValue()
      return makeITetheringEntitlementCheckTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: ITetheringEntitlementCheckTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2079689540_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITetheringEntitlementCheckTriggerDetails):
        Array<ITetheringEntitlementCheckTriggerDetails?> = (elements as
        Array<ITetheringEntitlementCheckTriggerDetails?>).castToImpl<ITetheringEntitlementCheckTriggerDetails,ITetheringEntitlementCheckTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITetheringEntitlementCheckTriggerDetails?> =
        arrayOfNulls<ITetheringEntitlementCheckTriggerDetails_Impl>(size) as
        Array<ITetheringEntitlementCheckTriggerDetails?>
  }
}
