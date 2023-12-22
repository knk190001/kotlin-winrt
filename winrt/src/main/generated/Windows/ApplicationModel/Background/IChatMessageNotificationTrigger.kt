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

@ABIMarker(IChatMessageNotificationTrigger.ABI::class)
@Signature("{513b43bf-1d40-5c5d-78f5-c923fee3739e}")
@Guid("513b43bf1d405c5d78f5c923fee3739e")
@WinRTInterface("513b43bf1d405c5d78f5c923fee3739e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageNotificationTrigger.ByReference::class)
public interface IChatMessageNotificationTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger
    {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageNotificationTrigger> {
    public override fun getValue() = ABI.makeIChatMessageNotificationTrigger(pointer.getPointer(0))

    public fun setValue(value: IChatMessageNotificationTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageNotificationTrigger, IBackgroundTrigger.WithDefault {
    public val __1426852241_Ptr: Pointer?

    public val _1426852241_VtblPtr: Pointer?
      get() = __1426852241_Ptr?.getPointer(0)
  }

  public class IChatMessageNotificationTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1426852241_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1426852241_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageNotificationTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("513b43bf1d405c5d78f5c923fee3739e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageNotificationTrigger(ptr: Pointer?): WithDefault =
        IChatMessageNotificationTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageNotificationTrigger {
      val address = segment.toRawLongValue()
      return makeIChatMessageNotificationTrigger(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageNotificationTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1426852241_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageNotificationTrigger):
        Array<IChatMessageNotificationTrigger?> = (elements as
        Array<IChatMessageNotificationTrigger?>).castToImpl<IChatMessageNotificationTrigger,IChatMessageNotificationTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageNotificationTrigger?> =
        arrayOfNulls<IChatMessageNotificationTrigger_Impl>(size) as
        Array<IChatMessageNotificationTrigger?>
  }
}
