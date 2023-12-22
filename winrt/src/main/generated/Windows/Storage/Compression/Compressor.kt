package Windows.Storage.Compression

import Windows.Foundation.IClosable
import Windows.Storage.Compression.ICompressorFactory.ABI.IID
import Windows.Storage.Streams.IOutputStream
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Compressor.ABI::class)
@Signature("rc(Windows.Storage.Compression.Compressor;{0ac3645a-57ac-4ee1-b702-84d39d5424e0})")
@WinRTByReference(brClass = Compressor.ByReference::class)
public class Compressor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompressor.WithDefault, IOutputStream.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __1048478406_Interface: ICompressor.WithDefault by lazy {
    as_1048478406()
  }


  private val __591248843_Interface: IOutputStream.WithDefault by lazy {
    as_591248843()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1048478406_Ptr: JNAPointer? by lazy {
    __1048478406_Interface.__1048478406_Ptr
  }


  public override val __591248843_Ptr: JNAPointer? by lazy {
    __591248843_Interface.__591248843_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1048478406_Interface, __591248843_Interface, __1260617006_Interface)

  public constructor(underlyingStream: IOutputStream) : this(ABI.activate(underlyingStream))

  public constructor(
    underlyingStream: IOutputStream,
    algorithm: CompressAlgorithm,
    blockSize: WinDef.UINT
  ) : this(ABI.activate(underlyingStream, algorithm, blockSize))

  private fun as_1048478406(): ICompressor.WithDefault {
    if(pointer == NULL) {
      return(ICompressor.ABI.makeICompressor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompressor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompressor.ABI.makeICompressor(ref.value))
  }

  private fun as_591248843(): IOutputStream.WithDefault {
    if(pointer == NULL) {
      return(IOutputStream.ABI.makeIOutputStream(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOutputStream>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOutputStream.ABI.makeIOutputStream(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Compressor> {
    public override fun getValue() = Compressor(pointer.getPointer(0))

    public fun setValue(value: Compressor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Compressor, MemoryAddress> {
    public val ICompressorFactory_Instance: ICompressorFactory by lazy {
      createICompressorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICompressorFactory(): ICompressorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Compression.Compressor".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICompressorFactory.ABI.makeICompressorFactory(factoryActivatorPtr.value))
    }

    public fun activate(underlyingStream: IOutputStream): JNAPointer? =
        ICompressorFactory_Instance.CreateCompressor(underlyingStream)?.pointer

    public fun activate(
      underlyingStream: IOutputStream,
      algorithm: CompressAlgorithm,
      blockSize: WinDef.UINT
    ): JNAPointer? = ICompressorFactory_Instance.CreateCompressorEx(underlyingStream, algorithm,
        blockSize)?.pointer

    public override fun fromNative(segment: MemoryAddress): Compressor {
      val address = segment.toRawLongValue()
      return Compressor(Pointer(address))
    }

    public override fun toNative(obj: Compressor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
