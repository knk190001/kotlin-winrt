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

@ABIMarker(UICommandSeparator.ABI::class)
@Signature("rc(Windows.UI.Popups.UICommandSeparator;{4ff93a75-4145-47ff-ac7f-dff1c1fa5b0f})")
@WinRTByReference(brClass = UICommandSeparator.ByReference::class)
public class UICommandSeparator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUICommand.WithDefault, IWinRTObject {
  private val __250994524_Interface: IUICommand.WithDefault by lazy {
    as_250994524()
  }


  public override val __250994524_Ptr: JNAPointer? by lazy {
    __250994524_Interface.__250994524_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__250994524_Interface)

  public constructor() : this(ABI.activate())

  private fun as_250994524(): IUICommand.WithDefault {
    if(pointer == NULL) {
      return(IUICommand.ABI.makeIUICommand(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUICommand>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUICommand.ABI.makeIUICommand(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UICommandSeparator> {
    public override fun getValue() = UICommandSeparator(pointer.getPointer(0))

    public fun setValue(value: UICommandSeparator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UICommandSeparator, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Popups.UICommandSeparator".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): UICommandSeparator {
      val address = segment.toRawLongValue()
      return UICommandSeparator(Pointer(address))
    }

    public override fun toNative(obj: UICommandSeparator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
