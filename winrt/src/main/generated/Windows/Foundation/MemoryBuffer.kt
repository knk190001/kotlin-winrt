package Windows.Foundation

import Windows.Foundation.IMemoryBufferFactory.ABI.IID
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

@ABIMarker(MemoryBuffer.ABI::class)
@Signature("rc(Windows.Foundation.MemoryBuffer;{fbc4dd2a-245b-11e4-af98-689423260cf8})")
@WinRTByReference(brClass = MemoryBuffer.ByReference::class)
public class MemoryBuffer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMemoryBuffer.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __2070864652_Interface: IMemoryBuffer.WithDefault by lazy {
    as_2070864652()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2070864652_Ptr: JNAPointer? by lazy {
    __2070864652_Interface.__2070864652_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2070864652_Interface, __1260617006_Interface)

  public constructor(capacity: WinDef.UINT) : this(ABI.activate(capacity))

  private fun as_2070864652(): IMemoryBuffer.WithDefault {
    if(pointer == NULL) {
      return(IMemoryBuffer.ABI.makeIMemoryBuffer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMemoryBuffer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMemoryBuffer.ABI.makeIMemoryBuffer(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MemoryBuffer> {
    public override fun getValue() = MemoryBuffer(pointer.getPointer(0))

    public fun setValue(value: MemoryBuffer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MemoryBuffer, MemoryAddress> {
    public val IMemoryBufferFactory_Instance: IMemoryBufferFactory by lazy {
      createIMemoryBufferFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMemoryBufferFactory(): IMemoryBufferFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.MemoryBuffer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMemoryBufferFactory.ABI.makeIMemoryBufferFactory(factoryActivatorPtr.value))
    }

    public fun activate(capacity: WinDef.UINT): JNAPointer? =
        IMemoryBufferFactory_Instance.Create(capacity)?.pointer

    public override fun fromNative(segment: MemoryAddress): MemoryBuffer {
      val address = segment.toRawLongValue()
      return MemoryBuffer(Pointer(address))
    }

    public override fun toNative(obj: MemoryBuffer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
