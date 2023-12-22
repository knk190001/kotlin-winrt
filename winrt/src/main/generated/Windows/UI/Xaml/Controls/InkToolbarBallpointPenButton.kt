package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IInkToolbarBallpointPenButtonFactory.ABI.IID
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

@ABIMarker(InkToolbarBallpointPenButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarBallpointPenButton;{158329f8-1e99-3acc-910f-9da2d872ae12})")
@WinRTByReference(brClass = InkToolbarBallpointPenButton.ByReference::class)
public open class InkToolbarBallpointPenButton(
  ptr: JNAPointer? = NULL
) : InkToolbarPenButton(ptr), IInkToolbarBallpointPenButton.WithDefault, IWinRTObject {
  private val __1874142571_Interface: IInkToolbarBallpointPenButton.WithDefault by lazy {
    as_1874142571()
  }


  public override val __1874142571_Ptr: JNAPointer? by lazy {
    __1874142571_Interface.__1874142571_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1874142571_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1874142571(): IInkToolbarBallpointPenButton.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarBallpointPenButton.ABI.makeIInkToolbarBallpointPenButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarBallpointPenButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarBallpointPenButton.ABI.makeIInkToolbarBallpointPenButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarBallpointPenButton> {
    public override fun getValue() = InkToolbarBallpointPenButton(pointer.getPointer(0))

    public fun setValue(value: InkToolbarBallpointPenButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarBallpointPenButton, MemoryAddress> {
    public val IInkToolbarBallpointPenButtonFactory_Instance: IInkToolbarBallpointPenButtonFactory
        by lazy {
      createIInkToolbarBallpointPenButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarBallpointPenButtonFactory(): IInkToolbarBallpointPenButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarBallpointPenButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkToolbarBallpointPenButtonFactory.ABI.makeIInkToolbarBallpointPenButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IInkToolbarBallpointPenButtonFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkToolbarBallpointPenButton {
      val address = segment.toRawLongValue()
      return InkToolbarBallpointPenButton(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarBallpointPenButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
