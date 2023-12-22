package Windows.UI.ViewManagement

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

@ABIMarker(IApplicationViewTransferContextStatics.ABI::class)
@Signature("{15a89d92-dd79-4b0b-bc47-d5f195f14661}")
@Guid("15a89d92dd794b0bbc47d5f195f14661")
@WinRTInterface("15a89d92dd794b0bbc47d5f195f14661")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewTransferContextStatics.ByReference::class)
public interface IApplicationViewTransferContextStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataPackageFormatId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewTransferContextStatics> {
    public override fun getValue() =
        ABI.makeIApplicationViewTransferContextStatics(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewTransferContextStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewTransferContextStatics {
    public val __188959492_Ptr: Pointer?

    public val _188959492_VtblPtr: Pointer?
      get() = __188959492_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataPackageFormatId(): String? {
      val fnPtr = _188959492_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__188959492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationViewTransferContextStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __188959492_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewTransferContextStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("15a89d92dd794b0bbc47d5f195f14661")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewTransferContextStatics(ptr: Pointer?): WithDefault =
        IApplicationViewTransferContextStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewTransferContextStatics {
      val address = segment.toRawLongValue()
      return makeIApplicationViewTransferContextStatics(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewTransferContextStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__188959492_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewTransferContextStatics):
        Array<IApplicationViewTransferContextStatics?> = (elements as
        Array<IApplicationViewTransferContextStatics?>).castToImpl<IApplicationViewTransferContextStatics,IApplicationViewTransferContextStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewTransferContextStatics?> =
        arrayOfNulls<IApplicationViewTransferContextStatics_Impl>(size) as
        Array<IApplicationViewTransferContextStatics?>
  }
}
