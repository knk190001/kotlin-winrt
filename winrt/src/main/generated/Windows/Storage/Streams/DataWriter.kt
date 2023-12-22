package Windows.Storage.Streams

import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(DataWriter.ABI::class)
@Signature("rc(Windows.Storage.Streams.DataWriter;{64b89265-d341-4922-b38a-dd4af8808c4e})")
@WinRTByReference(brClass = DataWriter.ByReference::class)
public class DataWriter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataWriter.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1098420241_Interface: IDataWriter.WithDefault by lazy {
    as_1098420241()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1098420241_Ptr: JNAPointer? by lazy {
    __1098420241_Interface.__1098420241_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1098420241_Interface, __1260617006_Interface)

  public constructor() : this(ABI.activate())

  public constructor(outputStream: IOutputStream) : this(ABI.activate(outputStream))

  private fun as_1098420241(): IDataWriter.WithDefault {
    if(pointer == NULL) {
      return(IDataWriter.ABI.makeIDataWriter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataWriter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataWriter.ABI.makeIDataWriter(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DataWriter> {
    public override fun getValue() = DataWriter(pointer.getPointer(0))

    public fun setValue(value: DataWriter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataWriter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IDataWriterFactory_Instance: IDataWriterFactory by lazy {
      createIDataWriterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Storage.Streams.DataWriter".toHandle(),
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

    public fun createIDataWriterFactory(): IDataWriterFactory {
      val refiid = Guid.REFIID(IDataWriterFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Streams.DataWriter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDataWriterFactory.ABI.makeIDataWriterFactory(factoryActivatorPtr.value))
    }

    public fun activate(outputStream: IOutputStream): JNAPointer? =
        IDataWriterFactory_Instance.CreateDataWriter(outputStream)?.pointer

    public override fun fromNative(segment: MemoryAddress): DataWriter {
      val address = segment.toRawLongValue()
      return DataWriter(Pointer(address))
    }

    public override fun toNative(obj: DataWriter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
