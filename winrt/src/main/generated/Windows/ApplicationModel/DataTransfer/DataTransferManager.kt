package Windows.ApplicationModel.DataTransfer

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DataTransferManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.DataTransferManager;{a5caee9b-8708-49d1-8d36-67d25a8da00c})")
@WinRTByReference(brClass = DataTransferManager.ByReference::class)
public class DataTransferManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataTransferManager.WithDefault, IDataTransferManager2.WithDefault,
    IWinRTObject {
  private val __1708565294_Interface: IDataTransferManager.WithDefault by lazy {
    as_1708565294()
  }


  private val __1425916612_Interface: IDataTransferManager2.WithDefault by lazy {
    as_1425916612()
  }


  public override val __1708565294_Ptr: JNAPointer? by lazy {
    __1708565294_Interface.__1708565294_Ptr
  }


  public override val __1425916612_Ptr: JNAPointer? by lazy {
    __1425916612_Interface.__1425916612_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1708565294_Interface, __1425916612_Interface)

  private fun as_1708565294(): IDataTransferManager.WithDefault {
    if(pointer == NULL) {
      return(IDataTransferManager.ABI.makeIDataTransferManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataTransferManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataTransferManager.ABI.makeIDataTransferManager(ref.value))
  }

  private fun as_1425916612(): IDataTransferManager2.WithDefault {
    if(pointer == NULL) {
      return(IDataTransferManager2.ABI.makeIDataTransferManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataTransferManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataTransferManager2.ABI.makeIDataTransferManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DataTransferManager> {
    public override fun getValue() = DataTransferManager(pointer.getPointer(0))

    public fun setValue(value: DataTransferManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataTransferManager, MemoryAddress> {
    public val IDataTransferManagerStatics_Instance: IDataTransferManagerStatics by lazy {
      createIDataTransferManagerStatics()
    }


    public val IDataTransferManagerStatics2_Instance: IDataTransferManagerStatics2 by lazy {
      createIDataTransferManagerStatics2()
    }


    public val IDataTransferManagerStatics3_Instance: IDataTransferManagerStatics3 by lazy {
      createIDataTransferManagerStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDataTransferManagerStatics(): IDataTransferManagerStatics {
      val refiid = Guid.REFIID(IDataTransferManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.DataTransferManager".toHandle(),refiid,interfacePtr)
      val result =
          IDataTransferManagerStatics.ABI.makeIDataTransferManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIDataTransferManagerStatics2(): IDataTransferManagerStatics2 {
      val refiid = Guid.REFIID(IDataTransferManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.DataTransferManager".toHandle(),refiid,interfacePtr)
      val result =
          IDataTransferManagerStatics2.ABI.makeIDataTransferManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIDataTransferManagerStatics3(): IDataTransferManagerStatics3 {
      val refiid = Guid.REFIID(IDataTransferManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.DataTransferManager".toHandle(),refiid,interfacePtr)
      val result =
          IDataTransferManagerStatics3.ABI.makeIDataTransferManagerStatics3(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DataTransferManager {
      val address = segment.toRawLongValue()
      return DataTransferManager(Pointer(address))
    }

    public override fun toNative(obj: DataTransferManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ShowShareUI() = ABI.IDataTransferManagerStatics_Instance.ShowShareUI()

    public fun GetForCurrentView() = ABI.IDataTransferManagerStatics_Instance.GetForCurrentView()

    public fun IsSupported() = ABI.IDataTransferManagerStatics2_Instance.IsSupported()

    public fun ShowShareUI(options: ShareUIOptions) =
        ABI.IDataTransferManagerStatics3_Instance.ShowShareUI(options)
  }
}
