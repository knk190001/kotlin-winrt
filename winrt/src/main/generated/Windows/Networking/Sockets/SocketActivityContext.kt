package Windows.Networking.Sockets

import Windows.Networking.Sockets.ISocketActivityContextFactory.ABI.IID
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(SocketActivityContext.ABI::class)
@Signature("rc(Windows.Networking.Sockets.SocketActivityContext;{43b04d64-4c85-4396-a637-1d973f6ebd49})")
@WinRTByReference(brClass = SocketActivityContext.ByReference::class)
public class SocketActivityContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISocketActivityContext.WithDefault, IWinRTObject {
  private val __1017169909_Interface: ISocketActivityContext.WithDefault by lazy {
    as_1017169909()
  }


  public override val __1017169909_Ptr: JNAPointer? by lazy {
    __1017169909_Interface.__1017169909_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1017169909_Interface)

  public constructor(`data`: IBuffer) : this(ABI.activate(data))

  private fun as_1017169909(): ISocketActivityContext.WithDefault {
    if(pointer == NULL) {
      return(ISocketActivityContext.ABI.makeISocketActivityContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISocketActivityContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISocketActivityContext.ABI.makeISocketActivityContext(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SocketActivityContext> {
    public override fun getValue() = SocketActivityContext(pointer.getPointer(0))

    public fun setValue(value: SocketActivityContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SocketActivityContext, MemoryAddress> {
    public val ISocketActivityContextFactory_Instance: ISocketActivityContextFactory by lazy {
      createISocketActivityContextFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISocketActivityContextFactory(): ISocketActivityContextFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Sockets.SocketActivityContext".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISocketActivityContextFactory.ABI.makeISocketActivityContextFactory(factoryActivatorPtr.value))
    }

    public fun activate(`data`: IBuffer): JNAPointer? =
        ISocketActivityContextFactory_Instance.Create(data)?.pointer

    public override fun fromNative(segment: MemoryAddress): SocketActivityContext {
      val address = segment.toRawLongValue()
      return SocketActivityContext(Pointer(address))
    }

    public override fun toNative(obj: SocketActivityContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
