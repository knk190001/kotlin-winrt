package Windows.UI.Popups

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(PopupMenu.ABI::class)
@Signature("rc(Windows.UI.Popups.PopupMenu;{4e9bc6dc-880d-47fc-a0a1-72b639e62559})")
@WinRTByReference(brClass = PopupMenu.ByReference::class)
public class PopupMenu(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPopupMenu.WithDefault, IWinRTObject {
  private val __839784808_Interface: IPopupMenu.WithDefault by lazy {
    as_839784808()
  }


  public override val __839784808_Ptr: JNAPointer? by lazy {
    __839784808_Interface.__839784808_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__839784808_Interface)

  public constructor() : this(ABI.activate())

  private fun as_839784808(): IPopupMenu.WithDefault {
    if(pointer == NULL) {
      return(IPopupMenu.ABI.makeIPopupMenu(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPopupMenu>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPopupMenu.ABI.makeIPopupMenu(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PopupMenu> {
    public override fun getValue() = PopupMenu(pointer.getPointer(0))

    public fun setValue(value: PopupMenu): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PopupMenu, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Popups.PopupMenu".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): PopupMenu {
      val address = segment.toRawLongValue()
      return PopupMenu(Pointer(address))
    }

    public override fun toNative(obj: PopupMenu): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
