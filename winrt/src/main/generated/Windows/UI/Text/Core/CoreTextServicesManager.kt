package Windows.UI.Text.Core

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

@ABIMarker(CoreTextServicesManager.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextServicesManager;{c2507d83-6e0a-4a8a-bdf8-1948874854ba})")
@WinRTByReference(brClass = CoreTextServicesManager.ByReference::class)
public class CoreTextServicesManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextServicesManager.WithDefault, IWinRTObject {
  private val __460636011_Interface: ICoreTextServicesManager.WithDefault by lazy {
    as_460636011()
  }


  public override val __460636011_Ptr: JNAPointer? by lazy {
    __460636011_Interface.__460636011_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__460636011_Interface)

  private fun as_460636011(): ICoreTextServicesManager.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextServicesManager.ABI.makeICoreTextServicesManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextServicesManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextServicesManager.ABI.makeICoreTextServicesManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextServicesManager> {
    public override fun getValue() = CoreTextServicesManager(pointer.getPointer(0))

    public fun setValue(value: CoreTextServicesManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextServicesManager, MemoryAddress> {
    public val ICoreTextServicesManagerStatics_Instance: ICoreTextServicesManagerStatics by lazy {
      createICoreTextServicesManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreTextServicesManagerStatics(): ICoreTextServicesManagerStatics {
      val refiid = Guid.REFIID(ICoreTextServicesManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Text.Core.CoreTextServicesManager".toHandle(),refiid,interfacePtr)
      val result =
          ICoreTextServicesManagerStatics.ABI.makeICoreTextServicesManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreTextServicesManager {
      val address = segment.toRawLongValue()
      return CoreTextServicesManager(Pointer(address))
    }

    public override fun toNative(obj: CoreTextServicesManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() =
        ABI.ICoreTextServicesManagerStatics_Instance.GetForCurrentView()
  }
}
