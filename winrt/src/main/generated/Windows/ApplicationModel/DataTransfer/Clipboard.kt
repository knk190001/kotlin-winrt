package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(Clipboard.ABI::class)
@WinRTByReference(brClass = Clipboard.ByReference::class)
public class Clipboard(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Clipboard> {
    public override fun getValue() = Clipboard(pointer.getPointer(0))

    public fun setValue(value: Clipboard): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Clipboard, MemoryAddress> {
    public val IClipboardStatics_Instance: IClipboardStatics by lazy {
      createIClipboardStatics()
    }


    public val IClipboardStatics2_Instance: IClipboardStatics2 by lazy {
      createIClipboardStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIClipboardStatics(): IClipboardStatics {
      val refiid = Guid.REFIID(IClipboardStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.Clipboard".toHandle(),refiid,interfacePtr)
      val result = IClipboardStatics.ABI.makeIClipboardStatics(interfacePtr.value)
      return result
    }

    public fun createIClipboardStatics2(): IClipboardStatics2 {
      val refiid = Guid.REFIID(IClipboardStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.Clipboard".toHandle(),refiid,interfacePtr)
      val result = IClipboardStatics2.ABI.makeIClipboardStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Clipboard {
      val address = segment.toRawLongValue()
      return Clipboard(Pointer(address))
    }

    public override fun toNative(obj: Clipboard): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetContent() = ABI.IClipboardStatics_Instance.GetContent()

    public fun SetContent(content: DataPackage) = ABI.IClipboardStatics_Instance.SetContent(content)

    public fun Flush() = ABI.IClipboardStatics_Instance.Flush()

    public fun Clear() = ABI.IClipboardStatics_Instance.Clear()

    public fun add_ContentChanged(handler: EventHandler<IUnknown?>) =
        ABI.IClipboardStatics_Instance.add_ContentChanged(handler)

    public fun remove_ContentChanged(token: EventRegistrationToken) =
        ABI.IClipboardStatics_Instance.remove_ContentChanged(token)

    public fun GetHistoryItemsAsync() = ABI.IClipboardStatics2_Instance.GetHistoryItemsAsync()

    public fun ClearHistory() = ABI.IClipboardStatics2_Instance.ClearHistory()

    public fun DeleteItemFromHistory(item: ClipboardHistoryItem) =
        ABI.IClipboardStatics2_Instance.DeleteItemFromHistory(item)

    public fun SetHistoryItemAsContent(item: ClipboardHistoryItem) =
        ABI.IClipboardStatics2_Instance.SetHistoryItemAsContent(item)

    public fun IsHistoryEnabled() = ABI.IClipboardStatics2_Instance.IsHistoryEnabled()

    public fun IsRoamingEnabled() = ABI.IClipboardStatics2_Instance.IsRoamingEnabled()

    public fun SetContentWithOptions(content: DataPackage, options: ClipboardContentOptions) =
        ABI.IClipboardStatics2_Instance.SetContentWithOptions(content, options)

    public fun add_HistoryChanged(handler: EventHandler<ClipboardHistoryChangedEventArgs?>) =
        ABI.IClipboardStatics2_Instance.add_HistoryChanged(handler)

    public fun remove_HistoryChanged(token: EventRegistrationToken) =
        ABI.IClipboardStatics2_Instance.remove_HistoryChanged(token)

    public fun add_RoamingEnabledChanged(handler: EventHandler<IUnknown?>) =
        ABI.IClipboardStatics2_Instance.add_RoamingEnabledChanged(handler)

    public fun remove_RoamingEnabledChanged(token: EventRegistrationToken) =
        ABI.IClipboardStatics2_Instance.remove_RoamingEnabledChanged(token)

    public fun add_HistoryEnabledChanged(handler: EventHandler<IUnknown?>) =
        ABI.IClipboardStatics2_Instance.add_HistoryEnabledChanged(handler)

    public fun remove_HistoryEnabledChanged(token: EventRegistrationToken) =
        ABI.IClipboardStatics2_Instance.remove_HistoryEnabledChanged(token)
  }
}
