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

@ABIMarker(ICommunicationBlockingAppSetAsActiveTrigger.ABI::class)
@Signature("{fb91f28a-16a5-486d-974c-7835a8477be2}")
@Guid("fb91f28a16a5486d974c7835a8477be2")
@WinRTInterface("fb91f28a16a5486d974c7835a8477be2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommunicationBlockingAppSetAsActiveTrigger.ByReference::class)
public interface ICommunicationBlockingAppSetAsActiveTrigger : NativeMapped, IWinRTInterface,
    IBackgroundTrigger {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommunicationBlockingAppSetAsActiveTrigger> {
    public override fun getValue() =
        ABI.makeICommunicationBlockingAppSetAsActiveTrigger(pointer.getPointer(0))

    public fun setValue(value: ICommunicationBlockingAppSetAsActiveTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommunicationBlockingAppSetAsActiveTrigger,
      IBackgroundTrigger.WithDefault {
    public val __1830116539_Ptr: Pointer?

    public val _1830116539_VtblPtr: Pointer?
      get() = __1830116539_Ptr?.getPointer(0)
  }

  public class ICommunicationBlockingAppSetAsActiveTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1830116539_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1830116539_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommunicationBlockingAppSetAsActiveTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb91f28a16a5486d974c7835a8477be2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommunicationBlockingAppSetAsActiveTrigger(ptr: Pointer?): WithDefault =
        ICommunicationBlockingAppSetAsActiveTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICommunicationBlockingAppSetAsActiveTrigger {
      val address = segment.toRawLongValue()
      return makeICommunicationBlockingAppSetAsActiveTrigger(Pointer(address))
    }

    public override fun toNative(obj: ICommunicationBlockingAppSetAsActiveTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1830116539_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommunicationBlockingAppSetAsActiveTrigger):
        Array<ICommunicationBlockingAppSetAsActiveTrigger?> = (elements as
        Array<ICommunicationBlockingAppSetAsActiveTrigger?>).castToImpl<ICommunicationBlockingAppSetAsActiveTrigger,ICommunicationBlockingAppSetAsActiveTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommunicationBlockingAppSetAsActiveTrigger?> =
        arrayOfNulls<ICommunicationBlockingAppSetAsActiveTrigger_Impl>(size) as
        Array<ICommunicationBlockingAppSetAsActiveTrigger?>
  }
}
