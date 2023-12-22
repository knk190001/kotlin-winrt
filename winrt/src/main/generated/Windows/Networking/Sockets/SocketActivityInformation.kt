package Windows.Networking.Sockets

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

@ABIMarker(SocketActivityInformation.ABI::class)
@Signature("rc(Windows.Networking.Sockets.SocketActivityInformation;{8d8a42e4-a87e-4b74-9968-185b2511defe})")
@WinRTByReference(brClass = SocketActivityInformation.ByReference::class)
public class SocketActivityInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISocketActivityInformation.WithDefault, IWinRTObject {
  private val __1778480242_Interface: ISocketActivityInformation.WithDefault by lazy {
    as_1778480242()
  }


  public override val __1778480242_Ptr: JNAPointer? by lazy {
    __1778480242_Interface.__1778480242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1778480242_Interface)

  private fun as_1778480242(): ISocketActivityInformation.WithDefault {
    if(pointer == NULL) {
      return(ISocketActivityInformation.ABI.makeISocketActivityInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISocketActivityInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISocketActivityInformation.ABI.makeISocketActivityInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SocketActivityInformation> {
    public override fun getValue() = SocketActivityInformation(pointer.getPointer(0))

    public fun setValue(value: SocketActivityInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SocketActivityInformation, MemoryAddress> {
    public val ISocketActivityInformationStatics_Instance: ISocketActivityInformationStatics by
        lazy {
      createISocketActivityInformationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISocketActivityInformationStatics(): ISocketActivityInformationStatics {
      val refiid = Guid.REFIID(ISocketActivityInformationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Sockets.SocketActivityInformation".toHandle(),refiid,interfacePtr)
      val result =
          ISocketActivityInformationStatics.ABI.makeISocketActivityInformationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SocketActivityInformation {
      val address = segment.toRawLongValue()
      return SocketActivityInformation(Pointer(address))
    }

    public override fun toNative(obj: SocketActivityInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AllSockets() = ABI.ISocketActivityInformationStatics_Instance.get_AllSockets()
  }
}
