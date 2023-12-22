package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ChoosingGroupHeaderContainerEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ChoosingGroupHeaderContainerEventArgs;{2db1b0b0-aee9-55fa-8c30-c98f00643d00})")
@WinRTByReference(brClass = ChoosingGroupHeaderContainerEventArgs.ByReference::class)
public class ChoosingGroupHeaderContainerEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChoosingGroupHeaderContainerEventArgs.WithDefault, IWinRTObject {
  private val __495424519_Interface: IChoosingGroupHeaderContainerEventArgs.WithDefault by lazy {
    as_495424519()
  }


  public override val __495424519_Ptr: JNAPointer? by lazy {
    __495424519_Interface.__495424519_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__495424519_Interface)

  public constructor() : this(ABI.activate())

  private fun as_495424519(): IChoosingGroupHeaderContainerEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IChoosingGroupHeaderContainerEventArgs.ABI.makeIChoosingGroupHeaderContainerEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChoosingGroupHeaderContainerEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChoosingGroupHeaderContainerEventArgs.ABI.makeIChoosingGroupHeaderContainerEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChoosingGroupHeaderContainerEventArgs> {
    public override fun getValue() = ChoosingGroupHeaderContainerEventArgs(pointer.getPointer(0))

    public fun setValue(value: ChoosingGroupHeaderContainerEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChoosingGroupHeaderContainerEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ChoosingGroupHeaderContainerEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ChoosingGroupHeaderContainerEventArgs {
      val address = segment.toRawLongValue()
      return ChoosingGroupHeaderContainerEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ChoosingGroupHeaderContainerEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
