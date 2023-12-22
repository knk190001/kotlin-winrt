package Windows.Media.PlayTo

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

@ABIMarker(PlayToManager.ABI::class)
@Signature("rc(Windows.Media.PlayTo.PlayToManager;{f56a206e-1b77-42ef-8f0d-b949f8d9b260})")
@WinRTByReference(brClass = PlayToManager.ByReference::class)
public class PlayToManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayToManager.WithDefault, IWinRTObject {
  private val __258998503_Interface: IPlayToManager.WithDefault by lazy {
    as_258998503()
  }


  public override val __258998503_Ptr: JNAPointer? by lazy {
    __258998503_Interface.__258998503_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__258998503_Interface)

  private fun as_258998503(): IPlayToManager.WithDefault {
    if(pointer == NULL) {
      return(IPlayToManager.ABI.makeIPlayToManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayToManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayToManager.ABI.makeIPlayToManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PlayToManager>
      {
    public override fun getValue() = PlayToManager(pointer.getPointer(0))

    public fun setValue(value: PlayToManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayToManager, MemoryAddress> {
    public val IPlayToManagerStatics_Instance: IPlayToManagerStatics by lazy {
      createIPlayToManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPlayToManagerStatics(): IPlayToManagerStatics {
      val refiid = Guid.REFIID(IPlayToManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.PlayTo.PlayToManager".toHandle(),refiid,interfacePtr)
      val result = IPlayToManagerStatics.ABI.makeIPlayToManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PlayToManager {
      val address = segment.toRawLongValue()
      return PlayToManager(Pointer(address))
    }

    public override fun toNative(obj: PlayToManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.IPlayToManagerStatics_Instance.GetForCurrentView()

    public fun ShowPlayToUI() = ABI.IPlayToManagerStatics_Instance.ShowPlayToUI()
  }
}
