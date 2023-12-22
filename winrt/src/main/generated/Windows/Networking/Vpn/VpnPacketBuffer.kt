package Windows.Networking.Vpn

import Windows.Networking.Vpn.IVpnPacketBufferFactory.ABI.IID
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

@ABIMarker(VpnPacketBuffer.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnPacketBuffer;{c2f891fc-4d5c-4a63-b70d-4e307eacce55})")
@WinRTByReference(brClass = VpnPacketBuffer.ByReference::class)
public class VpnPacketBuffer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnPacketBuffer.WithDefault, IVpnPacketBuffer2.WithDefault,
    IVpnPacketBuffer3.WithDefault, IWinRTObject {
  private val __1595087272_Interface: IVpnPacketBuffer.WithDefault by lazy {
    as_1595087272()
  }


  private val __2091902170_Interface: IVpnPacketBuffer2.WithDefault by lazy {
    as_2091902170()
  }


  private val __2091902171_Interface: IVpnPacketBuffer3.WithDefault by lazy {
    as_2091902171()
  }


  public override val __1595087272_Ptr: JNAPointer? by lazy {
    __1595087272_Interface.__1595087272_Ptr
  }


  public override val __2091902170_Ptr: JNAPointer? by lazy {
    __2091902170_Interface.__2091902170_Ptr
  }


  public override val __2091902171_Ptr: JNAPointer? by lazy {
    __2091902171_Interface.__2091902171_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1595087272_Interface, __2091902170_Interface, __2091902171_Interface)

  public constructor(
    parentBuffer: VpnPacketBuffer,
    offset: WinDef.UINT,
    length: WinDef.UINT
  ) : this(ABI.activate(parentBuffer, offset, length))

  private fun as_1595087272(): IVpnPacketBuffer.WithDefault {
    if(pointer == NULL) {
      return(IVpnPacketBuffer.ABI.makeIVpnPacketBuffer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnPacketBuffer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnPacketBuffer.ABI.makeIVpnPacketBuffer(ref.value))
  }

  private fun as_2091902170(): IVpnPacketBuffer2.WithDefault {
    if(pointer == NULL) {
      return(IVpnPacketBuffer2.ABI.makeIVpnPacketBuffer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnPacketBuffer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnPacketBuffer2.ABI.makeIVpnPacketBuffer2(ref.value))
  }

  private fun as_2091902171(): IVpnPacketBuffer3.WithDefault {
    if(pointer == NULL) {
      return(IVpnPacketBuffer3.ABI.makeIVpnPacketBuffer3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnPacketBuffer3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnPacketBuffer3.ABI.makeIVpnPacketBuffer3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnPacketBuffer> {
    public override fun getValue() = VpnPacketBuffer(pointer.getPointer(0))

    public fun setValue(value: VpnPacketBuffer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnPacketBuffer, MemoryAddress> {
    public val IVpnPacketBufferFactory_Instance: IVpnPacketBufferFactory by lazy {
      createIVpnPacketBufferFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVpnPacketBufferFactory(): IVpnPacketBufferFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnPacketBuffer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVpnPacketBufferFactory.ABI.makeIVpnPacketBufferFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      parentBuffer: VpnPacketBuffer,
      offset: WinDef.UINT,
      length: WinDef.UINT
    ): JNAPointer? = IVpnPacketBufferFactory_Instance.CreateVpnPacketBuffer(parentBuffer, offset,
        length)?.pointer

    public override fun fromNative(segment: MemoryAddress): VpnPacketBuffer {
      val address = segment.toRawLongValue()
      return VpnPacketBuffer(Pointer(address))
    }

    public override fun toNative(obj: VpnPacketBuffer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
