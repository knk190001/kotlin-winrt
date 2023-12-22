package Windows.ApplicationModel.Calls

import Windows.ApplicationModel.Calls.IVoipCallCoordinator.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVoipCallCoordinator2.ABI::class)
@Signature("{beb4a9f3-c704-4234-89ce-e88cc0d28fbe}")
@Guid("beb4a9f3c704423489cee88cc0d28fbe")
@WinRTInterface("beb4a9f3c704423489cee88cc0d28fbe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoipCallCoordinator2.ByReference::class)
public interface IVoipCallCoordinator2 : NativeMapped, IWinRTInterface, IVoipCallCoordinator {
  @InterfaceMethod(0)
  public fun SetupNewAcceptedCall(
    context: String?,
    contactName: String?,
    contactNumber: String?,
    serviceName: String?,
    media: VoipPhoneCallMedia?
  ): VoipPhoneCall?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoipCallCoordinator2> {
    public override fun getValue() = ABI.makeIVoipCallCoordinator2(pointer.getPointer(0))

    public fun setValue(value: IVoipCallCoordinator2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoipCallCoordinator2, IVoipCallCoordinator.WithDefault {
    public val __390643266_Ptr: Pointer?

    public val _390643266_VtblPtr: Pointer?
      get() = __390643266_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetupNewAcceptedCall(
      context: String?,
      contactName: String?,
      contactNumber: String?,
      serviceName: String?,
      media: VoipPhoneCallMedia?
    ): VoipPhoneCall? {
      val fnPtr = _390643266_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoipPhoneCall>()
      val hr = fn.invokeHR(arrayOf(__390643266_Ptr, marshalToNative(context),
          marshalToNative(contactName), marshalToNative(contactNumber),
          marshalToNative(serviceName), marshalToNative(media), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoipPhoneCall>(result.getValue())
      return resultValue
    }
  }

  public class IVoipCallCoordinator2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVoipCallCoordinator {
    public override val __1372871924_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_390643266_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __390643266_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoipCallCoordinator2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("beb4a9f3c704423489cee88cc0d28fbe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoipCallCoordinator2(ptr: Pointer?): WithDefault =
        IVoipCallCoordinator2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoipCallCoordinator2 {
      val address = segment.toRawLongValue()
      return makeIVoipCallCoordinator2(Pointer(address))
    }

    public override fun toNative(obj: IVoipCallCoordinator2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__390643266_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoipCallCoordinator2): Array<IVoipCallCoordinator2?> =
        (elements as
        Array<IVoipCallCoordinator2?>).castToImpl<IVoipCallCoordinator2,IVoipCallCoordinator2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoipCallCoordinator2?> =
        arrayOfNulls<IVoipCallCoordinator2_Impl>(size) as Array<IVoipCallCoordinator2?>
  }
}
