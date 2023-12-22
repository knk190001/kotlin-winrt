package Windows.ApplicationModel.Background

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundTrigger.ABI::class)
@Signature("{84b3a058-6027-4b87-9790-bdf3f757dbd7}")
@Guid("84b3a05860274b879790bdf3f757dbd7")
@WinRTInterface("84b3a05860274b879790bdf3f757dbd7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTrigger.ByReference::class)
public interface IBackgroundTrigger : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTrigger> {
    public override fun getValue() = ABI.makeIBackgroundTrigger(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTrigger {
    public val __54213927_Ptr: Pointer?

    public val _54213927_VtblPtr: Pointer?
      get() = __54213927_Ptr?.getPointer(0)
  }

  public class IBackgroundTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __54213927_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84b3a05860274b879790bdf3f757dbd7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTrigger(ptr: Pointer?): WithDefault = IBackgroundTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTrigger {
      val address = segment.toRawLongValue()
      return makeIBackgroundTrigger(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__54213927_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTrigger): Array<IBackgroundTrigger?> =
        (elements as
        Array<IBackgroundTrigger?>).castToImpl<IBackgroundTrigger,IBackgroundTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTrigger?> =
        arrayOfNulls<IBackgroundTrigger_Impl>(size) as Array<IBackgroundTrigger?>
  }
}
