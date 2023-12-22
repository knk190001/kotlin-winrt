package Windows.Storage.Compression

import Windows.Foundation.IClosable
import Windows.Storage.Compression.IDecompressorFactory.ABI.IID
import Windows.Storage.Streams.IInputStream
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

@ABIMarker(Decompressor.ABI::class)
@Signature("rc(Windows.Storage.Compression.Decompressor;{b883fe46-d68a-4c8b-ada0-4ee813fc5283})")
@WinRTByReference(brClass = Decompressor.ByReference::class)
public class Decompressor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDecompressor.WithDefault, IInputStream.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __326163001_Interface: IDecompressor.WithDefault by lazy {
    as_326163001()
  }


  private val __736491754_Interface: IInputStream.WithDefault by lazy {
    as_736491754()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __326163001_Ptr: JNAPointer? by lazy {
    __326163001_Interface.__326163001_Ptr
  }


  public override val __736491754_Ptr: JNAPointer? by lazy {
    __736491754_Interface.__736491754_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__326163001_Interface, __736491754_Interface, __1260617006_Interface)

  public constructor(underlyingStream: IInputStream) : this(ABI.activate(underlyingStream))

  private fun as_326163001(): IDecompressor.WithDefault {
    if(pointer == NULL) {
      return(IDecompressor.ABI.makeIDecompressor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDecompressor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDecompressor.ABI.makeIDecompressor(ref.value))
  }

  private fun as_736491754(): IInputStream.WithDefault {
    if(pointer == NULL) {
      return(IInputStream.ABI.makeIInputStream(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputStream>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputStream.ABI.makeIInputStream(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Decompressor> {
    public override fun getValue() = Decompressor(pointer.getPointer(0))

    public fun setValue(value: Decompressor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Decompressor, MemoryAddress> {
    public val IDecompressorFactory_Instance: IDecompressorFactory by lazy {
      createIDecompressorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDecompressorFactory(): IDecompressorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Compression.Decompressor".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDecompressorFactory.ABI.makeIDecompressorFactory(factoryActivatorPtr.value))
    }

    public fun activate(underlyingStream: IInputStream): JNAPointer? =
        IDecompressorFactory_Instance.CreateDecompressor(underlyingStream)?.pointer

    public override fun fromNative(segment: MemoryAddress): Decompressor {
      val address = segment.toRawLongValue()
      return Decompressor(Pointer(address))
    }

    public override fun toNative(obj: Decompressor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
