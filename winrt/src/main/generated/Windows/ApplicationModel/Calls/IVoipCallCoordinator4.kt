package Windows.ApplicationModel.Calls

import Windows.ApplicationModel.Calls.IVoipCallCoordinator.ABI.IID
import Windows.Foundation.IAsyncOperation
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVoipCallCoordinator4.ABI::class)
@Signature("{83737239-9311-468f-bb49-47e0dfb5d93e}")
@Guid("837372399311468fbb4947e0dfb5d93e")
@WinRTInterface("837372399311468fbb4947e0dfb5d93e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoipCallCoordinator4.ByReference::class)
public interface IVoipCallCoordinator4 : NativeMapped, IWinRTInterface, IVoipCallCoordinator {
  @InterfaceMethod(0)
  public fun ReserveCallResourcesAsync(): IAsyncOperation<VoipPhoneCallResourceReservationStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoipCallCoordinator4> {
    public override fun getValue() = ABI.makeIVoipCallCoordinator4(pointer.getPointer(0))

    public fun setValue(value: IVoipCallCoordinator4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoipCallCoordinator4, IVoipCallCoordinator.WithDefault {
    public val __390643264_Ptr: Pointer?

    public val _390643264_VtblPtr: Pointer?
      get() = __390643264_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReserveCallResourcesAsync():
        IAsyncOperation<VoipPhoneCallResourceReservationStatus?>? {
      val fnPtr = _390643264_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VoipPhoneCallResourceReservationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__390643264_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VoipPhoneCallResourceReservationStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IVoipCallCoordinator4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVoipCallCoordinator {
    public override val __1372871924_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_390643264_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __390643264_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoipCallCoordinator4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("837372399311468fbb4947e0dfb5d93e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoipCallCoordinator4(ptr: Pointer?): WithDefault =
        IVoipCallCoordinator4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoipCallCoordinator4 {
      val address = segment.toRawLongValue()
      return makeIVoipCallCoordinator4(Pointer(address))
    }

    public override fun toNative(obj: IVoipCallCoordinator4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__390643264_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoipCallCoordinator4): Array<IVoipCallCoordinator4?> =
        (elements as
        Array<IVoipCallCoordinator4?>).castToImpl<IVoipCallCoordinator4,IVoipCallCoordinator4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoipCallCoordinator4?> =
        arrayOfNulls<IVoipCallCoordinator4_Impl>(size) as Array<IVoipCallCoordinator4?>
  }
}
