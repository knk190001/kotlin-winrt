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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IESimDownloadProfileMetadataResult.ABI::class)
@Signature("{c4234d9e-5ad6-426d-8d00-4434f449afec}")
@Guid("c4234d9e5ad6426d8d004434f449afec")
@WinRTInterface("c4234d9e5ad6426d8d004434f449afec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IESimDownloadProfileMetadataResult.ByReference::class)
public interface IESimDownloadProfileMetadataResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Result(): ESimOperationResult?

  @InterfaceMethod(1)
  public fun get_ProfileMetadata(): ESimProfileMetadata?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IESimDownloadProfileMetadataResult> {
    public override fun getValue() =
        ABI.makeIESimDownloadProfileMetadataResult(pointer.getPointer(0))

    public fun setValue(value: IESimDownloadProfileMetadataResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IESimDownloadProfileMetadataResult {
    public val __1410379426_Ptr: Pointer?

    public val _1410379426_VtblPtr: Pointer?
      get() = __1410379426_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Result(): ESimOperationResult? {
      val fnPtr = _1410379426_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimOperationResult>()
      val hr = fn.invokeHR(arrayOf(__1410379426_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimOperationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProfileMetadata(): ESimProfileMetadata? {
      val fnPtr = _1410379426_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESimProfileMetadata>()
      val hr = fn.invokeHR(arrayOf(__1410379426_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESimProfileMetadata>(result.getValue())
      return resultValue
    }
  }

  public class IESimDownloadProfileMetadataResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1410379426_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IESimDownloadProfileMetadataResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4234d9e5ad6426d8d004434f449afec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIESimDownloadProfileMetadataResult(ptr: Pointer?): WithDefault =
        IESimDownloadProfileMetadataResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IESimDownloadProfileMetadataResult {
      val address = segment.toRawLongValue()
      return makeIESimDownloadProfileMetadataResult(Pointer(address))
    }

    public override fun toNative(obj: IESimDownloadProfileMetadataResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1410379426_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IESimDownloadProfileMetadataResult):
        Array<IESimDownloadProfileMetadataResult?> = (elements as
        Array<IESimDownloadProfileMetadataResult?>).castToImpl<IESimDownloadProfileMetadataResult,IESimDownloadProfileMetadataResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IESimDownloadProfileMetadataResult?> =
        arrayOfNulls<IESimDownloadProfileMetadataResult_Impl>(size) as
        Array<IESimDownloadProfileMetadataResult?>
  }
}
