package Windows.Services.Store

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

@ABIMarker(IStoreAcquireLicenseResult.ABI::class)
@Signature("{fbd7946d-f040-4cb3-9a39-29bcecdbe22d}")
@Guid("fbd7946df0404cb39a3929bcecdbe22d")
@WinRTInterface("fbd7946df0404cb39a3929bcecdbe22d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreAcquireLicenseResult.ByReference::class)
public interface IStoreAcquireLicenseResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StorePackageLicense(): StorePackageLicense?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreAcquireLicenseResult> {
    public override fun getValue() = ABI.makeIStoreAcquireLicenseResult(pointer.getPointer(0))

    public fun setValue(value: IStoreAcquireLicenseResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreAcquireLicenseResult {
    public val __253751300_Ptr: Pointer?

    public val _253751300_VtblPtr: Pointer?
      get() = __253751300_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StorePackageLicense(): StorePackageLicense? {
      val fnPtr = _253751300_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorePackageLicense>()
      val hr = fn.invokeHR(arrayOf(__253751300_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorePackageLicense>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _253751300_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__253751300_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IStoreAcquireLicenseResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __253751300_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreAcquireLicenseResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbd7946df0404cb39a3929bcecdbe22d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreAcquireLicenseResult(ptr: Pointer?): WithDefault =
        IStoreAcquireLicenseResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreAcquireLicenseResult {
      val address = segment.toRawLongValue()
      return makeIStoreAcquireLicenseResult(Pointer(address))
    }

    public override fun toNative(obj: IStoreAcquireLicenseResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__253751300_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreAcquireLicenseResult):
        Array<IStoreAcquireLicenseResult?> = (elements as
        Array<IStoreAcquireLicenseResult?>).castToImpl<IStoreAcquireLicenseResult,IStoreAcquireLicenseResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreAcquireLicenseResult?> =
        arrayOfNulls<IStoreAcquireLicenseResult_Impl>(size) as Array<IStoreAcquireLicenseResult?>
  }
}
