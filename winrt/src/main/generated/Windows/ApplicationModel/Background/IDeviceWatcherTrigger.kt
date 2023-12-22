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

@ABIMarker(IDeviceWatcherTrigger.ABI::class)
@Signature("{a4617fdd-8573-4260-befc-5bec89cb693d}")
@Guid("a4617fdd85734260befc5bec89cb693d")
@WinRTInterface("a4617fdd85734260befc5bec89cb693d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceWatcherTrigger.ByReference::class)
public interface IDeviceWatcherTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceWatcherTrigger> {
    public override fun getValue() = ABI.makeIDeviceWatcherTrigger(pointer.getPointer(0))

    public fun setValue(value: IDeviceWatcherTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceWatcherTrigger, IBackgroundTrigger.WithDefault {
    public val __6330429_Ptr: Pointer?

    public val _6330429_VtblPtr: Pointer?
      get() = __6330429_Ptr?.getPointer(0)
  }

  public class IDeviceWatcherTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_6330429_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __6330429_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceWatcherTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4617fdd85734260befc5bec89cb693d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceWatcherTrigger(ptr: Pointer?): WithDefault =
        IDeviceWatcherTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceWatcherTrigger {
      val address = segment.toRawLongValue()
      return makeIDeviceWatcherTrigger(Pointer(address))
    }

    public override fun toNative(obj: IDeviceWatcherTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__6330429_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceWatcherTrigger): Array<IDeviceWatcherTrigger?> =
        (elements as
        Array<IDeviceWatcherTrigger?>).castToImpl<IDeviceWatcherTrigger,IDeviceWatcherTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceWatcherTrigger?> =
        arrayOfNulls<IDeviceWatcherTrigger_Impl>(size) as Array<IDeviceWatcherTrigger?>
  }
}
