package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.IMediaProtectionServiceRequest
import Windows.Media.Protection.PlayReady.IPlayReadyLicenseAcquisitionServiceRequest2.ABI.IID
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadyLicenseAcquisitionServiceRequest3.ABI::class)
@Signature("{394e5f4d-7f75-430d-b2e7-7f75f34b2d75}")
@Guid("394e5f4d7f75430db2e77f75f34b2d75")
@WinRTInterface("394e5f4d7f75430db2e77f75f34b2d75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyLicenseAcquisitionServiceRequest3.ByReference::class)
public interface IPlayReadyLicenseAcquisitionServiceRequest3 : NativeMapped, IWinRTInterface,
    IPlayReadyLicenseAcquisitionServiceRequest2, IPlayReadyLicenseAcquisitionServiceRequest,
    IPlayReadyServiceRequest, IMediaProtectionServiceRequest {
  @InterfaceMethod(0)
  public fun CreateLicenseIterable(contentHeader: PlayReadyContentHeader?, fullyEvaluated: Boolean):
      PlayReadyLicenseIterable?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyLicenseAcquisitionServiceRequest3> {
    public override fun getValue() =
        ABI.makeIPlayReadyLicenseAcquisitionServiceRequest3(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyLicenseAcquisitionServiceRequest3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyLicenseAcquisitionServiceRequest3,
      IPlayReadyLicenseAcquisitionServiceRequest2.WithDefault,
      IPlayReadyLicenseAcquisitionServiceRequest.WithDefault, IPlayReadyServiceRequest.WithDefault,
      IMediaProtectionServiceRequest.WithDefault {
    public val __106473368_Ptr: Pointer?

    public val _106473368_VtblPtr: Pointer?
      get() = __106473368_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateLicenseIterable(contentHeader: PlayReadyContentHeader?,
        fullyEvaluated: Boolean): PlayReadyLicenseIterable? {
      val fnPtr = _106473368_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadyLicenseIterable>()
      val hr = fn.invokeHR(arrayOf(__106473368_Ptr, marshalToNative(contentHeader), fullyEvaluated,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadyLicenseIterable>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadyLicenseAcquisitionServiceRequest3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IPlayReadyLicenseAcquisitionServiceRequest2, IPlayReadyLicenseAcquisitionServiceRequest,
      IPlayReadyServiceRequest, IMediaProtectionServiceRequest {
    public override val __106473367_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_106473368_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __135112709_Ptr: JNAPointer by lazy {
      val refiid =
          com.sun.jna.platform.win32.Guid.REFIID(IPlayReadyLicenseAcquisitionServiceRequest.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_106473368_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __573428623_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IPlayReadyServiceRequest.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_106473368_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __454607004_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaProtectionServiceRequest.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_106473368_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __106473368_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyLicenseAcquisitionServiceRequest3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("394e5f4d7f75430db2e77f75f34b2d75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyLicenseAcquisitionServiceRequest3(ptr: Pointer?): WithDefault =
        IPlayReadyLicenseAcquisitionServiceRequest3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPlayReadyLicenseAcquisitionServiceRequest3 {
      val address = segment.toRawLongValue()
      return makeIPlayReadyLicenseAcquisitionServiceRequest3(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyLicenseAcquisitionServiceRequest3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__106473368_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyLicenseAcquisitionServiceRequest3):
        Array<IPlayReadyLicenseAcquisitionServiceRequest3?> = (elements as
        Array<IPlayReadyLicenseAcquisitionServiceRequest3?>).castToImpl<IPlayReadyLicenseAcquisitionServiceRequest3,IPlayReadyLicenseAcquisitionServiceRequest3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyLicenseAcquisitionServiceRequest3?> =
        arrayOfNulls<IPlayReadyLicenseAcquisitionServiceRequest3_Impl>(size) as
        Array<IPlayReadyLicenseAcquisitionServiceRequest3?>
  }
}
