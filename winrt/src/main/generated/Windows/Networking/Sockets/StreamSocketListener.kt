package Windows.Networking.Sockets

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

@ABIMarker(StreamSocketListener.ABI::class)
@Signature("rc(Windows.Networking.Sockets.StreamSocketListener;{ff513437-df9f-4df0-bf82-0ec5d7b35aae})")
@WinRTByReference(brClass = StreamSocketListener.ByReference::class)
public class StreamSocketListener(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStreamSocketListener.WithDefault, IClosable.WithDefault,
    IStreamSocketListener2.WithDefault, IStreamSocketListener3.WithDefault, IWinRTObject {
  private val __581455969_Interface: IStreamSocketListener.WithDefault by lazy {
    as_581455969()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __845265805_Interface: IStreamSocketListener2.WithDefault by lazy {
    as_845265805()
  }


  private val __845265804_Interface: IStreamSocketListener3.WithDefault by lazy {
    as_845265804()
  }


  public override val __581455969_Ptr: JNAPointer? by lazy {
    __581455969_Interface.__581455969_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __845265805_Ptr: JNAPointer? by lazy {
    __845265805_Interface.__845265805_Ptr
  }


  public override val __845265804_Ptr: JNAPointer? by lazy {
    __845265804_Interface.__845265804_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__581455969_Interface, __1260617006_Interface, __845265805_Interface,
        __845265804_Interface)

  public constructor() : this(ABI.activate())

  private fun as_581455969(): IStreamSocketListener.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocketListener.ABI.makeIStreamSocketListener(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocketListener>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocketListener.ABI.makeIStreamSocketListener(ref.value))
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

  private fun as_845265805(): IStreamSocketListener2.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocketListener2.ABI.makeIStreamSocketListener2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocketListener2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocketListener2.ABI.makeIStreamSocketListener2(ref.value))
  }

  private fun as_845265804(): IStreamSocketListener3.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocketListener3.ABI.makeIStreamSocketListener3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocketListener3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocketListener3.ABI.makeIStreamSocketListener3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StreamSocketListener> {
    public override fun getValue() = StreamSocketListener(pointer.getPointer(0))

    public fun setValue(value: StreamSocketListener): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StreamSocketListener, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Sockets.StreamSocketListener".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): StreamSocketListener {
      val address = segment.toRawLongValue()
      return StreamSocketListener(Pointer(address))
    }

    public override fun toNative(obj: StreamSocketListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
