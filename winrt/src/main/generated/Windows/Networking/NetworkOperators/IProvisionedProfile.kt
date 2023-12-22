package Windows.Networking.NetworkOperators

import Windows.Networking.Connectivity.NetworkCostType
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProvisionedProfile.ABI::class)
@Signature("{217700e0-8202-11df-adb9-f4ce462d9137}")
@Guid("217700e0820211dfadb9f4ce462d9137")
@WinRTInterface("217700e0820211dfadb9f4ce462d9137")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProvisionedProfile.ByReference::class)
public interface IProvisionedProfile : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun UpdateCost(value: NetworkCostType?): Unit

  @InterfaceMethod(1)
  public fun UpdateUsage(value: ProfileUsage?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProvisionedProfile> {
    public override fun getValue() = ABI.makeIProvisionedProfile(pointer.getPointer(0))

    public fun setValue(value: IProvisionedProfile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProvisionedProfile {
    public val __861945714_Ptr: Pointer?

    public val _861945714_VtblPtr: Pointer?
      get() = __861945714_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun UpdateCost(value: NetworkCostType?): Unit {
      val fnPtr = _861945714_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__861945714_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun UpdateUsage(value: ProfileUsage?): Unit {
      val fnPtr = _861945714_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__861945714_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IProvisionedProfile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __861945714_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProvisionedProfile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("217700e0820211dfadb9f4ce462d9137")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProvisionedProfile(ptr: Pointer?): WithDefault = IProvisionedProfile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProvisionedProfile {
      val address = segment.toRawLongValue()
      return makeIProvisionedProfile(Pointer(address))
    }

    public override fun toNative(obj: IProvisionedProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__861945714_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProvisionedProfile): Array<IProvisionedProfile?> =
        (elements as
        Array<IProvisionedProfile?>).castToImpl<IProvisionedProfile,IProvisionedProfile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProvisionedProfile?> =
        arrayOfNulls<IProvisionedProfile_Impl>(size) as Array<IProvisionedProfile?>
  }
}
