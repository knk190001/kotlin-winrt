package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.IMediaProtectionServiceRequest
import Windows.Media.Protection.PlayReady.IPlayReadyServiceRequest.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadyMeteringReportServiceRequest.ABI::class)
@Signature("{c12b231c-0ecd-4f11-a185-1e24a4a67fb7}")
@Guid("c12b231c0ecd4f11a1851e24a4a67fb7")
@WinRTInterface("c12b231c0ecd4f11a1851e24a4a67fb7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyMeteringReportServiceRequest.ByReference::class)
public interface IPlayReadyMeteringReportServiceRequest : NativeMapped, IWinRTInterface,
    IPlayReadyServiceRequest, IMediaProtectionServiceRequest {
  @InterfaceMethod(0)
  public fun get_MeteringCertificate(): Array<Byte>?

  @InterfaceMethod(1)
  public fun put_MeteringCertificate(meteringCertBytes: Array<Byte>): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyMeteringReportServiceRequest> {
    public override fun getValue() =
        ABI.makeIPlayReadyMeteringReportServiceRequest(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyMeteringReportServiceRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyMeteringReportServiceRequest,
      IPlayReadyServiceRequest.WithDefault, IMediaProtectionServiceRequest.WithDefault {
    public val __1928071804_Ptr: Pointer?

    public val _1928071804_VtblPtr: Pointer?
      get() = __1928071804_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MeteringCertificate(): Array<Byte>? {
      val fnPtr = _1928071804_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__1928071804_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MeteringCertificate(meteringCertBytes: Array<Byte>): Unit {
      val fnPtr = _1928071804_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1928071804_Ptr,
          meteringCertBytes.size,marshalToNative(meteringCertBytes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPlayReadyMeteringReportServiceRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPlayReadyServiceRequest,
      IMediaProtectionServiceRequest {
    public override val __573428623_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1928071804_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __454607004_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaProtectionServiceRequest.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1928071804_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1928071804_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyMeteringReportServiceRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c12b231c0ecd4f11a1851e24a4a67fb7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyMeteringReportServiceRequest(ptr: Pointer?): WithDefault =
        IPlayReadyMeteringReportServiceRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyMeteringReportServiceRequest {
      val address = segment.toRawLongValue()
      return makeIPlayReadyMeteringReportServiceRequest(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyMeteringReportServiceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1928071804_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyMeteringReportServiceRequest):
        Array<IPlayReadyMeteringReportServiceRequest?> = (elements as
        Array<IPlayReadyMeteringReportServiceRequest?>).castToImpl<IPlayReadyMeteringReportServiceRequest,IPlayReadyMeteringReportServiceRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyMeteringReportServiceRequest?> =
        arrayOfNulls<IPlayReadyMeteringReportServiceRequest_Impl>(size) as
        Array<IPlayReadyMeteringReportServiceRequest?>
  }
}
