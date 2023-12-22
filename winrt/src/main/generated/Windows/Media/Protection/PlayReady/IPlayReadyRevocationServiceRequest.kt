package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.IMediaProtectionServiceRequest
import Windows.Media.Protection.PlayReady.IPlayReadyServiceRequest.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadyRevocationServiceRequest.ABI::class)
@Signature("{543d66ac-faf0-4560-84a5-0e4acec939e4}")
@Guid("543d66acfaf0456084a50e4acec939e4")
@WinRTInterface("543d66acfaf0456084a50e4acec939e4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyRevocationServiceRequest.ByReference::class)
public interface IPlayReadyRevocationServiceRequest : NativeMapped, IWinRTInterface,
    IPlayReadyServiceRequest, IMediaProtectionServiceRequest {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyRevocationServiceRequest> {
    public override fun getValue() =
        ABI.makeIPlayReadyRevocationServiceRequest(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyRevocationServiceRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyRevocationServiceRequest,
      IPlayReadyServiceRequest.WithDefault, IMediaProtectionServiceRequest.WithDefault {
    public val __1196421261_Ptr: Pointer?

    public val _1196421261_VtblPtr: Pointer?
      get() = __1196421261_Ptr?.getPointer(0)
  }

  public class IPlayReadyRevocationServiceRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPlayReadyServiceRequest,
      IMediaProtectionServiceRequest {
    public override val __573428623_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1196421261_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __454607004_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaProtectionServiceRequest.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1196421261_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1196421261_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyRevocationServiceRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("543d66acfaf0456084a50e4acec939e4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyRevocationServiceRequest(ptr: Pointer?): WithDefault =
        IPlayReadyRevocationServiceRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyRevocationServiceRequest {
      val address = segment.toRawLongValue()
      return makeIPlayReadyRevocationServiceRequest(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyRevocationServiceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1196421261_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyRevocationServiceRequest):
        Array<IPlayReadyRevocationServiceRequest?> = (elements as
        Array<IPlayReadyRevocationServiceRequest?>).castToImpl<IPlayReadyRevocationServiceRequest,IPlayReadyRevocationServiceRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyRevocationServiceRequest?> =
        arrayOfNulls<IPlayReadyRevocationServiceRequest_Impl>(size) as
        Array<IPlayReadyRevocationServiceRequest?>
  }
}
