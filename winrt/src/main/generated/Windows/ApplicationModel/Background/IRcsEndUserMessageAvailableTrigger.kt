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

@ABIMarker(IRcsEndUserMessageAvailableTrigger.ABI::class)
@Signature("{986d0d6a-b2f6-467f-a978-a44091c11a66}")
@Guid("986d0d6ab2f6467fa978a44091c11a66")
@WinRTInterface("986d0d6ab2f6467fa978a44091c11a66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRcsEndUserMessageAvailableTrigger.ByReference::class)
public interface IRcsEndUserMessageAvailableTrigger : NativeMapped, IWinRTInterface,
    IBackgroundTrigger {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRcsEndUserMessageAvailableTrigger> {
    public override fun getValue() =
        ABI.makeIRcsEndUserMessageAvailableTrigger(pointer.getPointer(0))

    public fun setValue(value: IRcsEndUserMessageAvailableTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRcsEndUserMessageAvailableTrigger, IBackgroundTrigger.WithDefault
      {
    public val __2074762271_Ptr: Pointer?

    public val _2074762271_VtblPtr: Pointer?
      get() = __2074762271_Ptr?.getPointer(0)
  }

  public class IRcsEndUserMessageAvailableTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2074762271_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2074762271_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRcsEndUserMessageAvailableTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("986d0d6ab2f6467fa978a44091c11a66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRcsEndUserMessageAvailableTrigger(ptr: Pointer?): WithDefault =
        IRcsEndUserMessageAvailableTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRcsEndUserMessageAvailableTrigger {
      val address = segment.toRawLongValue()
      return makeIRcsEndUserMessageAvailableTrigger(Pointer(address))
    }

    public override fun toNative(obj: IRcsEndUserMessageAvailableTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2074762271_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRcsEndUserMessageAvailableTrigger):
        Array<IRcsEndUserMessageAvailableTrigger?> = (elements as
        Array<IRcsEndUserMessageAvailableTrigger?>).castToImpl<IRcsEndUserMessageAvailableTrigger,IRcsEndUserMessageAvailableTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRcsEndUserMessageAvailableTrigger?> =
        arrayOfNulls<IRcsEndUserMessageAvailableTrigger_Impl>(size) as
        Array<IRcsEndUserMessageAvailableTrigger?>
  }
}
