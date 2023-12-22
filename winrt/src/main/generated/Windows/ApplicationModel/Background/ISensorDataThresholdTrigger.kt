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

@ABIMarker(ISensorDataThresholdTrigger.ABI::class)
@Signature("{5bc0f372-d48b-4b7f-abec-15f9bacc12e2}")
@Guid("5bc0f372d48b4b7fabec15f9bacc12e2")
@WinRTInterface("5bc0f372d48b4b7fabec15f9bacc12e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISensorDataThresholdTrigger.ByReference::class)
public interface ISensorDataThresholdTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISensorDataThresholdTrigger> {
    public override fun getValue() = ABI.makeISensorDataThresholdTrigger(pointer.getPointer(0))

    public fun setValue(value: ISensorDataThresholdTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISensorDataThresholdTrigger, IBackgroundTrigger.WithDefault {
    public val __668638242_Ptr: Pointer?

    public val _668638242_VtblPtr: Pointer?
      get() = __668638242_Ptr?.getPointer(0)
  }

  public class ISensorDataThresholdTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_668638242_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __668638242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISensorDataThresholdTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bc0f372d48b4b7fabec15f9bacc12e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISensorDataThresholdTrigger(ptr: Pointer?): WithDefault =
        ISensorDataThresholdTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISensorDataThresholdTrigger {
      val address = segment.toRawLongValue()
      return makeISensorDataThresholdTrigger(Pointer(address))
    }

    public override fun toNative(obj: ISensorDataThresholdTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__668638242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISensorDataThresholdTrigger):
        Array<ISensorDataThresholdTrigger?> = (elements as
        Array<ISensorDataThresholdTrigger?>).castToImpl<ISensorDataThresholdTrigger,ISensorDataThresholdTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISensorDataThresholdTrigger?> =
        arrayOfNulls<ISensorDataThresholdTrigger_Impl>(size) as Array<ISensorDataThresholdTrigger?>
  }
}
