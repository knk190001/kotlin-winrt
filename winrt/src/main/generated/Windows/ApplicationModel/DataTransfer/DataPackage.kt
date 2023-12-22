package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(DataPackage.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.DataPackage;{61ebf5c7-efea-4346-9554-981d7e198ffe})")
@WinRTByReference(brClass = DataPackage.ByReference::class)
public class DataPackage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataPackage.WithDefault, IDataPackage2.WithDefault,
    IDataPackage3.WithDefault, IDataPackage4.WithDefault, IWinRTObject {
  private val __258915790_Interface: IDataPackage.WithDefault by lazy {
    as_258915790()
  }


  private val __563545152_Interface: IDataPackage2.WithDefault by lazy {
    as_563545152()
  }


  private val __563545153_Interface: IDataPackage3.WithDefault by lazy {
    as_563545153()
  }


  private val __563545154_Interface: IDataPackage4.WithDefault by lazy {
    as_563545154()
  }


  public override val __258915790_Ptr: JNAPointer? by lazy {
    __258915790_Interface.__258915790_Ptr
  }


  public override val __563545152_Ptr: JNAPointer? by lazy {
    __563545152_Interface.__563545152_Ptr
  }


  public override val __563545153_Ptr: JNAPointer? by lazy {
    __563545153_Interface.__563545153_Ptr
  }


  public override val __563545154_Ptr: JNAPointer? by lazy {
    __563545154_Interface.__563545154_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__258915790_Interface, __563545152_Interface, __563545153_Interface,
        __563545154_Interface)

  public constructor() : this(ABI.activate())

  private fun as_258915790(): IDataPackage.WithDefault {
    if(pointer == NULL) {
      return(IDataPackage.ABI.makeIDataPackage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackage.ABI.makeIDataPackage(ref.value))
  }

  private fun as_563545152(): IDataPackage2.WithDefault {
    if(pointer == NULL) {
      return(IDataPackage2.ABI.makeIDataPackage2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackage2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackage2.ABI.makeIDataPackage2(ref.value))
  }

  private fun as_563545153(): IDataPackage3.WithDefault {
    if(pointer == NULL) {
      return(IDataPackage3.ABI.makeIDataPackage3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackage3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackage3.ABI.makeIDataPackage3(ref.value))
  }

  private fun as_563545154(): IDataPackage4.WithDefault {
    if(pointer == NULL) {
      return(IDataPackage4.ABI.makeIDataPackage4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackage4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackage4.ABI.makeIDataPackage4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DataPackage> {
    public override fun getValue() = DataPackage(pointer.getPointer(0))

    public fun setValue(value: DataPackage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataPackage, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.DataPackage".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DataPackage {
      val address = segment.toRawLongValue()
      return DataPackage(Pointer(address))
    }

    public override fun toNative(obj: DataPackage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
