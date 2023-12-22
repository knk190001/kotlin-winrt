package Windows.Graphics.Printing3D

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

@ABIMarker(Printing3DModel.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DModel;{2d012ef0-52fb-919a-77b0-4b1a3b80324f})")
@WinRTByReference(brClass = Printing3DModel.ByReference::class)
public class Printing3DModel(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DModel.WithDefault, IPrinting3DModel2.WithDefault, IWinRTObject {
  private val __1245169032_Interface: IPrinting3DModel.WithDefault by lazy {
    as_1245169032()
  }


  private val __54465722_Interface: IPrinting3DModel2.WithDefault by lazy {
    as_54465722()
  }


  public override val __1245169032_Ptr: JNAPointer? by lazy {
    __1245169032_Interface.__1245169032_Ptr
  }


  public override val __54465722_Ptr: JNAPointer? by lazy {
    __54465722_Interface.__54465722_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1245169032_Interface, __54465722_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1245169032(): IPrinting3DModel.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DModel.ABI.makeIPrinting3DModel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DModel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DModel.ABI.makeIPrinting3DModel(ref.value))
  }

  private fun as_54465722(): IPrinting3DModel2.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DModel2.ABI.makeIPrinting3DModel2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DModel2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DModel2.ABI.makeIPrinting3DModel2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DModel> {
    public override fun getValue() = Printing3DModel(pointer.getPointer(0))

    public fun setValue(value: Printing3DModel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DModel, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing3D.Printing3DModel".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): Printing3DModel {
      val address = segment.toRawLongValue()
      return Printing3DModel(Pointer(address))
    }

    public override fun toNative(obj: Printing3DModel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
