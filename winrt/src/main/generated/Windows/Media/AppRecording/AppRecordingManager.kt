package Windows.Media.AppRecording

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(AppRecordingManager.ABI::class)
@Signature("rc(Windows.Media.AppRecording.AppRecordingManager;{e7e26076-a044-48e2-a512-3094d574c7cc})")
@WinRTByReference(brClass = AppRecordingManager.ByReference::class)
public class AppRecordingManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppRecordingManager.WithDefault, IWinRTObject {
  private val __1210258055_Interface: IAppRecordingManager.WithDefault by lazy {
    as_1210258055()
  }


  public override val __1210258055_Ptr: JNAPointer? by lazy {
    __1210258055_Interface.__1210258055_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1210258055_Interface)

  private fun as_1210258055(): IAppRecordingManager.WithDefault {
    if(pointer == NULL) {
      return(IAppRecordingManager.ABI.makeIAppRecordingManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppRecordingManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppRecordingManager.ABI.makeIAppRecordingManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppRecordingManager> {
    public override fun getValue() = AppRecordingManager(pointer.getPointer(0))

    public fun setValue(value: AppRecordingManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppRecordingManager, MemoryAddress> {
    public val IAppRecordingManagerStatics_Instance: IAppRecordingManagerStatics by lazy {
      createIAppRecordingManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppRecordingManagerStatics(): IAppRecordingManagerStatics {
      val refiid = Guid.REFIID(IAppRecordingManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.AppRecording.AppRecordingManager".toHandle(),refiid,interfacePtr)
      val result =
          IAppRecordingManagerStatics.ABI.makeIAppRecordingManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppRecordingManager {
      val address = segment.toRawLongValue()
      return AppRecordingManager(Pointer(address))
    }

    public override fun toNative(obj: AppRecordingManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IAppRecordingManagerStatics_Instance.GetDefault()
  }
}
