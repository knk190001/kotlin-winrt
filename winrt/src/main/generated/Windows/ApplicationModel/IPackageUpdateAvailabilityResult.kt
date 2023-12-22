package Windows.ApplicationModel

import Windows.Foundation.HResult
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

@ABIMarker(IPackageUpdateAvailabilityResult.ABI::class)
@Signature("{114e5009-199a-48a1-a079-313c45634a71}")
@Guid("114e5009199a48a1a079313c45634a71")
@WinRTInterface("114e5009199a48a1a079313c45634a71")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageUpdateAvailabilityResult.ByReference::class)
public interface IPackageUpdateAvailabilityResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Availability(): PackageUpdateAvailability?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageUpdateAvailabilityResult> {
    public override fun getValue() = ABI.makeIPackageUpdateAvailabilityResult(pointer.getPointer(0))

    public fun setValue(value: IPackageUpdateAvailabilityResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageUpdateAvailabilityResult {
    public val __2123707678_Ptr: Pointer?

    public val _2123707678_VtblPtr: Pointer?
      get() = __2123707678_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Availability(): PackageUpdateAvailability? {
      val fnPtr = _2123707678_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageUpdateAvailability>()
      val hr = fn.invokeHR(arrayOf(__2123707678_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageUpdateAvailability>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _2123707678_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__2123707678_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IPackageUpdateAvailabilityResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2123707678_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageUpdateAvailabilityResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("114e5009199a48a1a079313c45634a71")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageUpdateAvailabilityResult(ptr: Pointer?): WithDefault =
        IPackageUpdateAvailabilityResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageUpdateAvailabilityResult {
      val address = segment.toRawLongValue()
      return makeIPackageUpdateAvailabilityResult(Pointer(address))
    }

    public override fun toNative(obj: IPackageUpdateAvailabilityResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2123707678_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageUpdateAvailabilityResult):
        Array<IPackageUpdateAvailabilityResult?> = (elements as
        Array<IPackageUpdateAvailabilityResult?>).castToImpl<IPackageUpdateAvailabilityResult,IPackageUpdateAvailabilityResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageUpdateAvailabilityResult?> =
        arrayOfNulls<IPackageUpdateAvailabilityResult_Impl>(size) as
        Array<IPackageUpdateAvailabilityResult?>
  }
}
