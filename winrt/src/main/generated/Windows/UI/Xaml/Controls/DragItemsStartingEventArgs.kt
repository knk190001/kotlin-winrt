package Windows.UI.Xaml.Controls

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

@ABIMarker(DragItemsStartingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.DragItemsStartingEventArgs;{71cf215c-daed-4783-aa11-dc574d2713e9})")
@WinRTByReference(brClass = DragItemsStartingEventArgs.ByReference::class)
public class DragItemsStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDragItemsStartingEventArgs.WithDefault, IWinRTObject {
  private val __228302279_Interface: IDragItemsStartingEventArgs.WithDefault by lazy {
    as_228302279()
  }


  public override val __228302279_Ptr: JNAPointer? by lazy {
    __228302279_Interface.__228302279_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__228302279_Interface)

  public constructor() : this(ABI.activate())

  private fun as_228302279(): IDragItemsStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDragItemsStartingEventArgs.ABI.makeIDragItemsStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragItemsStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragItemsStartingEventArgs.ABI.makeIDragItemsStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DragItemsStartingEventArgs> {
    public override fun getValue() = DragItemsStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: DragItemsStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragItemsStartingEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.DragItemsStartingEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DragItemsStartingEventArgs {
      val address = segment.toRawLongValue()
      return DragItemsStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DragItemsStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
