package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ISwipeControlFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SwipeControl.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.SwipeControl;{337800fe-f51d-5f6b-9d35-e7f5de10a97c})")
@WinRTByReference(brClass = SwipeControl.ByReference::class)
public open class SwipeControl(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), ISwipeControl.WithDefault, IWinRTObject {
  private val __197747722_Interface: ISwipeControl.WithDefault by lazy {
    as_197747722()
  }


  public override val __197747722_Ptr: JNAPointer? by lazy {
    __197747722_Interface.__197747722_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__197747722_Interface)

  public constructor() : this(ABI.activate())

  private fun as_197747722(): ISwipeControl.WithDefault {
    if(pointer == NULL) {
      return(ISwipeControl.ABI.makeISwipeControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISwipeControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISwipeControl.ABI.makeISwipeControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SwipeControl> {
    public override fun getValue() = SwipeControl(pointer.getPointer(0))

    public fun setValue(value: SwipeControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SwipeControl, MemoryAddress> {
    public val ISwipeControlStatics_Instance: ISwipeControlStatics by lazy {
      createISwipeControlStatics()
    }


    public val ISwipeControlFactory_Instance: ISwipeControlFactory by lazy {
      createISwipeControlFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISwipeControlStatics(): ISwipeControlStatics {
      val refiid = Guid.REFIID(ISwipeControlStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SwipeControl".toHandle(),refiid,interfacePtr)
      val result = ISwipeControlStatics.ABI.makeISwipeControlStatics(interfacePtr.value)
      return result
    }

    public fun createISwipeControlFactory(): ISwipeControlFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SwipeControl".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISwipeControlFactory.ABI.makeISwipeControlFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ISwipeControlFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SwipeControl {
      val address = segment.toRawLongValue()
      return SwipeControl(Pointer(address))
    }

    public override fun toNative(obj: SwipeControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LeftItemsProperty() = ABI.ISwipeControlStatics_Instance.get_LeftItemsProperty()

    public fun get_RightItemsProperty() = ABI.ISwipeControlStatics_Instance.get_RightItemsProperty()

    public fun get_TopItemsProperty() = ABI.ISwipeControlStatics_Instance.get_TopItemsProperty()

    public fun get_BottomItemsProperty() =
        ABI.ISwipeControlStatics_Instance.get_BottomItemsProperty()
  }
}
