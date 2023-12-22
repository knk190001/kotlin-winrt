package Windows.Media.Capture

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppCaptureAlternateShortcutKeys.ABI::class)
@Signature("rc(Windows.Media.Capture.AppCaptureAlternateShortcutKeys;{19e8e0ef-236c-40f9-b38f-9b7dd65d1ccc})")
@WinRTByReference(brClass = AppCaptureAlternateShortcutKeys.ByReference::class)
public class AppCaptureAlternateShortcutKeys(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppCaptureAlternateShortcutKeys.WithDefault,
    IAppCaptureAlternateShortcutKeys2.WithDefault, IAppCaptureAlternateShortcutKeys3.WithDefault,
    IWinRTObject {
  private val __279358775_Interface: IAppCaptureAlternateShortcutKeys.WithDefault by lazy {
    as_279358775()
  }


  private val __70187483_Interface: IAppCaptureAlternateShortcutKeys2.WithDefault by lazy {
    as_70187483()
  }


  private val __70187484_Interface: IAppCaptureAlternateShortcutKeys3.WithDefault by lazy {
    as_70187484()
  }


  public override val __279358775_Ptr: JNAPointer? by lazy {
    __279358775_Interface.__279358775_Ptr
  }


  public override val __70187483_Ptr: JNAPointer? by lazy {
    __70187483_Interface.__70187483_Ptr
  }


  public override val __70187484_Ptr: JNAPointer? by lazy {
    __70187484_Interface.__70187484_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__279358775_Interface, __70187483_Interface, __70187484_Interface)

  private fun as_279358775(): IAppCaptureAlternateShortcutKeys.WithDefault {
    if(pointer == NULL) {
      return(IAppCaptureAlternateShortcutKeys.ABI.makeIAppCaptureAlternateShortcutKeys(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCaptureAlternateShortcutKeys>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCaptureAlternateShortcutKeys.ABI.makeIAppCaptureAlternateShortcutKeys(ref.value))
  }

  private fun as_70187483(): IAppCaptureAlternateShortcutKeys2.WithDefault {
    if(pointer == NULL) {
      return(IAppCaptureAlternateShortcutKeys2.ABI.makeIAppCaptureAlternateShortcutKeys2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCaptureAlternateShortcutKeys2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCaptureAlternateShortcutKeys2.ABI.makeIAppCaptureAlternateShortcutKeys2(ref.value))
  }

  private fun as_70187484(): IAppCaptureAlternateShortcutKeys3.WithDefault {
    if(pointer == NULL) {
      return(IAppCaptureAlternateShortcutKeys3.ABI.makeIAppCaptureAlternateShortcutKeys3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCaptureAlternateShortcutKeys3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCaptureAlternateShortcutKeys3.ABI.makeIAppCaptureAlternateShortcutKeys3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppCaptureAlternateShortcutKeys> {
    public override fun getValue() = AppCaptureAlternateShortcutKeys(pointer.getPointer(0))

    public fun setValue(value: AppCaptureAlternateShortcutKeys): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppCaptureAlternateShortcutKeys, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppCaptureAlternateShortcutKeys {
      val address = segment.toRawLongValue()
      return AppCaptureAlternateShortcutKeys(Pointer(address))
    }

    public override fun toNative(obj: AppCaptureAlternateShortcutKeys): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
