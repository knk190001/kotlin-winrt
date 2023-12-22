package Windows.Devices.Custom

import Windows.Devices.Custom.IIOControlCodeFactory.ABI.IID
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

@ABIMarker(IOControlCode.ABI::class)
@Signature("rc(Windows.Devices.Custom.IOControlCode;{0e9559e7-60c8-4375-a761-7f8808066c60})")
@WinRTByReference(brClass = IOControlCode.ByReference::class)
public class IOControlCode(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIOControlCode.WithDefault, IWinRTObject {
  private val __7564216_Interface: IIOControlCode.WithDefault by lazy {
    as_7564216()
  }


  public override val __7564216_Ptr: JNAPointer? by lazy {
    __7564216_Interface.__7564216_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__7564216_Interface)

  public constructor(
    deviceType: WinDef.USHORT,
    function: WinDef.USHORT,
    accessMode: IOControlAccessMode,
    bufferingMethod: IOControlBufferingMethod
  ) : this(ABI.activate(deviceType, function, accessMode, bufferingMethod))

  private fun as_7564216(): IIOControlCode.WithDefault {
    if(pointer == NULL) {
      return(IIOControlCode.ABI.makeIIOControlCode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIOControlCode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIOControlCode.ABI.makeIIOControlCode(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IOControlCode>
      {
    public override fun getValue() = IOControlCode(pointer.getPointer(0))

    public fun setValue(value: IOControlCode): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IOControlCode, MemoryAddress> {
    public val IIOControlCodeFactory_Instance: IIOControlCodeFactory by lazy {
      createIIOControlCodeFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIIOControlCodeFactory(): IIOControlCodeFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Custom.IOControlCode".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IIOControlCodeFactory.ABI.makeIIOControlCodeFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      deviceType: WinDef.USHORT,
      function: WinDef.USHORT,
      accessMode: IOControlAccessMode,
      bufferingMethod: IOControlBufferingMethod
    ): JNAPointer? = IIOControlCodeFactory_Instance.CreateIOControlCode(deviceType, function,
        accessMode, bufferingMethod)?.pointer

    public override fun fromNative(segment: MemoryAddress): IOControlCode {
      val address = segment.toRawLongValue()
      return IOControlCode(Pointer(address))
    }

    public override fun toNative(obj: IOControlCode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
