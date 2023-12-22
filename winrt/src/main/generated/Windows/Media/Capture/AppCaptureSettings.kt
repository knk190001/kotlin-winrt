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

@ABIMarker(AppCaptureSettings.ABI::class)
@Signature("rc(Windows.Media.Capture.AppCaptureSettings;{14683a86-8807-48d3-883a-970ee4532a39})")
@WinRTByReference(brClass = AppCaptureSettings.ByReference::class)
public class AppCaptureSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppCaptureSettings.WithDefault, IAppCaptureSettings2.WithDefault,
    IAppCaptureSettings3.WithDefault, IAppCaptureSettings4.WithDefault,
    IAppCaptureSettings5.WithDefault, IWinRTObject {
  private val __600377600_Interface: IAppCaptureSettings.WithDefault by lazy {
    as_600377600()
  }


  private val __1431836366_Interface: IAppCaptureSettings2.WithDefault by lazy {
    as_1431836366()
  }


  private val __1431836365_Interface: IAppCaptureSettings3.WithDefault by lazy {
    as_1431836365()
  }


  private val __1431836364_Interface: IAppCaptureSettings4.WithDefault by lazy {
    as_1431836364()
  }


  private val __1431836363_Interface: IAppCaptureSettings5.WithDefault by lazy {
    as_1431836363()
  }


  public override val __600377600_Ptr: JNAPointer? by lazy {
    __600377600_Interface.__600377600_Ptr
  }


  public override val __1431836366_Ptr: JNAPointer? by lazy {
    __1431836366_Interface.__1431836366_Ptr
  }


  public override val __1431836365_Ptr: JNAPointer? by lazy {
    __1431836365_Interface.__1431836365_Ptr
  }


  public override val __1431836364_Ptr: JNAPointer? by lazy {
    __1431836364_Interface.__1431836364_Ptr
  }


  public override val __1431836363_Ptr: JNAPointer? by lazy {
    __1431836363_Interface.__1431836363_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__600377600_Interface, __1431836366_Interface, __1431836365_Interface,
        __1431836364_Interface, __1431836363_Interface)

  private fun as_600377600(): IAppCaptureSettings.WithDefault {
    if(pointer == NULL) {
      return(IAppCaptureSettings.ABI.makeIAppCaptureSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCaptureSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCaptureSettings.ABI.makeIAppCaptureSettings(ref.value))
  }

  private fun as_1431836366(): IAppCaptureSettings2.WithDefault {
    if(pointer == NULL) {
      return(IAppCaptureSettings2.ABI.makeIAppCaptureSettings2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCaptureSettings2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCaptureSettings2.ABI.makeIAppCaptureSettings2(ref.value))
  }

  private fun as_1431836365(): IAppCaptureSettings3.WithDefault {
    if(pointer == NULL) {
      return(IAppCaptureSettings3.ABI.makeIAppCaptureSettings3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCaptureSettings3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCaptureSettings3.ABI.makeIAppCaptureSettings3(ref.value))
  }

  private fun as_1431836364(): IAppCaptureSettings4.WithDefault {
    if(pointer == NULL) {
      return(IAppCaptureSettings4.ABI.makeIAppCaptureSettings4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCaptureSettings4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCaptureSettings4.ABI.makeIAppCaptureSettings4(ref.value))
  }

  private fun as_1431836363(): IAppCaptureSettings5.WithDefault {
    if(pointer == NULL) {
      return(IAppCaptureSettings5.ABI.makeIAppCaptureSettings5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppCaptureSettings5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppCaptureSettings5.ABI.makeIAppCaptureSettings5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppCaptureSettings> {
    public override fun getValue() = AppCaptureSettings(pointer.getPointer(0))

    public fun setValue(value: AppCaptureSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppCaptureSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppCaptureSettings {
      val address = segment.toRawLongValue()
      return AppCaptureSettings(Pointer(address))
    }

    public override fun toNative(obj: AppCaptureSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
