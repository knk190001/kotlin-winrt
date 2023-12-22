package Microsoft.UI.Windowing

import Microsoft.UI.DisplayId
import Microsoft.UI.WindowId
import Windows.Graphics.PointInt32
import Windows.Graphics.RectInt32
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(DisplayArea.ABI::class)
@Signature("rc(Microsoft.UI.Windowing.DisplayArea;{5c7e0537-b621-5579-bcae-a84aa8746167})")
@WinRTByReference(brClass = DisplayArea.ByReference::class)
public class DisplayArea(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayArea.WithDefault, IWinRTObject {
  private val __853279618_Interface: IDisplayArea.WithDefault by lazy {
    as_853279618()
  }


  public override val __853279618_Ptr: JNAPointer? by lazy {
    __853279618_Interface.__853279618_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__853279618_Interface)

  private fun as_853279618(): IDisplayArea.WithDefault {
    if(pointer == NULL) {
      return(IDisplayArea.ABI.makeIDisplayArea(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayArea>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayArea.ABI.makeIDisplayArea(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplayArea> {
    public override fun getValue() = DisplayArea(pointer.getPointer(0))

    public fun setValue(value: DisplayArea): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayArea, MemoryAddress> {
    public val IDisplayAreaStatics_Instance: IDisplayAreaStatics by lazy {
      createIDisplayAreaStatics()
    }


    public val IDisplayAreaStatics3_Instance: IDisplayAreaStatics3 by lazy {
      createIDisplayAreaStatics3()
    }


    public val IDisplayAreaStatics2_Instance: IDisplayAreaStatics2 by lazy {
      createIDisplayAreaStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDisplayAreaStatics(): IDisplayAreaStatics {
      val refiid = Guid.REFIID(IDisplayAreaStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Windowing.DisplayArea".toHandle(),refiid,interfacePtr)
      val result = IDisplayAreaStatics.ABI.makeIDisplayAreaStatics(interfacePtr.value)
      return result
    }

    public fun createIDisplayAreaStatics3(): IDisplayAreaStatics3 {
      val refiid = Guid.REFIID(IDisplayAreaStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Windowing.DisplayArea".toHandle(),refiid,interfacePtr)
      val result = IDisplayAreaStatics3.ABI.makeIDisplayAreaStatics3(interfacePtr.value)
      return result
    }

    public fun createIDisplayAreaStatics2(): IDisplayAreaStatics2 {
      val refiid = Guid.REFIID(IDisplayAreaStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Windowing.DisplayArea".toHandle(),refiid,interfacePtr)
      val result = IDisplayAreaStatics2.ABI.makeIDisplayAreaStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DisplayArea {
      val address = segment.toRawLongValue()
      return DisplayArea(Pointer(address))
    }

    public override fun toNative(obj: DisplayArea): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Primary() = ABI.IDisplayAreaStatics_Instance.get_Primary()

    public fun CreateWatcher() = ABI.IDisplayAreaStatics_Instance.CreateWatcher()

    public fun FindAll() = ABI.IDisplayAreaStatics_Instance.FindAll()

    public fun GetFromWindowId(windowId: WindowId, displayAreaFallback: DisplayAreaFallback) =
        ABI.IDisplayAreaStatics_Instance.GetFromWindowId(windowId, displayAreaFallback)

    public fun GetFromPoint(point: PointInt32, displayAreaFallback: DisplayAreaFallback) =
        ABI.IDisplayAreaStatics_Instance.GetFromPoint(point, displayAreaFallback)

    public fun GetFromRect(rect: RectInt32, displayAreaFallback: DisplayAreaFallback) =
        ABI.IDisplayAreaStatics_Instance.GetFromRect(rect, displayAreaFallback)

    public fun GetMetricsFromWindowId(windowId: WindowId) =
        ABI.IDisplayAreaStatics3_Instance.GetMetricsFromWindowId(windowId)

    public fun GetFromDisplayId(displayId: DisplayId) =
        ABI.IDisplayAreaStatics2_Instance.GetFromDisplayId(displayId)
  }
}
