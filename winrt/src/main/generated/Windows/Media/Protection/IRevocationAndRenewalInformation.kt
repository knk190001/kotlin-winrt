package Windows.Media.Protection

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IRevocationAndRenewalInformation.ABI::class)
@Signature("{f3a1937b-2501-439e-a6e7-6fc95e175fcf}")
@Guid("f3a1937b2501439ea6e76fc95e175fcf")
@WinRTInterface("f3a1937b2501439ea6e76fc95e175fcf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRevocationAndRenewalInformation.ByReference::class)
public interface IRevocationAndRenewalInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Items(): IVector<RevocationAndRenewalItem?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRevocationAndRenewalInformation> {
    public override fun getValue() = ABI.makeIRevocationAndRenewalInformation(pointer.getPointer(0))

    public fun setValue(value: IRevocationAndRenewalInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRevocationAndRenewalInformation {
    public val __1791173074_Ptr: Pointer?

    public val _1791173074_VtblPtr: Pointer?
      get() = __1791173074_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Items(): IVector<RevocationAndRenewalItem?>? {
      val fnPtr = _1791173074_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<RevocationAndRenewalItem?>>()
      val hr = fn.invokeHR(arrayOf(__1791173074_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<RevocationAndRenewalItem?>>(result.getValue())
      return resultValue
    }
  }

  public class IRevocationAndRenewalInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1791173074_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRevocationAndRenewalInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3a1937b2501439ea6e76fc95e175fcf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRevocationAndRenewalInformation(ptr: Pointer?): WithDefault =
        IRevocationAndRenewalInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRevocationAndRenewalInformation {
      val address = segment.toRawLongValue()
      return makeIRevocationAndRenewalInformation(Pointer(address))
    }

    public override fun toNative(obj: IRevocationAndRenewalInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1791173074_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRevocationAndRenewalInformation):
        Array<IRevocationAndRenewalInformation?> = (elements as
        Array<IRevocationAndRenewalInformation?>).castToImpl<IRevocationAndRenewalInformation,IRevocationAndRenewalInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRevocationAndRenewalInformation?> =
        arrayOfNulls<IRevocationAndRenewalInformation_Impl>(size) as
        Array<IRevocationAndRenewalInformation?>
  }
}
