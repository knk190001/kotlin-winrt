package Windows.Media.Protection

import Windows.Foundation.IAsyncOperationWithProgress
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IComponentRenewalStatics.ABI::class)
@Signature("{6ffbcd67-b795-48c5-8b7b-a7c4efe202e3}")
@Guid("6ffbcd67b79548c58b7ba7c4efe202e3")
@WinRTInterface("6ffbcd67b79548c58b7ba7c4efe202e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComponentRenewalStatics.ByReference::class)
public interface IComponentRenewalStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RenewSystemComponentsAsync(information: RevocationAndRenewalInformation?):
      IAsyncOperationWithProgress<RenewalStatus?, WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComponentRenewalStatics> {
    public override fun getValue() = ABI.makeIComponentRenewalStatics(pointer.getPointer(0))

    public fun setValue(value: IComponentRenewalStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComponentRenewalStatics {
    public val __1117027983_Ptr: Pointer?

    public val _1117027983_VtblPtr: Pointer?
      get() = __1117027983_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RenewSystemComponentsAsync(information: RevocationAndRenewalInformation?):
        IAsyncOperationWithProgress<RenewalStatus?, WinDef.UINT>? {
      val fnPtr = _1117027983_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<RenewalStatus?, WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1117027983_Ptr, marshalToNative(information), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<RenewalStatus?,
          WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IComponentRenewalStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1117027983_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComponentRenewalStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ffbcd67b79548c58b7ba7c4efe202e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComponentRenewalStatics(ptr: Pointer?): WithDefault =
        IComponentRenewalStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComponentRenewalStatics {
      val address = segment.toRawLongValue()
      return makeIComponentRenewalStatics(Pointer(address))
    }

    public override fun toNative(obj: IComponentRenewalStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1117027983_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComponentRenewalStatics):
        Array<IComponentRenewalStatics?> = (elements as
        Array<IComponentRenewalStatics?>).castToImpl<IComponentRenewalStatics,IComponentRenewalStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComponentRenewalStatics?> =
        arrayOfNulls<IComponentRenewalStatics_Impl>(size) as Array<IComponentRenewalStatics?>
  }
}
