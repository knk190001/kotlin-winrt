package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
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

@ABIMarker(IAppointmentStoreNotificationTrigger.ABI::class)
@Signature("{64d4040c-c201-42ad-aa2a-e21ba3425b6d}")
@Guid("64d4040cc20142adaa2ae21ba3425b6d")
@WinRTInterface("64d4040cc20142adaa2ae21ba3425b6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentStoreNotificationTrigger.ByReference::class)
public interface IAppointmentStoreNotificationTrigger : NativeMapped, IWinRTInterface,
    IBackgroundTrigger {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentStoreNotificationTrigger> {
    public override fun getValue() =
        ABI.makeIAppointmentStoreNotificationTrigger(pointer.getPointer(0))

    public fun setValue(value: IAppointmentStoreNotificationTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentStoreNotificationTrigger,
      IBackgroundTrigger.WithDefault {
    public val __473190106_Ptr: Pointer?

    public val _473190106_VtblPtr: Pointer?
      get() = __473190106_Ptr?.getPointer(0)
  }

  public class IAppointmentStoreNotificationTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_473190106_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __473190106_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentStoreNotificationTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64d4040cc20142adaa2ae21ba3425b6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentStoreNotificationTrigger(ptr: Pointer?): WithDefault =
        IAppointmentStoreNotificationTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentStoreNotificationTrigger {
      val address = segment.toRawLongValue()
      return makeIAppointmentStoreNotificationTrigger(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentStoreNotificationTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__473190106_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentStoreNotificationTrigger):
        Array<IAppointmentStoreNotificationTrigger?> = (elements as
        Array<IAppointmentStoreNotificationTrigger?>).castToImpl<IAppointmentStoreNotificationTrigger,IAppointmentStoreNotificationTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentStoreNotificationTrigger?> =
        arrayOfNulls<IAppointmentStoreNotificationTrigger_Impl>(size) as
        Array<IAppointmentStoreNotificationTrigger?>
  }
}
