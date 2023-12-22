package Windows.Storage.Streams

import Windows.Foundation.IMemoryBuffer
import Windows.Storage.Streams.IBufferFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Buffer.ABI::class)
@Signature("rc(Windows.Storage.Streams.Buffer;{905a0fe0-bc53-11df-8c49-001e4fc686da})")
@WinRTByReference(brClass = Buffer.ByReference::class)
public class Buffer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBuffer.WithDefault, IWinRTObject {
  private val __1607707244_Interface: IBuffer.WithDefault by lazy {
    as_1607707244()
  }


  public override val __1607707244_Ptr: JNAPointer? by lazy {
    __1607707244_Interface.__1607707244_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1607707244_Interface)

  public constructor(capacity: WinDef.UINT) : this(ABI.activate(capacity))

  private fun as_1607707244(): IBuffer.WithDefault {
    if(pointer == NULL) {
      return(IBuffer.ABI.makeIBuffer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBuffer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBuffer.ABI.makeIBuffer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Buffer> {
    public override fun getValue() = Buffer(pointer.getPointer(0))

    public fun setValue(value: Buffer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Buffer, MemoryAddress> {
    public val IBufferStatics_Instance: IBufferStatics by lazy {
      createIBufferStatics()
    }


    public val IBufferFactory_Instance: IBufferFactory by lazy {
      createIBufferFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBufferStatics(): IBufferStatics {
      val refiid = Guid.REFIID(IBufferStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Streams.Buffer".toHandle(),refiid,interfacePtr)
      val result = IBufferStatics.ABI.makeIBufferStatics(interfacePtr.value)
      return result
    }

    public fun createIBufferFactory(): IBufferFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Streams.Buffer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBufferFactory.ABI.makeIBufferFactory(factoryActivatorPtr.value))
    }

    public fun activate(capacity: WinDef.UINT): JNAPointer? =
        IBufferFactory_Instance.Create(capacity)?.pointer

    public override fun fromNative(segment: MemoryAddress): Buffer {
      val address = segment.toRawLongValue()
      return Buffer(Pointer(address))
    }

    public override fun toNative(obj: Buffer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateCopyFromMemoryBuffer(input: IMemoryBuffer) =
        ABI.IBufferStatics_Instance.CreateCopyFromMemoryBuffer(input)

    public fun CreateMemoryBufferOverIBuffer(input: IBuffer) =
        ABI.IBufferStatics_Instance.CreateMemoryBufferOverIBuffer(input)
  }
}
