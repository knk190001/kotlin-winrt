package Windows.ApplicationModel.DataTransfer.DragDrop.Core

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

@ABIMarker(CoreDragOperation.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.DragDrop.Core.CoreDragOperation;{cc06de4f-6db0-4e62-ab1b-a74a02dc6d85})")
@WinRTByReference(brClass = CoreDragOperation.ByReference::class)
public class CoreDragOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreDragOperation.WithDefault, ICoreDragOperation2.WithDefault, IWinRTObject
    {
  private val __943998822_Interface: ICoreDragOperation.WithDefault by lazy {
    as_943998822()
  }


  private val __800807540_Interface: ICoreDragOperation2.WithDefault by lazy {
    as_800807540()
  }


  public override val __943998822_Ptr: JNAPointer? by lazy {
    __943998822_Interface.__943998822_Ptr
  }


  public override val __800807540_Ptr: JNAPointer? by lazy {
    __800807540_Interface.__800807540_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__943998822_Interface, __800807540_Interface)

  public constructor() : this(ABI.activate())

  private fun as_943998822(): ICoreDragOperation.WithDefault {
    if(pointer == NULL) {
      return(ICoreDragOperation.ABI.makeICoreDragOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreDragOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreDragOperation.ABI.makeICoreDragOperation(ref.value))
  }

  private fun as_800807540(): ICoreDragOperation2.WithDefault {
    if(pointer == NULL) {
      return(ICoreDragOperation2.ABI.makeICoreDragOperation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreDragOperation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreDragOperation2.ABI.makeICoreDragOperation2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreDragOperation> {
    public override fun getValue() = CoreDragOperation(pointer.getPointer(0))

    public fun setValue(value: CoreDragOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreDragOperation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.DragDrop.Core.CoreDragOperation".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): CoreDragOperation {
      val address = segment.toRawLongValue()
      return CoreDragOperation(Pointer(address))
    }

    public override fun toNative(obj: CoreDragOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
