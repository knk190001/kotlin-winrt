package Windows.Storage.Streams

import Windows.Foundation.IClosable
import Windows.Storage.Streams.IDataReaderFactory.ABI.IID
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

@ABIMarker(DataReader.ABI::class)
@Signature("rc(Windows.Storage.Streams.DataReader;{e2b50029-b4c1-4314-a4b8-fb813a2f275e})")
@WinRTByReference(brClass = DataReader.ByReference::class)
public class DataReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataReader.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __943015009_Interface: IDataReader.WithDefault by lazy {
    as_943015009()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __943015009_Ptr: JNAPointer? by lazy {
    __943015009_Interface.__943015009_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__943015009_Interface, __1260617006_Interface)

  public constructor(inputStream: IInputStream) : this(ABI.activate(inputStream))

  private fun as_943015009(): IDataReader.WithDefault {
    if(pointer == NULL) {
      return(IDataReader.ABI.makeIDataReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataReader.ABI.makeIDataReader(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DataReader> {
    public override fun getValue() = DataReader(pointer.getPointer(0))

    public fun setValue(value: DataReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataReader, MemoryAddress> {
    public val IDataReaderStatics_Instance: IDataReaderStatics by lazy {
      createIDataReaderStatics()
    }


    public val IDataReaderFactory_Instance: IDataReaderFactory by lazy {
      createIDataReaderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDataReaderStatics(): IDataReaderStatics {
      val refiid = Guid.REFIID(IDataReaderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Streams.DataReader".toHandle(),refiid,interfacePtr)
      val result = IDataReaderStatics.ABI.makeIDataReaderStatics(interfacePtr.value)
      return result
    }

    public fun createIDataReaderFactory(): IDataReaderFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Streams.DataReader".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDataReaderFactory.ABI.makeIDataReaderFactory(factoryActivatorPtr.value))
    }

    public fun activate(inputStream: IInputStream): JNAPointer? =
        IDataReaderFactory_Instance.CreateDataReader(inputStream)?.pointer

    public override fun fromNative(segment: MemoryAddress): DataReader {
      val address = segment.toRawLongValue()
      return DataReader(Pointer(address))
    }

    public override fun toNative(obj: DataReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromBuffer(buffer: IBuffer) = ABI.IDataReaderStatics_Instance.FromBuffer(buffer)
  }
}
