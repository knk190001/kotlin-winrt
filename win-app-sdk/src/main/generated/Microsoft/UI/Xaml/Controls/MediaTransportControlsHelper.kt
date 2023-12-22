package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.IReference
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaTransportControlsHelper.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.MediaTransportControlsHelper;{89d393ba-0e04-5e24-b456-ab05429591e4})")
@WinRTByReference(brClass = MediaTransportControlsHelper.ByReference::class)
public class MediaTransportControlsHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaTransportControlsHelper.WithDefault, IWinRTObject {
  private val __756555344_Interface: IMediaTransportControlsHelper.WithDefault by lazy {
    as_756555344()
  }


  public override val __756555344_Ptr: JNAPointer? by lazy {
    __756555344_Interface.__756555344_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__756555344_Interface)

  private fun as_756555344(): IMediaTransportControlsHelper.WithDefault {
    if(pointer == NULL) {
      return(IMediaTransportControlsHelper.ABI.makeIMediaTransportControlsHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTransportControlsHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTransportControlsHelper.ABI.makeIMediaTransportControlsHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaTransportControlsHelper> {
    public override fun getValue() = MediaTransportControlsHelper(pointer.getPointer(0))

    public fun setValue(value: MediaTransportControlsHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaTransportControlsHelper, MemoryAddress> {
    public val IMediaTransportControlsHelperStatics_Instance: IMediaTransportControlsHelperStatics
        by lazy {
      createIMediaTransportControlsHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaTransportControlsHelperStatics(): IMediaTransportControlsHelperStatics {
      val refiid = Guid.REFIID(IMediaTransportControlsHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.MediaTransportControlsHelper".toHandle(),refiid,interfacePtr)
      val result =
          IMediaTransportControlsHelperStatics.ABI.makeIMediaTransportControlsHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MediaTransportControlsHelper {
      val address = segment.toRawLongValue()
      return MediaTransportControlsHelper(Pointer(address))
    }

    public override fun toNative(obj: MediaTransportControlsHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DropoutOrderProperty() =
        ABI.IMediaTransportControlsHelperStatics_Instance.get_DropoutOrderProperty()

    public fun GetDropoutOrder(element: UIElement) =
        ABI.IMediaTransportControlsHelperStatics_Instance.GetDropoutOrder(element)

    public fun SetDropoutOrder(element: UIElement, value: IReference<Int>) =
        ABI.IMediaTransportControlsHelperStatics_Instance.SetDropoutOrder(element, value)
  }
}
