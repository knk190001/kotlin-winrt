package Windows.Media.Core

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

@ABIMarker(DataCue.ABI::class)
@Signature("rc(Windows.Media.Core.DataCue;{7c7f676d-1fbc-4e2d-9a87-ee38bd1dc637})")
@WinRTByReference(brClass = DataCue.ByReference::class)
public class DataCue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataCue.WithDefault, IMediaCue.WithDefault, IDataCue2.WithDefault,
    IWinRTObject {
  private val __597704268_Interface: IDataCue.WithDefault by lazy {
    as_597704268()
  }


  private val __256643460_Interface: IMediaCue.WithDefault by lazy {
    as_256643460()
  }


  private val __1348963074_Interface: IDataCue2.WithDefault by lazy {
    as_1348963074()
  }


  public override val __597704268_Ptr: JNAPointer? by lazy {
    __597704268_Interface.__597704268_Ptr
  }


  public override val __256643460_Ptr: JNAPointer? by lazy {
    __256643460_Interface.__256643460_Ptr
  }


  public override val __1348963074_Ptr: JNAPointer? by lazy {
    __1348963074_Interface.__1348963074_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__597704268_Interface, __256643460_Interface, __1348963074_Interface)

  public constructor() : this(ABI.activate())

  private fun as_597704268(): IDataCue.WithDefault {
    if(pointer == NULL) {
      return(IDataCue.ABI.makeIDataCue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataCue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataCue.ABI.makeIDataCue(ref.value))
  }

  private fun as_256643460(): IMediaCue.WithDefault {
    if(pointer == NULL) {
      return(IMediaCue.ABI.makeIMediaCue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCue.ABI.makeIMediaCue(ref.value))
  }

  private fun as_1348963074(): IDataCue2.WithDefault {
    if(pointer == NULL) {
      return(IDataCue2.ABI.makeIDataCue2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataCue2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataCue2.ABI.makeIDataCue2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DataCue> {
    public override fun getValue() = DataCue(pointer.getPointer(0))

    public fun setValue(value: DataCue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataCue, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Core.DataCue".toHandle(), refiid,
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

    public override fun fromNative(segment: MemoryAddress): DataCue {
      val address = segment.toRawLongValue()
      return DataCue(Pointer(address))
    }

    public override fun toNative(obj: DataCue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
