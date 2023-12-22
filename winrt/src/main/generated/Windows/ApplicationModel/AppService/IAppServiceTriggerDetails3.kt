package Windows.ApplicationModel.AppService

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IAppServiceTriggerDetails3.ABI::class)
@Signature("{fbd71e21-7939-4e68-9e3c-7780147aabb6}")
@Guid("fbd71e2179394e689e3c7780147aabb6")
@WinRTInterface("fbd71e2179394e689e3c7780147aabb6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppServiceTriggerDetails3.ByReference::class)
public interface IAppServiceTriggerDetails3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CheckCallerForCapabilityAsync(capabilityName: String?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppServiceTriggerDetails3> {
    public override fun getValue() = ABI.makeIAppServiceTriggerDetails3(pointer.getPointer(0))

    public fun setValue(value: IAppServiceTriggerDetails3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppServiceTriggerDetails3 {
    public val __1399652374_Ptr: Pointer?

    public val _1399652374_VtblPtr: Pointer?
      get() = __1399652374_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CheckCallerForCapabilityAsync(capabilityName: String?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1399652374_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1399652374_Ptr, marshalToNative(capabilityName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IAppServiceTriggerDetails3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1399652374_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppServiceTriggerDetails3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbd71e2179394e689e3c7780147aabb6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppServiceTriggerDetails3(ptr: Pointer?): WithDefault =
        IAppServiceTriggerDetails3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppServiceTriggerDetails3 {
      val address = segment.toRawLongValue()
      return makeIAppServiceTriggerDetails3(Pointer(address))
    }

    public override fun toNative(obj: IAppServiceTriggerDetails3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1399652374_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppServiceTriggerDetails3):
        Array<IAppServiceTriggerDetails3?> = (elements as
        Array<IAppServiceTriggerDetails3?>).castToImpl<IAppServiceTriggerDetails3,IAppServiceTriggerDetails3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppServiceTriggerDetails3?> =
        arrayOfNulls<IAppServiceTriggerDetails3_Impl>(size) as Array<IAppServiceTriggerDetails3?>
  }
}
