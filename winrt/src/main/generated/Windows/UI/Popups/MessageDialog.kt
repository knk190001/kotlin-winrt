package Windows.UI.Popups

import Windows.UI.Popups.IMessageDialogFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MessageDialog.ABI::class)
@Signature("rc(Windows.UI.Popups.MessageDialog;{33f59b01-5325-43ab-9ab3-bdae440e4121})")
@WinRTByReference(brClass = MessageDialog.ByReference::class)
public class MessageDialog(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMessageDialog.WithDefault, IWinRTObject {
  private val __1900260380_Interface: IMessageDialog.WithDefault by lazy {
    as_1900260380()
  }


  public override val __1900260380_Ptr: JNAPointer? by lazy {
    __1900260380_Interface.__1900260380_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1900260380_Interface)

  public constructor(content: String) : this(ABI.activate(content))

  public constructor(content: String, title: String) : this(ABI.activate(content, title))

  private fun as_1900260380(): IMessageDialog.WithDefault {
    if(pointer == NULL) {
      return(IMessageDialog.ABI.makeIMessageDialog(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMessageDialog>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMessageDialog.ABI.makeIMessageDialog(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MessageDialog>
      {
    public override fun getValue() = MessageDialog(pointer.getPointer(0))

    public fun setValue(value: MessageDialog): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MessageDialog, MemoryAddress> {
    public val IMessageDialogFactory_Instance: IMessageDialogFactory by lazy {
      createIMessageDialogFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMessageDialogFactory(): IMessageDialogFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Popups.MessageDialog".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMessageDialogFactory.ABI.makeIMessageDialogFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: String): JNAPointer? =
        IMessageDialogFactory_Instance.Create(content)?.pointer

    public fun activate(content: String, title: String): JNAPointer? =
        IMessageDialogFactory_Instance.CreateWithTitle(content, title)?.pointer

    public override fun fromNative(segment: MemoryAddress): MessageDialog {
      val address = segment.toRawLongValue()
      return MessageDialog(Pointer(address))
    }

    public override fun toNative(obj: MessageDialog): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
