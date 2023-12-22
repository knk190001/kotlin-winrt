package Microsoft.Windows.Widgets.Providers

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

@ABIMarker(WidgetManager.ABI::class)
@Signature("rc(Microsoft.Windows.Widgets.Providers.WidgetManager;{71cb10c0-671e-48e3-b995-207940397123})")
@WinRTByReference(brClass = WidgetManager.ByReference::class)
public class WidgetManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWidgetManager.WithDefault, IWinRTObject {
  private val __629259016_Interface: IWidgetManager.WithDefault by lazy {
    as_629259016()
  }


  public override val __629259016_Ptr: JNAPointer? by lazy {
    __629259016_Interface.__629259016_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__629259016_Interface)

  private fun as_629259016(): IWidgetManager.WithDefault {
    if(pointer == NULL) {
      return(IWidgetManager.ABI.makeIWidgetManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWidgetManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWidgetManager.ABI.makeIWidgetManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WidgetManager>
      {
    public override fun getValue() = WidgetManager(pointer.getPointer(0))

    public fun setValue(value: WidgetManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WidgetManager, MemoryAddress> {
    public val IWidgetManagerStatics_Instance: IWidgetManagerStatics by lazy {
      createIWidgetManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWidgetManagerStatics(): IWidgetManagerStatics {
      val refiid = Guid.REFIID(IWidgetManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.Widgets.Providers.WidgetManager".toHandle(),refiid,interfacePtr)
      val result = IWidgetManagerStatics.ABI.makeIWidgetManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WidgetManager {
      val address = segment.toRawLongValue()
      return WidgetManager(Pointer(address))
    }

    public override fun toNative(obj: WidgetManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IWidgetManagerStatics_Instance.GetDefault()
  }
}
