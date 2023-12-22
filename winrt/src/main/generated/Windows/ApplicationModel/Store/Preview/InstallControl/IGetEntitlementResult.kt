package Windows.ApplicationModel.Store.Preview.InstallControl

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

@ABIMarker(IGetEntitlementResult.ABI::class)
@Signature("{74fc843f-1a9e-4609-8e4d-819086d08a3d}")
@Guid("74fc843f1a9e46098e4d819086d08a3d")
@WinRTInterface("74fc843f1a9e46098e4d819086d08a3d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGetEntitlementResult.ByReference::class)
public interface IGetEntitlementResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): GetEntitlementStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGetEntitlementResult> {
    public override fun getValue() = ABI.makeIGetEntitlementResult(pointer.getPointer(0))

    public fun setValue(value: IGetEntitlementResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGetEntitlementResult {
    public val __1284798046_Ptr: Pointer?

    public val _1284798046_VtblPtr: Pointer?
      get() = __1284798046_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): GetEntitlementStatus? {
      val fnPtr = _1284798046_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GetEntitlementStatus>()
      val hr = fn.invokeHR(arrayOf(__1284798046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GetEntitlementStatus>(result.getValue())
      return resultValue
    }
  }

  public class IGetEntitlementResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1284798046_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGetEntitlementResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("74fc843f1a9e46098e4d819086d08a3d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGetEntitlementResult(ptr: Pointer?): WithDefault =
        IGetEntitlementResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGetEntitlementResult {
      val address = segment.toRawLongValue()
      return makeIGetEntitlementResult(Pointer(address))
    }

    public override fun toNative(obj: IGetEntitlementResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1284798046_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGetEntitlementResult): Array<IGetEntitlementResult?> =
        (elements as
        Array<IGetEntitlementResult?>).castToImpl<IGetEntitlementResult,IGetEntitlementResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGetEntitlementResult?> =
        arrayOfNulls<IGetEntitlementResult_Impl>(size) as Array<IGetEntitlementResult?>
  }
}
