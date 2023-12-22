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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INetworkOperatorTetheringEntitlementCheck.ABI::class)
@Signature("{0108916d-9e9a-4af6-8da3-60493b19c204}")
@Guid("0108916d9e9a4af68da360493b19c204")
@WinRTInterface("0108916d9e9a4af68da360493b19c204")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorTetheringEntitlementCheck.ByReference::class)
public interface INetworkOperatorTetheringEntitlementCheck : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AuthorizeTethering(allow: Boolean, entitlementFailureReason: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorTetheringEntitlementCheck> {
    public override fun getValue() =
        ABI.makeINetworkOperatorTetheringEntitlementCheck(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorTetheringEntitlementCheck_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorTetheringEntitlementCheck {
    public val __625063246_Ptr: Pointer?

    public val _625063246_VtblPtr: Pointer?
      get() = __625063246_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AuthorizeTethering(allow: Boolean, entitlementFailureReason: String?):
        Unit {
      val fnPtr = _625063246_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625063246_Ptr, allow,
          marshalToNative(entitlementFailureReason),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INetworkOperatorTetheringEntitlementCheck_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __625063246_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorTetheringEntitlementCheck, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0108916d9e9a4af68da360493b19c204")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorTetheringEntitlementCheck(ptr: Pointer?): WithDefault =
        INetworkOperatorTetheringEntitlementCheck_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INetworkOperatorTetheringEntitlementCheck {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorTetheringEntitlementCheck(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorTetheringEntitlementCheck): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__625063246_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorTetheringEntitlementCheck):
        Array<INetworkOperatorTetheringEntitlementCheck?> = (elements as
        Array<INetworkOperatorTetheringEntitlementCheck?>).castToImpl<INetworkOperatorTetheringEntitlementCheck,INetworkOperatorTetheringEntitlementCheck_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkOperatorTetheringEntitlementCheck?> =
        arrayOfNulls<INetworkOperatorTetheringEntitlementCheck_Impl>(size) as
        Array<INetworkOperatorTetheringEntitlementCheck?>
  }
}
