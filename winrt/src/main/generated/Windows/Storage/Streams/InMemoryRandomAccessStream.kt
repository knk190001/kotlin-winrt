package Windows.Storage.Streams

import Windows.Foundation.IClosable
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

@ABIMarker(InMemoryRandomAccessStream.ABI::class)
@Signature("rc(Windows.Storage.Streams.InMemoryRandomAccessStream;{905a0fe1-bc53-11df-8c49-001e4fc686da})")
@WinRTByReference(brClass = InMemoryRandomAccessStream.ByReference::class)
public class InMemoryRandomAccessStream(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRandomAccessStream.WithDefault, IOutputStream.WithDefault,
    IClosable.WithDefault, IInputStream.WithDefault, IWinRTObject {
  private val __597747131_Interface: IRandomAccessStream.WithDefault by lazy {
    as_597747131()
  }


  private val __591248843_Interface: IOutputStream.WithDefault by lazy {
    as_591248843()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __736491754_Interface: IInputStream.WithDefault by lazy {
    as_736491754()
  }


  public override val __597747131_Ptr: JNAPointer? by lazy {
    __597747131_Interface.__597747131_Ptr
  }


  public override val __591248843_Ptr: JNAPointer? by lazy {
    __591248843_Interface.__591248843_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __736491754_Ptr: JNAPointer? by lazy {
    __736491754_Interface.__736491754_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__597747131_Interface, __591248843_Interface, __1260617006_Interface,
        __736491754_Interface)

  public constructor() : this(ABI.activate())

  private fun as_597747131(): IRandomAccessStream.WithDefault {
    if(pointer == NULL) {
      return(IRandomAccessStream.ABI.makeIRandomAccessStream(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRandomAccessStream>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRandomAccessStream.ABI.makeIRandomAccessStream(ref.value))
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

  private fun as_736491754(): IInputStream.WithDefault {
    if(pointer == NULL) {
      return(IInputStream.ABI.makeIInputStream(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputStream>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputStream.ABI.makeIInputStream(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InMemoryRandomAccessStream> {
    public override fun getValue() = InMemoryRandomAccessStream(pointer.getPointer(0))

    public fun setValue(value: InMemoryRandomAccessStream): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InMemoryRandomAccessStream, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Streams.InMemoryRandomAccessStream".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): InMemoryRandomAccessStream {
      val address = segment.toRawLongValue()
      return InMemoryRandomAccessStream(Pointer(address))
    }

    public override fun toNative(obj: InMemoryRandomAccessStream): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
