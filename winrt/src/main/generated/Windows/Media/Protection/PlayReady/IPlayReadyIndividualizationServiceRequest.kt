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

@ABIMarker(IPlayReadyIndividualizationServiceRequest.ABI::class)
@Signature("{21f5a86b-008c-4611-ab2f-aaa6c69f0e24}")
@Guid("21f5a86b008c4611ab2faaa6c69f0e24")
@WinRTInterface("21f5a86b008c4611ab2faaa6c69f0e24")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyIndividualizationServiceRequest.ByReference::class)
public interface IPlayReadyIndividualizationServiceRequest : NativeMapped, IWinRTInterface,
    IPlayReadyServiceRequest, IMediaProtectionServiceRequest {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyIndividualizationServiceRequest> {
    public override fun getValue() =
        ABI.makeIPlayReadyIndividualizationServiceRequest(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyIndividualizationServiceRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyIndividualizationServiceRequest,
      IPlayReadyServiceRequest.WithDefault, IMediaProtectionServiceRequest.WithDefault {
    public val __1165043248_Ptr: Pointer?

    public val _1165043248_VtblPtr: Pointer?
      get() = __1165043248_Ptr?.getPointer(0)
  }

  public class IPlayReadyIndividualizationServiceRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IPlayReadyServiceRequest,
      IMediaProtectionServiceRequest {
    public override val __573428623_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1165043248_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __454607004_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaProtectionServiceRequest.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1165043248_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1165043248_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyIndividualizationServiceRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("21f5a86b008c4611ab2faaa6c69f0e24")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyIndividualizationServiceRequest(ptr: Pointer?): WithDefault =
        IPlayReadyIndividualizationServiceRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPlayReadyIndividualizationServiceRequest {
      val address = segment.toRawLongValue()
      return makeIPlayReadyIndividualizationServiceRequest(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyIndividualizationServiceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1165043248_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyIndividualizationServiceRequest):
        Array<IPlayReadyIndividualizationServiceRequest?> = (elements as
        Array<IPlayReadyIndividualizationServiceRequest?>).castToImpl<IPlayReadyIndividualizationServiceRequest,IPlayReadyIndividualizationServiceRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyIndividualizationServiceRequest?> =
        arrayOfNulls<IPlayReadyIndividualizationServiceRequest_Impl>(size) as
        Array<IPlayReadyIndividualizationServiceRequest?>
  }
}
