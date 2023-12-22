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

@ABIMarker(IEmailStoreNotificationTrigger.ABI::class)
@Signature("{986d06da-47eb-4268-a4f2-f3f77188388a}")
@Guid("986d06da47eb4268a4f2f3f77188388a")
@WinRTInterface("986d06da47eb4268a4f2f3f77188388a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailStoreNotificationTrigger.ByReference::class)
public interface IEmailStoreNotificationTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger
    {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailStoreNotificationTrigger> {
    public override fun getValue() = ABI.makeIEmailStoreNotificationTrigger(pointer.getPointer(0))

    public fun setValue(value: IEmailStoreNotificationTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailStoreNotificationTrigger, IBackgroundTrigger.WithDefault {
    public val __670701335_Ptr: Pointer?

    public val _670701335_VtblPtr: Pointer?
      get() = __670701335_Ptr?.getPointer(0)
  }

  public class IEmailStoreNotificationTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_670701335_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __670701335_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailStoreNotificationTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("986d06da47eb4268a4f2f3f77188388a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailStoreNotificationTrigger(ptr: Pointer?): WithDefault =
        IEmailStoreNotificationTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailStoreNotificationTrigger {
      val address = segment.toRawLongValue()
      return makeIEmailStoreNotificationTrigger(Pointer(address))
    }

    public override fun toNative(obj: IEmailStoreNotificationTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__670701335_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailStoreNotificationTrigger):
        Array<IEmailStoreNotificationTrigger?> = (elements as
        Array<IEmailStoreNotificationTrigger?>).castToImpl<IEmailStoreNotificationTrigger,IEmailStoreNotificationTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailStoreNotificationTrigger?> =
        arrayOfNulls<IEmailStoreNotificationTrigger_Impl>(size) as
        Array<IEmailStoreNotificationTrigger?>
  }
}
